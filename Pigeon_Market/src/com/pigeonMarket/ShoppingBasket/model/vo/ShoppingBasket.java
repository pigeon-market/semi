package com.pigeonMarket.ShoppingBasket.model.vo;

public class ShoppingBasket {

	private int pNo;
	private String bId;
	
	public ShoppingBasket() {
		
	}

	public ShoppingBasket(int pNo, String bId) {
		super();
		this.pNo = pNo;
		this.bId = bId;
	}

	public int getpNo() {
		return pNo;
	}

	public void setpNo(int pNo) {
		this.pNo = pNo;
	}

	public String getbId() {
		return bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
	}

	@Override
	public String toString() {
		return "ShoppingMarket [pNo=" + pNo + ", bId=" + bId + "]";
	}
	
	
	
}
