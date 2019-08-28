<<<<<<< HEAD
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
					<input type="submit" value="¼öÁ¤ÇÏ±â" onclick="location.href='<%= contextPath %>/updateMyInfoForm.me"> 
					<input type="button" value="Ãë¼ÒÇÏ±â" onclick="goMyPage();">
					<input type="button" value="Å»ÅðÇÏ±â" onclick="goDelete();">
	</div>
	<script>
	function goDelete() {
		var bool = confirm("Á¤¸»·Î Å»ÅðÇÏ½Ã°Ú½À´Ï±î?")
		
		if(bool) {
			$("#updateForm").attr("action", "<%= contextPath %>/deleteInfo.me");
			$("#updateForm").submit();
		} else {
			alert("È¸¿øÅ»Åð°¡ Ãë¼ÒµÇ¾ú½À´Ï´Ù.");
		}
	}
	
	</script>
</body>
=======
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
					<input type="submit" value="¼öÁ¤ÇÏ±â" onclick="location.href='<%= contextPath %>/updateMyInfoForm.me"> 
					<input type="button" value="Ãë¼ÒÇÏ±â" onclick="goMyPage();">
					<input type="button" value="Å»ÅðÇÏ±â" onclick="goDelete();">
	</div>
	<script>
	function goDelete() {
		var bool = confirm("Á¤¸»·Î Å»ÅðÇÏ½Ã°Ú½À´Ï±î?")
		
		if(bool) {
			$("#updateForm").attr("action", "<%= contextPath %>/deleteInfo.me");
			$("#updateForm").submit();
		} else {
			alert("È¸¿øÅ»Åð°¡ Ãë¼ÒµÇ¾ú½À´Ï´Ù.");
		}
	}
	
	</script>
</body>
>>>>>>> parent of d05a9a5... ìˆ˜ì •ë³¸
</html>