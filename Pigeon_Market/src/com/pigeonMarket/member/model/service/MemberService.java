package com.pigeonMarket.member.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.commit;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;
import static com.pigeonMarket.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.member.model.dao.MemberDao;
import com.pigeonMarket.member.model.vo.Activity;
import com.pigeonMarket.member.model.vo.Member;

public class MemberService {
	
	/**
	 * 1. 활동 리스트 조회해주는 서비스
	 * @param userId
	 * @return
	 */
	public ArrayList<ArrayList> activityList(Activity a) {
		
		Connection conn = getConnection();
		
		ArrayList<Activity> aList = new MemberDao().activityList(conn, a);
		
		new MemberDao().rangeList(conn, aList);
		
		close(conn);
		
		return list;
		
	}
	
	public int updateMyInfo(Member m) {
		
		Connection conn = getConnection();
		
		int result = new MemberDao().updateMyInfo(conn, m);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}
	
	public int deleteMyInfo(String userId) {
		
		Connection conn = getConnection();
		
		int result = new MemberDao().deleteMyInfo(conn, userId);
		
		if(result > 0) {
			commit(conn);
			
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}


}
