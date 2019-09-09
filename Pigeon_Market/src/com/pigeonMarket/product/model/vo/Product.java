package com.pigeonMarket.product.model.vo;

import java.sql.Date;

public class Product {
	
	private int productNo;					// 판매대기번호
	private String pId;						// 판매자아이디
	private int price;						// 판매가격
	private String categoryCode;			// 카테고리코드
	private String approval;				// 상품승인 상태 (N= 미승인  , Y= 승인)
	private String productTitle;			// 상품제목
	private String productContents;			// 상품내용
	private Date regDate;					// 등록날짜
	private String productState;			// 판매완료상태 ( N: 아직 판매중 , Y: 판매완료)
	private String status;					// 판매 글 상태( Y:등록중  N: 삭제)
	
	
	public Product() {
		
	}


	public Product(int productNo, String pId, int price, String categoryCode, String approval, String productTitle,
			String productContents, Date regDate, String productState, String status) {
		super();
		this.productNo = productNo;
		this.pId = pId;
		this.price = price;
		this.categoryCode = categoryCode;
		this.approval = approval;
		this.productTitle = productTitle;
		this.productContents = productContents;
		this.regDate = regDate;
		this.productState = productState;
		this.status = status;
	}


	public int getProductNo() {
		return productNo;
	}


	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}


	public String getpId() {
		return pId;
	}


	public void setpId(String pId) {
		this.pId = pId;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getCategoryCode() {
		return categoryCode;
	}


	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}


	public String getApproval() {
		return approval;
	}


	public void setApproval(String approval) {
		this.approval = approval;
	}


	public String getProductTitle() {
		return productTitle;
	}


	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}


	public String getProductContents() {
		return productContents;
	}


	public void setProductContents(String productContents) {
		this.productContents = productContents;
	}


	public Date getRegDate() {
		return regDate;
	}


	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}


	public String getProductState() {
		return productState;
	}


	public void setProductState(String productState) {
		this.productState = productState;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", pId=" + pId + ", price=" + price + ", categoryCode="
				+ categoryCode + ", approval=" + approval + ", productTitle=" + productTitle + ", productContents="
				+ productContents + ", regDate=" + regDate + ", productState=" + productState + ", status=" + status
				+ "]";
	}
	
	
	
	

}
