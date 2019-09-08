package com.pigeonMarket.product.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.product.model.dao.ProductDao;
import com.pigeonMarket.product.model.vo.Attachment;
import com.pigeonMarket.product.model.vo.Product;
import com.pigeonMarket.product.model.vo.ProductSale;

import static  com.pigeonMarket.common.JDBCTemplate.*;

public class ProductService {

	/**
	 * 판매등록 서비스
	 * @param p
	 * @param fileList
	 * @return
	 */
	public int insertProduct(Product p, ArrayList<Attachment> fileList) {
		Connection conn = getConnection();
		
		int result1 = new ProductDao().insertProduct(conn, p);
		
		int result2 = new ProductDao().insertAttachment(conn, fileList);
		
		if(result1 > 0 && result2 > 0) {
			commit(conn);							
		}else {
			rollback(conn);
		}
		close(conn);
		return result1;
	}


	/** 
	 * 판매 리스트 정보 불러오기
	 * @return
	 */
	public ArrayList<ProductSale> selectprList() {
		
		Connection conn = getConnection();

		ArrayList<ProductSale> prList = new ProductDao().selectPrList(conn);
		
		close(conn);
		return prList;

	}


	/**
	 *  판매 리스트 사진 불러오기
	 * @return
	 */
	public ArrayList<Attachment> selectAtList() {
		Connection conn = getConnection();

		ArrayList<Attachment> atList = new ProductDao().selectAtList(conn);
		
		close(conn);
		return atList;
	}


	/**
	 * 선택된 상품 내용디테일 뷰
	 * @param productOkNo
	 * @return
	 */
	public ProductSale selectProduct(int productOkNo) {
		Connection conn = getConnection();
		
		ProductSale p = new ProductDao().selectProduct(conn, productOkNo);
		close(conn);
		return p;
	}


	/**
	 * 선택된 상품 사진 디테일 뷰 
	 * @param productOkNo
	 * @return
	 */
	public ArrayList<Attachment> selectAttachment(int productOkNo) {
		
		Connection conn = getConnection();
		
		ArrayList<Attachment> file = new ProductDao().selectAttachment(conn, productOkNo);
		close(conn);
		
		return file;
		
	}


	/**
	 * 선택된 카테고리의 상품리스트
	 * @param categoryCode
	 * @return
	 */
	public ArrayList<ProductSale> selectcgPrList(String categoryCode) {
		
		Connection conn = getConnection();

		ArrayList<ProductSale> prList = new ProductDao().selectcgPrList(conn, categoryCode);
		
		close(conn);
		return prList;

	}
	
	
	public int deleteProduct(int no) {
		
		Connection conn = getConnection();
		
		int result = new ProductDao().deleteProduct(conn, no);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		return result;
		
	}


	
	

}
