package com.pigeonMarket.purchase.model.vo;

import java.sql.Date;

public class Purchase {
	
	private String payMentNo ;
	private String bId;
	private int pNo;
	private int price;
	private String state;
	private Date dealDate;
	
	
	public Purchase() {
		
	}


	public Purchase(String payMentNo, String bId, int pNo, int price, String state, Date dealDate) {
		super();
		this.payMentNo = payMentNo;
		this.bId = bId;
		this.pNo = pNo;
		this.price = price;
		this.state = state;
		this.dealDate = dealDate;
	}


	public String getPayMentNo() {
		return payMentNo;
	}


	public void setPayMentNo(String payMentNo) {
		this.payMentNo = payMentNo;
	}


	public String getbId() {
		return bId;
	}


	public void setbId(String bId) {
		this.bId = bId;
	}


	public int getpNo() {
		return pNo;
	}


	public void setpNo(int pNo) {
		this.pNo = pNo;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Date getDealDate() {
		return dealDate;
	}


	public void setDealDate(Date dealDate) {
		this.dealDate = dealDate;
	}


	@Override
	public String toString() {
		return "Purchase [payMentNo=" + payMentNo + ", bId=" + bId + ", pNo=" + pNo + ", price=" + price + ", state="
				+ state + ", dealDate=" + dealDate + "]";
	}
	
	

}
