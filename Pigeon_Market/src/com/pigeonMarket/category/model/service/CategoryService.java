package com.pigeonMarket.category.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.category.model.dao.CategoryDao;
import com.pigeonMarket.category.model.vo.Category;

import static  com.pigeonMarket.common.JDBCTemplate.*;


public class CategoryService {

	/**
	 * 상품구입 카테고리 리스트
	 * @return
	 */
	public ArrayList<Category> selectCgList() {
		
		Connection conn = getConnection();

		ArrayList<Category> cgList= new CategoryDao().selectCgList(conn);
		close(conn);
		return cgList;
	}

	/**
	 * 선택된 카테고리 코드,이름 가져오기
	 * @param categoryCode 
	 * @return
	 */
	public Category selectCategory(String categoryCode) {	
		
		Connection conn = getConnection();
		
		Category cg = new CategoryDao().selectCategory(conn, categoryCode );
		close(conn);
	
		return cg;
	}

}
