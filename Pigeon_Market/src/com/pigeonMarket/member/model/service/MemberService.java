package com.pigeonMarket.member.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.commit;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;
import static com.pigeonMarket.common.JDBCTemplate.rollback;

import java.sql.Connection;

import com.pigeonMarket.member.model.dao.MemberDao;
import com.pigeonMarket.member.model.vo.Member;

public class MemberService {
	

//	
//	
//	public ArrayList detailActivityList(ArrayList<Activity> aList) {
//		
//		Connection conn = getConnection();
//		
//		ArrayList list = new ArrayList();
//		
//		String status = "";
//		
//		String num = "";
//		
//		for(int i = 0 ; i < aList.size(); i++) {
//			
//			status = aList.get(i).getStatus();
//			
//			num = status.indexOf("_");
//			
//			if(num != -1) {
//				status = status.substring(0, num);
//			}
//			
//			switch(status) {
//			case "SIGNIN" :
//				ArrayList<String> signIn = new ArrayList<>();
//				signIn.add(aList.get(i).getStatus());
//				signIn.add("회원가입이 되셨습니다.");
//				break;
//			case "REVIEW" :
//				
//			}
//			
//			
//		}
//		
//		
//		close(conn);
//		
//		return list;
//		
//	}
	
	
	
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
	
	
	public Member loginUser(String userId) {
		Connection conn = getConnection();
		
		Member loginUser = new MemberDao().loginUser(conn, userId);
		
		close(conn);
		
		return loginUser;
		
	}


}
