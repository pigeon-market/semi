package com.pigeonMarket.review.model.vo;

import java.sql.Date;

public class Review {

	private int reviewNo;
	private String reviewTitle;
	private String reviewContent;
	private Date reviewDate;
	private int reviewReadcount;
	private String userId;
	private String status;
	
	public Review() {
		
	}
	
	public Review(String reviewTitle, String userId, String reviewContent) {
		super();
		this.reviewTitle = reviewTitle;
		this.userId = userId;
		this.reviewContent = reviewContent;
	}
	
	public Review(String noticetitle, String noticeContent) {
		super();
		this.reviewTitle = noticetitle;
		this.reviewContent = noticeContent;
	}


	public Review(int reviewNo, String reviewTitle, String reviewContent, Date reviewDate, int reviewReadcount,
			String userId, String status) {
		super();
		this.reviewNo = reviewNo;
		this.reviewTitle = reviewTitle;
		this.reviewContent = reviewContent;
		this.reviewDate = reviewDate;
		this.reviewReadcount = reviewReadcount;
		this.userId = userId;
		this.status = status;
	}




	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public int getReviewReadcount() {
		return reviewReadcount;
	}

	public void setReviewReadcount(int reviewReadcount) {
		this.reviewReadcount = reviewReadcount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Review [reviewNo=" + reviewNo + ", reviewTitle=" + reviewTitle + ", reviewContent=" + reviewContent
				+ ", reviewDate=" + reviewDate + ", reviewReadcount=" + reviewReadcount + ", userId=" + userId
				+ ", status=" + status + "]";
	}
	
	
	
}
