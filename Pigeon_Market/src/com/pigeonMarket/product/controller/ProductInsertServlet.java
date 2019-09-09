package com.pigeonMarket.product.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;
import com.pigeonMarket.common.MyFileRenamePolicy;
import com.pigeonMarket.member.model.vo.Member;
import com.pigeonMarket.product.model.service.ProductService;
import com.pigeonMarket.product.model.vo.Attachment;
import com.pigeonMarket.product.model.vo.Product;
import com.pigeonMarket.member.model.*;
import com.pigeonMarket.member.model.vo.Member;

/**
 * Servlet implementation class ProductInsertServlet
 */
@WebServlet("/insert.pr")
public class ProductInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		
		// String title = request.getParameter("title");
		
		// 폼 전송을 multipart/form-data 로 전송하는 경우 다른 방식으로 값 추출
		// 파일 업로드를 위한 라이브러리 : cos.jar (com.orelilly.servlet의 약자)
		// http://www.servlets.com
		
		// enctype이 multipart/form-data로 전송되었는지 확인!
		if(ServletFileUpload.isMultipartContent(request)) {
			
			// 1. 전송된 파일들을 가지고 작업할 내용( 전송파일 용량 제산, 저장될 경로)
			// 1_1.  전송파일 용량 제한 : 10Mbyre로 제한 한 경우
			
			int maxSize = 1024*1024*10;
			
			// 1_2. 웹 서버 컨테이너 경로(WebContent)/resources 경로 추출
			String resources = request.getSession().getServletContext().getRealPath("/resources");
			
			// 한 폴더에는 총 65000개까지의 파일만 저장 가능하다.
			// 폴더별로 구분을 해 놓는게 좋음
			
			// 1_3. 파일이 실제로 저장될 경로(resources/ThumbnailuploadFiles/)
			String savePath = resources + "/product_uploadFiles/";
			
			
			/*
			 * 2. 파일명 수정 및 저장 작업
			 * 
			 * HttpServletRequest --> MultipartRequest로 변경
			 * 
			 * MultipartRequest MultiRequest 
			 *  = new MultipartRequest(request, savePath, maxSize,"UTF-8", new DefaultFileRenamePolicy());
			 *  
			 *  
			 *  위의 MultipartRequest 객체 생성과 동시에 업로드한 파일들이 서버로 업로드 된다.
			 *  --> 즉, 문제가 있든 없든 간에 우선 서버에 업로드 된다.
			 *  --> 만약에 문제가 있을 경우 업로드된 파일을 삭제시켜야된다.
			 *  
			 *  사용자가 올린 파일명 그대로 저장하지 않는게 일반적!!!
			 *  - 같은 파일명이 있을 경우 덮어씌워질 수도 있다.
			 *  - 한글로 된 파일명, 특수기호나 띄어쓰기 등은 서버에 따라 문제가 생길수도 있다.
			 *  
			 *  
			 *  DefaultFileRenamePolicy 는 cos.jar안에 존재하는 클래스
			 *  위에 multiRequest 객체 생성시 DefaultFileRenamePolicy 클래스의 rename 메소드가 실행되면서 파일명 수정됨
			 *  ex) aaa.zip, aaa1.zip. aaa2.zip
			 *  
			 *  우리는 직접 rename 할거임
			 *  --> common 패키지에 MyFileRenamePolicy 클래스 만들자!!  
			 */
			
			// 2_1. multiRequest 객체 생성하기
			MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new MyFileRenamePolicy());
			// --> 이순간 서버에 파일 업로드됨
			
			//2_2. DB에 저장하기 위해 change_name과 origin_name 각각의 ArrayList 만들어줄꺼임--> 다중파일이기 때문
			
			
			// 실제로 저장된 파일의 이름(수정명)을 저장할 ArrayList
			ArrayList<String> changeFiles = new ArrayList<>();
			//원폰 파일의 이름을 저장할 ArrayList
			ArrayList<String> originFiles = new ArrayList<>();
			
			Enumeration<String> files = multiRequest.getFileNames(); // 전송된 역순으로 담겨있다.
			while(files.hasMoreElements()) {
				
				String name = files.nextElement(); //files에 담겨있는 파일 하나씩 뽑아내기
				
				if(multiRequest.getFilesystemName(name) != null) { //파일이 null이 아닐경우
					
					//수정명
					String changeName= multiRequest.getFilesystemName(name);
					//원본명
					String originName = multiRequest.getOriginalFileName(name);
					changeFiles.add(changeName);
					originFiles.add(originName);
				}			
			}
			
			// 3_1. 파일 외에 게시판 제목, 내용, 작성자 회원번호 받아오기 --> Board 객체 생성
			String pId = String.valueOf(((Member)request.getSession().getAttribute("loginUser")).getUserId());
			int price = Integer.parseInt(multiRequest.getParameter("price"));
			String categoryCode = multiRequest.getParameter("categoryCode");
			String productTitle = multiRequest.getParameter("productTitle");
			String productContents = multiRequest.getParameter("productContents");
			
			Product p = new Product();
			p.setpId(pId);
			p.setPrice(price);
			p.setCategoryCode(categoryCode);
			p.setProductTitle(productTitle);
			p.setProductContents(productContents);
			
			// 3_2. Attachment 테이블에 값 삽입할 것들 작업하기 --> Attachment 객체들을 담을 리스트
			ArrayList<Attachment> fileList = new ArrayList<>();
			
			// 전송순서 역순으로 담겨 있기 때문에 마지막 인덱스부터 접근하게 끔
			for(int i=originFiles.size()-1; i>=0; i--) {
				
				Attachment at = new Attachment();
				at.setFilePath(savePath);
				at.setOriginName(originFiles.get(i));
				at.setChangeName(changeFiles.get(i));
				
				//타이틀 이미지일 경우 fileLevel 0으로, 내용 이미지일 경우 fileLevel 1로
				if(i ==originFiles.size()-1) {
					at.setFileLevel(0);
				}else {
					at.setFileLevel(1);				
				
				}
				fileList.add(at);
			}
			
			// 4. 사진 게시판 작성용 서비스 요청(board 객체, 첨부파일 리스트 전달
			
			int result = new ProductService().insertProduct(p,fileList);
			
			if(result >0) {
				response.sendRedirect("list.pr"); // 마이페이지 판매상품리시트로 이동???
			}else {
				
				// 저장된 사진 삭제
				for(int i=0; i<changeFiles.size(); i++) {
					
					// 삭제할 파일 객체 생성
					File failedFile = new File(savePath + changeFiles.get(i));
					failedFile.delete();
				}
				
				
				request.setAttribute("msg", "제품등록 등록 실패!!");
				request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
				
			}
			
		}	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
