<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<%@ include file="../common/menubar.jsp" %>
	
	
	
	<div class="btns">
					<input type="submit" value="�����ϱ�" onclick="location.href='<%= contextPath %>/updateMyInfoForm.me"> 
					<input type="button" value="����ϱ�" onclick="goMyPage();">
					<input type="button" value="Ż���ϱ�" onclick="deleteMember();">
	</div>
</body>
</html>