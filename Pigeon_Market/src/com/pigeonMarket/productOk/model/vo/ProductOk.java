package com.pigeonMarket.productOk.model.vo;

import java.sql.Date;

public class ProductOk {
	
	private int productOkNo;
	private int productNo;
	private String approval;
	private Date approvalDate;
	private String userId;
	
	public ProductOk() {
		
	}

	public ProductOk(int productOkNo, int productNo, String approval, Date approvalDate, String userId) {
		super();
		this.productOkNo = productOkNo;
		this.productNo = productNo;
		this.approval = approval;
		this.approvalDate = approvalDate;
		this.userId = userId;
	}

	public int getProductOkNo() {
		return productOkNo;
	}

	public void setProductOkNo(int productOkNo) {
		this.productOkNo = productOkNo;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}

	public Date getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	
	

}
