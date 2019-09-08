package com.pigeonMarket.product.model.dao;

import static com.pigeonMarket.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.pigeonMarket.product.model.vo.Attachment;
import com.pigeonMarket.product.model.vo.Product;
import com.pigeonMarket.product.model.vo.ProductSale;


public class ProductDao {
	
	private Properties prop = new Properties();
	
	public ProductDao() {
		
		String fileName = ProductDao.class.getResource("/com/pigeonMarket/sql/product/product-query.properties").getPath();
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일로드 불가");
		}

		
	}

	/**
	 * 판매 글등록
	 * @param conn
	 * @param p
	 * @return
	 */
	public int insertProduct(Connection conn, Product p) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("insertProduct");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getpId());
			pstmt.setInt(2, p.getPrice());
			pstmt.setString(3, p.getCategoryCode());
			pstmt.setString(4, p.getProductTitle());
			pstmt.setString(5, p.getProductContents());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;		
		
	}

	/**
	 * 판매 사진등록
	 * @param conn
	 * @param fileList
	 * @return
	 */
	public int insertAttachment(Connection conn, ArrayList<Attachment> fileList) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("insertAttachment");
		
		try {
			
			for(int i=0; i<fileList.size(); i++) {
				Attachment at = fileList.get(i);
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, at.getOriginName());
				pstmt.setString(2, at.getChangeName());
				pstmt.setString(3, at.getFilePath());
				pstmt.setInt(4, at.getFileLevel());
				
				result = pstmt.executeUpdate();	
				
				if(result <=0 ) {
					break;
				}
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}		
		
		return result;
	}

	/**
	 * 상품제목 썸네일 리스트
	 * @param conn
	 * @return
	 */
	public ArrayList<ProductSale> selectPrList(Connection conn) {
		
		ArrayList<ProductSale> prList = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectPrList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				prList.add(new ProductSale(rset.getInt("PRODUCT_OK_NO"),
										   rset.getString("P_ID"),
										   rset.getInt("PRICE"),
										   rset.getString("CATEGORY_CODE"),
										   rset.getString("PRODUCT_TITLE"),
										   rset.getString("PRODUCT_CONTENTS"),
										   rset.getDate("REG_DATE"),
										   rset.getDate("APPROVAL_DATE"),
										   rset.getString("PRODUCT_STATE"),
										   rset.getString("STATUS")	));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
			
		}
		
		return prList;
	}

	/**
	 *  상품사진 썸네일 리스트
	 * @param conn
	 * @return 사진 리스트  fileLever = 1
	 */
	public ArrayList<Attachment> selectAtList(Connection conn) {
		
		ArrayList<Attachment> at = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectAtList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				at.add(new Attachment(rset.getInt("F_ID"),
									  rset.getInt("PRODUCT_OK_NO"),
									  rset.getString("ORIGIN_NAME"),
									  rset.getString("CHANGE_NAME"),
									  rset.getString("FILE_PATH"),
									  rset.getInt("FILE_LEVEL")));
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}		
		return at;
	}

	/**
	 * 상품 상세 판매자 작성 글 가져오기
	 * @param conn
	 * @param productOkNo
	 * @return
	 */
	public ProductSale selectProduct(Connection conn, int productOkNo) {
		ProductSale pr = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectProduct");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, productOkNo);			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				pr = new ProductSale(rset.getInt("PRODUCT_OK_NO"),
										   rset.getString("P_ID"),
										   rset.getInt("PRICE"),
										   rset.getString("CATEGORY_CODE"),
										   rset.getString("PRODUCT_TITLE"),
										   rset.getString("PRODUCT_CONTENTS"),
										   rset.getDate("REG_DATE"),
										   rset.getDate("APPROVAL_DATE"),
										   rset.getString("PRODUCT_STATE"),
										   rset.getString("STATUS"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
			
		}
		
		return pr;
	}

	/** 
	 * 상품 상세사진 리스트    FILE_LEVER 2  빼고 가져오기 2인 인증용으로만 사용함 
	 * @param conn
	 * @param productOkNo
	 * @return
	 */
	public ArrayList<Attachment> selectAttachment(Connection conn, int productOkNo) {
		
		ArrayList<Attachment> file = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectAttachment");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, productOkNo);			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				file.add(new Attachment(rset.getInt("F_ID"),
									  rset.getInt("PRODUCT_OK_NO"),
									  rset.getString("ORIGIN_NAME"),
									  rset.getString("CHANGE_NAME"),
									  rset.getString("FILE_PATH"),
									  rset.getInt("FILE_LEVEL")));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}		
		return file;
	}

	public ArrayList<ProductSale> selectcgPrList(Connection conn, String categoryCode) {
		ArrayList<ProductSale> prList = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectcgPrList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, categoryCode);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				prList.add(new ProductSale(rset.getInt("PRODUCT_OK_NO"),
										   rset.getString("P_ID"),
										   rset.getInt("PRICE"),
										   rset.getString("CATEGORY_CODE"),
										   rset.getString("PRODUCT_TITLE"),
										   rset.getString("PRODUCT_CONTENTS"),
										   rset.getDate("REG_DATE"),
										   rset.getDate("APPROVAL_DATE"),
										   rset.getString("PRODUCT_STATE"),
										   rset.getString("STATUS")	));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
			
		}
		
		return prList;
	}
	

	public int deleteProduct(Connection conn, int no) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("deleteProduct");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
		
	}

	

}

