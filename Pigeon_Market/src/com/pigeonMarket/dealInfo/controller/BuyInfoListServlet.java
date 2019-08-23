package com.pigeonMarket.dealInfo.controller;

import static com.pigeonMarket.common.Paging.pagingBar;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.dealInfo.model.service.DealInfoService;
import com.pigeonMarket.dealInfo.model.vo.Deal;
import com.pigeonMarket.member.model.vo.Member;

/**
 * Servlet implementation class BuyInfoListServlet
 */
@WebServlet("/BuyList.deal")
public class BuyInfoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyInfoListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				int listCount = new DealInfoService().getListCount();
		
				PageInfo pi = pagingBar(listCount, 10);

				// 페이지 전환시 전달받은 현재 페이지가 있을 경우 전달받은 페이지를 currentPage로!
				if (request.getParameter("currentPage") != null) {
					pi.setCurrentPage(Integer.parseInt(request.getParameter("currentPage")));
				}

				
				PageInfo page = new PageInfo(pi.getCurrentPage(), pi.getBoardLimit());
				
				String userId = ((Member)request.getSession().getAttribute("loginUser")).getUserId();

				// 현재 페이지(currentPage)에 따른 게시글 리스트 조회하기
				ArrayList<Deal> list = new DealInfoService().selectBuyList(page, userId);

				// 페이지 정보들 PageInfo 객체에 담아주기

				// request에 전달값 담기

				request.setAttribute("pi", pi);
				request.setAttribute("list", list);
				request.getRequestDispatcher("views/board/boardListView.jsp").forward(request, response);
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
