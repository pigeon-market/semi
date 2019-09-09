<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.pigeonMarket.review.model.vo.Review, java.util.*"%>
<%
	Review review = (Review)request.getAttribute("review");
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
		<h2 align="center">리뷰 수정</h2>
		<div class="tableArea">
			<form action="<%= request.getContextPath() %>/update.re" method="post">
			<input type="hidden" name="nno" value="<%= review.getReviewNo() %>">
				<table>

					<tr>
						<th>제목</th>
						<td><input type="text" size="10" name="noticetitle" value="<%= review.getReviewTitle() %>"></td>
						<td>조회수</td>
						<td><%= review.getReviewReadcount() %></td>
					</tr>
					<tr>
						<td>작성일</td>
						<td><%= review.getReviewDate() %></td>
						<td>작성자</td>
						<td><%= review.getUserId() %></td>
					</tr>
					<tr>
						<td>내용</td>
						<td colspan="3">
							<textarea rows="3" cols="60" name="noticeContent" style="resize:none;"><%= review.getReviewContent() %></textarea>
						</td>
					</tr>
				</table>
				<br>
				<div align="center">
					<form action="<%= contextPath %>/detail.re" method="post">
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
