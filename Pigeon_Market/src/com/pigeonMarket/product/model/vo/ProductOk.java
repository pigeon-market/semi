package com.pigeonMarket.product.model.vo;

import java.sql.Date;

public class ProductOk {
	
	private int productOkNo;		// 판매승인번호
	private int productNo;			// 판매대기번호
	private Date approvalDate;		// 승인날짜
	private String pId;				// 판매자아이디
	
	
	
	public ProductOk () {
		
	}



	public ProductOk(int productOkNo, int productNo, Date approvalDate, String pId) {
		super();
		this.productOkNo = productOkNo;
		this.productNo = productNo;
		this.approvalDate = approvalDate;
		this.pId = pId;
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



	public Date getApprovalDate() {
		return approvalDate;
	}



	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}



	public String getpId() {
		return pId;
	}



	public void setpId(String pId) {
		this.pId = pId;
	}



	@Override
	public String toString() {
		return "ProductOk [productOkNo=" + productOkNo + ", productNo=" + productNo + ", approvalDate=" + approvalDate
				+ ", pId=" + pId + "]";
	}
	
	

}
