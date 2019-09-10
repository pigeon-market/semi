package com.pigeonMarket.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.pigeonMarket.member.model.service.MemberService;
import com.pigeonMarket.member.model.vo.Member;

/**
 * Servlet implementation class UpdateAddrServlet
 */
@WebServlet("/updateAddr.me")
public class UpdateAddrServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAddrServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getUserId();
		
		String addr1 = request.getParameter("phone1");
		String addr2 = request.getParameter("phone2");
		String addr3 = request.getParameter("phone3");
		
		String addr = addr1+","+addr2+"-"+addr3;
		
		int result = new MemberService().updateAddr(addr, userId);
		
		if(result > 0) {
			
			
			response.setContentType("application/json; charset=utf-8");
		      
		      Gson gson = new Gson();
		      
		      gson.toJson(addr, response.getWriter()); 
			
			
		}else {
			request.getSession().setAttribute("msg", "이메일업데이트에 오류가 발생했습니다.");
			response.sendRedirect(request.getContextPath());
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
