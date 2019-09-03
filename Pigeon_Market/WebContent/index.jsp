<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>

.category_tab {
	display: block;
	box-sizing: border-box;
	width: 1200px;
	height: 320px;
	margin: auto;
}

.overflow {
	list-style-type: none;
	height: 100px;
	padding: 0;
	margin: 0;
}

.overflow>li {
	float: left;
	width: 120px;
	height: 100px;
	text-align: center;
}

.overflow li a {
	display: block;
	height: 100%;
	line-height: 30px;
	text-decoration: none;
	font-size: 11pt;
	padding-top: 3px;
	color: black;
	border: 0px;
}

.overflow li a:hover {
	color: orange;
}


.intes{
	position:fixed;
	top: 10%;
	right: 5%;
	float:right;
	width:100px;
	height:200px;
	border: 1px solid red;
}
</style>
</head>
<body>
	<%@ include file="views/common/menubar.jsp"%>

	<section id="main" class="container">
		<header>
			<h2>상품구매</h2>
		</header>
		<div class="category_tab">
			<ul class="overflow">
				<li><a href="#">남성의류</a></li>
				<li><a href="#">여성의류</a></li>
				<li><a href="#">귀금속</a></li>
				<li><a href="#">기타/의류/잡화</a></li>
				<li><a href="#">미용</a></li>
				<li><a href="#">출산/육아</a></li>
				<li><a href="#">모바일</a></li>
				<li><a href="#">상품권/티켓/쿠폰</a></li>
				<li><a href="#">영화/연극/공연</a></li>
				<li><a href="#">스타굿즈</a></li>
				<li><a href="#">여행/여가</a></li>
				<li><a href="#">컴퓨터</a></li>
				<li><a href="#">카메라</a></li>
				<li><a href="#">음악/음향/악기</a></li>
				<li><a href="#">게임용품</a></li>
				<li><a href="#">골프</a></li>
				<li><a href="#">스포츠레저</a></li>
				<li><a href="#">자전거</a></li>
				<li><a href="#">생활용품</a></li>
				<li><a href="#">가구</a></li>
				<li><a href="#">예술/미술/취미</a></li>
				<li><a href="#">키덜트</a></li>
				<li><a href="#">도서관련</a></li>
				<li><a href="#">ETC</a></li>
			</ul>
		</div>

		<table style="text-align: center">
			<tr>
				<td colspan="4">남성의류</td>
			</tr>
			<tr>
				<td>남성의류 사진</td>
				<td>남성의류 사진</td>
				<td>남성의류 사진</td>
				<td>남성의류 사진</td>
			</tr>
			<tr>
				<td colspan="4">남성의류 더보기></td>
			</tr>
			<tr>
				<td colspan="4">여성의류</td>
			</tr>
			<tr>
				<td>여성의류 사진</td>
				<td>여성의류 사진</td>
				<td>여성의류 사진</td>
				<td>여성의류 사진</td>
			</tr>
			<tr>
				<td colspan="4">여성의류 더보기></td>
			</tr>

			<tr>
				<td colspan="4">귀금속</td>
			</tr>
			<tr>
				<td>귀금속 사진</td>
				<td>귀금속 사진</td>
				<td>귀금속 사진</td>
				<td>귀금속 사진</td>
			</tr>
			<tr>
				<td colspan="4">귀금속 더보기></td>
			</tr>

		</table>
		</div>
	</section>
	
	
	<aside>
	
		<div class="intes">
				

		
		</div>
	
	</aside>
	


	<%@ include file="views/common/foot.jsp"%>

</body>

</html>
