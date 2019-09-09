
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, com.pigeonMarket.event.model.vo.Event, com.pigeonMarket.common.model.vo.PageInfo" %>
<%
	ArrayList<Event> list = (ArrayList<Event>)request.getAttribute("list");
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
		width:800px;
		height:800px;
		color: #646464;
		margin-left:auto;
		margin-right:auto;
		margin-top:50px;
	}
	.tableArea{
		width:650px;
		height:600px;
		margin-left:auto;
		margin-right:auto;
		text-align:center;
	}
	#listArea{
		border:1px solid white;
		text-align:center;
		border-top-left-radius: 30px;
		border-top-right-radius: 30px;
		border-bottom-left-radius: 30px;
		border-bottom-right-radius: 30px;
	}
	.searchArea{
		width:650px;
		margin-left:auto;
		margin-right:auto;

		
	}
	th{
	align:center;
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
					<th >글번호</th>
					<th width="100">제목</th>
					<th width="300">내용</th>
					<th width="100">작성일</th>
					<th>조회수</th>
				</tr>
				<%if(list.isEmpty()){ %>
					<tr>
						<td colspan="5">존재하는 공지사항이 없습니다.</td>
					</tr>
					
				<%}else{ %>
					<%for(Event e : list){ %>
						<tr>
							<td><%= e.getNoticeNo() %></td>
							<td><%= e.getNoticetitle() %></td>
							<td><%= e.getNoticeContent() %></td>
							<td><%= e.getNoticeDate() %></td>
							<td><%= e.getNoticeReadcount()%></td>
							
						</tr>
					<%} %>
				<%} %>
			</table>
		</div>
		
		<!-- 페이징바 만들기 -->
		<div class="pagingArea" align="center">
		
			<!-- 맨처음으로 (<<) -->
			<button onclick="location.href='<%= contextPath %>/event.eo?currentPage=1'"> &lt;&lt; </button>
			
			<!-- 이전페이지로(<) -->
			<%if(currentPage == 1){ %>
			<button disabled> &lt; </button>
			<%}else{ %>
			<button onclick="location.href='<%= contextPath %>/event.eo?currentPage=<%= currentPage-1 %>'"> &lt; </button>
			<%} %>
			
			
			<!-- 10개의 페이지 목록 -->
			<%for(int p=startPage; p<=endPage; p++){ %>
				
				<%if(p == currentPage){ %>
				<button disabled> <%= p %> </button>
				<%}else{ %>
				<button onclick="location.href='<%=contextPath %>/event.eo?currentPage=<%= p %>'"> <%= p %> </button>
				<%} %>
				
			<%} %>
			
			
			<!-- 다음페이지로(>) -->
			<%if(currentPage == maxPage){ %>
			<button disabled> &gt; </button>
			<%}else { %>
			<button onclick="location.href='<%= contextPath %>/event.eo?currentPage=<%= currentPage+1 %>'"> &gt; </button>
			<%} %>
			
			<!-- 맨끝으로(>>) -->
			<button onclick="location.href='<%= contextPath %>/event.eo?currentPage=<%= maxPage %>'"> &gt;&gt; </button>
			
		</div>
		
		
		<div class="searchArea" align="center">
			<select id="searchCondition" name="searchCondition">
				<option>-----</option>
				<option value="title">제목</option>
				<option value="content">내용</option>
			</select>
			<input type="search" name="search">
			<button type="submit">검색하기</button>
			<button onclick="location.href='<%= contextPath %>/insertForm.eo';">작성하기</button>
		</div>
		
		<!-- 관리자만 볼 수 있는 작성하기 버튼 -->
	<!--  <%if(loginUser != null && loginUser.getUserId().equals("admin")){ %>
		<button onclick="location.href='<%= contextPath %>/insertForm.no';">작성하기</button>
		<%} %>
		-->
		
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
				location.href="<%= contextPath %>/detail.eo?nno="+num;
			});
			
		});
	</script>

</body>
</html>