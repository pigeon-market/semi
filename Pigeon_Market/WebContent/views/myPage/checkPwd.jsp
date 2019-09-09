<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="com.pigeonMarket.member.model.vo.Member"%>
<%
	Member m = (Member)session.getAttribute("loginUser");
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>수정중</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<style>
body{
	
	margin:auto !important;
	
}

</style>

</head>

<body>
	
	<%@ include file="../common/menubar.jsp"%>
	<div id="page-wrapper">
	
	<section>
	<div class="row">
			<div class="col-12">
				<section class="box">
				<form action="<%= contextPath %>/myInfo.me" method="post">
				<div class="box alt">
				
					<div class="row gtr-50 gtr-uniform">
						
							
							<div class="col-6">
							<input type="password"  name="pwd" style="text-align:center; width:50%;">
							<br>
							
							<input type="submit" value="확인하기" style="text-align:center;">
				
							</div>

					
						
					</div>
				</div>
</form>
				</section>

	

			</div>
		</div>
</section>
</div>
	
	<%@ include file="../common/foot.jsp"%>
	
</body>
</html>