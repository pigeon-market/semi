<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="<%= request.getContextPath()%>/resources/assets/css/main.css" />

		
<title>비둘기 중고 장터</title>

<link rel="shortcut icon" href="resources/images/dulgi.ico"  type="image/x-icon">
<link rel="icon" href="resources/images/dulgi.ico"  type="image/x-icon">

<style>
@font-face{
    src: url("resources/assets/fonts/BMJUA_ttf.ttf");
    font-family: "Jua";
    }
    
    #back {
 	background-attachment: scroll,							fixed;
	background-color: #666;
	background-image: url("resources/assets/css/images/overlay.jpg"), url("resources/images/notebook.jpg");
	background-position: top left,						center center;
	background-repeat: repeat,							no-repeat;
	background-size: auto,							cover;
	color: #fff;
	padding: 12em 0 20em 0;
	text-align: center; 
	


    }
    
    font{
    text-algin:center;
    }
 
 
 
</style>
</head>
<body>
	<%@ include file="views/common/menubar.jsp"%>


		<section id ="back" >
					<font size="20" color="yellow" face="Jua">Pigeon ONLINE CTC Market</font><br><br>
					<p>Consumer To Consumer, 평화롭게&nbsp; <em>온라인으로 쉽게 중고거래 </em>&nbsp; 하세요</p>
					<ul class="actions special">
							<% if(loginUser == null){ %>
				<form id="loginForm"
					action="<%= request.getContextPath() %>/login.me" method="post"
					onsubmit="return validate();">
					<li><a href="#" onclick="login();" class="button primary">회원가입</a></li>
				</form>
				<%}else { %>
				<div id="userInfo">
					<label><%= loginUser.getUserName() %>님의 방문을 환영합니다</label>
					<div class="btns" align="center">
					</div>

						<div id="logoutBtn" onclick="logout();">로그아웃</div>
					</div>
				<%} %>

						<li><a href="#main" class="button">사용방법</a></li>
					</ul>
	 	
	
		
			<!-- Main -->
				<section id="main" class="container">

					<section class="box special">
						<header class="major">
						<!-- <font size="5" color="Green" face="Jua">Simple한 중고거래!</font><br><br> -->
						 <h2>'벽돌' 없는 Simple한 개인간 중고 거래 사이트</h2>
						
						</header>
						<span class="image featured"><img src="resources/images/maybe.jpg" alt="중고나라아웃" height="393px" /></span>
						<%-- <span class="image featured"><img src="<%= request.getContextPath()%>/resources/images/dedove.jpg" alt="힙합비둘기" width="1200px" height="393px" /></span> --%>
					</section>

					<section class="box special features">
						<div class="features-row">
							<section>
							<img src="resources/images/sell.png" width="70px">
								<!-- <span class="icon solid major fa-bolt accent2"></span> -->
								<h3>1. 중고 물건을 업로드하세요.</h3>
								<!-- <p>판매자가 되고 싶다면 중고물품을 사진을 찍어서 업로드하세요.</p> -->
							</section>
							<section>
								<img src="resources/images/ok2.png" width="70px">
								<h3>2. 실제 판매자인지 확인 합니다.</h3>
							<!-- 	<p>판매자의 사기 전적과 실제 판매자 정보를 저희가 확인 합니다.</p> -->
							</section>
						</div>
						<div class="features-row">
							<section>
								<img src="resources/images/sell2.png" width="70px">
								<h3>3. 셀러가 되셨습니다.</h3>
								<!-- <p>2번의 확인 절차가 끝났고 이제 판매자가 되셨습니다. 이제 본격적으로 거래를 시작하십시요.</p> -->
							</section>
							<section>
								<img src="resources/images/deal1.png" width="70px">
								<h3>4. 맘편히 안전거래를 하세요. </h3>
							<!-- 	<p>수수료는 없습니다. 멋진 거래가 되길 바라겠습니다. </p> -->
							</section>
						</div>
					</section>

					<div class="row">
						<div class="col-6 col-12-narrower">

							<section class="box special">
								<span class="image featured"><img src="resources/images/one.png" alt="구매" width="170" height="300" /></span>
								<h3>구매</h3>
								<p>구매 페이지로 바로 연결(로그인 한 사람만)</p>
								<ul class="actions special">
								<%if(loginUser != null){ %>
									<li><a href="<%= contextPath%>/list.pr" class="button alt">구매 페이지 연결</a></li>
								<%}else{ %>
									<li><a class="button alt" onclick="alert('로그인해주세요');">구매 페이지 연결</a></li>
								<%} %>
								</ul>
							</section>

						</div>
						<div class="col-6 col-12-narrower">

							<section class="box special">
								<span class="image featured"><img src="resources/images/two.jpg" alt="판매" width="170" height="300"/></span>
								<!-- <ul class="actions special"> -->
								<h3>판매</h3>
								<p>판매 페이지로 바로 연결(로그인 한 사람만)</p>
								<ul class="actions special">
								<%if(loginUser != null){ %>
									<li><a href="#" class="button alt">판매 페이지 연결</a></li>
								<%}else{ %>
									<li><a class="button alt" onclick="alert('로그인해주세요');">판매 페이지 연결</a></li>
								<%} %>
								</ul>
							</section>

						</div>
					</div>

				</section>
	</section> 

			<!-- CTA -->
				<section id="cta">

					<h2>이제는 복잡하게 거래하지마세요</h2>
					<p>인증하고, 상품을 올리고, 판매하고, 입금받고! 간편한 여러분의 중고마켓!</p>

					<form>
						<!-- <div class="row gtr-50 gtr-uniform"> -->
							<!-- <div class="col-8 col-12-mobilep">
								<input type="email" name="email" id="email" placeholder="Email Address" />
							</div> -->
							<div class="col-4 col-12-mobilep">
								<input type="submit" value="위로" class="fit" />
							</div>
						<!-- </div> -->
					</form>

				</section>




	<%@ include file="views/common/foot.jsp"%>

			<!-- Scripts -->
			<script src="resources/assets/js/jquery.min.js"></script>
			<script src="resources/assets/js/jquery.dropotron.min.js"></script>
			<script src="resources/assets/js/jquery.scrollex.min.js"></script>
			<script src="resources/assets/js/browser.min.js"></script>
			<script src="resources/assets/js/breakpoints.min.js"></script>
			<script src="resources/assets/js/util.js"></script>
			<script src="resources/assets/js/main.js"></script>

			<script>
			function login(){
			//location.href="<%= request.getContextPath() %>/views/member/memberJoinForm.jsp";
			location.href="<%=request.getContextPath()%>/joinForm.me";
			}
			</script>

</body>
</html>
