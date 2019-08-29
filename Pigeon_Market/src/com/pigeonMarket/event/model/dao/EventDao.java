package com.pigeonMarket.event.model.dao;

import static com.pigeonMarket.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.event.model.vo.Event;
import com.pigeonMarket.notice.model.dao.NoticeDao;
import com.pigeonMarket.notice.model.vo.Notice;

public class EventDao {
	

	private Properties prop = new Properties();
	
	public EventDao() {
		String fileName = NoticeDao.class.getResource("/com/pigeonMarket/sql/event/event-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public int getListCount(Connection conn) {
		int listCount = 0;
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("getListCount");
		
		try {
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(sql);
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return listCount;
	}


	public ArrayList<Event> selectList(Connection conn, PageInfo page) {
		ArrayList<Event> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			// currentPage = 1		--> startRow : 1 ~ endRow : 10
			// currentPage = 2		--> startRow : 11~ endRow : 20
			
			int startRow = (page.getCurrentPage() - 1) * page.getBoardLimit()+ 1;
			int endRow = startRow + page.getBoardLimit() - 1;
			
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Event(rset.getInt("RNUM"),
								   rset.getInt("NOTICE_TYPE"),
								   rset.getString("NOTICE_TITLE"),
								   rset.getString("NOTICE_CONTENT"),
								   rset.getDate("NOTICE_DATE"),
								   rset.getInt("NOTICE_READCOUNT"),
								   rset.getString("STATUS")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}


	public int insertEvent(Connection conn, Event e) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("insertEvent");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, e.getNoticetitle());
			pstmt.setString(2, e.getNoticeContent());

			result = pstmt.executeUpdate();
			
		} catch (SQLException ee) {
			ee.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.print(e.getNoticetitle());
		return result;

	}


	public int increaseCount(Connection conn, int eventNo) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("increaseCount");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, eventNo);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
		
	}


	public Event selectEvent(Connection conn, int eventNo) {
		Event e = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectEvent");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, eventNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				e = new Event(rset.getInt("RNUM"),
							  rset.getInt("NOTICE_TYPE"),
							  rset.getString("NOTICE_TITLE"),
							  rset.getString("NOTICE_CONTENT"),
							  rset.getDate("NOTICE_DATE"),
							  rset.getInt("NOTICE_READCOUNT"),
							  rset.getString("STATUS"));
			}
			
		} catch (SQLException ee) {
			ee.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return e;
	}


	public int updateEvent(Connection conn, Event event) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("updateEvent");
		
		try {
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, event.getNoticetitle());
			pstmt.setString(2, event.getNoticeContent());
			pstmt.setInt(3, event.getNoticeNo());
			
			result = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}


	public int deleteEvent(Connection conn, int eventNo) {

		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("deleteEvent");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, eventNo);
			
			result = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

}
