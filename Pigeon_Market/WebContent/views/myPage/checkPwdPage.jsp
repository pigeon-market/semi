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
	
	<div>
		<input type="password" name="checkPwd">
		<button type="submit" onclick="location.href='<%= contextPath %>/checkPwd.me'">Ȯ���ϱ�</button>
	
	</div>
</body>
</html>