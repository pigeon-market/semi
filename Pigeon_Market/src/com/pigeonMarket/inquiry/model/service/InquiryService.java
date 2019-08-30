package com.pigeonMarket.inquiry.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.commit;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;
import static com.pigeonMarket.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.event.model.dao.EventDao;
import com.pigeonMarket.event.model.vo.Event;
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
		Connection conn = getConnection();
		
		int listCount = new InquiryDao().getListCount(conn);
		
		close(conn);
		
		return listCount;
	}

	public ArrayList<Inquiry> selectList(PageInfo page) {
		Connection conn = getConnection();
		ArrayList<Inquiry> list = new InquiryDao().selectList(conn, page);
		
		close(conn);
		
		return list;
	}



}
