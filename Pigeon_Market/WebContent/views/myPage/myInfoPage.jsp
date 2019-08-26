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
					<input type="button" value="Ż���ϱ�" onclick="goDelete();">
	</div>
	<script>
	function goDelete() {
		var bool = confirm("������ Ż���Ͻðڽ��ϱ�?")
		
		if(bool) {
			$("#updateForm").attr("action", "<%= contextPath %>/deleteInfo.me");
			$("#updateForm").submit();
		} else {
			alert("ȸ��Ż�� ��ҵǾ����ϴ�.");
		}
	}
	
	</script>
</body>
</html>