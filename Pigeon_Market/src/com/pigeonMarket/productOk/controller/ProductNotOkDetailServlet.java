package com.pigeonMarket.productOk.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.productOk.model.service.ProductOkService;
import com.pigeonMarket.productOk.model.vo.ProductOk;

/**
 * Servlet implementation class ProductNotOkDetailServlet
 */
@WebServlet("/detail.po")
public class ProductNotOkDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductNotOkDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int productOkNo = Integer.parseInt(request.getParameter("productOkNo"));
		
		ProductOk p = new ProductOkService().selectProductOkDetail(productOkNo);
		
		if(p != null) {
			request.setAttribute("p", p);
			request.getRequestDispatcher("views/board/boardDetailView.jsp").forward(request, response);
		}else {
			
			request.setAttribute("msg", "상세조회 실패!!");
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
