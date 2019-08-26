<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, com.pigeonMarket.product.model.vo.*"%>
    
<% 
	ArrayList<ProductSale> prList = (ArrayList<ProductSale>)request.getAttribute("prList");
	ArrayList<Attachment> atList = (ArrayList<Attachment>)request.getAttribute("atList");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	.ourter{
		width:1000px;
		height:700px;
		background:black;
		color:white;
		margin-left:auto;
		margin-right:auto;
		margin-top:50px;
	}
	.thumbnailArea{
		width:760px;
		height:550px;
		margin-left:auto;
		margin-right:auto;
	}
	.thumb-list{
		display:inline-block;
		width:220px;
		border:1px solid white;
		align:center;
		margin:10px;
	}
	.thumb-list:hover{
		opacity:0.7;
		cursor:pointer;
	}

</style>
</head>
<body>

<%@ include file="../common/menubar.jsp" %>
	
	<div class="ourter">
		<br>
		<h2 align="center">상품 구입</h2>
		
		<div class="thumbnailArea">
			<% for(ProductSale p : prList){%>
				<div class="thumb-list" align="center">
					<input type="hidden" value="<%= p.getProductOkNo() %>">
					<div>
						<%for(Attachment at : atList){ %>							
							<%if(p.getProductOkNo() == at.getProductNo()){ %>							
								<img src="<%= contextPath %>/resources/product_uploadFiles/<%= at.getChangeName() %>" width="200px" height="150px">							
							<%} %>							
						<%} %>				
					</div>
					<p>
						NO.<%= p.getProductOkNo() %> <%= p.getProductTitle() %>
					</p>
				</div>			
			<%} %>
		</div>
		
		<% if(loginUser != null) { %>
		<button onclick="location.href='<%= contextPath %>/insertForm.pr'">작성하기</button>
	<%} %>
	
	</div>
	
	<script>
		$(function(){
			$(".thumb-list").click(function(){
				var ProductOkNo = $(this).children().eq(0).val();
				location.href="<%= contextPath %>/detail.pr?ProductOkNo="+ ProductOkNo;
			
			});
		});
	</script>

</body>
</html>