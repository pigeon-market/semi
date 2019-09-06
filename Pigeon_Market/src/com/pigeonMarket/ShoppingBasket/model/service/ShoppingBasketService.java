package com.pigeonMarket.ShoppingBasket.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.commit;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;
import static com.pigeonMarket.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.ShoppingBasket.model.dao.ShoppingBasketDao;
import com.pigeonMarket.ShoppingBasket.model.vo.ShoppingBasket;
import com.pigeonMarket.dealInfo.model.vo.Deal;;

public class ShoppingBasketService {

	public int InsertShoppingBasket(int pNo, ShoppingBasket sm) {
		Connection conn = getConnection();
		int result1 = new ShoppingBasketDao().selectShoppingBasket(conn,sm);
		System.out.println(result1);
		int result2 = 0;
		
		if(result1 > 0) {
			
			result2 = new ShoppingBasketDao().InsertShoppingBasket(conn,sm);
			
			if(result2 >0) {
				commit(conn);
			}else {
				rollback(conn);
			}
		
		}else{
			
		}
		close(conn);
		
		return result1;
	}
	
	public ArrayList<Deal> searchBasketList(String userId) {
		
		Connection conn = getConnection();
		
		ArrayList<Deal> list = new ShoppingBasketDao().searchBasketList(conn, userId);
		
		close(conn);
		
		return list;
		
	}
	
	public int deleteList(String list, String userId) {
		
		Connection conn = getConnection();
		
		int result = 0;
		
		String[] arr = list.split(",");
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			int sc = new ShoppingBasketDao().deleteList(conn ,arr[i], userId);
			
			result += sc;
			
		}
		
		close(conn);
		
		
		return result;
		
	}

	

}
