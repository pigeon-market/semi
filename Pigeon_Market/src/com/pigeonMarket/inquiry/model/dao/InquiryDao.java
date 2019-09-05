package com.pigeonMarket.inquiry.model.dao;

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

import com.pigeonMarket.inquiry.model.vo.Inquiry;
import com.pigeonMarket.inquiry.model.vo.Reply;
import com.pigeonMarket.notice.model.vo.Notice;
import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.event.model.vo.Event;
import com.pigeonMarket.inquiry.model.dao.InquiryDao;

public class InquiryDao {
	
	private Properties prop = new Properties();
	
	public InquiryDao() { 
	
	String fileName = InquiryDao.class.getResource("/com/pigeonMarket/sql/inquiry/inquiry-query.properties").getPath();
	
	try {
		prop.load(new FileReader(fileName));
	} catch (IOException e) {
		e.printStackTrace();
	}
}

	public int insertInquiry(Connection conn, Inquiry i) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("insertInquiry");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, i.getInquiryTitle());
			pstmt.setString(2, i.getInquiryContent());
			pstmt.setString(3, i.getUserId());

			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;

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

	public ArrayList<Inquiry> selectList(Connection conn, PageInfo page) {
		ArrayList<Inquiry> list = new ArrayList<>();
		
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
				list.add(new Inquiry(rset.getInt("INQUIRY_NO"),
								   rset.getString("INQUIRY_TITLE"),
								   rset.getString("INQUIRY_CONTENT"),
								   rset.getDate("INQUIRY_DATE"),
								   rset.getString("USER_ID"),
								   rset.getString("ANSWER_STATE"),
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

	public Inquiry selectInquiry(Connection conn, int inquiryNo) {
		Inquiry i = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectInquiry");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, inquiryNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				i = new Inquiry(rset.getInt("RNUM"),
							  rset.getString("INQUIRY_TITLE"),
							  rset.getString("INQUIRY_CONTENT"),
							  rset.getDate("INQUIRY_DATE"),
							  rset.getString("USER_ID"),
							  rset.getString("ANSWER_STATE"),
							  rset.getString("STATUS"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return i;
	}

	public int insertReply(Connection conn, Reply r) {
		int result = 0;
		
		
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("insertReply");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, r.getrContent());
			pstmt.setInt(2, r.getInquiryNo());
			pstmt.setString(3, r.getUserId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public ArrayList<Reply> selectRlist(Connection conn, int nno) {
		ArrayList<Reply> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectRlist");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, nno);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Reply(rset.getInt("RID"),
								   rset.getString("RCONTENT"),
								   rset.getInt("INQUIRY_NO"),
								   rset.getString("USER_ID"),
								   rset.getDate("CREATE_DATE"),
								   rset.getDate("MODIFY_DATE"),
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

	public int status(Connection conn, int nno) {
		PreparedStatement pstmt = null;
		int result1 = 0;
		
		String query = prop.getProperty("statusReply");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, nno);
			
			result1 = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result1;
	}


}
