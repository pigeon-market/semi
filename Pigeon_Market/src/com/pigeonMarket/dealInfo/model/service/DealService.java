package com.pigeonMarket.dealInfo.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.dealInfo.model.dao.DealDao;
import com.pigeonMarket.dealInfo.model.vo.Activity;
import com.pigeonMarket.dealInfo.model.vo.Deal;

public class DealService {
	
	public int getListCount(Activity a) {
		
		Connection conn = getConnection();
		
		int listCount = new DealDao().getListCount(conn, a);
		
		close(conn);
		
		return listCount;
		
	}
	
	
	
	public ArrayList<Activity> activityList(Activity a) {
		
		Connection conn = getConnection();
		
		ArrayList<Activity> aList = new DealDao().activityList(conn, a);
		
		close(conn);
		
		return aList;
		
	}
	
	public  ArrayList<Activity> activityList(Activity a, PageInfo page) {
		
		Connection conn = getConnection();
		
		ArrayList<Activity> aList = new DealDao().activityList(conn, a, page);
		
		close(conn);
		
		return aList;
	}
	
	public ArrayList<String> selectDetailInfo(int no, String st, String userId) {
		
		Connection conn = getConnection();
		
		ArrayList<String> list = new DealDao().selectDetailInfo(conn, no, st, userId);
		
		close(conn);
		
		return list;
		
		
	}
	

	


}
