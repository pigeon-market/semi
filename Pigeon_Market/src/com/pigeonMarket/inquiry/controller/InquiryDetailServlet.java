package com.pigeonMarket.inquiry.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.inquiry.model.service.InquiryService;
import com.pigeonMarket.inquiry.model.vo.Inquiry;
import com.pigeonMarket.notice.model.service.NoticeService;
import com.pigeonMarket.notice.model.vo.Notice;

/**
 * Servlet implementation class InquiryDetailServlet
 */
@WebServlet("/detail.in")
public class InquiryDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InquiryDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int inquiryNo = Integer.parseInt(request.getParameter("nno"));
		
		Inquiry i = new InquiryService().selectInquiry(inquiryNo);
		
		if(i != null) {
			request.setAttribute("i", i);
			request.getRequestDispatcher("views/inquiry/inquiryDetailView.jsp").forward(request, response);
		}else {
			
			
			request.getRequestDispatcher("views/common/menubar.jsp").forward(request, response);
		}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
