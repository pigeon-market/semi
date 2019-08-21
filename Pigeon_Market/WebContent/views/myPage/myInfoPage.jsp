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
					<input type="submit" value="수정하기" onclick="location.href='<%= contextPath %>/updateMyInfoForm.me"> 
					<input type="button" value="취소하기" onclick="goMyPage();">
					<input type="button" value="탈퇴하기" onclick="deleteMember();">
	</div>
</body>
</html>