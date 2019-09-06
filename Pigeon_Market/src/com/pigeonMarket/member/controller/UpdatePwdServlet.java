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
 * Servlet implementation class UpdatePwdServlet
 */
@WebServlet("/updatePwd.me")
public class UpdatePwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePwdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getUserId();
		String pwd = request.getParameter("pwd");
		String nPwd = request.getParameter("nPwd");
		
		Member m = new Member();
		
		m.setUserId(userId);
		m.setUserPwd(pwd);
		m.setUserName(nPwd);
		
		int result = new MemberService().updatePwd(m);
		
		if(result > 0 ) { 
			request.getSession().removeAttribute("loginUser");
			request.getSession().setAttribute("msg", "비밀번호가 변경되었습니다. 다시 로그인해주세요.");
			response.sendRedirect(request.getContextPath());
		} else {
			request.setAttribute("msg", "비밀번호 변경에 실패했습니다.");
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
