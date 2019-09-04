
package com.pigeonMarket.member.model.dao;

import static com.pigeonMarket.common.JDBCTemplate.close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.pigeonMarket.member.model.vo.Member;

public class MemberDao {

	private Properties prop = new Properties();

	public MemberDao() {

		String fileName = MemberDao.class.getResource("/com/pigeonMarket/sql/member/member-query.properties").getPath();

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
		} finally {
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
		} finally {
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
				loginUser=new Member(rset.getString(1), 
							 		 rset.getString(2), 
							 		 rset.getString(3), 
							 		 rset.getString(4), 
							 		 rset.getString(5), 
							 		 rset.getString(6), 
							 		 rset.getString(7), 
							 		 rset.getString(8), 
							 		 rset.getDate(9), 
							 		 rset.getString(10), 
							 		 rset.getString(11));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return loginUser;

	}

}
