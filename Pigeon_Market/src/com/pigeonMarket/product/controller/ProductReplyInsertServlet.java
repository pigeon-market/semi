package com.pigeonMarket.product.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.product.model.service.ProductService;
import com.pigeonMarket.product.model.vo.Reply;

/**
 * Servlet implementation class ProductReplyInsertServlet
 */
@WebServlet("/productReviewinsert.pr")
public class ProductReplyInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductReplyInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String content = request.getParameter("content");
		int pNo = Integer.parseInt(request.getParameter("pNo"));
		String writer=request.getParameter("writer");
		
		Reply r = new Reply();
		r.setContent(content);
		r.setpNo(pNo);
		r.setWriter(writer);
		
		int result = new ProductService().insertReply(r);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
