package com.pigeonMarket.inquiry.model.vo;

import java.sql.Date;

public class Reply {
	
	private int rId;
	private String rContent;
	private int inquiryNo;
	private String userId;
	private Date createDate;
	private Date modifyDate;
	private String status;
	
	public Reply() {
		
	}

	public Reply(int rId, String rContent, int inquiryNo, String userId, Date createDate, Date modifyDate,
			String status) {
		super();
		this.rId = rId;
		this.rContent = rContent;
		this.inquiryNo = inquiryNo;
		this.userId = userId;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.status = status;
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getrContent() {
		return rContent;
	}

	public void setrContent(String rContent) {
		this.rContent = rContent;
	}

	public int getInquiryNo() {
		return inquiryNo;
	}

	public void setInquiryNo(int inquiryNo) {
		this.inquiryNo = inquiryNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Reply [rId=" + rId + ", rContent=" + rContent + ", inquiryNo=" + inquiryNo + ", userId=" + userId
				+ ", createDate=" + createDate + ", modifyDate=" + modifyDate + ", status=" + status + "]";
	}
	
	
	
	
	

}
