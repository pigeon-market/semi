package com.pigeonMarket.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.member.model.service.MemberService;
import com.pigeonMarket.member.model.vo.Member;

/**
 * Servlet implementation class UpdateMyInfo
 */
@WebServlet("/myInfo.me")
public class UpdateMyInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMyInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pwd = request.getParameter("pwd");
		
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getUserId();
		
		Member m = new Member();
		
		m.setUserId(userId);
		m.setUserPwd(pwd);
		
		Member mem = new MemberService().checkMyInfo(m);

		if(mem != null) {
			request.setAttribute("me", mem);
			request.getRequestDispatcher("views/myPage/updateMyInfo.jsp").forward(request, response);
		} else {

			request.getSession().setAttribute("msg", "비밀번호를 틀렸습니다. 메인으로 돌아갑니다.");
			response.sendRedirect(request.getContextPath());
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
