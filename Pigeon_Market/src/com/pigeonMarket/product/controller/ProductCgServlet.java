package com.pigeonMarket.product.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.category.model.service.CategoryService;
import com.pigeonMarket.category.model.vo.Category;
import com.pigeonMarket.product.model.service.ProductService;
import com.pigeonMarket.product.model.vo.Attachment;
import com.pigeonMarket.product.model.vo.ProductSale;

/**
 * Servlet implementation class ProductCgServlet
 */
@WebServlet("/listCg.pr")
public class ProductCgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductCgServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String categoryCode = request.getParameter("cg");
		
		ArrayList<ProductSale> prList = new ProductService().selectcgPrList(categoryCode);
		
		ArrayList<Attachment> atList = new ProductService().selectAtList();
		ArrayList<Category> cgList = new CategoryService().selectCgList();
		Category cg = new CategoryService().selectCategory(categoryCode);
		
		
		
		request.setAttribute("prList", prList);
		request.setAttribute("atList", atList);
		request.setAttribute("cgList", cgList);
		request.setAttribute("cg", cg);
		
		request.getRequestDispatcher("/views/product/categoryProductListView.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
