package com.pigeonMarket.blackList.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.commit;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.blackList.model.dao.BlackListDao;
import com.pigeonMarket.blackList.model.vo.BlackList;
import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.member.model.dao.MemberDao;
import com.pigeonMarket.member.model.vo.Member;

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

}
