<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.pigeonMarket.member.model.vo.Member" %>
<%
	String userId = ((Member)request.getSession().getAttribute("loginUser")).getUserId();
	
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>수정중</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<style>
.col-3 {
	text-align: center;
}

hr {
	border: 1px solid rgba(79, 106, 228, 0.685);
}
</style>

</head>

<%@ include file="../common/menubar.jsp"%>
<body class="is-preload">
	<div id="page-wrapper">


		<!-- Main -->
		<section id="main" class="container"> <header>
		<h2>MyPage</h2>
		

		</header>
		<div class="row">
			<div class="col-12">
				<section>
				<div class="box alt">
					<div class="row gtr-50 gtr-uniform">
						<div class="col-12" style="text-align: center">
							<span class="image fit"><img src="images/pic04.jpg" alt="" /></span>개인정보수정
						</div>

						
						<div class="col-3">
							<span class="image fit"><img src="images/pic04.jpg" alt="" /></span>활동조회
						</div>
						<div class="col-3">
							<span class="image fit"><img src="images/pic04.jpg" alt="" /></span>판매조회
						</div>
						<div class="col-3">
							<span class="image fit"><img src="images/pic04.jpg" alt="" /></span>구매조회
						</div>
						<div class="col-3">
							<span class="image fit"><img src="images/pic04.jpg" alt="" /></span>거래조회
						</div>

					</div>
				</div>

				</section>

				<!-- Text -->
				<section class="box">
				<form>
					<h2>최근 활동 기록</h2>
					<h3>날짜 가지고 올꺼임</h3>
					<p>판매, 구매, 활동 등등</p>

					<hr>

					IF 판매자일때 테이블이랑 IF 구매자일때 테이블이랑 IF 로그인할때랑 나뉘어야함

				</form>
				</section>

			</div>
		</div>

		</section>



	</div>

<%@ include file="../common/foot.jsp"%>

</body>
</html>