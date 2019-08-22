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
					<input type="button" value="탈퇴하기" onclick="goDelete();">
	</div>
	<script>
	function goDelete() {
		var bool = confirm("정말로 탈퇴하시겠습니까?")
		
		if(bool) {
			$("#updateForm").attr("action", "<%= contextPath %>/deleteInfo.me");
			$("#updateForm").submit();
		} else {
			alert("회원탈퇴가 취소되었습니다.");
		}
	}
	
	</script>
</body>
</html>