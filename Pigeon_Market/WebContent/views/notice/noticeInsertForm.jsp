<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>
<%@ page import="java.util.ArrayList, com.pigeonMarket.notice.model.vo.Notice, com.pigeonMarket.common.model.vo.PageInfo" %>

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
		height:750px;
		color:black;
		margin-left:auto;
		margin-right:auto;
		margin-top:50px;
	}
	table{
		border:1px solid white;
	}
	.tableArea{
		width:450px;
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
		<h2 align="center">공지사항 작성</h2>
		
		<div class="tableArea">
			<form action="<%= contextPath %>/insert.no" method="post">
				<table>
					<tr>
						<td>제목</td>
						<td colspan="3"><input type="text" size="50" name="title"></td>
					</tr>
					<tr>
						<td>작성일</td>
						<td colspan="3"><%= today %></td>
					</tr>
					<tr>
						<td>내용</td>
					</tr>
					<tr>
						<td colspan="4">
							<textarea name="content" cols="60" rows="15" style="resize:none;"></textarea>
						</td>
					</tr>
				</table>
				<br>
				
				<div align="center">
					<button type="button" onclick="javascript:history.back();">취소</button>
					<button type="submit">등록</button>
				</div>
			</form>
		</div>
	</div>
	
	
	<%@ include file="../common/foot.jsp" %>
</body>
</html>