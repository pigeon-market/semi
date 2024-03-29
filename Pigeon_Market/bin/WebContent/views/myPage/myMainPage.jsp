<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.pigeonMarket.member.model.vo.Member, java.util.ArrayList, com.pigeonMarket.dealInfo.model.vo.Activity" %>
<%
	Member m = (Member)session.getAttribute("loginUser");

	ArrayList<Activity> aList = (ArrayList<Activity>)request.getAttribute("aList");
	ArrayList<String> range = (ArrayList<String>)request.getAttribute("range");
	
	
	
	int maxNum = 0;
	int viewNum = 0;
	String status = "";
	
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>수정중</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<style>
.col-3 {
	text-align: center;
}

hr {
	border: 1px solid rgba(79, 106, 228, 0.685);
}

.listTable{

	width:100%;
	padding-left:5%;
	padding-right:5%;
}
.imgDiv, .statusDiv, .titleDiv{
	
	display:inline-block;

	
	
}
</style>

</head>


<body class="is-preload">
		<%@ include file="../common/menubar.jsp" %>
	<div id="page-wrapper">


		<!-- Main -->
		<section id="main" class="container"> <header>
		<h2>MyPage</h2>
		

		</header>
		<div class="row">
			<div class="col-12">
				<section>
				<div class="box alt">
					<div class="row gtr-50 gtr-uniform">
						<div class="col-12" style="text-align: center" >
						<span class="image fit" onclick="location.href='<%= contextPath %>/Activity.me?status=all&page=1&group=15&period=&date='"><img src="<%= contextPath %>/resources/images/pic04.jpg">개인정보수정</span>
						</div>
						<div class="col-3">
						<span class="image fit" onclick="location.href='<%= contextPath %>/Activity.me?status=all&page=1&group=15&period=&date='"><img src="<%= contextPath %>/resources/images/pic04.jpg">활동조회</span>
						</div>
						<div class="col-3">
						<span class="image fit" onclick="location.href='<%= contextPath %>/Activity.me?status=sell&page=1&group=15&period=&date='"><img src="<%= contextPath %>/resources/images/pic04.jpg">판매조회</span>
						</div>
						<div class="col-3">
						<span class="image fit" onclick="location.href='<%= contextPath %>/Activity.me?status=buy&page=1&group=15&period=&date='"><img src="<%= contextPath %>/resources/images/pic04.jpg">구매조회</span>
						</div>
						<div class="col-3">
<<<<<<< HEAD
								<span class="image fit" onclick="location.href='<%= contextPath %>/insert.sm'"><img src="images/pic04.jpg">거래조회</span>
=======
						<!--	<span class="image fit"><img src="images/pic04.jpg" alt="" /></span>거래조회 -->
>>>>>>> parent of 8ae0e8c... 0904_0221
						</div>

					</div>
				</div>

				</section>

				<!-- Text -->
				<section class="box">
				<form>
					<h2>최근 활동 기록</h2>
					
					
					<% while(maxNum < aList.size()) { %>
					
							<h3><%= aList.get(maxNum).getaDate() %></h3>
							
							<% for(int i = maxNum ; i< Integer.parseInt(range.get(viewNum)) ; i++) { %>


								<% switch(aList.get(i).getStatus()) { 
										case "SIGNIN" : 
											status = "회원가입";
											break;
										case "INQUIRY_Q" : 
											status = "문의등록";
											break;
										case "INQUIRY_A" : 
											status = "문의답변";
											break;
										case "PRODUCT_R" : 
											status = "판매등록";
											break;
										case "PRODUCT_E" : 
											status = "판매완료";
											break;
										case "PRODUCT_A" : 
											status = "판매승인";
											break;
										case "REVIEW" : 
											status = "리뷰작성";
											break;

								}%>

								<div class="listTable">
									<div class="statusDiv">
										<%= status %>     
									</div>
									<div class="imgDiv">
								<% if(aList.get(i).getChangeName() != null ) {%>
									<img src="<%= contextPath %>/resources/thumbnail_uploadFiles/<%=aList.get(i).getChangeName() %>" width="200px" height="150px"> 
					
								<% } %>
									</div>
									<div class="titleDiv">		
								<%= aList.get(i).getTitle() %>
									</div>
										<hr>
								</div>
							
									
											<br>
									
								<%} %>
								<hr>
					<% maxNum=Integer.parseInt(range.get(viewNum)); viewNum = viewNum+1; %>
					
							
					<%} %>
					
					</form>
				</section>

			</div>
		</div>

		</section>



	</div>

<%@ include file="../common/foot.jsp"%>

<script>
	$(function() {
		$(".listTable div").mouseenter(function() {
			$(this).parent().css({"cursor": "pointer"});
			$(this).parent().children().css({"background":"yellow"});
		}).click(function() {

			
		}).mouseout(function() {
			$(this).parent().children().css({"background":"white"});
		});
		
	});


</script>


</body>
</html>