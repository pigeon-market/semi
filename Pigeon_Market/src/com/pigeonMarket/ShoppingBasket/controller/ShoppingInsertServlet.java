package com.pigeonMarket.ShoppingBasket.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.ShoppingBasket.model.service.ShoppingBasketService;
import com.pigeonMarket.ShoppingBasket.model.vo.ShoppingBasket;
import com.pigeonMarket.member.model.vo.Member;

/**
 * Servlet implementation class ShoppingInsertServlet
 */
@WebServlet("/insert.sm")
public class ShoppingInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int pNo = Integer.parseInt(request.getParameter("pNo"));
		String userId= ((Member)request.getSession().getAttribute("loginUser")).getUserId();
		
		ShoppingBasket sm = new ShoppingBasket(pNo,userId);
		
		System.out.println("pNo:" +pNo);
		System.out.println("userId:" +userId);
		
		
		int result = new ShoppingBasketService().InsertShoppingBasket(pNo,sm);
		
		if(result > 0) {
			request.getSession().setAttribute("msg", "장바구니에 추가되었습니다.");
		}else {
			
			request.getSession().setAttribute("msg", "장바구니에 제품을 담을수 없습니다.");
		}
		
		request.setAttribute("pNo", pNo);
		request.getRequestDispatcher("/detail.pr").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
