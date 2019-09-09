package com.pigeonMarket.purchase.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.member.model.vo.Member;
import com.pigeonMarket.product.model.service.ProductService;
import com.pigeonMarket.product.model.vo.Attachment;
import com.pigeonMarket.product.model.vo.ProductSale;

/**
 * Servlet implementation class PurchaseInsertFormServlet
 */
@WebServlet("/insertForm.pc")
public class PurchaseInsertFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PurchaseInsertFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String list = request.getParameter("list");
		
		String[] arr = list.split(",");
		
		ArrayList<ProductSale> prList = new ProductService().selectProduct(arr);
		
		
		
		ArrayList<Attachment> fileList  = new ProductService().selectAttachment(arr);
		
		if(prList != null) {
			request.setAttribute("prList", prList);
			request.setAttribute("fileList", fileList);
			request.getRequestDispatcher("views/purchase/purchaseInsertForm.jsp").forward(request, response);
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
