package com.pigeonMarket.member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.dealInfo.model.dao.DealDao;
import com.pigeonMarket.dealInfo.model.service.DealService;
import com.pigeonMarket.dealInfo.model.vo.Activity;
import com.pigeonMarket.member.model.vo.Member;

/**
 * Servlet implementation class myPageFormServlet
 */
@WebServlet("/myPage.me")
public class MyPageFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyPageFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getUserId();
		
		int limitCount = 30;
		
		int perious = 90;
		
		Activity a = new Activity(userId, perious, limitCount);
		
		ArrayList<Activity> aList = new DealService().activityList(a);
		
		ArrayList<String> range = new DealDao().rangeList(aList);
		
		request.setAttribute("range", range);
		request.setAttribute("aList", aList);

		
		request.getRequestDispatcher("views/myPage/myMainPage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
