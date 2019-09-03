package com.pigeonMarket.review.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.commit;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;
import static com.pigeonMarket.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.notice.model.dao.NoticeDao;
import com.pigeonMarket.notice.model.vo.Notice;
import com.pigeonMarket.review.model.dao.ReviewDao;
import com.pigeonMarket.review.model.vo.Review;

public class ReviewService {

	public int getListCount() {
		Connection conn = getConnection();
		
		int listCount = new ReviewDao().getListCount(conn);
		
		close(conn);
		
		return listCount;
	}

	public ArrayList<Review> selectList(PageInfo page) {
		Connection conn = getConnection();
		ArrayList<Review> list = new ReviewDao().selectList(conn, page);
		
		close(conn);
		
		return list;
	}

	public int insertReview(Review r) {
		Connection conn = getConnection();
		
		int result = new ReviewDao().insertReview(conn, r);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	public Review selectReview(int reviewNo) {
		Connection conn = getConnection();
		
		// 1. 조회수 증가시키는 dao 호출 
		int result = new ReviewDao().increaseCount(conn, reviewNo);
		
		// 2. 1번의 결과에 따라 게시글 조회하는 dao 호출
		Review r = null;
		if(result > 0) {
			commit(conn);
			r = new ReviewDao().selectReview(conn, reviewNo);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return r;
		
	}

	public int updateReview(Review review) {
		Connection conn = getConnection();
		
		int result = new ReviewDao().updateReview(conn, review);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	public int deleteReview(int reviewNo) {
		Connection conn = getConnection();
		
		int result = new ReviewDao().deleteReview(conn, reviewNo);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

}
