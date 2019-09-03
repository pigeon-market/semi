<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<title>Insert title here</title>

</head>
<body>
	<%@ include file="views/common/menubar.jsp"%>
	
		<section id="banner">
					<h2>Dove Market</h2>
					<p>비둘기를 팔지 않아요. 여러분이 직접 물건을 사고 팔면 됩니다.</p>
					<ul class="actions special">
						<li><a href="#" class="button primary">Login</a></li>
						<li><a href="#" class="button">사용방법</a></li>
					</ul>
				</section>

			<!-- Main -->
				<section id="main" class="container">

					<section class="box special">
						<header class="major">
							<h2>평화 비둘기 마켓에 대해 소개 하겠습니다. 
							<br />
							부제목 / 내용 </h2>
							<p>간단한 소개 내용 : 추가 예정</p>
						</header>
						<span class="image featured"><img src="images/dedove.jpg" alt="힙합비둘기" width="1200px" height="393px" /></span>
					</section>

					<section class="box special features">
						<div class="features-row">
							<section>
								<span class="icon solid major fa-bolt accent2"></span>
								<h3>아이템1</h3>
								<p>내용 </p>
							</section>
							<section>
								<span class="icon solid major fa-chart-area accent3"></span>
								<h3>아이템2</h3>
								<p>내용 </p>
							</section>
						</div>
						<div class="features-row">
							<section>
								<span class="icon solid major fa-cloud accent4"></span>
								<h3>아이템3</h3>
								<p>내용 </p>
							</section>
							<section>
								<span class="icon solid major fa-lock accent5"></span>
								<h3>아이템4</h3>
								<p>내용 </p>
							</section>
						</div>
					</section>

					<div class="row">
						<div class="col-6 col-12-narrower">

							<section class="box special">
								<span class="image featured"><img src="images/pic02.jpg" alt="" /></span>
								<h3>구매</h3>
								<p>구매 페이지로 바로 연결(로그인 한 사람만)</p>
								<ul class="actions special">
									<li><a href="<%= contextPath%>/list.pr" class="button alt">구매 페이지 연결</a></li>
								</ul>
							</section>

						</div>
						<div class="col-6 col-12-narrower">

							<section class="box special">
								<span class="image featured"><img src="images/pic03.jpg" alt="" /></span>
								<h3>판매</h3>
								<p>판매 페이지로 바로 연결(로그인 한 사람만)</p>
								<ul class="actions special">
									<li><a href="#" class="button alt">판매 페이지 연결</a></li>
								</ul>
							</section>

						</div>
					</div>

				</section>

			<!-- CTA -->
				<section id="cta">

					<h2>위 버튼이 안눌러지시면</h2>
					<p>바로 가입 하세요. 여러분의 중고 마켓이 생깁니다.</p>

					<form>
						<div class="row gtr-50 gtr-uniform">
							<div class="col-8 col-12-mobilep">
								<input type="email" name="email" id="email" placeholder="Email Address" />
							</div>
							<div class="col-4 col-12-mobilep">
								<input type="submit" value="login" class="fit" />
							</div>
						</div>
					</form>

				</section>

	
	
	
	<%@ include file="views/common/foot.jsp"%>
	
			<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.dropotron.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>


</body>
</html>
