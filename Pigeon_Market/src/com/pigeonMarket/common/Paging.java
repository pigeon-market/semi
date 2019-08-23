package com.pigeonMarket.common;

import com.pigeonMarket.common.model.vo.PageInfo;

public class Paging {
	
	
	/** 1. 페이징바에 필요한 변수값 불러오기
	 * @param listCount
	 * @return
	 */
	
	
	/*
	 * Servlet에서 작성법
	 * 
	 * 
	 * 사용법 : 
	 * 1. int listCount = new 해당게사판Service().getListCount(); 									// 해당게시판의 리스트 갯수 불러오기
	 * 
	 * 2. PageInfo pi = pagingBar(listCount);													// 리스트 갯수와 boardLimit 갯수를 담아서 PageInfo 객체에 받아서 보내기
	 * 
	 * 3. if (request.getParameter("currentPage") != null)
	 * 		 { pi.setCurrentPage(Integer.parseInt(request.getParameter("currentPage"))); } 		// CurrentPage 변경(복붙가능)
	 * 
	 * 4. PageInfo page = new PageInfo(pi.getCurrentPage(), pi.getBoardLimit());
	 * 
	 * 5. 각자 현재 페이지(currentPage)에 따른 게시글 리스트 조회하기
	 * ex) ArrayList<Deal> list = new DealInfoService().selectBuyList(page); 					// 변수값으로 page 넣기
	 * 
	 * 	   또는 4.을 생략하고 
	 * 	   ArrayList<Deal> list = new DealInfoService().selectBuyList(pi.getCurrentPage(), pi.getBoardLimit());  사용한다.
	 * 
	 * 
	 */
	
	
	public static PageInfo pagingBar(int listCount, int boardLimit) {
		
		PageInfo pi = null;
		
		int currentPage; // 현재 페이지;
		int pageLimit; // 한 페이지 하단에 보여질 페이지 수
		int maxPage; // 전체 페이지에서 가장 마지막 페이지
		int startPage; // 한 페이지 하단에 보여질 시작 페이지
		int endPage; // 한 페이지 하단에 보여질 마지막 페이지

		// * currentPage : 현재페이지
		currentPage = 1;

		// 페이지 전환시 전달받은 현재 페이지가 있을 경우 전달받은 페이지를 currentPage로!


		// * pageLimit : 한 페이지 하단에 보여질 페이지 수
		pageLimit = 10;

		// * maxPage : 총 페이지 수
		// ex) boardLimit : 10
		// 100 / 10 => 10페이지
		// 101 / 10 => 11페이지
		// 105 / 10 => 11페이지
		// 109 / 10 => 11페이지

		maxPage = (int) Math.ceil((double) listCount / boardLimit);

		// * startPage : 현제 페이지에 보여지는 페이지 바의 시작 수
		// ex) pageLimit : 10
		// currentPage = 1 => 0 * 10 + 1 => 1
		// currentPage = 1 => 0 * 10 + 1 => 1
		// currentPage = 1~10 => n = 0

		// currentPage = 11 => 1 * 10 + 1 => 11
		// currentPage = 15 => 1 * 10 + 1 => 11
		// currentPage = 20 => 1 * 10 + 1 => 11

		// currentPage = 1~10 => n=0
		// currentPage = 11~20 => n=1
		// n = (int)Math.floor(((double)currenPage - 1) / pageLimit)
		startPage = (currentPage - 1) / pageLimit * pageLimit + 1;

		// endPage : 현제 페이지에서 보여질 마지막 페이지 수
		endPage = startPage + pageLimit - 1;

		// ex) maxPage = 13, endPage = 20;
		if (maxPage < endPage) {
			endPage = maxPage; // maxPage = 13, endPage = 13;
		}
		
		pi = new PageInfo(currentPage, listCount, pageLimit, maxPage, startPage, endPage, boardLimit);
		
		return pi;
	}

}
