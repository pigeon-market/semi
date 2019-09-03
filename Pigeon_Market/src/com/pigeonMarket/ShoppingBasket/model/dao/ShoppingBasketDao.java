package com.pigeonMarket.ShoppingBasket.model.dao;

import static com.pigeonMarket.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.pigeonMarket.ShoppingBasket.model.vo.ShoppingBasket;

public class ShoppingBasketDao {
	
	private Properties prop = new Properties();
	
	public ShoppingBasketDao(){
		
		String fileName = ShoppingBasketDao.class.getResource("/com/pigeonMarket/sql/shoppingBasket/shoppingBasket-query.properties").getPath();
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일로드 불가");
		}

		
	}
	
	public int selectShoppingBasket(Connection conn, ShoppingBasket sm) {
		
		ShoppingBasket s = null;
		
		int result=0;
		
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectShoppingBasket");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sm.getpNo());
			pstmt.setString(2, sm.getbId());
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				s = new ShoppingBasket(rset.getInt("PRODUCT_OK_NO"),
									   rset.getString("B_ID"));
			}
			
			if(s == null) {
				result = 1;
			}
			else {
				result = -1;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return result;
	}

	public int InsertShoppingBasket(Connection conn, ShoppingBasket sm) {
		int result =0;
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("InsertShoppingBasket");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sm.getpNo());
			pstmt.setString(2, sm.getbId());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		return result;
	}

	

	

}
