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
<title>Insert title here</title>
<style>
	.category_tab {
		display: block;
		box-sizing: border-box;
		width: 1200px;
		margin: auto;
	}

	.overflow {
		list-style-type: none;
		height: 100px;
		padding: 0;
		margin: 0;
	}

	.overflow>li {
		float: left;
		width: 120px;
		height: 100px;
		text-align: center;
	}

	.overflow li a {
		display: block;
		height: 100%;
		line-height: 30px;
		text-decoration: none;
		font-size: 11pt;
		padding-top: 3px;
		color: black;
		border: 0px;
	}

	.overflow li a:hover {
		color: orange;
		cursor:pointer;
	}
	table td {
    	padding: 0.3em 0.3em;
	}
	p {
   		display: block;
   	 	margin-block-start: 0em;
    	margin-block-end: 0em;
    	margin-inline-start: 0px;
    	margin-inline-end: 0px;
	}
	table td p {
		margin: 0 0 0 0;
	}
	#list > td:hover{
		cursor:pointer;
	}
</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp"%>

	<section id="main" class="container">
		<header>
			<h2>상품구매</h2>
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
					 <%if (c.getCategoryCode().equals(ps.getCategoryCode()) && (count<4)){ %> <!-- 카테고리와 같을 경우 -->
						<%for(Attachment at : atList){%>	<!-- 사진리스트 불러오기  -->
								<%if(at.getProductNo() == ps.getProductOkNo()){ %> <!-- 사진상품번호 와 상품번호가 같을 경우 -->
									<td width="25%" height="300px">
										<input type="hidden" id ="pNo" value="<%= ps.getProductOkNo() %>">
										</td>
										<td>
										<img src="<%= contextPath %>/resources/thumbnail_uploadFiles/<%= at.getChangeName()%>" width="100%" height="100%">
										<p><%= ps.getProductTitle() %></p>
										<P><%= ps.getPrice() %>원</p>
										</td>
									
								<%} %>
							<% } %>
						<% count= count+1; } %>
						
						
					<%} %>
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
	
	/* 	$(function() {
			
			$("#detail td").click(function() {
				var bId = $(this).parent().children().eq(0).val();
				
			}).css("background", "black");
			
		}); */
		
		$(function(){
			$("#detail td").mouseenter(function(){
				$(this).parent().css({"background":"darkgray","cursor":"pointer"});
			}).mouseout(function(){
				$(this).parent().css("background", "black");
			}).click(function(){
				var bId = $(this).parent().children().eq(0).val();
				
				
			});
		});
		
	
	</script>


</body>
</html>
