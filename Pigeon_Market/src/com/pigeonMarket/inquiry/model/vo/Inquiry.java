package com.pigeonMarket.inquiry.model.vo;

import java.sql.Date;

public class Inquiry {
	
	private int inquiryNo;
	private String inquiryTitle;
	private String inquiryContent;
	private Date inquiryDate;
	private String userId;
	private String answerState;
	private String status;
	
	public Inquiry() {
		
	}
	
	public Inquiry( String userId, String inquiryTitle, String inquiryContent) {
		super();
		this.userId = userId;
		this.inquiryTitle = inquiryTitle;
		this.inquiryContent = inquiryContent;
	}

	public Inquiry(int inquiryNo, String inquiryTitle, String inquiryContent, Date inquiryDate, String userId,
			 String answerState, String status) {
		super();
		this.inquiryNo = inquiryNo;
		this.inquiryTitle = inquiryTitle;
		this.inquiryContent = inquiryContent;
		this.inquiryDate = inquiryDate;
		this.userId = userId;
		this.answerState = answerState;
		this.status = status;
	}

	public int getInquiryNo() {
		return inquiryNo;
	}

	public void setInquiryNo(int inquiryNo) {
		this.inquiryNo = inquiryNo;
	}

	public String getInquiryTitle() {
		return inquiryTitle;
	}

	public void setInquiryTitle(String inquiryTitle) {
		this.inquiryTitle = inquiryTitle;
	}

	public String getInquiryContent() {
		return inquiryContent;
	}

	public void setInquiryContent(String inquiryContent) {
		this.inquiryContent = inquiryContent;
	}

	public Date getInquiryDate() {
		return inquiryDate;
	}

	public void setInquiryDate(Date inquiryDate) {
		this.inquiryDate = inquiryDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getAnswerState() {
		return answerState;
	}

	public void setAnswerState(String answerState) {
		this.answerState = answerState;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Inquiry [inquiryNo=" + inquiryNo + ", inquiryTitle=" + inquiryTitle + ", inquiryContent="
				+ inquiryContent + ", inquiryDate=" + inquiryDate + ", userId=" + userId + ", answerState=" + answerState + ", status=" + status + "]";
	}
	
	

}
