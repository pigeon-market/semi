package com.pigeonMarket.inquiry.model.dao;

import static com.pigeonMarket.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.pigeonMarket.inquiry.model.vo.Inquiry;
import com.pigeonMarket.inquiry.model.dao.InquiryDao;

public class InquiryDao {
	
	private Properties prop = new Properties();
	
	public InquiryDao() { 
	
	String fileName = InquiryDao.class.getResource("/com/pigeonMarket/sql/inquiry/inquiry-query.properties").getPath();
	
	try {
		prop.load(new FileReader(fileName));
	} catch (IOException e) {
		e.printStackTrace();
	}
}

	public int insertInquiry(Connection conn, Inquiry i) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("insertInquiry");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, i.getInquiryTitle());
			pstmt.setString(2, i.getInquiryContent());

			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;

	}


}
