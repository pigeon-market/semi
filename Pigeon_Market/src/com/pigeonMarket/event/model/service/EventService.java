package com.pigeonMarket.event.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.commit;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;
import static com.pigeonMarket.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.event.model.dao.EventDao;
import com.pigeonMarket.event.model.vo.Event;
import com.pigeonMarket.notice.model.dao.NoticeDao;
import com.pigeonMarket.notice.model.vo.Notice;

public class EventService {
	
	public int getListCount() {
		Connection conn = getConnection();
		
		int listCount = new EventDao().getListCount(conn);
		
		close(conn);
		
		return listCount;
	}

	public ArrayList<Event> selectList(PageInfo page) {
		Connection conn = getConnection();
		ArrayList<Event> list = new EventDao().selectList(conn, page);
		
		close(conn);
		
		return list;
	}

	public int insertEvent(Event e) {

		Connection conn = getConnection();
		
		int result = new EventDao().insertEvent(conn, e);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	public Event selectEvent(int eventNo) {
		Connection conn = getConnection();
		
		// 1. 조회수 증가시키는 dao 호출 
		int result = new EventDao().increaseCount(conn, eventNo);
		
		// 2. 1번의 결과에 따라 게시글 조회하는 dao 호출
		Event e = null;
		if(result > 0) {
			commit(conn);
			e = new EventDao().selectEvent(conn, eventNo);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return e;
	}

	public int updateEvent(Event event) {
		Connection conn = getConnection();
		
		int result = new EventDao().updateEvent(conn, event);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	public int deleteEvent(int eventNo) {
		Connection conn = getConnection();
		
		int result = new EventDao().deleteEvent(conn, eventNo);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	

}
