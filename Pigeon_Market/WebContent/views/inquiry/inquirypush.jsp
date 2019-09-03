<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.pigeonMarket.inquiry.model.vo.Inquiry" %>
    <%
	Inquiry i = (Inquiry)request.getAttribute("i");
%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>

<%
	Date date = new Date();

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	String today = sdf.format(date); // 2019-08-14
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>

<section id="main" class="container medium">
					<header>
						<h2>문의하세요</h2>
						<p>육하 원칙에 의거하여 문의 주세요</p>
					</header>
					<div class="box">
						<form action="<%= contextPath %>/insert.in" method="post">
							<table>
						<div class="row gtr-50 gtr-uniform">
							<tr>
								<div class="col-6 col-12-mobilep">
									<td>아이디</td>
									<td colspan="3"><input type="text" style="background-color:white" name="userId" id="userId" value="<%= loginUser.getUserId() %>" placeholder="아이디" readonly /></td>
								</div>
							</tr>
							<tr>
								<div class="col-12">
									<td>제목</td>
									<td colspan="3"><input type="text"  style="background-color:white" name="inquiryTitle" id="inquiryTitle" placeholder="제목" /></td>
								</div>
							</tr>
							<tr>
								
									<td>내용</td>
									<td>&nbsp;</td>
									<td>   작성일</td>
									<td><%= today %></td>
							
							</tr>
							<tr>
								
									<td colspan="4"><textarea name="inquiryContent" style="background-color:white; resize: none;" id="inquiryContent" placeholder="내용" rows="6"></textarea></td>
								
							</tr>
								</div>
							</table>
							<div align="center">
								<input type="submit" value="전송" onclick="inquiry();"/>
							</div>
						</form>
					</div>
				</section>

<%@ include file="../common/foot.jsp" %>

<!-- Scripts -->
			<script src="<%= request.getContextPath()%>/resources/assets/js/jquery.min.js"></script>
			<script src="<%= request.getContextPath()%>/resources/assets/js/jquery.dropotron.min.js"></script>
			<script src="<%= request.getContextPath()%>/resources/assets/js/jquery.scrollex.min.js"></script>
			<script src="<%= request.getContextPath()%>/resources/assets/js/browser.min.js"></script>
			<script src="<%= request.getContextPath()%>/resources/assets/js/breakpoints.min.js"></script>
			<script src="<%= request.getContextPath()%>/resources/assets/js/util.js"></script>
			<script src="<%= request.getContextPath()%>/resources/assets/js/main.js"></script>
			<script>
			function inquiry(){
				$("#detailForm").attr("action", "<%=contextPath%>/insert.in");
				$("#detailForm").submit();
			}
			</script>
	
</body>
</html>