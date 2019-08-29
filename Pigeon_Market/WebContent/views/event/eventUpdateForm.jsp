<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.pigeonMarket.event.model.vo.Event, java.util.*"%>
 <% 
	Event event = (Event)request.getAttribute("event");
 %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	.outer{
		width:900px;
		height:500px;
		color:black;
		margin-left:auto;
		margin-right:auto;
		margin-top:50px;
	}
	table {
		border:1px solid white;
	}

	.tableArea {
		width:500px;
		height:350px;
		margin-left:auto;
		margin-right:auto;
	}
</style>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
	
	<div class="outer">
		<br>
		<h2 align="center">게시판 수정</h2>
		<div class="tableArea">
			<form action="<%= request.getContextPath() %>/update.eo" method="post">
			<input type="hidden" name="nno" value="<%= event.getNoticeNo() %>">
				<table>
					
					<tr>
						<th>제목</th>
						<td colspan="3"><input type="text" size="58" name="noticetitle" value="<%= event.getNoticetitle() %>"></td>
					</tr>
					<tr>
					<td>조회수</td>
					<td><%= event.getNoticeReadcount() %></td>
					<td>작성일</td>
					<td><%= event.getNoticeDate() %></td>
					</tr>
					<tr>
						<th>내용</th>
						<td colspan="3">
							<textarea rows="15" cols="60" name="noticeContent" style="resize:none;"><%= event.getNoticeContent() %></textarea>
						</td>
					</tr>
				</table>
				<br>
				<div align="center">
					<button type="submit" id="updateBtn">수정</button>
					<button onclick="history.go(-1);">취소</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>