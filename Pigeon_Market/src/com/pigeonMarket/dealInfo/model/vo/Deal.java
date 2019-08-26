package com.pigeonMarket.dealInfo.model.vo;

import java.sql.Date;

public class Deal {
	
	private String productOkNo;			// 등록 제품 넘버
	private String productNo;			// 판매자 등록 넘버
	private int price;					// 가격
	private String pId;					// 판매자 아이디
	private String bId;					// 구매자 아이디
	private String categoryName;		// 카테고리 이름
	private String title;				// 게시글 제목
	private Date regDate; 				// 등록 날짜
	private Date approvalDate;			// 승인 날짜
	private Date dealDate;				// 구매 날짜
	private String state;				// 판매 상태
	
	public Deal() {
		
	}

	public Deal(String productOkNo, int price, String pId, String title, Date dealDate, String state) {
		super();
		this.productOkNo = productOkNo;
		this.price = price;
		this.pId = pId;
		this.title = title;
		this.dealDate = dealDate;
		this.state = state;
	}

	public Deal(String productOkNo, String productNo, int price, String pId, String bId, String categoryName,
			String title, Date regDate, Date approvalDate, Date dealDate, String state) {
		super();
		this.productOkNo = productOkNo;
		this.productNo = productNo;
		this.price = price;
		this.pId = pId;
		this.bId = bId;
		this.categoryName = categoryName;
		this.title = title;
		this.regDate = regDate;
		this.approvalDate = approvalDate;
		this.dealDate = dealDate;
		this.state = state;
	}
	
	public String getProductOkNo() {
		return productOkNo;
	}

	public void setProductOkNo(String productOkNo) {
		this.productOkNo = productOkNo;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getbId() {
		return bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}

	public Date getDealDate() {
		return dealDate;
	}

	public void setDealDate(Date dealDate) {
		this.dealDate = dealDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Deal [productOkNo=" + productOkNo + ", productNo=" + productNo + ", price=" + price + ", pId=" + pId
				+ ", bId=" + bId + ", categoryName=" + categoryName + ", title=" + title + ", regDate=" + regDate
				+ ", approvalDate=" + approvalDate + ", dealDate=" + dealDate + ", state=" + state + "]";
	}
	
	
	
}
