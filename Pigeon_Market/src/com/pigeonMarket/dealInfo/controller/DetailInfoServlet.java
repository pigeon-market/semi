package com.pigeonMarket.dealInfo.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.dealInfo.model.service.DealInfoService;
import com.pigeonMarket.dealInfo.model.vo.Deal;
import com.sun.xml.internal.ws.api.message.Attachment;

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
		
		System.out.println(no);
		System.out.println(st);
		
		// 1. 해당 게시판 정보 조회!
//		
//		Deal d = new DealInfoService().selectDeal(productNo);
//		
//		// 2. 해당 게시판의 사진들 리스트 조회!
//		ArrayList<Attachment> fileList = new DealInfoService().selectAttachment(productNo);
//		
//		if(d!=null) {
//			request.setAttribute("d", d);
//			request.setAttribute("fileList", fileList);
//			request.getRequestDispatcher("views/thumbnail/thumbnailDetailView.jsp").forward(request, response);
//		} else {
//			request.setAttribute("msg", "사진게시판 상세보기 실패");
//			request.getRequestDispatcher("views/common/errorPage.js").forward(request, response);
//		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
