package com.pigeonMarket.blackList.model.service;

import static com.pigeonMarket.common.JDBCTemplate.*;
import static com.pigeonMarket.common.JDBCTemplate.commit;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.blackList.model.dao.BlackListDao;
import com.pigeonMarket.blackList.model.vo.BlackList;
import com.pigeonMarket.common.model.vo.PageInfo;

public class BlackListService {

	public int getListCount() {
		Connection conn = getConnection();
		
		int listCount = new BlackListDao().getListCount(conn);
		
		close(conn);
		
		return listCount;
	}

	public ArrayList<BlackList> selectList(PageInfo page) {
		Connection conn = getConnection();
		ArrayList<BlackList> list = new BlackListDao().selectList(conn, page);
		
		close(conn);
		
		return list;
	}

	public BlackList selectBlackList(int blackListNo) {
		Connection conn = getConnection();

		BlackList bl = null;

			commit(conn);
			bl = new BlackListDao().selectBlackList(conn, blackListNo);
	
		close(conn);
		
		return bl;
	}

	public int insertBlackList(BlackList b) {
		Connection conn = getConnection();

		int result = new BlackListDao().insertBlackList(conn, b);
		
		if(result > 0 ) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}



}
