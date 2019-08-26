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
import java.util.ArrayList;
import java.util.Properties;

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.dealInfo.model.vo.Deal;

public class DealInfoDao {
	
	private Properties prop = new Properties();
	
	/** 0. 시퀀스 불러오는 Dao
	 * 
	 */
	public DealInfoDao() {
		
		String fileName = DealInfoDao.class.getResource("/com/pigeonMarket/sql/dealInfo/dealInfo-query.properties").getPath();
		
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
	
	/** 1_1. 리스트 전체 리스트 조회해주는 메소드
	 * @param conn
	 * @return
	 */
	public int buyListCount(Connection conn, String userId) {
		
		int listCount = 0;

		Statement stmt = null; // sql구문이 완성물일때
		ResultSet rset = null;

		String sql = prop.getProperty("buyListCount");

		try {
			stmt = conn.createStatement();

			rset = stmt.executeQuery(sql);

			if (rset.next()) {
				listCount = rset.getInt(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}

		return listCount;

	}
	
	
	
	/** 2. 구매 목록 가지고오는 메소드
	 * @param conn
	 * @param userId
	 * @return
	 */
	public ArrayList<Deal> selectBuyList(Connection conn, PageInfo pi, String userId) {
		
		ArrayList<Deal> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		
		ResultSet rset = null;
		
		int start = pi.getCurrentPage()*pi.getPageLimit();
		int end = start+pi.getPageLimit()-1;
		
		String sql = prop.getProperty("selectBuyList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userId);
			pstmt.setInt(2, start);
			pstmt.setInt(3, end);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Deal(rset.getString("product_OK_NO"), rset.getInt("price"), rset.getString("p_Id"), rset.getString("title"), rset.getDate("deal_date"), rset.getString("state")));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
		
	}
	
	/** 상세조회 메소드
	 * @param conn
	 * @param no
	 * @return
	 */
	public Deal selectDeal(Connection conn, int no) {
		
		Deal d = null;
		
		PreparedStatement pstmt = null;
		
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectDeal");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, no);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {

				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
