package com.pigeonMarket.productOk.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.productOk.model.dao.ProductOkDao;
import com.pigeonMarket.productOk.model.vo.ProductOk;

public class ProductOkService {
	
	/**
	 * 1_1. 리스트 갯수 조회용 서비스
	 * @return
	 */
	public int getListCount() {
		Connection conn = getConnection();
		
		int listCount = new ProductOkDao().getListCount(conn);
		
		close(conn);
		
		return listCount;
	}
	
	/**
	 * 1_2. 리스트 조회용 서비스
	 * @param currentPage
	 * @param boardLimit
	 * @return
	 */
	public ArrayList<ProductOk> selectList(int currentPage, int boardLimit){
		Connection conn = getConnection();
		ArrayList<ProductOk> list = new ProductOkDao().selectList(conn, currentPage, boardLimit);
		
		close(conn);
		
		return list;
	}
	

}
