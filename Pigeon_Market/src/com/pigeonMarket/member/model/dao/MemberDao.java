package com.pigeonMarket.member.model.dao;

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

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.member.model.vo.Member;
import com.pigeonMarket.notice.model.vo.Notice;

public class MemberDao {
	
	private Properties prop = new Properties();
	
	public MemberDao() {
		
		String fileName = MemberDao.class.getResource("/com/pigeonMarket/sql/member/member-query.properties").getPath();
		// ��ġ���� ����
		
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
	
	public int updateMyInfo(Connection conn, Member m) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("updateMyInfo");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, m.getUserPwd());
			pstmt.setString(2, m.getAddress());
			pstmt.setString(3, m.getAddress());
			pstmt.setString(4, m.getUserId());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
		
	}
	
	public int deleteMyInfo(Connection conn, String userId) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("updateMyInfo");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userId);

			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
		
		
	}
	

public Member loginUser(Connection conn, String userId) {
		
		Member loginUser = null;
		
		PreparedStatement pstmt = null;
		

		ResultSet rset = null;
		
		String sql = prop.getProperty("loginUser");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				loginUser=new Member(rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5), rset.getString(6), rset.getString(7), rset.getString(8), rset.getString(9), rset.getDate(10), rset.getString(11), rset.getString(12));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return loginUser;
		
		
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

public ArrayList<Member> selectList(Connection conn, PageInfo page) {
	ArrayList<Member> list = new ArrayList<>();
	
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
			list.add(new Member(rset.getInt("PNUM"),
							   rset.getString("USER_ID"),
							   rset.getString("USER_PWD"),
							   rset.getString("USER_NAME"),
							   rset.getString("BIRTH_DATE"),
							   rset.getString("GENDER"),
							   rset.getString("EMAIL"),
							   rset.getString("PHONE"),
							   rset.getString("ADDRESS"),
							   rset.getDate("JOIN_DATE"),
							   rset.getString("WITHDRAWAL"),
							   rset.getString("BLACK_CODE")));
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close(rset);
		close(pstmt);
	}
	
	return list;
}

public Member selectMember(Connection conn, int memberNo) {
	Member m = null;
	
	PreparedStatement pstmt = null;
	ResultSet rset = null;
	
	String sql = prop.getProperty("selectMember");
	
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, memberNo);
		
		rset = pstmt.executeQuery();
		
		if(rset.next()) {
			m = new Member(rset.getInt("PNUM"),
					   rset.getString("USER_ID"),
					   rset.getString("USER_PWD"),
					   rset.getString("USER_NAME"),
					   rset.getString("BIRTH_DATE"),
					   rset.getString("GENDER"),
					   rset.getString("EMAIL"),
					   rset.getString("PHONE"),
					   rset.getString("ADDRESS"),
					   rset.getDate("JOIN_DATE"),
					   rset.getString("WITHDRAWAL"),
					   rset.getString("BLACK_CODE"));
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close(rset);
		close(pstmt);
	}
	
	return m;
}

public int deleteMember(Connection conn, String memberNo) {
	PreparedStatement pstmt = null;
	int result = 0;
	
	String query = prop.getProperty("deleteMember");
	
	try {
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, memberNo);
		
		result = pstmt.executeUpdate();
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(pstmt);
	}
	
	return result;
}

}
