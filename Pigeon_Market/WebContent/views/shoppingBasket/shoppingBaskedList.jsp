<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.ArrayList, com.pigeonMarket.dealInfo.model.vo.Deal"%>
<%

	Member m = (Member)session.getAttribute("loginUser");
	ArrayList<Deal> myList = (ArrayList<Deal>)request.getAttribute("myList");


%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
input[id="check"]+label {
	display: inline-block;
	width: 20px;
	height: 20px;
	border: 2px solid #bcbcbc;
	cursor: pointer;
}

input[id="check"]:checked+label {
	background-color: #666666;
}

input[name="check"] {
	display: none;
}

table th {
	padding: 0.3em 0.3em;
	text-align: center;
}

p {
	display: block;
	margin-block-start: 0em;
	margin-block-end: 0em;
	margin-inline-start: 0px;
	margin-inline-end: 0px;
}

.titleimg {
	width: 100%;
	height: 30%;
}

#delete, #purchase {
	height: 50px;
	text-align: center;
	font-size: 1.5em;
	padding: 10px 0px;
	color: white;
}

#delete {
	background: burlywood;
}

#purchase {
	background: cornflowerblue;
}

#delete:hover, #purchase:hover {
	cursor: pointer;
	padding-bottom: 0cm
}

#infoImg {
	height: 50px;
}
</style>
</head>
<body>

	<%@ include file="../common/menubar.jsp"%>
	<div id="page-wrapper">
		<section id="main" class="container">
			<header>
				<h2>MyPage</h2>


			</header>
			<div class="row">
				<div class="col-12">
					<section>
						<div class="box alt">
							<div class="row gtr-50 gtr-uniform">
								<div class="col-12" id="info">
									<span class="image fit"
										onclick="location.href='<%=contextPath%>/goMyInfo.me'">
										<img id="infoImg"
										src="<%=contextPath%>/resources/images/pic04.jpg">개인정보수정
									</span>
								</div>
								<div class="col-3">
									<span class="image fit"
										onclick="location.href='<%=contextPath%>/Activity.me?status=all&page=1&group=15&period=&date='"><img
										src="<%=contextPath%>/resources/images/pic04.jpg">활동조회</span>
								</div>
								<div class="col-3">
									<span class="image fit"
										onclick="location.href='<%=contextPath%>/Activity.me?status=sell&page=1&group=15&period=&date='"><img
										src="<%=contextPath%>/resources/images/pic04.jpg">판매조회</span>
								</div>
								<div class="col-3">
									<span class="image fit"
										onclick="location.href='<%=contextPath%>/Activity.me?status=buy&page=1&group=15&period=&date='"><img
										src="<%=contextPath%>/resources/images/pic04.jpg">구매조회</span>
								</div>
								<div class="col-3">
									<span class="image fit"
										onclick="location.href='<%=contextPath%>/myShoppingBacket.me'"><img
										src="<%=contextPath%>/resources/images/pic04.jpg">배송조회</span>
								</div>

							</div>
						</div>

					</section>

					<section class="box">
						<form>
							<table class="listTable">
								<tr>
									<th width="10%">상품체크</th>
									<th width="25%">상품사진</th>
									<th width="25%">상품제목</th>
									<th width="20%">판매자아이디</th>
									<th width="20%">상품가격</th>
								</tr>
								<% for(int i = 0 ; i < myList.size() ; i++) { %>
								<tr>
									<th class="info"><input type="checkbox" name="check" id="check"
										value="no1"> <label for="check"></label></th>
									<th class="info"><img
										src="<%= contextPath %>/resources/thumbnail_uploadFiles/<%=myList.get(i).getName() %>"
										width="100%" height="100%" class="titleimg"></th>
									<th class="info"><%= myList.get(i).getTitle() %></th>
									<th class="info"><%= myList.get(i).getpId() %>
									<th class="info"><%= myList.get(i).getPrice() %></th>
								</tr>
								<% } %>
								<tr>
									<th colspne="2"></th>
									<th>총 금액</th>
									<th>total</th>
								</tr>
								<tr>
									<th colspan="2"><div id="delete">선택 삭제</div></th>
									<th colspan="3"><div id="purchase">구입</div></th>
								</tr>

							</table>

						</form>

					</section>
				</div>
			</div>
		</section>
	</div>
	<script>
		
		$(function() {
			$(".listTable .classInfo").click(function() {
				$('input:checkbox[id="check"]').attr("checked", true);

			});
		});
				
	</script>

	<%@ include file="../common/foot.jsp"%>

</body>
</html>