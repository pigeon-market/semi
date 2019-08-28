<<<<<<< HEAD
package com.pigeonMarket.dealInfo.model.vo;

import java.sql.Date;

public class Deal {
	
	private String productOkNo;			// ë“±ë¡ ì œí’ˆ ë„˜ë²„
	private String productNo;			// íŒë§¤ìž ë“±ë¡ ë„˜ë²„
	private int price;					// ê°€ê²©
	private String pId;					// íŒë§¤ìž ì•„ì´ë””
	private String bId;					// êµ¬ë§¤ìž ì•„ì´ë””
	private String categoryName;		// ì¹´í…Œê³ ë¦¬ ì´ë¦„
	private String title;				// ê²Œì‹œê¸€ ì œëª©
	private Date regDate; 				// ë“±ë¡ ë‚ ì§œ
	private Date approvalDate;			// ìŠ¹ì¸ ë‚ ì§œ
	private Date dealDate;				// êµ¬ë§¤ ë‚ ì§œ
	private String state;				// íŒë§¤ ìƒíƒœ
	
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
=======
package com.pigeonMarket.dealInfo.model.vo;

import java.sql.Date;

public class Deal {
	
	private int productNo;				// »óÇ°¹øÈ£
	private int price;					// °¡°Ý
	private String pId;					// ÆÇ¸ÅÀÚ ¾ÆÀÌµð
	private String bId;					// ±¸¸ÅÀÚ ¾ÆÀÌµð
	private String categoryName;		// Ä«Å×ÄÚ¸® ÀÌ¸§
	private String title;				// °Ô½Ã¹É Á¦¸ñ
	private Date regDate; 				// µî·Ï³¯Â¥
	private Date approvalDate;			// ½ÂÀÎ³¯Â¥
	private Date dealDate;				// ÆÇ¸Å³¯Â¥
	private String state;				// ÆÇ¸Å¿Ï·á »óÅÂ
	
	public Deal() {
		
	}

	public Deal(int productNo, int price, String pId, String bId, String categoryName, String title, Date regDate,
			Date approvalDate, Date dealDate, String state) {
		super();
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
		return "Deal [productNo=" + productNo + ", price=" + price + ", pId=" + pId + ", bId=" + bId + ", categoryName="
				+ categoryName + ", title=" + title + ", regDate=" + regDate + ", approvalDate=" + approvalDate
				+ ", dealDate=" + dealDate + ", state=" + state + "]";
	}

	
}
>>>>>>> parent of d05a9a5... ìˆ˜ì •ë³¸
