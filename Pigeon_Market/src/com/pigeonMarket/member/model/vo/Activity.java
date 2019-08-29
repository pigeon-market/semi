package com.pigeonMarket.member.model.vo;

import java.sql.Date;

public class Activity {
	
	private String userId;
	private String aDate;
	private int period;
	private int limitCount;
	private String status;
	
	public Activity() {
		
	}
	
	

	public Activity(String userId, String aDate, String status) {
		super();
		this.userId = userId;
		this.aDate = aDate;
		this.status = status;
	}



	public Activity(String userId, int period, int limitCount) {
		super();
		this.userId = userId;
		this.period = period;
		this.limitCount = limitCount;
	}



	public Activity(String userId, String aDate, int period, int limitCount, String status) {
		super();
		this.userId = userId;
		this.aDate = aDate;
		this.period = period;
		this.limitCount = limitCount;
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getaDate() {
		return aDate;
	}

	public void setaDate(String aDate) {
		this.aDate = aDate;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public int getLimitCount() {
		return limitCount;
	}

	public void setLimitCount(int limitCount) {
		this.limitCount = limitCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Activity [userId=" + userId + ", aDate=" + aDate + ", period=" + period + ", limitCount=" + limitCount
				+ ", status=" + status + "]";
	}

	

	
	

}
