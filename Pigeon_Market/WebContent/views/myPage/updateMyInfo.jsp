<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.pigeonMarket.member.model.vo.Member"%>
<%
	Member m = (Member)request.getAttribute("me");

	String email = m.getEmail();
	
	int emailDiv = email.indexOf("@");
	
	String eb = "";
	
	for(int i = 0 ; i < emailDiv-5 ; i++) {
		eb += "*";
	}
	
	String email1 = email.substring(0, 3) + eb;
	
	String email2 = email.substring(emailDiv+1);
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>수정중</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<style>
#test {
	padding: 0 0 2em 0;
	border: 1px solid blue;
}

.box {
	border: 1px solid red;
}

.col-3 {
	text-align: center;
	display: inline-block;
}

.col-12 {
	position: relative;
	text-align:center;
}

#delUser, #changePwd {
	height: 50px;
}

#email1, #email2 {
	background-color:rgba(70, 70, 70, 0.4);

}
</style>

</head>

<body>

	<%@ include file="../common/menubar.jsp"%>
	<div id="page-wrapper">


		<!-- Main -->



		<section id="main" class="container"> <header>
		<h2>개인정보 수정</h2>


		</header>

		<div class="row">
			<div class="col-12">
				<div class="box alt">
					<div class="row gtr-50 gtr-uniform">

						<div class="col-12">
							<span class="image fit"
								onclick="location.href='<%=contextPath%>/changePwd.me'"><img
								src="<%=contextPath%>/resources/images/pic04.jpg" id="changePwd">비밀번호변경</span>
						</div>
						

					</div>
				</div>


				<!-- Text -->
				<div id="test">



					<section class="box">

					<form>
						<h2>이메일 변경</h2>


						<div class="box">



							<div class="col-3">
								<input type="text" class="email" id="email1" name="eamil1"
									value="<%= email1 %>" size="20" readonly>
							</div>
							<div class="col-3">@</div>
							<div class="col-3">
								<input type="text" class="email" id="email2" name="email2"
									value="<%= email2 %>" readonly>
							</div>
							<div class="col-3" onclick="emailBtn();">
								<input type="button" value="해제하기" id="emailBtn" readonly>

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
				
				<div class="box alt">
					<div class="row gtr-50 gtr-uniform">

						<div class="col-12">
							<span class="image fit"
								onclick="location.href='<%=contextPath%>/Activity.me?status=sell&page=1&group=15&period=&date='"><img
								src="<%=contextPath%>/resources/images/pic04.jpg" id="delUser">회원탈퇴</span>
						</div>


					</div>
				</div>

			</div>
		</div>

		</section>


	</div>
	
	<script>
		function emailBtn() {
			
			if($("#emailBtn").val() == "해제하기") {
				
				
				$("#emailBtn").css({'background-color':'rgba(232, 153, 128, 0.5)'});
				$("#email1").val("").removeAttr('readonly').css( {'background-color': 'rgb(250, 250, 250)', 'border': '5px solid rgba(232, 153, 128, 0.5)'} ).focus();
				$("#email2").removeAttr('readonly').css({'background-color': 'rgb(250, 250, 250)', 'border': '5px solid rgba(232, 153, 128, 0.5)'});
			
				$("#emailBtn").val("수정하기");
			}else{

				
				var email1 = $("#email1").val();
				var email2 = $("#email2").val();
				
				
				$.ajax({
					url:"updateEmail.me",
					data:{email1:email1, email2:email2},
					type:"post",
					success:function(email){
						
						var newEmail = email;
						
						var num = newEmail.indexOf("@");
						
						var nEmail1 = newEmail.substring(0, 3);
						
						var eb = "";
						
						for(var i = 0 ; i < num-3 ; i++) {
							eb += "*";
						}
						
						var nEmail2 = newEmail.substring(num+1);
						
						$("#email1").val(nEmail1+eb);
						$("#email2").val(nEmail2);
						
					},
					error:function(){
						console.log("통신 실패");
					}
				});
				
				
				
				
				
				$("#emailBtn").css({'background-color':'rgb(102, 102, 102)'});
				$("#email1").css({'background-color':'rgba(70, 70, 70, 0.4)' , 'border' : '0px'}).attr('readonly');
				$("#email2").css({'background-color':'rgba(70, 70, 70, 0.4)' , 'border' : '0px'}).attr('readonly');
				$("#emailBtn").val("해제하기");
				
			}
			
		}
	
	
	
	
	
	
	</script>

	<%@ include file="../common/foot.jsp"%>


</body>

</html>