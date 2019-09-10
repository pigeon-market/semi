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

/**
 * Servlet implementation class ProductInsertServlet
 */
@WebServlet("/update.pr")
public class ProductUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		
		// String title = request.getParameter("title");
		
		// �뤌 �쟾�넚�쓣 multipart/form-data 濡� �쟾�넚�븯�뒗 寃쎌슦 �떎瑜� 諛⑹떇�쑝濡� 媛� 異붿텧
		// �뙆�씪 �뾽濡쒕뱶瑜� �쐞�븳 �씪�씠釉뚮윭由� : cos.jar (com.orelilly.servlet�쓽 �빟�옄)
		// http://www.servlets.com
		
		// enctype�씠 multipart/form-data濡� �쟾�넚�릺�뿀�뒗吏� �솗�씤!
		if(ServletFileUpload.isMultipartContent(request)) {
			
			// 1. �쟾�넚�맂 �뙆�씪�뱾�쓣 媛�吏�怨� �옉�뾽�븷 �궡�슜( �쟾�넚�뙆�씪 �슜�웾 �젣�궛, ���옣�맆 寃쎈줈)
			// 1_1.  �쟾�넚�뙆�씪 �슜�웾 �젣�븳 : 10Mbyre濡� �젣�븳 �븳 寃쎌슦
			
			int maxSize = 1024*1024*10;
			
			// 1_2. �쎒 �꽌踰� 而⑦뀒�씠�꼫 寃쎈줈(WebContent)/resources 寃쎈줈 異붿텧
			String resources = request.getSession().getServletContext().getRealPath("/resources");
			
			// �븳 �뤃�뜑�뿉�뒗 珥� 65000媛쒓퉴吏��쓽 �뙆�씪留� ���옣 媛��뒫�븯�떎.
			// �뤃�뜑蹂꾨줈 援щ텇�쓣 �빐 �넃�뒗寃� 醫뗭쓬
			
			// 1_3. �뙆�씪�씠 �떎�젣濡� ���옣�맆 寃쎈줈(resources/ThumbnailuploadFiles/)
			String savePath = resources + "/product_uploadFiles/";
			
			
			/*
			 * 2. �뙆�씪紐� �닔�젙 諛� ���옣 �옉�뾽
			 * 
			 * HttpServletRequest --> MultipartRequest濡� 蹂�寃�
			 * 
			 * MultipartRequest MultiRequest 
			 *  = new MultipartRequest(request, savePath, maxSize,"UTF-8", new DefaultFileRenamePolicy());
			 *  
			 *  
			 *  �쐞�쓽 MultipartRequest 媛앹껜 �깮�꽦怨� �룞�떆�뿉 �뾽濡쒕뱶�븳 �뙆�씪�뱾�씠 �꽌踰꾨줈 �뾽濡쒕뱶 �맂�떎.
			 *  --> 利�, 臾몄젣媛� �엳�뱺 �뾾�뱺 媛꾩뿉 �슦�꽑 �꽌踰꾩뿉 �뾽濡쒕뱶 �맂�떎.
			 *  --> 留뚯빟�뿉 臾몄젣媛� �엳�쓣 寃쎌슦 �뾽濡쒕뱶�맂 �뙆�씪�쓣 �궘�젣�떆耳쒖빞�맂�떎.
			 *  
			 *  �궗�슜�옄媛� �삱由� �뙆�씪紐� 洹몃�濡� ���옣�븯吏� �븡�뒗寃� �씪諛섏쟻!!!
			 *  - 媛숈� �뙆�씪紐낆씠 �엳�쓣 寃쎌슦 �뜮�뼱�뵆�썙吏� �닔�룄 �엳�떎.
			 *  - �븳湲�濡� �맂 �뙆�씪紐�, �듅�닔湲고샇�굹 �쓣�뼱�벐湲� �벑�� �꽌踰꾩뿉 �뵲�씪 臾몄젣媛� �깮湲몄닔�룄 �엳�떎.
			 *  
			 *  
			 *  DefaultFileRenamePolicy �뒗 cos.jar�븞�뿉 議댁옱�븯�뒗 �겢�옒�뒪
			 *  �쐞�뿉 multiRequest 媛앹껜 �깮�꽦�떆 DefaultFileRenamePolicy �겢�옒�뒪�쓽 rename 硫붿냼�뱶媛� �떎�뻾�릺硫댁꽌 �뙆�씪紐� �닔�젙�맖
			 *  ex) aaa.zip, aaa1.zip. aaa2.zip
			 *  
			 *  �슦由щ뒗 吏곸젒 rename �븷嫄곗엫
			 *  --> common �뙣�궎吏��뿉 MyFileRenamePolicy �겢�옒�뒪 留뚮뱾�옄!!  
			 */
			
			// 2_1. multiRequest 媛앹껜 �깮�꽦�븯湲�
			MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new MyFileRenamePolicy());
			// --> �씠�닚媛� �꽌踰꾩뿉 �뙆�씪 �뾽濡쒕뱶�맖
			
			//2_2. DB�뿉 ���옣�븯湲� �쐞�빐 change_name怨� origin_name 媛곴컖�쓽 ArrayList 留뚮뱾�뼱以꾧볼�엫--> �떎以묓뙆�씪�씠湲� �븣臾�
			
			
			// �떎�젣濡� ���옣�맂 �뙆�씪�쓽 �씠由�(�닔�젙紐�)�쓣 ���옣�븷 ArrayList
			ArrayList<String> changeFiles = new ArrayList<>();
			//�썝�룿 �뙆�씪�쓽 �씠由꾩쓣 ���옣�븷 ArrayList
			ArrayList<String> originFiles = new ArrayList<>();
			
			Enumeration<String> files = multiRequest.getFileNames(); // �쟾�넚�맂 �뿭�닚�쑝濡� �떞寃⑥엳�떎.
			while(files.hasMoreElements()) {
				
				String name = files.nextElement(); //files�뿉 �떞寃⑥엳�뒗 �뙆�씪 �븯�굹�뵫 戮묒븘�궡湲�
				
				if(multiRequest.getFilesystemName(name) != null) { //�뙆�씪�씠 null�씠 �븘�땺寃쎌슦
					
					//�닔�젙紐�
					String changeName= multiRequest.getFilesystemName(name);
					//�썝蹂몃챸
					String originName = multiRequest.getOriginalFileName(name);
					changeFiles.add(changeName);
					originFiles.add(originName);
				}			
			}
			
			// 3_1. �뙆�씪 �쇅�뿉 寃뚯떆�뙋 �젣紐�, �궡�슜, �옉�꽦�옄 �쉶�썝踰덊샇 諛쏆븘�삤湲� --> Board 媛앹껜 �깮�꽦
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
			
			// 3_2. Attachment �뀒�씠釉붿뿉 媛� �궫�엯�븷 寃껊뱾 �옉�뾽�븯湲� --> Attachment 媛앹껜�뱾�쓣 �떞�쓣 由ъ뒪�듃
			ArrayList<Attachment> fileList = new ArrayList<>();
			
			// �쟾�넚�닚�꽌 �뿭�닚�쑝濡� �떞寃� �엳湲� �븣臾몄뿉 留덉�留� �씤�뜳�뒪遺��꽣 �젒洹쇳븯寃� �걫
			for(int i=originFiles.size()-1; i>=0; i--) {
				
				Attachment at = new Attachment();
				at.setFilePath(savePath);
				at.setOriginName(originFiles.get(i));
				at.setChangeName(changeFiles.get(i));
				
				//���씠�� �씠誘몄��씪 寃쎌슦 fileLevel 0�쑝濡�, �궡�슜 �씠誘몄��씪 寃쎌슦 fileLevel 1濡�
				if(i ==originFiles.size()-1) {
					at.setFileLevel(0);
				}else {
					at.setFileLevel(1);				
				
				}
				fileList.add(at);
			}
			
			// 4. �궗吏� 寃뚯떆�뙋 �옉�꽦�슜 �꽌鍮꾩뒪 �슂泥�(board 媛앹껜, 泥⑤��뙆�씪 由ъ뒪�듃 �쟾�떖
			
			int result = new ProductService().insertProduct(p,fileList);
			
			if(result >0) {
				response.sendRedirect("list.pr"); // 留덉씠�럹�씠吏� �뙋留ㅼ긽�뭹由ъ떆�듃濡� �씠�룞???
			}else {
				
				// ���옣�맂 �궗吏� �궘�젣
				for(int i=0; i<changeFiles.size(); i++) {
					
					// �궘�젣�븷 �뙆�씪 媛앹껜 �깮�꽦
					File failedFile = new File(savePath + changeFiles.get(i));
					failedFile.delete();
				}
				
				
				request.setAttribute("msg", "�젣�뭹�벑濡� �벑濡� �떎�뙣!!");
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
