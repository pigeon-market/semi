<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>내 메인페이지</title>
</head>
<body>
	<%@ include file="../common/menubar.jsp" %>

	<div class="mainform">

		<div class="btndiv" id="" onclick="location.href='<%= contextPath %>/buyInfoForm.deal'">구매정보</div>
		<div class="btndiv" id="" onclick="location.href='<%= contextPath %>/sellInfoForm.deal">판매정보</div>
		<!--  <div class="btndiv" id="배송정보" onclick="delivinfo();">배송정보</div>  -->
		<div class="btndiv" id="" onclick="location.href='<%= contextPath %>/checkMyPwdForm.me'">회원정보 수정</div>

	</div>
	<script>

	
	</script>
</body>
</html>