package com.pigeonMarket.blackList.model.dao;

import static com.pigeonMarket.common.JDBCTemplate.close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.pigeonMarket.blackList.model.vo.BlackList;
import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.member.model.dao.MemberDao;
import com.pigeonMarket.member.model.vo.Member;

public class BlackListDao {
	
private Properties prop = new Properties();
	
	public BlackListDao() {
		
		String fileName = MemberDao.class.getResource("/com/pigeonMarket/sql/blackList/blackList-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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

	public ArrayList<BlackList> selectList(Connection conn, PageInfo page) {
		ArrayList<BlackList> list = new ArrayList<>();
		
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
				list.add(new BlackList(rset.getInt("RNUM"),
								   rset.getString("BLACK_ID"),
								   rset.getString("REPORTER_ID"),
								   rset.getDate("REPORTER_DATE"),
								   rset.getString("REPORTER_REASON")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public BlackList selectBlackList(Connection conn, int blackListNo) {
		BlackList bl = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectBlackList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, blackListNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				bl = new BlackList(rset.getInt("RNUM"),
						   rset.getString("BLACK_ID"),
						   rset.getString("REPORTER_ID"),
						   rset.getDate("REPORTER_DATE"),
						   rset.getString("REPORTER_REASON"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return bl;
	}

	public int insertBlackList(Connection conn, BlackList b) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("insertBlackList");
		
		try {
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, b.getBlackId());
			pstmt.setString(2, b.getReporterId());
			pstmt.setString(3, b.getReporterReason());
			
			result =pstmt.executeUpdate();
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		return result;
	}

}
