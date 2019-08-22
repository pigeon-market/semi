package com.pigeonMarket.dealInfo.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.pigeonMarket.dealInfo.model.vo.Deal;

public class DealInfoDao {
	
	private Properties prop = new Properties();
	
	public DealInfoDao() {
		
		String fileName = DealInfoDao.class.getResource("/sql/dealInfo/dealInfo-query.properties").getPath();
		
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
	
	
	
	/** 1. 구매 목록 조회
	 * @param conn
	 * @param userId
	 * @return
	 */
	public ArrayList<Deal> selectBuyList(Connection conn, String userId) {
		
		ArrayList<Deal> dealList = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectBuyList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				
				Deal d = new Deal()
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
