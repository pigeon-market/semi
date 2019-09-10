package com.pigeonMarket.dealInfo.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.dealInfo.model.service.DealService;
import com.pigeonMarket.dealInfo.model.vo.Activity;
import com.pigeonMarket.member.model.vo.Member;
import com.pigeonMarket.product.model.service.ProductService;
import com.pigeonMarket.product.model.vo.Attachment;

/**
 * Servlet implementation class DetailInfoServlet
 */
@WebServlet("/detailView.deal")
public class DetailInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int no = Integer.parseInt(request.getParameter("no"));
		String st = request.getParameter("st");	
		
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getUserId();
		
		ArrayList<String> list = new DealService().selectDetailInfo(no, st, userId);
			
		ArrayList<Attachment> file = new ProductService().selectAttachment(Integer.parseInt(list.get(0)));
		
		request.setAttribute("list", list);
		request.setAttribute("file", file);
		
		request.getRequestDispatcher("views/myPage/myDetailView.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
