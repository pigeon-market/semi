package com.pigeonMarket.inquiry.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.event.model.service.EventService;
import com.pigeonMarket.event.model.vo.Event;
import com.pigeonMarket.inquiry.model.service.InquiryService;
import com.pigeonMarket.inquiry.model.vo.Inquiry;
import com.pigeonMarket.notice.model.service.NoticeService;
import com.pigeonMarket.notice.model.vo.Notice;

/**
 * Servlet implementation class InquiryUpdateServlet
 */
@WebServlet("/insert.in")
public class InquiryInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InquiryInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("userId");
		String title = request.getParameter("inquiryTitle");
		String content = request.getParameter("inquiryContent");
		
		Inquiry i = new Inquiry(id, title, content);
		
		int result = new InquiryService().insertInquiry(i);
		
		
		if(result > 0) {
			mm
			response.setContentType("text/html; charset=UTF-8");
			  PrintWriter out = response.getWriter();
			  out.println("<script>alert('전송이 완료되었습니다!!!'); location.href='/Pigeon_Market/inquiry.in';</script>");
			// response.sendRedirect("inquiry.in"); // 공지사항 리스트 출력하는 서블릿 호출
			  
		}else {
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
