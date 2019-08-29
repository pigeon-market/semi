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
		width:800px;
		height:600px;
		color:black;
		margin-left:auto;
		margin-right:auto;
		margin-top:50px;
	}
	table, td{
		border:1px solid white;
	}
	.tableArea{
		width:600px;
		height:550px;
		margin-left:auto;
		margin-right:auto;
	}
	#content{
		height:230px;
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
					<td><%= e.getNoticetitle() %></td>
					<td>조회수</td>
					<td><%= e.getNoticeReadcount() %></td>
					<td>작성일</td>
					<td><%= e.getNoticeDate() %></td>
				</tr>
				<tr>
					<td colspan="6">내용</td>
				</tr>
				<tr>
					<td colspan="6">
						<p id="content"><%= e.getNoticeContent() %></p>
					</td>
				</tr>
			</table>
			
			<div align="center">
				<button type="button" onclick="location.href='<%= contextPath %>/list.no'">이전으로</button>
				<button type="button" onclick="updateForm();">수정하기</button>
				<button type="button" onclick="deleteBoard();">삭제하기</button>
				
			</div>
		</div>
	</div>
	<form action="" id="detailForm" method="post">
		<input type="hidden" name="nno" value="<%= e.getNoticeNo() %>">
	</form>
	<%@ include file="../common/foot.jsp" %>
	<script>
		function updateForm(){
			//location.href="<%=contextPath%>/updateForm.no" + <%= e.getNoticeNo() %>;
			// 위의 방식대로 하면 url에 그대로 노출.. --> 직접 url창에 타고 들어갈수있다!!!
			
			$("#detailForm").attr("action", "<%=contextPath%>/updateForm.no");
			$("#detailForm").submit();
			
		}
		function deleteBoard(){
			console.log(<%= e.getNoticeNo() %>);
			$("#detailForm").attr("action", "<%=contextPath%>/delete.no");
			$("#detailForm").submit();
		}
	</script>

</body>
</html>