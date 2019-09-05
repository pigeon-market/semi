<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.pigeonMarket.blackList.model.vo.BlackList" %>
<%
	BlackList bl = (BlackList)request.getAttribute("bl");
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
		
		<h2 align="center">블랙리스트 상세보기</h2>
		
		<div class="tableArea">
			
			<table align="center" width="800px">
				
				<tr>
					<td>신고 번호</td>
					<td colspan="2"><%= bl.getReportNo() %></td>
					<td>블랙자</td>
					<td colspan="2"><%= bl.getBlackId() %></td>					
				</tr>
					<tr>
					<td>신고자</td>
					<td colspan="2"><%= bl.getReporterId() %></td>
					<td>신고일자</td>
					<td colspan="2"><%= bl.getReproterDate() %></td>
				</tr>
				<tr>
					<td>신고사유</td>
					<td colspan="5"><%= bl.getReporterReason() %></td>
				</tr>
				
			</table>
			
			<div align="center">
				<form action="<%= contextPath %>/black.bl" method="post">
					<input type="submit" value="이전으로">	
				</form>
			</div>
		</div>
	</div>
	<form action="" id="detailForm" method="post">
		<input type="hidden" name="nno" value="<%= bl.getReportNo() %>">
	</form>
	<%@ include file="../common/foot.jsp" %>
	


</body>
</html>