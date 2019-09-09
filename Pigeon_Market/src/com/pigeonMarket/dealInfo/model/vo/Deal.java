
package com.pigeonMarket.dealInfo.model.vo;

import java.sql.Date;

public class Deal {
	
	private int productNo;				// ��ǰ��ȣ
	private int price;					// ����
	private String pId;					// �Ǹ��� ���̵�
	private String bId;					// ������ ���̵�
	private String name;		// ī���ڸ� �̸�
	private String title;				// �Խù� ����
	private Date regDate; 				// ��ϳ�¥
	private Date approvalDate;			// ���γ�¥
	private Date dealDate;				// �Ǹų�¥
	private String state;				// �ǸſϷ� ����
	
	public Deal() {
		
	}
	
	

	public Deal(int productNo, String name, String title, String pId, int price) {
		super();
		this.productNo = productNo;
		this.price = price;
		this.pId = pId;
		this.name = name;
		this.title = title;
	}



	public Deal(int productNo, int price, String pId, String bId, String name, String title, Date regDate,
			Date approvalDate, Date dealDate, String state) {
		super();
		this.productNo = productNo;
		this.price = price;
		this.pId = pId;
		this.bId = bId;
		this.name = name;
		this.title = title;
		this.regDate = regDate;
		this.approvalDate = approvalDate;
		this.dealDate = dealDate;
		this.state = state;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
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

	public String getName() {
		return name;
	}

	public void setCategoryName(String name) {
		this.name = name;
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
		return "Deal [productNo=" + productNo + ", price=" + price + ", pId=" + pId + ", bId=" + bId + ", categoryName="
				+ name + ", title=" + title + ", regDate=" + regDate + ", approvalDate=" + approvalDate
				+ ", dealDate=" + dealDate + ", state=" + state + "]";
	}

	
}

