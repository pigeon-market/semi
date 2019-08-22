package com.pigeonMarket.dealInfo.model.service;

import static com.pigeonMarket.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.dealInfo.model.dao.DealInfoDao;
import com.pigeonMarket.dealInfo.model.vo.Deal;

public class DealInfoService {
	
	/** 1. ���Ÿ���Ʈ ����
	 * @param userId
	 * @return
	 */
	public ArrayList<Deal> selectBuyList(String userId) {
		Connection conn = getConnection();
		
		ArrayList<Deal> dealList = new DealInfoDao().selectBuyList(conn, userId);
		
		close(conn);
		
		return dealList;
		
	}

}
