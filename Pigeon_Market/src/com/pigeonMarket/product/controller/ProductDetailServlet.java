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
		
		int ProductOkNo = Integer.parseInt(request.getParameter("ProductOkNo"));
		
		// 1. 해당 게시판 정보 조회!
		
		ProductSale p = new ProductService().selectProduct(ProductOkNo);		
		
		// 2. 해당 게시판의 사진들 리스트 조회	
		
		ArrayList<Attachment> fileList  = new ProductService().selectAttachment(ProductOkNo);
		
		if(p != null) {
			request.setAttribute("p", p);
			request.setAttribute("fileList", fileList);
			request.getRequestDispatcher("views/product/productDetailView.jsp").forward(request, response);
			
		}else {
			
			request.setAttribute("msg", "상품 상세보기 실패!!");
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);			
			
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
