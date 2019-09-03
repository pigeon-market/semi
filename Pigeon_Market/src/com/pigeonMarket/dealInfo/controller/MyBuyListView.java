package com.pigeonMarket.dealInfo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.common.Paging;
import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.dealInfo.model.service.DealInfoService;
import com.pigeonMarket.member.model.vo.Member;

/**
 * Servlet implementation class MyBuyListView
 */
@WebServlet("/buyList.deal")
public class MyBuyListView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyBuyListView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int page = Integer.parseInt(request.getParameter("page"));
		
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getUserId();
		
		int listCount = new DealInfoService().buyListCount(userId);
		
		PageInfo pi = new Paging().pagingBar(listCount, 10);
		
		if (request.getParameter("currentPage") != null) {
			pi.setCurrentPage(Integer.parseInt(request.getParameter("currentPage")));
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
