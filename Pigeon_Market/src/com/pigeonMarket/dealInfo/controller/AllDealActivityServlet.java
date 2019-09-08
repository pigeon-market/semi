package com.pigeonMarket.dealInfo.controller;

import static com.pigeonMarket.common.Paging.pagingBar;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.dealInfo.model.dao.DealDao;
import com.pigeonMarket.dealInfo.model.service.DealService;
import com.pigeonMarket.dealInfo.model.vo.Activity;
import com.pigeonMarket.member.model.vo.Member;

/**
 * Servlet implementation class AllDealActivityServlet
 */
@WebServlet("/Activity.me")
public class AllDealActivityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllDealActivityServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getUserId();
		
		String status = request.getParameter("status");
		
		int period = 99999;
		
		if(request.getParameter("period") != "") {
			period = Integer.parseInt(request.getParameter("period"));
		}
		
		String date = "SYSDATE";
		
		if(request.getParameter("date") != "") {
			request.getParameter("date");
		}
		
		Activity a = new Activity(userId, status, period, date);
		
		int limitCount = 9999;
		
		if(request.getParameter("group") != "") {
			limitCount = Integer.parseInt(request.getParameter("group"));
		}
		
		int listCount = new DealService().getListCount(a); 	
		
		PageInfo pi = pagingBar(listCount,limitCount);
		
		if (request.getParameter("page") != "")
			 { pi.setCurrentPage(Integer.parseInt(request.getParameter("page"))); 

			 }else {
				 pi.setCurrentPage(1);
			 }
		
		PageInfo page = new PageInfo(pi.getCurrentPage(), pi.getBoardLimit());
		
		ArrayList<Activity> aList = new DealService().activityList(a, page);
		
		ArrayList<String> range = new DealDao().rangeList(aList);

		
		request.setAttribute("a", a);
		request.setAttribute("range", range);
		request.setAttribute("aList", aList);
		request.setAttribute("pi", pi);
		
		request.getRequestDispatcher("views/myPage/myActivity.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
