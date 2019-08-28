<<<<<<< HEAD
package com.pigeonMarket.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.member.model.service.MemberService;

/**
 * Servlet implementation class DeleteMyInfoServlet
 */
@WebServlet("/deleteInfo.me")
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
		
		String userId = request.getParameter("userId");
		
		int result = new MemberService().deleteMyInfo(userId);
		
		if(result > 0) {
			request.getSession().removeAttribute("loginUser");
			request.getSession().setAttribute("msg", "È¸¿øÀÌ Å»ÅðµÇ¾ú½À´Ï´Ù. È¸¿øº¹±¸´Â ¹®ÀÇ¸¦ ÅëÇØ ÇØÁÖ¼¼¿ä.");
			response.sendRedirect(request.getContextPath());
		}else {
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

/**
 * Servlet implementation class DeleteMyInfoServlet
 */
@WebServlet("/deleteInfo.me")
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
		
		String userId = request.getParameter("userId");
		
		int result = new MemberService().deleteMyInfo(userId);
		
		if(result > 0) {
			request.getSession().removeAttribute("loginUser");
			request.getSession().setAttribute("msg", "È¸¿øÀÌ Å»ÅðµÇ¾ú½À´Ï´Ù. È¸¿øº¹±¸´Â ¹®ÀÇ¸¦ ÅëÇØ ÇØÁÖ¼¼¿ä.");
			response.sendRedirect(request.getContextPath());
		}else {
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
