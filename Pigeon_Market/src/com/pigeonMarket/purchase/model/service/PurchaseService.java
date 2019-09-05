package com.pigeonMarket.purchase.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.commit;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;
import static com.pigeonMarket.common.JDBCTemplate.rollback;

import java.sql.Connection;

import com.pigeonMarket.purchase.model.dao.PurchaseDao;
import com.pigeonMarket.purchase.model.vo.Purchase;

public class PurchaseService {

	public int insertPurchase(Purchase p) {
		Connection conn = getConnection();
		
		int result = new PurchaseDao().insertPurchase(conn,p);
		
		if(result >0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

}
