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
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>

	
</script>
<style>
	body{
		background:url('<%= request.getContextPath() %>/resources/images/city1.PNG') no-repeat;
		background-size:cover;
	}
	.loginArea > form, #userInfo{
		float:right;
	}
	#memberJoinBtn{
		background:yellowgreen;
		border-radius:5px;
	}
	#loginBtn input{
		background:orangered;
		color:white;
	}
	#memberJoinBtn, #loginBtn, #myPage, #logoutBtn{
		display:inline-block;
		width:80px;
		height:25px;
		color:white;
	}
	#loginBtn input:hover, #memberJoinBtn:hover, #myPage:hover, #logoutBtn:hover{
		cursor:pointer;
	}
	#myPage{
		background:yellowgreen;
		border-radius:5px;
	}
	#logoutBtn{
		background:orangered;
		border-radius:5px;
	}
	
	
	.wrap{
		background:black;
		width:100%;
		height:50px;
	}
	.nav{
		width:600px;
		margin-left:auto;
		margin-right:auto;
	}
	.menu{
		background:black;
		color:white;
		text-align:center;
		vertical-align:middle;
		width:150px;
		height:50px;
		display:table-cell;
	}
	.menu:hover{
		background:darkgray;
		color:orangered;
		font-weight:bold;
		cursor:pointer;
	}
</style>
</head>
<body>
	<h1 align="center">Welcome JSP World!!</h1>
	
	<!-- 로그인폼 만들기 -->
	<div class="loginArea">
	
		
		<form id="loginForm" action="<%= request.getContextPath() %>/login.me" method="post" onsubmit="return validate();">
			<table>
				<tr>
					<td><label for="userId">ID : </label></td>
					<td><input type="text" name="userId" id="userId"></td>
				</tr>
				<tr>
					<td><label for="userPwd">PWD : </label></td>
					<td><input type="password" name="userPwd" id="userPwd"></td>
				</tr>
			</table>
			
			<div class="btns" align="center">
				<div id="memberJoinBtn" onclick="memberJoin();">회원가입</div>
				<div id="loginBtn"><input type="submit" value="로그인"></div>
			</div>
		</form>

	</div>
	
	<script>
		function validate(){
			if($("#userId").val().trim().length == 0){ // 아이디 입력 안했을 경우
				alert("아이디를 입력해주세요.");
				$("#userId").focus();
				return false;
			}
			
			if($("#userPwd").val().trim().length == 0){ // 비밀번호 입력 안했을 경우
				alert("비밀번호를 입력해주세요.");
				$("#userPwd").focus();
				return false;
			}
			
			return true;
		}
		
		function logout(){
			location.href='<%= request.getContextPath() %>/logout.me';
		}
		
		function memberJoin(){
			//location.href="<%= request.getContextPath() %>/views/member/memberJoinForm.jsp";
			
			// 단순한 페이지 이동도 WAS 거쳐서 보여지게끔 작업하자!! 
			// 왜냐면 url에 우리 디렉토리 구조가 다 노출 되기 때문에
			
			location.href="<%=request.getContextPath()%>/joinForm.me";
			
			
		}
		
	</script>
	
	
	<br clear="both">
	
	<div class="wrap">
		<div class="nav">
			<div class="menu">HOME</div>
			<div class="menu" onclick="goNotice();">공지사항</div>
			<div class="menu">게시판</div>
			<div class="menu">사진게시판</div>
		</div>
	</div>
	
	<script>
		function goNotice(){
			location.href="<%= request.getContextPath() %>/list.no";
		}
		

	</script>
	
	
	
</body>
</html>




