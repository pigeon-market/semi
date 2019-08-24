package com.pigeonMarket.dealInfo.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.dealInfo.model.dao.DealInfoDao;
import com.pigeonMarket.dealInfo.model.vo.Deal;

public class DealInfoService {
	
	public int getListCount() {
		
		Connection conn = getConnection();
		
		int listCount = new DealInfoDao().getListCount(conn);
		
		close(conn);
		
		return listCount;
		
	}
	
	
	
	
	public ArrayList<Deal> selectBuyList(PageInfo pi, String userId) {
		Connection conn = getConnection();
		
		ArrayList<Deal> dealList = new DealInfoDao().selectBuyList(conn, pi, userId);
		
		close(conn);
		
		return dealList;
		
	}

}
