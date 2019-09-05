package com.pigeonMarket.purchase.model.dao;

import java.io.FileReader;
import static com.pigeonMarket.common.JDBCTemplate.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.pigeonMarket.purchase.model.vo.Purchase;

public class PurchaseDao {
	
	private Properties prop = new Properties();	
	
	public PurchaseDao() {
		
		String fileName = PurchaseDao.class.getResource("/com/pigeonMarket/sql/purchase/purchase-query.properties").getPath();
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일로드 불가");
		}
	}

	public int insertPurchase(Connection conn, Purchase p) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		
		String sql = prop.getProperty("insertPurchase");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getPayMentNo());
			pstmt.setString(2, p.getbId());
			pstmt.setInt(3, p.getpNo());
			pstmt.setInt(4, p.getPrice());
			
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

}
