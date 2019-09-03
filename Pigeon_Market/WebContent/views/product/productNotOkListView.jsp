<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList, 
	com.pigeonMarket.product.model.vo.*, com.pigeonMarket.category.model.vo.*"%>
<% 
	ArrayList<ProductSale> prList = (ArrayList<ProductSale>)request.getAttribute("prList");
	ArrayList<Attachment> atList = (ArrayList<Attachment>)request.getAttribute("atList");
	ArrayList<Category> cgList = (ArrayList<Category>)request.getAttribute("cgList");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>미승인된 상품 목록</title>
</head>
<body>
	<%@ include file="../common/menubar.jsp"%>

	<section id="main" class="container">
		<header>
			<h2>미승인된 상품 목록</h2>
		</header>
		<div class="category_tab">
			<ul class="overflow">
			<% for(Category c : cgList){ %>
				<li><a href="<%= contextPath%>/listCg.pr?cg=<%= c.getCategoryCode()%>"><%= c.getCategoryName() %></a></li>
			<%} %>
			</ul>
		</div>

		<table style="text-align: center" id="detailArea">
			<% for(Category c : cgList){ int count=0;%>
				<tr>
					<td colspan="4"><%= c.getCategoryName() %></td>
				</tr>
				<tr id="list">
					<%for (ProductSale ps : prList){  %>	 <!-- 전체 리스트 불러오기  -->
						<%for(Attachment at : atList){%>	<!-- 사진리스트 불러오기  -->
								<%if(at.getProductNo() == ps.getProductOkNo()){ %> <!-- 사진상품번호 와 상품번호가 같을 경우 -->
									<td width="25%" height="300px">
									<a href="<%= contextPath%>/detail.pr?pNo=<%= ps.getProductOkNo()%>" >
										<img src="<%= contextPath %>/resources/thumbnail_uploadFiles/<%= at.getChangeName()%>" width="100%" height="100%">
										<p><%= ps.getProductTitle() %></p>
										<P><%= ps.getPrice() %>원</p>
									</a>
									</td>
									
								<%} %>
							<% } %>
						<% count= count+1; } %>	
						
				</tr>
				<tr>
					<td colspan="4"><a href="<%= contextPath%>/listCg.pr?cg=<%= c.getCategoryCode()%>"><%= c.getCategoryName() %>더보기</td>
				</tr>
			
			<%} %>
			<tr>

		</table>
	</section>

	<%@ include file="../common/foot.jsp"%>
	
	
		<script>
		$(function(){
			$("#listArea td").mouseenter(function(){
				$(this).parent().css({"background":"darkgray", "cursor":"pointer"});
			}).mouseout(function(){
				$(this).parent().css("background", "black");
			}).click(function(){
				
				var bId = $(this).parent().children().eq(0).text();
				
				<% if(loginUser != null){ %> // 로그인한 회원만 이용가능하게
					location.href="<%= contextPath %>/detail.bo?bId=" + bId;
				<%}else{ %>
					alert("로그인해야만 상세보기가 가능합니다!");
				<%}%>
			});
		});
		
		console.log($("b.getbId"))
	</script>
	
	
	
</body>
</html>