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
import com.pigeonMarket.inquiry.model.vo.Reply;
import com.pigeonMarket.notice.model.dao.NoticeDao;
import com.pigeonMarket.notice.model.vo.Notice;

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

	public Inquiry selectInquiry(int inquiryNo) {
		Connection conn = getConnection();

		// 1. 조회수 증가시키는 dao 호출
		int result = new NoticeDao().increaseCount(conn, inquiryNo);

		// 2. 1번의 결과에 따라 게시글 조회하는 dao 호출
		Inquiry i = null;
		if(result > 0) {
			commit(conn);
			i = new InquiryDao().selectInquiry(conn, inquiryNo);
		}else {
			rollback(conn);
		}

		close(conn);

		return i;
	}

	public int insertReply(Reply r) {
		Connection conn = getConnection();

		int result = new InquiryDao().insertReply(conn, r);

		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}

		close(conn);

		return result;
	}

	public ArrayList<Reply> selectRlist(int nno) {
		Connection conn = getConnection();

		ArrayList<Reply> list = new InquiryDao().selectRlist(conn, nno);

		close(conn);

		return list;
	}

	public int status(int nno) {
		Connection conn = getConnection();

		int result1 = new InquiryDao().status(conn, nno);

		if(result1 > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}

		close(conn);

		return result1;
	}



}
