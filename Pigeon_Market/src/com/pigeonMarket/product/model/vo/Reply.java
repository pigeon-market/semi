package com.pigeonMarket.product.model.vo;

import java.sql.Date;

public class Reply {
	
	private int rNo;
	private int pNo;
	private String content;
	private	String writer;
	private Date createDate;
	
	public Reply() {
		
	}

	public Reply(int rNo, int pNo, String content, String writer, Date createDate) {
		super();
		this.rNo = rNo;
		this.pNo = pNo;
		this.content = content;
		this.writer = writer;
		this.createDate = createDate;
	}

	public int getrNo() {
		return rNo;
	}

	public void setrNo(int rNo) {
		this.rNo = rNo;
	}

	public int getpNo() {
		return pNo;
	}

	public void setpNo(int pNo) {
		this.pNo = pNo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Reply [rNo=" + rNo + ", pNo=" + pNo + ", content=" + content + ", writer=" + writer + ", createDate="
				+ createDate + "]";
	}
	
	

	
}
