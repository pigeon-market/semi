<<<<<<< HEAD
package com.pigeonMarket.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.member.model.vo.Member;

/**
 * Servlet implementation class CheckMyPwdServlet
 */
@WebServlet("/CheckPwd.me")
public class CheckMyPwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckMyPwdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Å×½ºÆ®¸¦ ÇØºÁ¾ßÇÔ //
		
		request.setCharacterEncoding("UTF-8");
		
		String checkPwd = request.getParameter("checkPwd");
		
		String sessionPwd = ((Member)request.getSession().getAttribute("loginUser")).getUserPwd();
		
		if(checkPwd.equals(sessionPwd)) {
			request.getRequestDispatcher("views/myPage/myInfoPage.jsp").forward(request, response);
		}else {
			request.getSession().setAttribute("msg", "ºñ¹Ð¹øÈ£°¡ Æ²·È½À´Ï´Ù.");
			request.getRequestDispatcher("views/myPage/myMainPage.jsp").forward(request, response);
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

import com.pigeonMarket.member.model.vo.Member;

/**
 * Servlet implementation class CheckMyPwdServlet
 */
@WebServlet("/CheckPwd.me")
public class CheckMyPwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckMyPwdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Å×½ºÆ®¸¦ ÇØºÁ¾ßÇÔ //
		
		request.setCharacterEncoding("UTF-8");
		
		String checkPwd = request.getParameter("checkPwd");
		
		String sessionPwd = ((Member)request.getSession().getAttribute("loginUser")).getUserPwd();
		
		if(checkPwd.equals(sessionPwd)) {
			request.getRequestDispatcher("views/myPage/myInfoPage.jsp").forward(request, response);
		}else {
			request.getSession().setAttribute("msg", "ºñ¹Ð¹øÈ£°¡ Æ²·È½À´Ï´Ù.");
			request.getRequestDispatcher("views/myPage/myMainPage.jsp").forward(request, response);
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
