package com.pigeonMarket.event.model.vo;
import java.sql.Date;

public class Event {

		
		private int noticeNo;
		private int noticeType;
		private String noticetitle;
		private String noticeContent;
		private Date noticeDate;
		private int noticeReadcount;
		private String status;
		
		public Event() {
			
		}

		public Event(String noticetitle, String noticeContent) {
			super();
			this.noticetitle = noticetitle;
			this.noticeContent = noticeContent;
		}

		public Event(int noticeNo, int noticeType, String noticetitle, String noticeContent, Date noticeDate,
				int noticeReadcount, String status) {
			super();
			this.noticeNo = noticeNo;
			this.noticeType = noticeType;
			this.noticetitle = noticetitle;
			this.noticeContent = noticeContent;
			this.noticeDate = noticeDate;
			this.noticeReadcount = noticeReadcount;
			this.status = status;
		}

		public int getNoticeNo() {
			return noticeNo;
		}

		public void setNoticeNo(int noticeNo) {
			this.noticeNo = noticeNo;
		}

		public int getNoticeType() {
			return noticeType;
		}

		public void setNoticeType(int noticeType) {
			this.noticeType = noticeType;
		}

		public String getNoticetitle() {
			return noticetitle;
		}

		public void setNoticetitle(String noticetitle) {
			this.noticetitle = noticetitle;
		}

		public String getNoticeContent() {
			return noticeContent;
		}

		public void setNoticeContent(String noticeContent) {
			this.noticeContent = noticeContent;
		}

		public Date getNoticeDate() {
			return noticeDate;
		}

		public void setNoticeDate(Date noticeDate) {
			this.noticeDate = noticeDate;
		}

		public int getNoticeReadcount() {
			return noticeReadcount;
		}

		public void setNoticeReadcount(int noticeReadcount) {
			this.noticeReadcount = noticeReadcount;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "Event [noticeNo=" + noticeNo + ", noticeType=" + noticeType + ", noticetitle=" + noticetitle
					+ ", noticeContent=" + noticeContent + ", noticeDate=" + noticeDate + ", noticeReadcount="
					+ noticeReadcount + ", status=" + status + "]";
		}
		
		
		
	}


