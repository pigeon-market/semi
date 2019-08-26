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


	public ArrayList<ProductSale> selectprList() {
		
		Connection conn = getConnection();

		ArrayList<ProductSale> prList = new ProductDao().selectPrList(conn);
		
		close(conn);
		return prList;
	}


	public ArrayList<Attachment> selectAtList() {
		Connection conn = getConnection();

		ArrayList<Attachment> atList = new ProductDao().selectAtList(conn);
		
		close(conn);
		return atList;
	}


	public ProductSale selectProduct(int productOkNo) {
		Connection conn = getConnection();
		
		ProductSale p = new ProductDao().selectProduct(conn, productOkNo);
		close(conn);
		return p;
	}


	public ArrayList<Attachment> selectAttachment(int productOkNo) {
		
		Connection conn = getConnection();
		
		ArrayList<Attachment> file = new ProductDao().selectAttachment(conn, productOkNo);
		close(conn);
		
		return file;
		
	}
	
	

}
