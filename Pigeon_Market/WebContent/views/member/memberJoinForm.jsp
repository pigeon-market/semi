<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>


<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script src="/resources/js/addressapi.js"></script>


<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="../../js/member/member.js?ver=1"></script>
<link href="../../css/member/member.css?ver=1" type="text/css"
	rel="stylesheet">



<style>
@font-face {
	font-family: "Jua";
	src: url("fonts/BMJUA_otf.otf");
}
/* .header{ background-color:antiquewhite; height: 100px;} */
.main {
	margin: 0 auto;
	width: 40%;
}

.main h4 {
	margin: 60px auto;
	text-align: center;
	font-size: 2em;
}

fieldset {
	border: none;
}

fieldset>div {
	position: relative;
	margin-bottom: 10px;
}

.none {
	display: none;
}

.error {
	font-size: 0.8em;
	position: absolute;
	width: auto;
	top: 18px;
	right: 10px;
	text-align: right;
	color: red;
}

.vaild {
	font-size: 0.8em;
	position: absolute;
	width: 150px;
	top: 18px;
	right: 10px;
	text-align: right;
	color: forestgreen;
}

input[type=text], select, input[type=password], input[type=email] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit], input[type=boutton] {
	width: 100%;
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px auto;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover, input[type=boutton]:hover {
	background-color: #45a049;
}

#wrap_gender {
	border-radius: 4px;
	border: 1px solid #ccc;
	display: flex;
}

.gender {
	display: block;
	height: 100%;
	width: 50%;
	border-right: 1px solid #ccc;
}

.no_line {
	border-right: none;
}

.gender>label {
	display: block;
	/*width: 100%; height: 100%;*/
	padding: 10px 0;
	text-align: center;
	font-size: 0.8em;
	color: #666;
}

input[type=radio] {
	display: none;
}

.gender_act {
	display: inline-block;
	height: 100%;
	width: 50%;
	background-color: #45a049;
	color: #fff;
}

.gender_act>label {
	display: inline-block;
	width: 100%;
	height: 100%;
	padding: 10px 0;
	text-align: center;
	font-size: 0.8em;
	color: #fff;
}

/* div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
} */
a {
	text-decoration: none
}

body {
	height: 100vh;
	background-repeat: no-repeat;
	background-position: center;
	background-size: cover;
	background: url("images/bg2.jpg") no-repeat center/cover;
	/* opacity: 0.3!important; filter:alpha(opacity=30); */
}

h4 {
	font-family: Jua;
}

