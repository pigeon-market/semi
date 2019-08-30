package com.pigeonMarket.member.model.vo;

public class Activity implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6725967333241788044L;
	private String userId;
	private String aDate;
	private int period;
	private int limitCount;
	private String status;
	private String title;
	
	public Activity() {
		
	}
	
	

	public Activity(String userId, String aDate, String status, String title) {
		super();
		this.userId = userId;
		this.aDate = aDate;
		this.status = status;
		this.title = title;
	}



	public Activity(String userId, int period, int limitCount) {
		super();
		this.userId = userId;
		this.period = period;
		this.limitCount = limitCount;

	}



	public Activity(String userId, String aDate, int period, int limitCount, String status, String title) {
		super();
		this.userId = userId;
		this.aDate = aDate;
		this.period = period;
		this.limitCount = limitCount;
		this.status = status;
		this.title = title;
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



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	@Override
	public String toString() {
		return "Activity [userId=" + userId + ", aDate=" + aDate + ", period=" + period + ", limitCount=" + limitCount
				+ ", status=" + status + ", title=" + title + "]";
	}

	
	

	
	

}
