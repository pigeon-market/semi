package com.pigeonMarket.productOk.model.dao;

import static com.pigeonMarket.common.JDBCTemplate.*;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.jdt.internal.compiler.ast.Statement;

import com.pigeonMarket.productOk.model.vo.ProductOk;



public class ProductOkDao {
	
	private Properties prop = new Properties();
	
	public ProductOkDao() {
		String fileName = ProductOkDao.class.getResource("/sql/productOk/productOk-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
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
	
	public ArrayList<ProductOk> selectList(Connection conn, int currentPage, int boardLimit){
		
		ArrayList<ProductOk> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			// currentPage = 1		--> startRow : 1 ~ endRow : 10
			// currentPage = 2		--> startRow : 11~ endRow : 20
			
			int startRow = (currentPage - 1) * boardLimit + 1;
			int endRow = startRow + boardLimit - 1;
			
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Board(rset.getInt(2),
								   rset.getInt(3),
								   rset.getString(4),
								   rset.getString(5),
								   rset.getString(6),
								   rset.getString(7),
								   rset.getInt(8),
								   rset.getDate(9),
								   rset.getDate(10),
								   rset.getString(11)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	

}