a {
	font-family: Jua;
}
</style>
</head>
<body>
	<!-- 회원가입 페이지에서도 menubar는 노출되도록 -->
	<%@ include file="../common/menubar.jsp"%>

	<div class="container">
		<div class="header">
			<a href="#">뒤로가기</a>
		</div>

		<div class="main">
			<h4>회원가입</h4>
			<div>

				<form id="joinForm"
					action="<%= request.getContextPath() %>/insert.me" method="post"
					onsubmit="return joinValidate();">

					<div class="main">
						<h4>회원가입</h4>
						<div>
							<form action="#">
								<fieldset>
								


									<div>
										<label for="name"></label> <input type="text" id="name"
											name="lastname" placeholder="아이디" onblur="ck_name()">
										<span id="MsgName" class="none">유효성체크</span>
									</div>






									<div>
										<label for="pwd"></label> <input type="password" id="pwd"
											name="lastname" placeholder="비밀번호" onblur="ck_pwd()">
										<span id="MsgPw" class="none">유효성체크</span>
									</div>
									<div>
										<label for="pwd_ck"></label> <input type="password"
											id="pwd_ck" name="lastname" placeholder="비밀번호 확인"
											onblur="ck_pwd2()"> <span id="MsgPwck" class="none">유효성체크</span>
									</div>
									
										<div>
										<label for="email"></label> <input type="email" id="email"
											name="firstname" placeholder="이메일 ( ex@codepen.com)"
											onblur="ck_email()"> <span id="MsgId" class="none">aa</span>
									</div>
									
									
									<div>
										<label for="name"></label> <input type="text" id="name"
											name="lastname" placeholder="이름" onblur="ck_name()">
										<span id="MsgName" class="none">유효성체크</span>
									</div>





									<div>
										<label for="name"></label> <input type="text" id="name"
											name="lastname" placeholder="주민등록번호" onblur="ck_name()">
										<span id="MsgName" class="none">유효성체크</span>
									</div>





									<div id="wrap_gender">
										<span id="wrap_man" class="gender"> <input type="radio"
											id="man" name="gender" onclick="ck_gender()"> <label
											for="man"> 남자 </label>
										</span> <span id="wrap_woman" class="gender no_line"> <input
											type="radio" id="woman" name="gender" onclick="ck_gender()">
											<label for="woman" onclick="ck_gender()">여자 </label>
										</span>
									</div>


									<div>



										<label for="name"></label> <input type="text" id="name"
											name="lastname" placeholder="연락처" onblur="ck_name()">

									</div>












									<!-- 주소 -->
									<div class="form-group">
										<input class="form-control"
											style="width: 40%; display: inline;" placeholder="우편번호"
											name="addr1" id="addr1" type="text" readonly="readonly">
										<button type="button" class="btn btn-default"
											onclick="execPostCode();">
											<i class="fa fa-search"></i> 우편번호 찾기
										</button>
									</div>
									<div class="form-group">
										<input class="form-control" style="top: 5px;"
											placeholder="도로명 주소" name="addr2" id="addr2" type="text"
											readonly="readonly" />
									</div>
									<div class="form-group">
										<input class="form-control" placeholder="상세주소" name="addr3"
											id="addr3" type="text" />
									</div>












									<input type="submit" value="회원가입">
								
								</fieldset>
							</form>
						</div>
					</div>
			</div>




			<script>
		function goMain(){
			location.href="<%= request.getContextPath() %>";
		}
		
		function joinValidate(){
			
		    function ck_email(){
		        var email = document.getElementById("email")
		        var MsgId = document.getElementById("MsgId")
		        var isEmail = /([\w\-]+\@[\w\-]+\.[\w\-]+)/

		        if(!isEmail.test(email.value)){
		            MsgId.style.display="block";
		            MsgId.className='error'
		            MsgId.innerHTML="이메일 형식을 확인하세요"
		            email.focus()
		            return false;
		        } else{
		            MsgId.className='vaild'
		            MsgId.innerHTML="ok"
		        }   
		}

		function ck_pwd(){
		        var pwd = document.getElementById("pwd")
		        var MsgPw = document.getElementById("MsgPw")
		        var isPwd = /^(?=.*[a-zA-Z])((?=.*\d)|(?=.*\W)).{6,20}$/
		        
		        if(!isPwd.test(pwd.value)){
		            MsgPw.style.display="block";
		            MsgPw.className='error'
		            MsgPw.innerHTML="숫자포함 최소 6자리 이상"
		            pwd.focus()
		            return false;
		        } else{
		            MsgPw.className='vaild'
		            MsgPw.innerHTML="ok"
		        }   
		}


		function ck_pwd2(){
		        var pwd_ck = document.getElementById("pwd_ck")
		        var pwd = document.getElementById("pwd").value
		        var MsgPwck = document.getElementById("MsgPwck")
		        
		        if(pwd_ck.value!=pwd){
		            MsgPwck.style.display="block";
		            MsgPwck.className='error'
		            MsgPwck.innerHTML="비밀번호가 일치하지 않습니다."
		            pwd_ck.focus()
		            return false;
		        } else{
		            MsgPwck.className='vaild'
		            MsgPwck.innerHTML="ok"
		        }   
		}


		function ck_name(){
		        var name = document.getElementById("name")
		        var MsgName = document.getElementById("MsgName")
		        
		        if(name.value==''){
		            MsgName.style.display="block";
		            MsgName.className='error'
		            MsgName.innerHTML="2자 이상 입력하세요."
		            name.focus()
		            return false;
		        } else{
		            MsgName.className='vaild'
		            MsgName.innerHTML="ok"
		        }   
		}


		function ck_gender(){
		    var wrap_gender = document.getElementById("wrap_gender")
		    var man = document.getElementById("man")
		    var woman = document.getElementById("woman")
		    var MsgGender = document.getElementById("MsgGender")

		    
		    if(man.checked){
		        document.getElementById("wrap_man").className='gender_act';
		        document.getElementById("wrap_woman").className='gender';
		    }
		    
		    if(woman.checked){
		        document.getElementById("wrap_woman").className='gender_act';
		        document.getElementById("wrap_man").className='gender';
		    }
		    
		    
		}

			
			return true;
			
			
			
		}
		
		$(function(){
			
			var isUsable = false;
			
			$("#idCheck").click(function(){
				
				var userId = $("#joinForm input[name=userId]");
				
				$.ajax({
					url:"idCheck.me",
					type:"post",
					data:{userId:userId.val()},
					success:function(result){
						
						if(result == "fail"){ // 사용불가
							alert("사용할수 없는 아이디 입니다!");
							userId.focus();
							
						}else{ // 사용가능
							
							if(confirm("사용 가능한 아이디입니다. 사용하시겠습니까?")){
								userId.attr("readonly", "true"); // 더 이상 바꿀수 없도록
								isUsable = true;
							}else{
								userId.focus();
							}
							
						}
						
						if(isUsable){
							$("#joinBtn").removeAttr("disabled");
						}
						
					},
					error:function(){
						console.log("서버 통신 안됨");
					}
				});
				
			});
			
		});
		
	     // 취소 버튼 클릭시 로그인 화면으로 이동
        function goLoginForm() {
            location.href="LoginForm.jsp";
        }



		
	</script>
</body>
</html>




