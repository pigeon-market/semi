package com.pigeonMarket.member.model.service;

import java.sql.Connection;

import com.pigeonMarket.member.model.dao.MemberDao;
import com.pigeonMarket.member.model.vo.Member;

import static com.pigeonMarket.common.JDBCTemplate.*;

public class MemberService {
	
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
