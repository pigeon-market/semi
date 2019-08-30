package com.pigeonMarket.inquiry.controller;

import static com.pigeonMarket.common.Paging.pagingBar;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.event.model.service.EventService;
import com.pigeonMarket.event.model.vo.Event;
import com.pigeonMarket.inquiry.model.service.InquiryService;
import com.pigeonMarket.inquiry.model.vo.Inquiry;

/**
 * Servlet implementation class InquiryListServlet
 */
@WebServlet("/inquirylist.in")
public class InquiryListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InquiryListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int listCount = new InquiryService().getListCount(); 	
		
		PageInfo pi = pagingBar(listCount,10);
		
		if (request.getParameter("currentPage") != null)
			 { pi.setCurrentPage(Integer.parseInt(request.getParameter("currentPage"))); } 	
		
		 PageInfo page = new PageInfo(pi.getCurrentPage(), pi.getBoardLimit());
		 
		 ArrayList<Inquiry> list = new InquiryService().selectList(page); 	

		// request에 전달값 담기
		request.setAttribute("list", list);
		request.setAttribute("pi", pi);
		
	
		
		request.getRequestDispatcher("views/inquiry/inquiryListView.jsp").forward(request, response);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
