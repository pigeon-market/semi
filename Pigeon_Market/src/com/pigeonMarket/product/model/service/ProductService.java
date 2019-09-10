package com.pigeonMarket.product.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.product.model.dao.ProductDao;
import com.pigeonMarket.product.model.vo.Attachment;
import com.pigeonMarket.product.model.vo.Product;
import com.pigeonMarket.product.model.vo.ProductSale;
import com.pigeonMarket.product.model.vo.Reply;


import static  com.pigeonMarket.common.JDBCTemplate.*;

/**
 * @author 병현
 *
 */
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

	
	/**
	 * 구입할 제품 상품리스트
	 * @param arr
	 * @return
	 */
	public ArrayList<ProductSale> selectProduct(String[] arr) {
		
		Connection conn = getConnection();
		ArrayList<ProductSale> prList = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			
			int pNo = Integer.parseInt(arr[i]);

			ProductSale p  = new ProductDao().selectProduct(conn,pNo);
			prList.add(p);
		}
		close(conn);
		return prList;
	}


	public ArrayList<Attachment> selectAttachment(String[] arr) {

		Connection conn = getConnection();
		
		ArrayList<Attachment> atList = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			
			int pNo = Integer.parseInt(arr[i]);

		Attachment at = new ProductDao().selectAt(conn,pNo);
		 atList.add(at);
		}
		
		close(conn);
		return atList;
	}


	public int insertReply(Reply r) {
		
		Connection conn = getConnection();
		
		int result = new ProductDao().insertReview(conn, r);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}


	public ArrayList<Reply> selectRlist(int pNo) {
		
		Connection conn = getConnection();
		
		ArrayList<Reply> list = new ProductDao().selectRlist(conn,pNo);
		
		commit(conn);
		return list;
	}
	
	public int deleteProduct(int no) {
		
		Connection conn = getConnection();
		
		int result = new ProductDao().deleteProduct(conn, no);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
		
		
	}


	
	

}
