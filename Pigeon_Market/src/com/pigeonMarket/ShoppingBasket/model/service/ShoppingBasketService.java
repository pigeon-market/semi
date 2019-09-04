package com.pigeonMarket.ShoppingBasket.model.service;

import static  com.pigeonMarket.common.JDBCTemplate.*;

import java.sql.Connection;

import com.pigeonMarket.ShoppingBasket.model.dao.ShoppingBasketDao;
import com.pigeonMarket.ShoppingBasket.model.vo.ShoppingBasket;;

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

	

}
