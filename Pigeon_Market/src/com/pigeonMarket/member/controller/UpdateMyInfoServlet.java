<<<<<<< HEAD
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
 * Servlet implementation class UpdateMyInfoServlet
 */
@WebServlet("/UpdateMyInfo.me")
public class UpdateMyInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMyInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// ¹¹¹¹ Á¤º¸°¡ ÇÊ¿äÇÏÁö??

		/*
		 * 
		 * ºñ¹Ð¹øÈ£
		 * ÁÖ¼Ò
		 * ÀÌ¸ÞÀÏ
		 * 
		 */
		
		String userId = request.getParameter("userId");
		String pwd = request.getParameter("pwd");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
		Member m = new Member(userId, pwd, address, email);
		
		int result = new MemberService().updateMyInfo(m);
		
		if(result > 0 ) {
			request.getSession().removeAttribute("loginUser");
			request.getSession().setAttribute("msg", "È¸¿øÁ¤º¸¼öÁ¤ÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù. ´Ù½Ã ·Î±×ÀÎÇØÁÖ¼¼¿ä");
			response.sendRedirect(request.getContextPath());
		} else {
			request.setAttribute("msg", "È¸¿ø Å»Åð¿¡ ½ÇÆÐÇß½À´Ï´Ù.");
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
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
=======
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
 * Servlet implementation class UpdateMyInfoServlet
 */
@WebServlet("/UpdateMyInfo.me")
public class UpdateMyInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMyInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// ¹¹¹¹ Á¤º¸°¡ ÇÊ¿äÇÏÁö??

		/*
		 * 
		 * ºñ¹Ð¹øÈ£
		 * ÁÖ¼Ò
		 * ÀÌ¸ÞÀÏ
		 * 
		 */
		
		String userId = request.getParameter("userId");
		String pwd = request.getParameter("pwd");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
		Member m = new Member(userId, pwd, address, email);
		
		int result = new MemberService().updateMyInfo(m);
		
		if(result > 0 ) {
			request.getSession().removeAttribute("loginUser");
			request.getSession().setAttribute("msg", "È¸¿øÁ¤º¸¼öÁ¤ÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù. ´Ù½Ã ·Î±×ÀÎÇØÁÖ¼¼¿ä");
			response.sendRedirect(request.getContextPath());
		} else {
			request.setAttribute("msg", "È¸¿ø Å»Åð¿¡ ½ÇÆÐÇß½À´Ï´Ù.");
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
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
>>>>>>> parent of d05a9a5... ìˆ˜ì •ë³¸
