package com.pigeonMarket.product.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.pigeonMarket.product.model.service.ProductService;
import com.pigeonMarket.product.model.vo.Reply;

/**
 * Servlet implementation class ProductReplyListServlet
 */
@WebServlet("/productReviewlist.pr")
public class ProductReplyListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductReplyListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pNo = Integer.parseInt(request.getParameter("pNo"));
		
		ArrayList<Reply> list = new ProductService().selectRlist(pNo);
		
		
		response.setContentType("application/json; charset=utf-8");
		
		Gson gson = new Gson();
		gson.toJson(list, response.getWriter());
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
