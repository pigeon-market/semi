package com.pigeonMarket.inquiry.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.inquiry.model.service.InquiryService;
import com.pigeonMarket.inquiry.model.vo.Reply;

/**
 * Servlet implementation class InquiryReplyInsertServlet
 */
@WebServlet("/rinsert.in")
public class InquiryReplyInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InquiryReplyInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String content = request.getParameter("content");
		int nno = Integer.parseInt(request.getParameter("nno"));
		String writer=request.getParameter("writer");
		
		Reply r = new Reply();
		r.setrContent(content);
		r.setInquiryNo(nno);
		r.setUserId(writer);
		
		int result1 = new InquiryService().status(nno);
		
		int result = new InquiryService().insertReply(r);
		
		if(result > 0 && result1 >0) {
			
			response.setContentType("text/html; charset=UTF-8");
			  PrintWriter out = response.getWriter();
			  out.println("<script>alert('답변 작성이 완료되었습니다!!!'); location.href='/Pigeon_Market/rinsert.in';</script>");
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
