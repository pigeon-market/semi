package com.pigeonMarket.dealInfo.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.dealInfo.model.dao.DealInfoDao;
import com.pigeonMarket.dealInfo.model.vo.Deal;

public class DealInfoService {
	
	
	/** 1. 구매리시트 전체 조회하는 서비스
	 * @param userId
	 * @return
	 */
	public int buyListCount(String userId) {
		
		Connection conn = getConnection();
		
		int listCount = new DealInfoDao().buyListCount(conn, userId);
		
		close(conn);
		
		return listCount;
		
	}
	
	
	
	
	/** 2. 페이지처리된 리스트 조회하는 서비스
	 * @param pi
	 * @param userId
	 * @return
	 */
	public ArrayList<Deal> selectBuyList(PageInfo pi, String userId) {
		Connection conn = getConnection();
		
		ArrayList<Deal> dealList = new DealInfoDao().selectBuyList(conn, pi, userId);
		
		close(conn);
		
		return dealList;
		
	}

}
