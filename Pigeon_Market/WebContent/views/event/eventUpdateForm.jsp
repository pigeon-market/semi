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
		width:800px;
		color:black;
		margin-left:auto;
		margin-right:auto;
		margin-top:50px;
	}
	table {
		border:1px solid white;
	}

	.tableArea {
		margin-left:auto;
		margin-right:auto;
		text-align:center;
	}
	td{
	text-align:center !importarnt;
	}
	.content{
	text-align:center;
	}
</style>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>

	<div class="outer">
		<br>
		<h2 align="center">이벤트  수정</h2>
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
							<textarea rows="3" cols="60" name="noticeContent" style="resize:none;"><%= event.getNoticeContent() %></textarea>
						</td>
					</tr>
				</table>
				<br>
				<div align="center">
				<form action="<%= contextPath %>/detail.eo" method="post">
						<input type="submit" id="updateBtn" value="수정">
						<input type="button" onclick="history.go(-1);" value="취소">
					 </form>
				</div>
			</form>
		</div>
	</div>
	<%@ include file="../common/foot.jsp" %>
</body>
</html>
