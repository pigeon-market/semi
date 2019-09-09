package com.pigeonMarket.review.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.member.model.vo.Member;
import com.pigeonMarket.review.model.service.ReviewService;
import com.pigeonMarket.review.model.vo.Review;

/**
 * Servlet implementation class ReviewInsertServlet
 */
@WebServlet("/insert.re")
public class ReviewInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String title = request.getParameter("reviewtitle");
		String content = request.getParameter("reviewContent");
		String userId = request.getParameter("userId");


		Review r = new Review(title, content, userId);

		int result = new ReviewService().insertReview(r);

		if(result > 0) {

			// 바로 페이지로 포워딩 하면 NullPointerException 발생할 것
			//request.getRequestDispatcher("views/notice/noticeListView.jsp").forward(request, response);

			response.sendRedirect("review.re"); // 공지사항 리스트 출력하는 서블릿 호출


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
