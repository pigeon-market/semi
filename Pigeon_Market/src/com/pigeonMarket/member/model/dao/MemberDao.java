
package com.pigeonMarket.member.model.dao;

import static com.pigeonMarket.common.JDBCTemplate.close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.pigeonMarket.member.model.vo.Activity;
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
	

	
	public ArrayList<Activity> activityList(Connection conn , Activity a) {
		
		ArrayList<Activity> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("activityList");
		
		ResultSet rset = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, a.getPeriod());
			pstmt.setString(2, a.getUserId());
			pstmt.setInt(3, a.getLimitCount());
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Activity(rset.getString("ID"), rset.getString("DATE"), rset.getString("DO"), rset.getInt("NO"), rset.getString("title"), rset.getString("TNAME")));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public ArrayList<String> rangeList(ArrayList<Activity> aList) {
		
		ArrayList<String> list = new ArrayList<>();
		
		int groupNum = 0;
		
		int num = 0;
		
		
		
		while(num<aList.size()) {
		
			for(num = groupNum ; num < aList.size() ; num++) {
				
				if(!((aList.get(num).getaDate()).equals(aList.get(groupNum).getaDate()))) {
					
					
					String listAdd = String.valueOf(num);
					
					list.add(listAdd);
					groupNum=num;
					break;
				}
			
			}

		}
		
		if(list.isEmpty()) {
			list.add(String.valueOf(aList.size()));
		}

		
		return list;
		
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
				loginUser=new Member(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5), rset.getString(6), rset.getString(7), rset.getString(8), rset.getDate(9), rset.getString(10), rset.getString(11));
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

}

