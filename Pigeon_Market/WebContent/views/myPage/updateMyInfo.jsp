<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="com.pigeonMarket.member.model.vo.Member"%>
<%
	Member m = (Member)request.getAttribute("me");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>수정중</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<style>
.col-3 {
	text-align: center;
}



</style>

</head>

<body>
	
	<%@ include file="../common/menubar.jsp"%>
	<div id="page-wrapper">


		<!-- Main -->
		<section id="main" class="container">
		<div class="row">
			<div class="col-12">
	

				<!-- Text -->
				<section class="box">
				<form>
					<h2>이메일 변경</h2>
					<div>
					<input type="text"> @
					<input type="text">
					</div>
					

				</form>
				</section>
				
				<section class="box">
				<form>
					<h2>주소지 변경</h2>
					

					

				</form>
				</section>
				
				<section class="box">
				<form>
					<h2>핸드폰번호 변경</h2>
					<input type="number" placeholder="-를 제외하고 적어주세요">

				</form>
				</section>
				
				<section class="box">
				<form>
					<h2>탈퇴하기</h2>
					<input type="text" name="userId" placeholder="아이디를 다시 입력해주세요.">
					<input type="password" name="userPwd" placeholder="비밀번호를 다시 입력해주세요.">
					<button value="withdrawal">탈퇴하기</button>
				</form>
				</section>
				

			</div>
		</div>

		</section>
		

	</div>

	<%@ include file="../common/foot.jsp"%>

	
</body>

</html>