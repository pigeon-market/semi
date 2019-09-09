<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="com.pigeonMarket.member.model.vo.Member, java.util.ArrayList, com.pigeonMarket.dealInfo.model.vo.Activity"%>
<%
	Member m = (Member) session.getAttribute("loginUser");

	ArrayList<Activity> aList = (ArrayList<Activity>) request.getAttribute("aList");
	ArrayList<String> range = (ArrayList<String>) request.getAttribute("range");

	int maxNum = 0;
	int viewNum = 0;
	String status = "";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>수정중</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<style>
.row {
	margin: auto !important;
}

hr {
	border: 1px solid rgba(79, 106, 228, 0.685);
}

.listTable {
	width: 100%;
	padding-left: 2%;
	padding-right: 2%;
}

.imgDiv, .statusDiv, .titleDiv {
	display: inline-block;
	vertical-align: middle;
}

#info {
	text-align: center;
}

#infoImg {
	height: 50px;
}
</style>

</head>


<body class="is-preload">
	<%@ include file="../common/menubar.jsp"%>
	<div id="page-wrapper">


		<!-- Main -->
		<section id="main" class="container"> <header>
		<h2>MyPage</h2>


		</header>
		<div class="row">
			<div class="col-15">
				<section>
				<div class="box alt">
					<div class="row gtr-50 gtr-uniform">
						<div class="col">

							<span class="image fit"
								onclick="location.href='<%=contextPath%>/goMyInfo.me'"> <input
								type="button" value="개인정보수정">
							</span>
						</div>
						<div>

							<span class="image fit"	onclick="location.href='<%=contextPath%>/Activity.me?status=all&page=&group=15&period='">
								<input type="button" value="활동조회">
							</span>

						</div>
						<div class="col">
							<span class="image fit" onclick="location.href='<%=contextPath%>/Activity.me?status=sell&page=&group=15&period='">
								<input type="button" value="판매조회">
															</span>
						</div>
						<div class="col">
							<span class="image fit" onclick="location.href='<%=contextPath%>/Activity.me?status=buy&page=&group=15&period=&'">
								<input type="button" value="구매조회">
															</span>
						</div>
						<div class="col">
							<span class="image fit"
								onclick="location.href='<%=contextPath%>/myShoppingBacket.me'">
								<input type="button" value="장바구니">
							</span>
						</div>

					</div>
				</div>

				</section>

				<!-- Text -->
				<section class="box">
				<form method="post" id="form" action="">
					<h2>최근 활동 기록</h2>


					<%
						while (maxNum < aList.size()) {
					%>
					<h3><%=aList.get(maxNum).getaDate()%></h3>

					<%
						for (int i = maxNum; i < Integer.parseInt(range.get(viewNum)); i++) {
					%>


					<%
						switch (aList.get(i).getStatus()) {
									case "signin" :
										status = "회원가입";
										break;
									case "inq_q" :
										status = "문의등록";
										break;
									case "inq_a" :
										status = "문의답변";
										break;
									case "sell_r" :
										status = "판매등록";
										break;
									case "sell_e" :
										status = "판매완료";
										break;
									case "buy" :
										status = "구매완료";
										break;
									case "sell_a" :
										status = "판매승인";
										break;
									case "review" :
										status = "리뷰작성";
										break;

								}
					%>

					<div class="listTable">
						<input type="hidden" value="<%=aList.get(i).getbNo()%>"> <input
							type="hidden" value="<%=aList.get(i).getStatus()%>">
						<div class="statusDiv">
							<%=status%>
						</div>
						<div class="imgDiv">
							<%
								if (aList.get(i).getChangeName() != null) {
							%>
							<img
								src="<%=contextPath%>/resources/thumbnail_uploadFiles/<%=aList.get(i).getChangeName()%>"
								width="250px" height="150px">

							<%
								}
							%>
						</div>
						<div class="titleDiv">
							<%=aList.get(i).getTitle()%>
						</div>
						<hr>
					</div>



					<%
						}
					%>
					<hr>
					<%
						maxNum = Integer.parseInt(range.get(viewNum));
							viewNum = viewNum + 1;
					%>


					<%
						}
					%>

					<input type="hidden" name="no" id="no" value=""> <input
						type="hidden" name="st" id="st" value="">

				</form>
				</section>

			</div>
		</div>

		</section>



	</div>

	<%@ include file="../common/foot.jsp"%>

	<script>
	$(function() {
		$(".listTable div").mouseenter(function() {
			$(this).parent().css({"cursor": "pointer", "background":"yellow"});
		}).click(function() {
			
			var no = $(this).parent().children().eq(0).val();
			var st = $(this).parent().children().eq(1).val();
			
			var checkSt = st.indexOf("_");
			var st = st.substring(0, checkSt);;
			
			if(st == "sell" || st == "buy") {

				$('#no').val(no);
				$('#st').val(st);
				
				$('#form').attr("action", "<%=contextPath%>/detailView.deal");
							$('#form').submit();

						}

					}).mouseout(function() {
				$(this).parent().css({
					"background" : "white",
				});
			});

		});
	</script>


</body>
</html>