package com.pigeonMarket.ShoppingBasket.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.ShoppingBasket.model.service.ShoppingBasketService;
import com.pigeonMarket.member.model.vo.Member;

/**
 * Servlet implementation class ShoppingDeleteServlet
 */
@WebServlet("/deleteForm.pc")
public class ShoppingDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String list = request.getParameter("list");
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getUserId();
		
		int result = new ShoppingBasketService().deleteList(list, userId);
		
		String[] arr = list.split(",");
		
		System.out.println(arr.length);
		
		if(arr.length == result) {
			request.getSession().setAttribute("msg", "장바구니에서 삭제되었습니다.");
		}else {
			request.getSession().setAttribute("msg", "장바구니에서 삭제를 실패했습니다. 다시 시도해주세요.");
			
		}
		response.sendRedirect("myShoppingBacket.me");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
