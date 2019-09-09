package com.pigeonMarket.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pigeonMarket.member.model.service.MemberService;
import com.pigeonMarket.member.model.vo.Member;



/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/login.me")
@WebServlet(name="LoginServlet", urlPatterns="/login.me")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*
		 * < request와 response >
		 * 
		 * request : 서버에 요청하는 모든 정보들에 대해 보관
		 * response : 요청에 응답할 때 필요한 객체
		 * 
		 * < get방식과 post방식 >
		 * 
		 * get방식 : header에 기록되서 전달 (url에 보임, 보안 취약, 데이터길이 제한 있음, 즐겨찾기 가능)
		 * post방식 : body에 기록되서 전달(url에 안보임, 데이터길이 제한 없음, 즐겨찾기 불가능, 전달값에 대한 인코딩 작업 필수)
		 * 
		 */
		
		// 1. 전송값 중에 한글이 있을 경우 인코딩 처리해야됨
		//request.setCharacterEncoding("UTF-8");
		
		// 2. 전송값 꺼내서 변수에 기록해두기 --> request.getParameter("")
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		
//		userId = "user01";
//		userPwd = "pass01";
		
		// 3. 비즈니스 로직을 처리하는 서비스 클래스의 메소드 실행, 그 처리 결과를 받는다. 
		Member loginUser = new MemberService().loginMember(userId, userPwd);
		
		
		// 4. 서비스 요청에 해당하는 결과를 가지고 성공/실패에 대한 뷰페이지를 선택해서 내보냄
		if(loginUser == null) { // 로그인에 실패했을 경우
			
			request.setAttribute("msg", "로그인 실패!!");
			
			RequestDispatcher view = request.getRequestDispatcher("views/common/errorPage.jsp");
			view.forward(request, response);
			
		}else { // 로그인에 성공한 경우
			
			/*
			 * 1) page : 해당 그 페이지에서만 사용 가능
			 * 2) request : 현재 페이지 + 응답 페이지 
			 * 3) session : 브라우저가 종료되기 전까지 어느 페이지든 사용가능한 객체
			 * 4) application : 애플리케이션 전역 다 쓸수 있다.  
			 * 
			 */
			
			// 해당 클라이언트에 대한 세션 객체
			HttpSession session = request.getSession();
			
			//session.setMaxInactiveInterval(600); // 10분뒤 자동 로그아웃
			
			session.setAttribute("loginUser", loginUser);
			// 세션에 로그인한 유저의 정보 담기
			
			
			// 로그인 완료 후 다시 메인 페이지로
			response.sendRedirect(request.getContextPath()); //  /jsp
			
			// forward 방식 : 내가 응답페이지에 전달해줘야되는 request, response있을 경우
			// sendRedirect방식 : 내가 전달해줘야되는 내용이 없을 경우하는 방식 --> 해당 그 곳에서 다시 request, response 객체 새로 생성
			
			
			
			
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
