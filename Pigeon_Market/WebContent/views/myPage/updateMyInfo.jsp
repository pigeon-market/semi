<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.pigeonMarket.member.model.vo.Member"%>
<%
	Member m = (Member) request.getAttribute("me");

	String email = m.getEmail();

	int emailDiv = email.indexOf("@");

	String eb = "";

	for (int i = 0; i < emailDiv - 5; i++) {
		eb += "*";
	}

	String email1 = email.substring(0, 3) + eb;

	String email2 = email.substring(emailDiv + 1);

	
	String phone = m.getPhone();

	int phoneDiv1 = phone.indexOf("-");

	int phoneDiv2 = phone.lastIndexOf("-");

	String pb = "";

	for (int i = 0; i < phoneDiv2 - phoneDiv1 -1; i++) {
		pb += "*";
	}

	String phone1 = phone.substring(0, phoneDiv1);
	String phone2 = pb;
	String phone3 = phone.substring(phoneDiv2 + 1);
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
	
}


.box{


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
									value="<%=email1%>" size="20" readonly>
							</div>
							<div class="col-3">@</div>
							<div class="col-3">
								<input type="text" class="email" id="email2" name="email2"
									value="<%=email2%>" readonly>
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
					<div class="box">



						<div class="col-3">
							<input type="text" class="phone" id="phone1" name="phone1"
								value="<%=phone1%>" size="20" readonly>
						</div>
						<div class="col-3">-</div>
						<div class="col-3">
							<input type="text" class="phone" id="phone2" name="phone2"
								value="<%=phone2%>" readonly>
						</div>
												<div class="col-3">-</div>
						<div class="col-3">
							<input type="text" class="phone" id="phone3" name="phone3"
								value="<%=phone3%>" readonly>
						</div>

						<div class="col-3" onclick="phoneBtn();">
							<input type="button" value="해제하기" id="phoneBtn" readonly>

						</div>


					</div>

				</form>
				</section>

				<div class="box alt">
					<div class="row gtr-50 gtr-uniform">

						<div class="col-12">
							<span class="image fit"
								onclick="location.href='<%=contextPath%>/delete.me'"><img
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

			if ($("#emailBtn").val() == "해제하기") {

				$("#emailBtn").css({
					'background-color' : 'rgba(232, 153, 128, 0.5)'
				});
				$("#email1").val("").removeAttr('readonly').css({
					'background-color' : 'rgb(250, 250, 250)',
					'border' : '5px solid rgba(232, 153, 128, 0.5)'
				}).focus();
				$("#email2").removeAttr('readonly').css({
					'background-color' : 'rgb(250, 250, 250)',
					'border' : '5px solid rgba(232, 153, 128, 0.5)'
				});

				$("#emailBtn").val("수정하기");
			} else {

				var email1 = $("#email1").val();
				var email2 = $("#email2").val();

				$.ajax({
					url : "updateEmail.me",
					data : {
						email1 : email1,
						email2 : email2
					},
					type : "post",
					success : function(email) {

						var newEmail = email;

						var num = newEmail.indexOf("@");

						var nEmail1 = newEmail.substring(0, 3);

						var eb = "";

						for (var i = 0; i < num - 3; i++) {
							eb += "*";
						}

						var nEmail2 = newEmail.substring(num + 1);

						$("#email1").val(nEmail1 + eb);
						$("#email2").val(nEmail2);

					},
					error : function() {
						console.log("통신 실패");
					}
				});

				$("#emailBtn").css({
					'background-color' : 'rgb(102, 102, 102)'
				});
				$("#email1").css({
					'background-color' : 'rgba(70, 70, 70, 0.4)',
					'border' : '0px'
				}).attr('readonly');
				$("#email2").css({
					'background-color' : 'rgba(70, 70, 70, 0.4)',
					'border' : '0px'
				}).attr('readonly');
				$("#emailBtn").val("해제하기");

			}

		}

		function phoneBtn() {

			if ($("#phoneBtn").val() == "해제하기") {

				$("#phoneBtn").css({
					'background-color' : 'rgba(232, 153, 128, 0.5)'
				});
				$("#phone1").val("").removeAttr('readonly').css({
					'background-color' : 'rgb(250, 250, 250)',
					'border' : '5px solid rgba(232, 153, 128, 0.5)'
				}).focus();
				$("#phone2").val("").removeAttr('readonly').css({
					'background-color' : 'rgb(250, 250, 250)',
					'border' : '5px solid rgba(232, 153, 128, 0.5)'
				});
				$("#phone3").val("").removeAttr('readonly').css({
					'background-color' : 'rgb(250, 250, 250)',
					'border' : '5px solid rgba(232, 153, 128, 0.5)'
				});

				$("#phoneBtn").val("수정하기");
			} else {

				var phone1 = $("#phone1").val();
				var phone2 = $("#phone2").val();
				var phone3 = $("#phone3").val();

				$.ajax({
					url : "updatePhone.me",
					data : {
						phone1 : phone1,
						phone2 : phone2,
						phone3 : phone3
					},
					type : "post",
					success : function(phone) {

						var newPhone = phone;

						var num1 = newPhone.indexOf("-");
						var num2 = newPhone.lastIndexOf("-");
						
						console.log(num1);
						console.log(num2);

						var pb = "";

						for (var i = 0; i < num2 - num1-1 ; i++) {
							pb += "*";
						}

						var nPhone2 = pb
						
						var nPhone1 = newPhone.substring(0, num1);
						var phone2 = pb;
						var nPhone3 = newPhone.substring(num2 + 1);

						$("#phone1").val(nPhone1);
						$("#phone2").val(nPhone2);
						$("#phone3").val(nPhone3);


					},
					error : function() {
						console.log("통신 실패");
					}
				});

				$("#phoneBtn").css({
					'background-color' : 'rgb(102, 102, 102)'
				});
				$("#phone1").css({
					'background-color' : 'rgba(70, 70, 70, 0.4)',
					'border' : '0px'
				}).attr('readonly');
				$("#phone2").css({
					'background-color' : 'rgba(70, 70, 70, 0.4)',
					'border' : '0px'
				}).attr('readonly');
				$("#phone3").css({
					'background-color' : 'rgba(70, 70, 70, 0.4)',
					'border' : '0px'
				}).attr('readonly');
				$("#phoneBtn").val("해제하기");

			}

		}
	</script>

	<%@ include file="../common/foot.jsp"%>


</body>

</html>