package com.pigeonMarket.member.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.member.model.service.MemberService;
import com.pigeonMarket.member.model.vo.Member;

/**
 * Servlet implementation class InsertMemberServlet
 */
//@WebServlet("/insert.me") // 암호화되기 전
@WebServlet(name="InsertMemberServlet", urlPatterns="/insert.me")
public class InsertMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertMemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("test");
		// 1. 한글이 있을 경우 인코딩 처리
		request.setCharacterEncoding("utf-8");
		
		// 2. request 객체에 담겨있는 값들 꺼내서 변수에 저장 및 객체 생성
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String userName = request.getParameter("userName");
		String birthDate = request.getParameter("birthDate");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String addm = request.getParameter("address");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		
		String address = addm+","+addr1+","+addr2;
		
		
		
		Member mem = new Member(userId, userPwd, userName, birthDate, gender, email, phone, address);
		
		// 3. 비즈니스 로직을 수행할 서비스 메소드 전달하고 그 결과 값 받기
		int result = new MemberService().insertMember(mem);
		
		System.out.println(result);
		
		
		// 4. 받은 결과에 따라 성공/실패에 따른 페이지 내보내기
		if(result > 0) {
			
			request.getSession().setAttribute("msg", "회원 가입 성공!!");
			// menubar.jsp에서 alert창 출력하도록 작업
			
			response.sendRedirect(request.getContextPath());
			
		}else {
			
			request.setAttribute("msg", "회원 가입 실패!!");
			
			RequestDispatcher view = request.getRequestDispatcher("views/common/errorPage.jsp");
			view.forward(request, response);
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
