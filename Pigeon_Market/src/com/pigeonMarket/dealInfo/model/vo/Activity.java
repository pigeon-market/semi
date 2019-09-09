package com.pigeonMarket.dealInfo.model.vo;

public class Activity implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6725967333241788044L;
	private int pNo;
	private int rNo;
	private String userId;
	private String aDate;
	private int period;
	private int limitCount;
	private int bNo;
	private String status;
	private String title;
	private String changeName;
	
	
	public Activity() {
		
	}
	
	
	

	public Activity(String userId, int period, String aDate) {
		super();
		this.userId = userId;
		this.aDate = aDate;
		this.period = period;
	}




	public Activity(int rNo, String userId, String aDate, String status, int bNo, String title, String changeName) {
		super();
		this.rNo = rNo;
		this.userId = userId;
		this.aDate = aDate;
		this.status = status;
		this.bNo = bNo;
		this.title = title;
		this.changeName = changeName;
	}
	

	public Activity(String userId, String status, int period, String aDate) {
		super();
		this.userId = userId;
		this.period = period;
		this.status = status;
		this.aDate = aDate;
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



	public Activity(int pNo, int rNo, String userId, String aDate, int period, int limitCount, int bNo, String status,
			String title, String changeName) {
		super();
		this.pNo = pNo;
		this.rNo = rNo;
		this.userId = userId;
		this.aDate = aDate;
		this.period = period;
		this.limitCount = limitCount;
		this.bNo = bNo;
		this.status = status;
		this.title = title;
		this.changeName = changeName;
	}
	
	



	public int getpNo() {
		return pNo;
	}



	public void setpNo(int pNo) {
		this.pNo = pNo;
	}



	public int getrNo() {
		return rNo;
	}



	public void setrNo(int rNo) {
		this.rNo = rNo;
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



	public int getbNo() {
		return bNo;
	}



	public void setbNo(int bNo) {
		this.bNo = bNo;
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



	public String getChangeName() {
		return changeName;
	}



	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "Activity [pNo=" + pNo + ", rNo=" + rNo + ", userId=" + userId + ", aDate=" + aDate + ", period="
				+ period + ", limitCount=" + limitCount + ", bNo=" + bNo + ", status=" + status + ", title=" + title
				+ ", changeName=" + changeName + "]";
	}







}
