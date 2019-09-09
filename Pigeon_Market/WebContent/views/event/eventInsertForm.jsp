<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>
<%@ page import="java.util.ArrayList, com.pigeonMarket.event.model.vo.Event, com.pigeonMarket.common.model.vo.PageInfo" %>

<%
	Date date = new Date();

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	String today = sdf.format(date); // 2019-08-14
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
	table{
		border:1px solid white;
	}
	.tableArea{
		margin-left:auto;
		margin-right:auto;
		text-align:center;
	}
</style>
</head>
<body>

<%@ include file="../common/menubar.jsp" %>
<div class="outer">
		<br>
		<h2 align="center">이벤트 작성</h2>

		<div class="tableArea">
			<form action="<%= contextPath %>/insert.eo" method="post">
				<table>
					<tr>
						<td>제목</td>
						<td colspan="3"><input type="text" size="50" name="noticetitle"></td>
					</tr>
					<tr>
						<td>작성일</td>
						<td colspan="3"><%= today %></td>
					</tr>
					<tr>
					<td>내용</td>
						<td colspan="3">
							<textarea name="noticeContent" cols="60" rows="3" style="resize:none;"></textarea>
						</td>
					</tr>
				</table>
				<br>

				<div align="center">
					<input type="button" onclick="javascript:history.back();" value="취소">
					<input type="submit" value="등록">
				</div>
			</form>
		</div>
	</div>


	<%@ include file="../common/foot.jsp" %>
</body>
</html>
