<%@page import="com.pigeonMarket.member.model.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.ArrayList, com.pigeonMarket.member.model.vo.Member, com.pigeonMarket.common.model.vo.PageInfo" %>
<%
	ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list");
	 PageInfo pi = (PageInfo)request.getAttribute("pi");
	
	int listCount = pi.getListCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.outer{
		width:900px;
		height:800px;
		color:black;
		margin-left:auto;
		margin-right:auto;
		margin-top:50px;
	}
	table, td{
		border:1px solid white;
	}
	.tableArea{
		width:700px;
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
		<h2 align="center">이벤트</h2>
		
		<div class="tableArea">
			
			<table id="listArea">
				<tr>
					<th>글번호</th>
					<th width="200">회원이름</th>
					<th width="100">회원아이디</th>
					<th width="100">가입일</th>
					<th width="100">탈퇴여부</th>
					<th width="100">블랙자여부</th>
				</tr>
				<%if(list.isEmpty()){ %>
					<tr>
						<td colspan="6">존재하는 회원이 없습니다.</td>
					</tr>
					
				<%}else{ %>
					<%for(Member m : list){ %>
						<tr>
							<td><%= m.getrNum() %></td>
							<td><%= m.getUserName() %></td>
							<td><%= m.getUserId() %></td>
							<td><%= m.getJoinDate() %></td>
							<td><%= m.getWithdrawal() %></td>
							<td><%= m.getBlackCode() %></td>
							
						</tr>
					<%} %>
				<%} %>
			</table>
		</div>
		
		<!-- 페이징바 만들기 -->
		<div class="pagingArea" align="center">
		
			<!-- 맨처음으로 (<<) -->
			<button onclick="location.href='<%= contextPath %>/member.mim?currentPage=1'"> &lt;&lt; </button>
			
			<!-- 이전페이지로(<) -->
			<%if(currentPage == 1){ %>
			<button disabled> &lt; </button>
			<%}else{ %>
			<button onclick="location.href='<%= contextPath %>/member.mim?currentPage=<%= currentPage-1 %>'"> &lt; </button>
			<%} %>
			
			
			<!-- 10개의 페이지 목록 -->
			<%for(int p=startPage; p<=endPage; p++){ %>
				
				<%if(p == currentPage){ %>
				<button disabled> <%= p %> </button>
				<%}else{ %>
				<button onclick="location.href='<%=contextPath %>/member.mim?currentPage=<%= p %>'"> <%= p %> </button>
				<%} %>
				
			<%} %>
			
			
			<!-- 다음페이지로(>) -->
			<%if(currentPage == maxPage){ %>
			<button disabled> &gt; </button>
			<%}else { %>
			<button onclick="location.href='<%= contextPath %>/member.mim?currentPage=<%= currentPage+1 %>'"> &gt; </button>
			<%} %>
			
			<!-- 맨끝으로(>>) -->
			<button onclick="location.href='<%= contextPath %>/member.mim?currentPage=<%= maxPage %>'"> &gt;&gt; </button>
			
		</div>
		
		
		<div class="searchArea" align="center">
			<select id="searchCondition" name="searchCondition">
				<option>-----</option>
				<option value="title">제목</option>
				<option value="content">내용</option>
			</select>
			<input type="search" name="search">
			<button type="submit">검색하기</button>
		</div>
		
		
		
	</div>
	
	<%@ include file="../common/foot.jsp" %>
	
	<script>
		// 공지사항 상세보기 기능 
		$(function(){
			
			$("#listArea td").mouseenter(function(){
				$(this).parent().css({"cursor":"pointer"});
				
			}).mouseout(function(){
				//$(this).parent().css("background", "black");
				
			}).click(function(){
				var num = $(this).parent().children().eq(0).text();
				
				// 쿼리스트링을 이용하여 get방식으로 글번호를 server로 전달
				location.href="<%= contextPath %>/detail.mim?nno="+num;
			});
			
		});
	</script>

</body>
</html>