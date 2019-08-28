package com.pigeonMarket.notice.model.dao;


import static com.pigeonMarket.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.notice.model.vo.Notice;



public class NoticeDao {
	
	private Properties prop = new Properties();
	
	public NoticeDao() {
		String fileName = NoticeDao.class.getResource("/com/pigeonMarket/sql/notice/notice-query.properties").getPath();
		
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


	public ArrayList<Notice> selectList(Connection conn, PageInfo page) {
		ArrayList<Notice> list = new ArrayList<>();
		
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
				list.add(new Notice(rset.getInt("RNUM"),
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


	public int insertBoard(Connection conn, Notice n) {

		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("insertBoard");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, n.getNoticetitle());
			pstmt.setString(2, n.getNoticeContent());

			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.print(n.getNoticetitle());
		return result;

	}


	public int increaseCount(Connection conn, int noticeNo) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("increaseCount");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, noticeNo);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
		
	}


	public Notice selectNotice(Connection conn, int noticeNo) {
		Notice n = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectNotice");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, noticeNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				n = new Notice(rset.getInt("RNUM"),
							  rset.getInt("noticeType"),
							  rset.getString("noticetitle"),
							  rset.getString("noticeContent"),
							  rset.getDate("noticeDate"),
							  rset.getInt("noticeReadcount"),
							  rset.getString("status"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return n;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
