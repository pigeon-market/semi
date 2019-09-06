<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>

<script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>

<!-- <script type="text/JavaScript" src="http://code.jquery.com/jquery-1.7.min.js"></script>

	<script type="text/JavaScript" src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>

	<script type="text/javascript">

		function openDaumZipAddress() {

			new daum.Postcode({

				oncomplete:function(data) {

					jQuery("#postcode1").val(data.postcode1);

					jQuery("#postcode2").val(data.postcode2);

					jQuery("#zonecode").val(data.zonecode);

					jQuery("#address").val(data.address);

					jQuery("#address_etc").focus();

					console.log(data);

				}

			}).open();

		}

	</script>
     -->
<style>

	  .outer{
		width:600px;
		height:500px;
	 /* background:black;
		color:white;  */
		margin-left:auto;
		margin-right:auto;
		margin-top:50px;
	}  
	#idCheck:hover, #joinBtn:hover, #goMain:hover {
		cursor:pointer;
	}
 	 #joinForm table{
		width:100%;
		margin-left:auto;
		margin-right:auto;
	}
 	#joinForm td{
		text-align:right;
	} 
	#idCheck{
		text-align:left;
	}
	 #joinBtn{
		background:yellowgreen;
	}
	#joinBtn, #goMain{
		display:inline-block;
	}
	
/* 	.main{ margin: 0 auto;
    width: 40%;
	}
	
	.main h4{ margin: 60px auto;
	text-align: center; font-size: 2em; } */
	
	fieldset{
	    border: none;
	}
	
	fieldset > div{ 
	    position: relative;
	    margin-bottom: 10px;
	}    
	
	
	#wrap_gender{
    border-radius: 4px;
    border: 1px solid #ccc;
    display: flex;
}

.gender{
    display: block;
    height: 100%; width: 50%;
    border-right: 1px solid #ccc;
}

.gender > label {
    display: block;
    /*width: 100%; height: 100%;*/
    padding: 10px 0;
    text-align: center;
    font-size: 0.8em;
    color: #666;
}

.gender_act{
    display: inline-block;
    height: 100%; width: 50%;
    background-color: #45a049;
    color:#fff;
}

.gender_act > label {
    display: inline-block;
    width: 100%; height: 100%;
    padding: 10px 0;
    text-align: center;
    font-size: 0.8em;
    color: #fff;
}


</style>
</head>
<body>
	<!-- 회원가입 페이지에서도 menubar는 노출되도록 -->
	<%@ include file="../common/menubar.jsp" %>
	
	<div class="outer">
		<br>
	<!-- 	<div class="main"> -->
		<h4 align="center">회원가입</h4>
		
		<fieldset>
		 <form id="joinForm" action="<%= request.getContextPath() %>/insert.me" method="post" onsubmit="return joinValidate();"> 
			
			<table>
				<tr>
		
				<label for="name"></label>
                <input type="text" id="name" name="userId" placeholder="* 아이디" onblur="ck_name()" required >
                <span id="MsgName" class="none"></span>
               
				<div id="idCheck"> 중복확인</div>
		
				</tr>
				<tr>
					  <label for="pwd"></label> 
				 	  <input type="password" id="pwd" maxlength="15" name="userPwd" placeholder="* 비밀번호" onblur="ck_pwd()" required>
                      <span id="MsgPw" class="none"></span>
			
				</tr>
				<tr>
				<label for="pwd_ck"></label> 
				<input type="password" id="pwd_ck" maxlength="15"  name="userPwd2" placeholder="* 비밀번호 확인" onblur="ck_pwd2()" required>
                <span id="MsgPwck" class="none"></span>
				<!-- <td><label id="pwdResult"></label></td> -->
				</tr>
				<tr>
				<label for="name"></label>
				<input type="text" id="name"  maxlength="5" name="userName" placeholder="*이름" onblur="ck_name()" required>
                <span id="MsgName" class="none"></span>
				</tr>
				<tr>
				<label for="birthDate"></label> 
				<input type="text" id="name" maxlength="8" name="birthDate" placeholder="* 주민등록번호(19951105)" onblur="ck_name()" required>
                <span id="MsgName" class="none"></span>
               
				</tr>
				<tr>
				<label for="gender"></label> 
				<input type="text" maxlength="1" name="gender" placeholder="성별(M/F)기입">
				</tr>
				<tr>
				 <label for="email"></label> 
				 <input type="email" id="email" name="email" placeholder="이메일(ex@codepen.com)" onblur="ck_email()"> 
                 <span id="MsgId" class="none"></span>
				</tr>
				<tr>
				<label for="phone"></label> 
				<input type="text" maxlength="13" name="phone" placeholder="* 연락처(010-1234-5678)">
				</tr>
				<tr>
				<label for="address"></label> 
				<!--<input type="text" name="address" placeholder="주소"> -->
				우편번호 : <input type="text" name="address" style="width:80px; height:26px;" />
				<button type="button" style="width:60px; height:32px;" onclick="openZipSearch()">검색</button><br>
				주소 : <input type="text" name="addr1" style="width:300px; height:30px;" readonly /><br>
				상세 : <input type="text" name="addr2" style="width:300px; height:30px;" />
				</tr>
				
				
				
				
				<!-- <input id="postcode1" type="text" value="" style="width:80px;" readonly/>
				&nbsp;-&nbsp;
				<input id="postcode2" type="text" value="" style="width:80px;" readonly/>
				&nbsp;&nbsp;
				<input id="zonecode" type="text" value="" style="width:80px;" readonly/>
				&nbsp;
				<input type="button" onClick="openDaumZipAddress();" value = "주소 찾기" />
				<br/>
				<br>
				<input type="text" id="address" name="address" value="" style="width:480px;" readonly/>
				&nbsp;&nbsp;
				<input type="text" id="address_etc" name="address" value="" style="width:240px;"/> -->
					
			
			
			
			</table>
			
			<div class="btns" align="center">
				<div id="goMain" onclick="goMain();">메인으로</div>
				
				<input type="submit" <%-- action="<%=request.getContextPath()%>/insert.me" method="post" --%> value="가입하기" id="joinBtn">
			</div>
			
		</form>
		</fieldset>
	<!-- 	</div> -->
	</div>
	
	
	
	<script>
		function goMain(){
			location.href="<%= request.getContextPath() %>";
		}
		
		function joinValidate(){
			
			// 아이디 검사
			if(!(/^[a-z][a-z\d]{3,11}$/i.test($("#joinForm input[name=userId]").val()))){
				$("#joinForm input[name=userId]").focus();
				return false;
			}
			
			// 비밀번호와 비밀번호 확인 일치하는지
			if($("#joinForm input[name=userPwd]").val() != $("#joinForm input[name=userPwd2]").val()){
				$("#pwdResult").text("비밀번호 불일치").css("color", "red");
				return false;
			}
			
			// 이름 검사
			if(!(/^[가-힣]{2,}$/.test($("#joinForm input[name=userName]").val()))){
				$("#joinForm input[name=userName]").focus();
				return false;
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
		
		
		
		// id,pw,email 유효성
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



 function openZipSearch() {
	new daum.Postcode({
		oncomplete: function(data) {
			$('[name=address]').val(data.zonecode); // 우편번호 (5자리)
			$('[name=addr1]').val(data.address);
			$('[name=addr2]').val(data.buildingName);
		}
	}).open();
}
 
		

		
	</script>
	
</body>
</html>




