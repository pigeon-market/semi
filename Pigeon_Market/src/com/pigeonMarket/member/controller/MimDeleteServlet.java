package com.pigeonMarket.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.member.model.service.MemberService;
import com.pigeonMarket.notice.model.service.NoticeService;

/**
 * Servlet implementation class MimDeleteServlet
 */
@WebServlet("/delete.mim")
public class MimDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MimDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int memberNo = Integer.parseInt(request.getParameter("nno"));
		int result = new MemberService().deleteMember(memberNo);
		
		if(result > 0) {
			response.setContentType("text/html; charset=UTF-8");
			  PrintWriter out = response.getWriter();
			  out.println("<script>alert('강제 탈퇴가 완료되었습니다!!!'); location.href='/Pigeon_Market/member.mim';</script>");
		} else {
			request.getRequestDispatcher("views/common/menubar.jsp").forward(request, response);
			
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
