package com.pigeonMarket.category.model.dao;

import static com.pigeonMarket.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.pigeonMarket.category.model.vo.Category;


public class CategoryDao {
	
	private Properties prop = new Properties();
	
	public CategoryDao() {
		String fileName = CategoryDao.class.getResource("/com/pigeonMarket/sql/category/category-query.properties").getPath();
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}


	/**
	 * 상품구입 카테고리 리스트
	 * @param conn
	 * @return
	 */
	public ArrayList<Category> selectCgList(Connection conn) {
	
		ArrayList<Category> cgList = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectCgList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			while(rset.next()) {
			cgList.add(new Category(rset.getString("CATEGORY_CODE"),
								    rset.getString("CATEGORY_NAME")));
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return cgList;
	}


	public Category selectCategory(Connection conn, String categoryCode) {
		Category cg = null;
		
		PreparedStatement pstmt = null;
		
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectCategory");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, categoryCode);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
			cg = new Category(rset.getString("CATEGORY_CODE"),
								    rset.getString("CATEGORY_NAME"));
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return cg;
	}

}
