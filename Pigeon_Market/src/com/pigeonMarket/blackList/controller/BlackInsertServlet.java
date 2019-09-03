package com.pigeonMarket.blackList.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.blackList.model.service.BlackListService;
import com.pigeonMarket.blackList.model.vo.BlackList;
import com.pigeonMarket.member.model.vo.Member;

/**
 * Servlet implementation class BlackInsertServlet
 */
@WebServlet("/Insert.bl")
public class BlackInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BlackInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String reason = request.getParameter("reason");
		String pId = request.getParameter("pId");
		String userId= ((Member)request.getSession().getAttribute("loginUser")).getUserId();
		
		BlackList b = new BlackList();
		b.setBlackId(pId);
		b.setReporterId(userId);
		b.setReporterReason(reason);
		
		int result = new BlackListService().insertBlackList(b);	
		
		if(result >0) {
			
			request.getSession().setAttribute("msg", "블랙리스트에 추가되었습니다.");
			
		}else {
			request.getSession().setAttribute("msg", "블랙리스트 추가에 실패하였습니다.");
		}
			
			request.getRequestDispatcher("/views/manager/blackListView.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
