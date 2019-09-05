<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.ArrayList, com.pigeonMarket.review.model.vo.Review, com.pigeonMarket.common.model.vo.PageInfo" %>
<%
	ArrayList<Review> list = (ArrayList<Review>)request.getAttribute("list");
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
		color: #646464;
		margin-left:auto;
		margin-right:auto;
		margin-top:50px;
	}
	.tableArea{
		margin-left:auto;
		margin-right:auto;
		text-align:center;
	}
	#listArea{
		border:1px solid white;
		text-align:center;
	}
	.searchArea{
		width:650px;
		margin-left:auto;
		margin-right:auto;

		
	}
	th{
	text-align:center !importarnt;
	}
</style>
</head>
<body>

<%@ include file="../common/menubar.jsp" %>
	
	<div class="outer">
		
		<br>
		<h2 align="center">리뷰</h2>
		
		<div class="tableArea">
			
			<table id="listArea">
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>내용</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
				</tr>
				<%if(list.isEmpty()){ %>
					<tr>
						<td colspan="6">존재하는 공지사항이 없습니다.</td>
					</tr>
					
				<%}else{ %>
					<%for(Review r : list){ %>
						<tr>
							<td><%= r.getReviewNo() %></td>
							<td><%= r.getReviewTitle() %></td>
							<td><%= r.getReviewContent() %></td>
							<td><%= r.getUserId()%></td>
							<td><%= r.getReviewDate() %></td>
							<td><%= r.getReviewReadcount()%></td>
						</tr>
					<%} %>
				<%} %>
			</table>
		</div>
		
		<!-- 페이징바 만들기 -->
		<div class="pagingArea" align="center">
		
			<!-- 맨처음으로 (<<) -->
			<button onclick="location.href='<%= contextPath %>/review.re?currentPage=1'"> &lt;&lt; </button>
			
			<!-- 이전페이지로(<) -->
			<%if(currentPage == 1){ %>
			<button disabled> &lt; </button>
			<%}else{ %>
			<button onclick="location.href='<%= contextPath %>/review.re?currentPage=<%= currentPage-1 %>'"> &lt; </button>
			<%} %>
			
			
			<!-- 10개의 페이지 목록 -->
			<%for(int p=startPage; p<=endPage; p++){ %>
				
				<%if(p == currentPage){ %>
				<button disabled> <%= p %> </button>
				<%}else{ %>
				<button onclick="location.href='<%=contextPath %>/review.re?currentPage=<%= p %>'"> <%= p %> </button>
				<%} %>
				
			<%} %>
			
			
			<!-- 다음페이지로(>) -->
			<%if(currentPage == maxPage){ %>
			<button disabled> &gt; </button>
			<%}else { %>
			<button onclick="location.href='<%= contextPath %>/review.re?currentPage=<%= currentPage+1 %>'"> &gt; </button>
			<%} %>
			
			<!-- 맨끝으로(>>) -->
			<button onclick="location.href='<%= contextPath %>/review.re?currentPage=<%= maxPage %>'"> &gt;&gt; </button>
			
		</div>
		<br>
		
		
		<div class="searchArea" align="center">
		
			<!-- 사용자만 볼 수 있는 작성하기 버튼 -->
	 <%if(loginUser != null && loginUser.getUserId().equals("user10")){ %>
		 <form action="<%= contextPath %>/insertForm.re" method="post">
			<input type="submit" value="작성하기">
		 </form>
	<%} %>
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
				location.href="<%= contextPath %>/detail.re?nno="+num;
			});
			
		});
	</script>




</body>
</html>