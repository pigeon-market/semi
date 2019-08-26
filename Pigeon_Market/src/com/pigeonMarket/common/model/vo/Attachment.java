package com.pigeonMarket.common.model.vo;

public class Attachment {
	
	private int fId;
	private int productNo;
	private String originName;
	private String changeName;
	private int fileLevel;
	
	public Attachment() {
		
	}

	public Attachment(int fId, int productNo, String originName, String changeName, int fileLevel) {
		super();
		this.fId = fId;
		this.productNo = productNo;
		this.originName = originName;
		this.changeName = changeName;
		this.fileLevel = fileLevel;
	}

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public String getChangeName() {
		return changeName;
	}

	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}

	public int getFileLevel() {
		return fileLevel;
	}

	public void setFileLevel(int fileLevel) {
		this.fileLevel = fileLevel;
	}

	@Override
	public String toString() {
		return "Attachment [fId=" + fId + ", productNo=" + productNo + ", originName=" + originName + ", changeName="
				+ changeName + ", fileLevel=" + fileLevel + "]";
	}
	

	

}
