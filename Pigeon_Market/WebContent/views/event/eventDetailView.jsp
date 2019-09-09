<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.pigeonMarket.event.model.vo.Event" %>
<%
	Event e = (Event)request.getAttribute("e");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	.outer{
		width:70%;
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

		<h2 align="center">이벤트 상세보기</h2>

		<div class="tableArea">

			<table align="center" width="800px">

				<tr>
					<td>제목</td>
					<td><%= e.getNoticetitle() %></td>
					<td>조회수</td>
					<td><%= e.getNoticeReadcount() %></td>
					<td>작성일</td>
					<td><%= e.getNoticeDate() %></td>
				</tr>
				<tr>
					<td>내용</td>
					<td colspan="5">
						<p id="content"><%= e.getNoticeContent() %></p>
					</td>
				</tr>
			</table>

			<div align="center">
			<form action="<%= contextPath %>/event.eo" method="post">
				<input type="submit" value="이전으로">
				<!-- 관리자만 볼 수 있는 작성하기 버튼 -->
		 <%if(loginUser != null && loginUser.getUserId().equals("admin")){ %>
				<input type="button" onclick="updateForm();" value="수정하기">
				<input type="button" onclick="deleteBoard();" value="삭제하기">
					<%} %>
			</form>
			</div>
		</div>
	</div>
	<form action="" id="detailForm" method="post">
		<input type="hidden" name="nno" value="<%= e.getNoticeNo() %>">
	</form>
	<%@ include file="../common/foot.jsp" %>
	<script>
		function updateForm(){
			//location.href="<%=contextPath%>/updateForm.eo" + <%= e.getNoticeNo() %>;
			// 위의 방식대로 하면 url에 그대로 노출.. --> 직접 url창에 타고 들어갈수있다!!!

			$("#detailForm").attr("action", "<%=contextPath%>/updateForm.eo");
			$("#detailForm").submit();

		}
		function deleteBoard(){
			console.log(<%= e.getNoticeNo() %>);
			$("#detailForm").attr("action", "<%=contextPath%>/delete.eo");
			$("#detailForm").submit();
		}
	</script>

</body>
</html>
