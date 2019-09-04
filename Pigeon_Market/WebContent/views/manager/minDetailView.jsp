<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.pigeonMarket.member.model.vo.Member" %>
<%
	Member m = (Member)request.getAttribute("m");
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
					<td>글 번호</td>
					<td colspan="2"><%= m.getRnum() %></td>
					<td>회원 이름</td>
					<td colspan="2"><%= m.getUserName() %></td>					
				</tr>
					<tr>
					<td>회원 아이디</td>
					<td colspan="2"><%= m.getUserId() %></td>
					<td>회원 생년월일</td>
					<td colspan="2"><%= m.getBirthDate() %></td>			
				</tr>
				<tr>
					<td>회원 성별</td>
					<td colspan="2"><%= m.getGender() %></td>
					<td>회원 가입날</td>
					<td colspan="2"><%= m.getJoinDate() %></td>
				</tr>
				<tr>
					<td>회원 전화번호</td>
					<td colspan="2"><%= m.getPhone() %></td>
					<td>회원 이메일</td>
					<td colspan="2"><%= m.getEmail() %></td>
				</tr>
				<tr>
					<td>회원 주소</td>
					<td colspan="5"><%= m.getAddress() %></td>
				</tr>
				<tr>
					<td colspan="2">회원 탈퇴 여부</td>
					<td><%= m.getWithdrawal() %></td>
					<td colspan="2">회원 블랙자 여부</td>
					<td><%= m.getBlackCode() %></td>
				</tr>
			</table>
			
			<div align="center">
				<button type="button" onclick="location.href='<%= contextPath %>/member.mim'">이전으로</button>
				<%if(m.getWithdrawal().equals("N")){ %>
				<button type="button" onclick="deleteBoard();">삭제하기</button>
				<%}else{ %>
				<button type="button" disabled>삭제하기</button>
				<%} %>
			</div>
		</div>
	</div>
	<form action="" id="detailForm" method="post">
		<input type="hidden" name="userId" value="<%= m.getUserId() %>">
	</form>
	<%@ include file="../common/foot.jsp" %>
	<script>
		
		function deleteBoard(){
			console.log(<%= m.getRnum() %>);
			$("#detailForm").attr("action", "<%=contextPath%>/delete.mim");
			$("#detailForm").submit();
		}
	</script>

</body>
</html>