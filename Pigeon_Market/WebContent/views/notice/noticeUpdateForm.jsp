<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.pigeonMarket.notice.model.vo.Notice, java.util.*"%>
 <% 
	Notice notice = (Notice)request.getAttribute("notice");
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
		<h2 align="center">공지사항 수정</h2>
		<div class="tableArea">
			<form action="<%= request.getContextPath() %>/update.no" method="post">
			<input type="hidden" name="nno" value="<%= notice.getNoticeNo() %>">
				<table>
					
					<tr>
						<td>제목</td>
						<td colspan="3"><input type="text" size="58" name="noticetitle" value="<%= notice.getNoticetitle() %>"></td>
					</tr>
					<tr>
					<td>조회수</td>
					<td><%= notice.getNoticeReadcount() %></td>
					<td>작성일</td>
					<td><%= notice.getNoticeDate() %></td>
					</tr>
					<tr>
						<td rowspan="2"><div class="content">내용</div></td>
						<td colspan="3">
							<textarea rows="3" cols="10" name="noticeContent" style="resize:none;"><%= notice.getNoticeContent() %></textarea>
						</td>
					</tr>
				</table>
				<br>
				<div align="center">
					<form action="<%= contextPath %>/detail.no" method="post">
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