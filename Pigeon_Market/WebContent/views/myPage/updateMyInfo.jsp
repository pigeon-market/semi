<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="com.pigeonMarket.member.model.vo.Member"%>
<%
	Member m = (Member)request.getAttribute("me");

	String email = m.getEmail();
	
	System.out.println(email);
	
	int eamilDiv = email.indexOf("@");
	
	String email1 = email.substring(0, 3) + email.substring(4, eamilDiv-1);
	
	String email2 = email.substring(eamilDiv+1);
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>수정중</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<style>
#test{
	padding:0 0 2em 0;
	border:1px solid blue;
}


.box{
	border:1px solid red;

}
.col-3 {
	text-align: center;
	display:inline-block;
}


.col-12{
position:relative;
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
				<section class="box">
				<form>
					<h2>탈퇴하기</h2>
					<input type="text" name="userId" placeholder="아이디를 다시 입력해주세요.">
					<input type="password" name="userPwd" placeholder="비밀번호를 다시 입력해주세요.">
					<button value="withdrawal">탈퇴하기</button>
				</form>
				</section>

				<!-- Text -->
				<div id="test">
				
								
					
				<section class="box">
							
				<form>
					<h2>이메일 변경</h2>
						
	
					<div class="box">
						
				
							
							<div class="col-3">
							<input type="text" class="email" name="eamil1" value="<%= email1 %>" readonly></div> 
							<div class="col-3">@</div>
							<div class="col-3">
							<input type="text" class="email" name="eamil2" value="<%= email2 %>" readonly>
							</div>
							<div class="col-3">
							<button onclick=""></button>
							</div>
							
					
					</div>

				</form>
				</section>
			
				</div>

				
				
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