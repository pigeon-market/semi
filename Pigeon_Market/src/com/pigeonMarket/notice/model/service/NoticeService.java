package com.pigeonMarket.notice.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.commit;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;
import static com.pigeonMarket.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.notice.model.dao.NoticeDao;
import com.pigeonMarket.notice.model.vo.Notice;


public class NoticeService {

	public int getListCount() {
		Connection conn = getConnection();
		
		int listCount = new NoticeDao().getListCount(conn);
		
		close(conn);
		
		return listCount;
	}

	public ArrayList<Notice> selectList(PageInfo page) {
		Connection conn = getConnection();
		ArrayList<Notice> list = new NoticeDao().selectList(conn, page);
		
		close(conn);
		
		return list;
	}

	public int insertNotice(Notice n) {
		
		Connection conn = getConnection();
		
		int result = new NoticeDao().insertBoard(conn, n);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	public Notice selectNotice(int noticeNo) {
		Connection conn = getConnection();
		
		// 1. 조회수 증가시키는 dao 호출 
		int result = new NoticeDao().increaseCount(conn, noticeNo);
		
		// 2. 1번의 결과에 따라 게시글 조회하는 dao 호출
		Notice n = null;
		if(result > 0) {
			commit(conn);
			n = new NoticeDao().selectNotice(conn, noticeNo);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return n;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
