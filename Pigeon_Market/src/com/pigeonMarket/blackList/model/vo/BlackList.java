package com.pigeonMarket.blackList.model.vo;

import java.sql.Date;

public class BlackList {

	private int reportNo;
	private String blackId;
	private String reporterId;
	private Date reproterDate;
	private String reporterReason;
	
	public BlackList() {
		
	}

	public BlackList(int reportNo, String blackId, String reporterId, Date reproterDate, String reporterReason) {
		super();
		this.reportNo = reportNo;
		this.blackId = blackId;
		this.reporterId = reporterId;
		this.reproterDate = reproterDate;
		this.reporterReason = reporterReason;
	}

	public int getReportNo() {
		return reportNo;
	}

	public void setReportNo(int reportNo) {
		this.reportNo = reportNo;
	}

	public String getBlackId() {
		return blackId;
	}

	public void setBlackId(String blackId) {
		this.blackId = blackId;
	}

	public String getReporterId() {
		return reporterId;
	}

	public void setReporterId(String reporterId) {
		this.reporterId = reporterId;
	}

	public Date getReproterDate() {
		return reproterDate;
	}

	public void setReproterDate(Date reproterDate) {
		this.reproterDate = reproterDate;
	}

	public String getReporterReason() {
		return reporterReason;
	}

	public void setReporterReason(String reporterReason) {
		this.reporterReason = reporterReason;
	}

	@Override
	public String toString() {
		return "BlackList [reportNo=" + reportNo + ", blackId=" + blackId + ", reporterId=" + reporterId
				+ ", reproterDate=" + reproterDate + ", reporterReason=" + reporterReason + "]";
	}
	
	
	
}
