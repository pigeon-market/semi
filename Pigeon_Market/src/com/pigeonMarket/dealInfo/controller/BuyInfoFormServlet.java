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
import com.pigeonMarket.member.model.vo.Member;

/**
 * Servlet implementation class BuyInfoFormServlet
 */
@WebServlet("/buyInfoForm.deal")
public class BuyInfoFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyInfoFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * ���� ����Ʈ ��������� ����
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ���� ������ �ò���
		
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getUserId();
		
		
		
		
		ArrayList<Deal> dealList = new DealInfoService().selectBuyList(userId);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
