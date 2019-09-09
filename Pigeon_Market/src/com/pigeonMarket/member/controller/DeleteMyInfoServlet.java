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
 * Servlet implementation class DeleteMyInfoServlet
 */
@WebServlet("/deleteMyInfo.me")
public class DeleteMyInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMyInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		Member m = new Member();
		
		m.setUserId(userId);
		m.setUserPwd(pwd);
		
		int result = new MemberService().deleteMyInfo(m);
		
		if(result > 0 ) { 
			request.getSession().removeAttribute("loginUser");
			request.getSession().setAttribute("msg", "회원탈퇴가 되었습니다.");
			response.sendRedirect(request.getContextPath());
		} else {
			request.setAttribute("msg", "회원 탈퇴에 실패했습니다.");
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
