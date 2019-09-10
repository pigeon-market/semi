package com.pigeonMarket.product.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.product.model.service.ProductService;
import com.pigeonMarket.product.model.vo.Attachment;
import com.pigeonMarket.product.model.vo.ProductSale;

/**
 * Servlet implementation class ProductDetailServlet
 */
@WebServlet("/detail.pr")
public class ProductDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pNo = Integer.parseInt(request.getParameter("pNo"));
		ProductSale p = new ProductService().selectProduct(pNo);
		
		
		ArrayList<Attachment> fileList  = new ProductService().selectAttachment(pNo);
		
		if(p != null) {
			request.setAttribute("p", p);
			request.setAttribute("fileList", fileList);
			request.getRequestDispatcher("views/product/productDetailView.jsp").forward(request, response);
			
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
