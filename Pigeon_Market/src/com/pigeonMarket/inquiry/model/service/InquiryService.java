package com.pigeonMarket.inquiry.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.commit;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;
import static com.pigeonMarket.common.JDBCTemplate.rollback;

import java.sql.Connection;

import com.pigeonMarket.event.model.dao.EventDao;
import com.pigeonMarket.inquiry.model.dao.InquiryDao;
import com.pigeonMarket.inquiry.model.vo.Inquiry;

public class InquiryService {

	public int insertInquiry(Inquiry i) {
		Connection conn = getConnection();
		
		int result = new InquiryDao().insertInquiry(conn, i);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	public int getListCount() {
		// TODO Auto-generated method stub
		return 0;
	}



}
