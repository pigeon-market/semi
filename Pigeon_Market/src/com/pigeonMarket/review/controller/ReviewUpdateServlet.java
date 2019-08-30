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
 * Servlet implementation class ReviewUpdateServlet
 */
@WebServlet("/update.re")
public class ReviewUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		int reviewNo = Integer.parseInt(request.getParameter("nno"));
		
		Review review = new Review();
		review.setReviewTitle(request.getParameter("noticetitle"));
		review.setReviewContent(request.getParameter("noticeContent"));
		review.setReviewNo(reviewNo);
		
		ReviewService service = new ReviewService();
		
		int result = service.updateReview(review);
		
		if(result > 0) {
			request.setAttribute("reviewNo", reviewNo);
			request.getRequestDispatcher("detail.re").forward(request, response);
		} else {
			
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
