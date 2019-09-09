package com.pigeonMarket.dealInfo.model.dao;

import static com.pigeonMarket.common.JDBCTemplate.close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.dealInfo.model.vo.Activity;

public class DealDao {

	private Properties prop = new Properties();

	/**
	 * 0. 시퀀스 불러오는 Dao
	 * 
	 */
	public DealDao() {

		String fileName = DealDao.class.getResource("/com/pigeonMarket/sql/dealInfo/dealInfo-query.properties")
				.getPath();

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
	
	public ArrayList<String> rangeList(ArrayList<Activity> aList) {

		ArrayList<String> list = new ArrayList<>();

		int groupNum = 0;

		int num = 0;
		
		

		while (num < aList.size()) {

			for (num = groupNum; num < aList.size(); num++) {

				if (!((aList.get(num).getaDate()).equals(aList.get(groupNum).getaDate()))) {
					
					System.out.println("1");
					
					String listAdd = String.valueOf(num);

					list.add(listAdd);
					groupNum = num;
					break;
				}

			}

		}

		list.add(String.valueOf(aList.size()));


		return list;

	}

	public int getListCount(Connection conn, Activity a) {

		int listCount = 0;

		PreparedStatement pstmt = null;

		String sql = prop.getProperty("listCount");

		ResultSet rset = null;

		if(a.getStatus().equals("all")) {
			a.setStatus("");
		}
		
		if(a.getaDate().equals("SYSDATE")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date currentTime = new Date();
			a.setaDate(sdf.format(currentTime));
		}

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, a.getUserId());
			pstmt.setString(2, a.getStatus() + "%");
			pstmt.setString(3, a.getaDate());
			pstmt.setInt(4, a.getPeriod());
			
			rset = pstmt.executeQuery();

			if (rset.next()) {
				listCount = rset.getInt(1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return listCount;

	}

	public ArrayList<Activity> activityList(Connection conn, Activity a) {

		ArrayList<Activity> list = new ArrayList<>();

		PreparedStatement pstmt = null;

		String sql = prop.getProperty("mainActivityList");

		ResultSet rset = null;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, a.getPeriod());
			pstmt.setString(2, a.getUserId());
			pstmt.setInt(3, a.getLimitCount());

			rset = pstmt.executeQuery();

			while (rset.next()) {
				list.add(new Activity(rset.getInt("rNum"), rset.getString("ID"), rset.getString("DATE"),
						rset.getString("DO"), rset.getInt("NO"), rset.getString("title"), rset.getString("TNAME")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	
	public ArrayList<Activity> activityList(Connection conn, Activity a, PageInfo page) {

		ArrayList<Activity> list = new ArrayList<>();

		PreparedStatement pstmt = null;

		String sql = prop.getProperty("activityList");

		ResultSet rset = null;
		
		int startRow = (page.getCurrentPage() - 1) * page.getBoardLimit()+ 1;
		int endRow = startRow + page.getBoardLimit() - 1;
		
		if(a.getStatus().equals("all")) {
			a.setStatus("");
		}
		
		if(a.getaDate().equals("SYSDATE")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date currentTime = new Date();
			a.setaDate(sdf.format(currentTime));
		}
		
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, a.getUserId());
			pstmt.setString(2, a.getStatus() + "%");
			pstmt.setString(3, a.getaDate());
			pstmt.setInt(4, a.getPeriod());
			pstmt.setInt(5, startRow);
			pstmt.setInt(6, endRow);

			rset = pstmt.executeQuery();

			while (rset.next()) {
				list.add(new Activity(rset.getInt("rNum"), rset.getString("ID"), rset.getString("DATE"),
						rset.getString("DO"), rset.getInt("NO"), rset.getString("title"), rset.getString("TNAME")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	
	public ArrayList<String> selectDetailInfo(Connection conn, int no, String st, String userId) {
		
		ArrayList<String> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		
		String sql = "";
		
		if(st.equals("sell")) {
			sql = prop.getProperty("sDetailInfo");

		}else if(st.equals("but")){
			sql = prop.getProperty("bDetailInfo");
		}
		
		ResultSet rset = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, no);
			pstmt.setString(2, userId);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				list.add(String.valueOf(rset.getString(1)));
				list.add(String.valueOf(rset.getString(2)));
				list.add(rset.getString(3));
				list.add(rset.getString(4));
				list.add(rset.getString(5));
				list.add(rset.getString(6));
				list.add(rset.getString(7));
				list.add(rset.getString(8));
				list.add(rset.getString(9));
				list.add(rset.getString(10));
				list.add(rset.getString(11));
				list.add(rset.getString(12));
				
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}


}
