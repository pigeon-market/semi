package com.pigeonMarket.review.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.notice.model.service.NoticeService;
import com.pigeonMarket.notice.model.vo.Notice;
import com.pigeonMarket.review.model.service.ReviewService;
import com.pigeonMarket.review.model.vo.Review;

/**
 * Servlet implementation class ReviewDetailServlet
 */
@WebServlet("/detail.re")
public class ReviewDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int reviewNo = Integer.parseInt(request.getParameter("nno"));
		
		Review r = new ReviewService().selectReview(reviewNo);
		
		if(r != null) {
			request.setAttribute("r", r);
			request.getRequestDispatcher("views/review/reviewDetailView.jsp").forward(request, response);
		}else {
			
			
			request.getRequestDispatcher("views/common/menubar.jsp").forward(request, response);
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
