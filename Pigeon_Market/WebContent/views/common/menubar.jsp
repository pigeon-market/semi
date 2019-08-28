<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.pigeonMarket.member.model.vo.Member" %>
<%
	Member loginUser = (Member)session.getAttribute("loginUser");
	
	// 세션에 담겨있는 메세지 받기
	String msg = (String)session.getAttribute("msg");
	
	String contextPath = request.getContextPath();
%>




<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" href="<%= request.getContextPath()%>/resources/assets/css/main.css" />	

<link rel="shortcut icon" href="dulgi.ico">
<link rel="icon" href="dulgi.ico">


<script language="javascript">
  		function showPopup() { window.open("login.html", "a", "width=350, height=450, left=600, top=50"); }
 </script>

</head>
<body>
	<header id="header">
					<h1><a href="<%= request.getContextPath()%>">처음으로</a></h1>
					<nav id="nav">
						<ul>
							<li><a href="index.html">Home</a></li>
							<li>
								<a href="#" class="icon solid fa-angle-down">메뉴</a>
								<ul>
									<li><a href="generic.html">소개</a></li>
									<li><a href="contact.html">문의</a></li>
									<li><a href="mypage.html">mypage</a></li>
									<li>
										<a href="#">Submenu</a>
										<ul>
											<li><a href="#">Option One</a></li>
											<li><a href="#">Option Two</a></li>
											<li><a href="#">Option Three</a></li>
											<li><a href="#">Option Four</a></li>
										</ul>
									</li>
								</ul>
							</li>
							<li><input type="button" value="Login" onclick="showPopup();" /></li>
						</ul>
					</nav>
				</header>
				
				<%@ include file="../common/foot.jsp" %>
				
	
		<!-- Scripts -->
			<script src="<%= request.getContextPath()%>/resources/assets/js/jquery.min.js"></script>
			<script src="<%= request.getContextPath()%>/resources/assets/js/jquery.dropotron.min.js"></script>
			<script src="<%= request.getContextPath()%>/resources/assets/js/jquery.scrollex.min.js"></script>
			<script src="<%= request.getContextPath()%>/resources/assets/js/browser.min.js"></script>
			<script src="<%= request.getContextPath()%>/resources/assets/js/breakpoints.min.js"></script>
			<script src="<%= request.getContextPath()%>/resources/assets/js/util.js"></script>
			<script src="<%= request.getContextPath()%>/resources/assets/js/main.js"></script>
	
</body>
</html>




