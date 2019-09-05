<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.pigeonMarket.review.model.vo.Review" %>

<%
	Review r = (Review)request.getAttribute("r");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
<style>
	.outer{
		width:800px;
		color:black;
		margin-left:auto;
		margin-right:auto;
		margin-top:50px;
	}
	table, td{
		border:1px solid white;
	}
	.tableArea{

		margin-left:auto;
		margin-right:auto;
	}
	#content{

	}
</style>
</head>
<body>


<%@ include file="../common/menubar.jsp" %>
		

		
	<div class="outer">
		<br>
		
		<h2 align="center">게시판 상세보기</h2>
		
		<div class="tableArea">
			
			<table align="center" width="800px">
				
				<tr>
					<td>제목</td>
					<td><%= r.getReviewTitle() %></td>
					<td>조회수</td>
					<td><%= r.getReviewReadcount() %></td>
				</tr>
				<tr>
					<td>작성일</td>
					<td><%= r.getReviewDate() %></td>
					<td>작성자</td>
					<td><%= r.getUserId() %></td>
				</tr>
				<tr>
						<td>내용</td>
					<td colspan="3">
						<p id="content"><%= r.getReviewContent() %></p>
					</td>
				</tr>
			</table>
			
			<div align="center">
			<form action="<%= contextPath %>/review.re" method="post">
				<input type="submit" value="이전으로">
					<!-- 관리자만 볼 수 있는 작성하기 버튼 -->
	 <%if(loginUser != null && loginUser.getUserId().equals("user10")){ %>
				<input type="button" onclick="updateForm();" value="수정하기">
				<input type="button" onclick="deleteBoard();" value="삭제하기">
					<%} %>	
			</form>
			</div>
		</div>
	</div>
	<form action="" id="detailForm" method="post">
		<input type="hidden" name="nno" value="<%= r.getReviewNo() %>">
	</form>
	<%@ include file="../common/foot.jsp" %>
	<script>
		function updateForm(){
			//location.href="<%=contextPath%>/updateForm.no" + <%= r.getReviewNo() %>;
			// 위의 방식대로 하면 url에 그대로 노출.. --> 직접 url창에 타고 들어갈수있다!!!
			
			$("#detailForm").attr("action", "<%=contextPath%>/updateForm.re");
			$("#detailForm").submit();
			
		}
		function deleteBoard(){
			console.log(<%= r.getReviewNo() %>);
			$("#detailForm").attr("action", "<%=contextPath%>/delete.re");
			$("#detailForm").submit();
		}
	</script>


</body>
</html>