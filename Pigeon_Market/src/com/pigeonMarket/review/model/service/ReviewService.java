package com.pigeonMarket.review.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.commit;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;
import static com.pigeonMarket.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.common.model.vo.PageInfo;
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

}
