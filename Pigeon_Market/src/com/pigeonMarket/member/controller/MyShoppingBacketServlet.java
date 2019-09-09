package com.pigeonMarket.member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.ShoppingBasket.model.service.ShoppingBasketService;
import com.pigeonMarket.dealInfo.model.vo.Deal;
import com.pigeonMarket.member.model.vo.Member;

/**
 * Servlet implementation class MyShoppingBacketServlet
 */
@WebServlet("/myShoppingBacket.me")
public class MyShoppingBacketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyShoppingBacketServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getUserId();
		
		ArrayList<Deal> myList = new ShoppingBasketService().searchBasketList(userId);
		
		request.setAttribute("myList", myList);
		
		request.getRequestDispatcher("views/shoppingBasket/shoppingBaskedList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
