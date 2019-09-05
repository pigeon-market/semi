package com.pigeonMarket.purchase.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.purchase.model.service.PurchaseService;
import com.pigeonMarket.purchase.model.vo.Purchase;

/**
 * Servlet implementation class PurchaseCompleteServlet
 */
@WebServlet("/insert.pc")
public class PurchaseCompleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PurchaseCompleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String impUid = request.getParameter("impUid");
		String bId = request.getParameter("bId");
		int pNo = Integer.parseInt(request.getParameter("pNo"));
		int amount = Integer.parseInt(request.getParameter("amount"));
		
		Purchase  p = new Purchase();
		p.setPayMentNo(impUid);
		p.setbId(bId);
		p.setpNo(pNo);
		p.setPrice(amount);
		
		
		int result = new PurchaseService().insertPurchase(p);
		
		if(result >0) {
			PrintWriter out = response.getWriter();
			out.append("결제가 완료되었습니다.");
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
