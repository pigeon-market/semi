package com.pigeonMarket.purchase.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.commit;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;
import static com.pigeonMarket.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.purchase.model.dao.PurchaseDao;
import com.pigeonMarket.purchase.model.vo.Purchase;

public class PurchaseService {

	public int insertPurchase(ArrayList<Purchase> pList) {
		Connection conn = getConnection();
		
		int result = 0;
		for(int i=0; i<pList.size(); i++) {
			
			result = new PurchaseDao().insertPurchase(conn,pList.get(i));
			
			if(result >0) {
				commit(conn);
			}else {
				rollback(conn);
			}
			
		}
		close(conn);
		return result;
	}

}
