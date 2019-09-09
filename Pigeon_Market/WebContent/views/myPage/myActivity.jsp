<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="com.pigeonMarket.member.model.vo.Member, java.util.ArrayList, com.pigeonMarket.dealInfo.model.vo.Activity, com.pigeonMarket.common.model.vo.PageInfo, java.util.Date, java.text.SimpleDateFormat "%>
<%
	Member m = (Member) session.getAttribute("loginUser");

	ArrayList<Activity> aList = (ArrayList<Activity>) request.getAttribute("aList");
	ArrayList<String> range = (ArrayList<String>) request.getAttribute("range");

	// 상태 처리 변수 선언

	Activity a = (Activity) request.getAttribute("a");

	String title = "";

	switch (a.getStatus()) {
		case "" :
			title = "전체 활동";
			break;
		case "inq_q" :
			title = "문의등록";
			break;
		case "inq_a" :
			title = "문의답변";
			break;
		case "sell_r" :
			title = "판매등록";
			break;
		case "buy" :
			title = "구매활동";
			break;
		case "sell_e" :
			title = "판매완료";
			break;
		case "sell_a" :
			title = "판매승인";
			break;
		case "sell" :
			title = "판매활동";
			break;
		case "review" :
			title = "리뷰작성";
			break;
	};

	// 페이징바 처리 변수 선언

	PageInfo pi = (PageInfo) request.getAttribute("pi");

	int listCount = pi.getListCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();

	// 반복문 변수 선언

	int maxNum = 0;
	int viewNum = 0;
	String status = "";
	
	SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date currentTime = new Date();
	String today = mSimpleDateFormat.format(currentTime );

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
	
	margin:auto !important;
	
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

#infoImg{
	height:50px;
}
</style>

</head>


<body class="is-preload">
	<%@ include file="../common/menubar.jsp"%>
	<div id="page-wrapper">


		<!-- Main -->
		<section id="main" class="container"> <header>
		<h2><%=title%></h2>


		</header>
		<div class="row">
			<div class="col-12">
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

							<span class="image fit"	onclick="location.href='<%=contextPath%>/Activity.me?status=all&page=1&group=15&period=&date='">
								<input type="button" value="활동조회">
							</span>

						</div>
						<div class="col">
							<span class="image fit" onclick="location.href='<%=contextPath%>/Activity.me?status=sell&page=1&group=15&period=&date='">
								<input type="button" value="판매조회">
															</span>
						</div>
						<div class="col">
							<span class="image fit" onclick="location.href='<%=contextPath%>/Activity.me?status=buy&page=1&group=15&period=&date='">
								<input type="button" value="구매조회">
															</span>
						</div>
						<div class="col">
							<span class="image fit"
								onclick="location.href='<%=contextPath%>/myShoppingBacket.me'">
								<input type="button" value="배송조회">
							</span>
						</div>

					</div>
				</div>
				</section>

				<!-- Text -->
				<section class="box">
				<form method="post">
					<div id="filterForm">
						<table>
							<tr>
								<td>페이지당 갯수</td>
								<td><input type="radio" name="group" value="15"></td>
								<td><input type="radio" name="group" value="20"></td>
								<td><input type="radio" name="group" value="30"></td>
							</tr>
							<tr>
								<td>기간</td>
								<td><input type="radio" name="period" value="90"></td>
								<td><input type="radio" name="period" value="180"></td>
								<td><input type="radio" name="period" value="365"></td>
								<td><input type="radio" name="period" value="all"></td>
								<td><input type="number" name="period" value="" disabled></td>
							</tr>
							<tr>
								<td>특정날짜 검색</td>
								<td><input type="date" id="date1" name="date1" value=<%= today %> min="2018-01-01" max=<%= today %> disabled></td>
								<td><input type="date" id="date2" name="date2" value=<%= today %> min="2018-01-01" max=<%= today %> disabled></td>
								<td><button id="dateAbled" onclick="dateAbled();">해제하기</button>
							</tr>
							
							<tr>
								<td><button onclick="filtButton();">검색하기</button>
							</tr>
					
						</table>
					 </div>
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
						<input type="hidden" value="<%= aList.get(i).getStatus()%>">
						<input type="hidden" value="<%= aList.get(i).getrNo()%>">
						<div class="statusDiv">
							<p><%=status%></p>
						</div>
						<div class="imgDiv">
							<%
								if (aList.get(i).getChangeName() != null) {
							%>
							<img
								src="<%=contextPath%>/resources/thumbnail_uploadFiles/<%=aList.get(i).getChangeName()%>"
								width="200px" height="150px">


							<%
								}
							%>
						</div>
						<div class="titleDiv">
							<%=aList.get(i).getTitle()%>
						</div>
						<hr>
					</div>


					<br>

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

					<!-- 페이징바 만들기 -->
					<div class="pagingArea" align="center">

						<!-- 맨처음으로 (<<) -->
						<button
							onclick="location.href='<%=contextPath%>/Activity.me?status=<%=a.getStatus() %>&page=1&group=<%=a.getLimitCount() %>&period=<%=a.getPeriod() %>&date='">
							&lt;&lt;</button>

						<!-- 이전페이지로(<) -->
						<%
							if (currentPage == 1) {
						%>
						<button disabled>&lt;</button>
						<%
							} else {
						%>
						<button
							onclick="location.href='<%=contextPath%>/Activity.me?status=<%=a.getStatus() %>&page=<%= currentPage-1 %>&group=<%=a.getLimitCount() %>&period=<%=a.getPeriod() %>&date='">
							&lt;</button>
						<%
							}
						%>


						<!-- 10개의 페이지 목록 -->
						<%
							for (int p = startPage; p <= endPage; p++) {
						%>

						<%
							if (p == currentPage) {
						%>
						<button disabled>
							<%=p%>
						</button>
						<%
							} else {
						%>
						<button
							onclick="location.href='<%=contextPath%>/Activity.me?status=<%=a.getStatus() %>&page=<%= p %>&group=<%=a.getLimitCount() %>&period=<%=a.getPeriod() %>&date='">
							<%=p%>
						</button>
						<%
							}
						%>

						<%
							}
						%>


						<!-- 다음페이지로(>) -->
						<%
							if (currentPage == maxPage) {
						%>
						<button disabled>&gt;</button>
						<%
							} else {
						%>
						<button
							onclick="location.href='<%=contextPath%>/Activity.me?status=<%=a.getStatus() %>&page=<%= currentPage+1 %>&group=<%=a.getLimitCount() %>&period=<%=a.getPeriod() %>&date='">
							&gt;</button>
						<%
							}
						%>

						<!-- 맨끝으로(>>) -->
						<button
							onclick="location.href='<%=contextPath%>/Activity.me?status=<%=a.getStatus() %>&page=<%= maxPage %>&group=<%=a.getLimitCount() %>&period=<%=a.getPeriod() %>&date='">
							&gt;&gt;</button>

					</div>
					<input type="hidden" name="no" id="detailNo" value="">
					<input type="hidden" name="st" id="detailSt" value="">
						
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
				$(this).parent().css({
					"cursor" : "pointer"
				});
				$(this).parent().children().css({
					"background" : "yellow"
				});
			}).click(function() {
				var st = $(this).parent().children().eq(0).text();
				var no = $(this).parent().children().eq(1).val();
				
				$('#detailNo').val(no);
				$('#detailSt').val(st);
				
				Console.log(st);
				Console.log(no);
				
				var no1= $('#detailNo').val();
				var st1 = $('#detailSt').val();
				
				Console.log(st1);
				Console.log(no1);
				
				
				
				location.href="<%= contextPath %>/detailView.deal"
				
				
			}).mouseout(function() {
				$(this).parent().children().css({
					"background" : "white"
				});
			});

		});
		
		
		function dateAbled() {
			
			var dateSt = $('#dateAbled').text();
			
			if(dateSt == '잠그기') {
			$('#date1').removeAttr(disabled);
			$('#date2').removeAttr(disabled);
			$('#dateAbled').text("해제하기");
			}else{
				$('#date1').attr(abled);
				$('#date2').attr(abled);
				$('#dateAbled').text("잠그기");
						
			}
		}
		
		function filtButton() {
			
			var dateSt = $('#dateAbled').text();
			if(dateSt == '잠그기') {
				Date date1 = $('#date1').val();
				Date date2 = $('#date1').val();
				
				var dateSub = date2-date1;
				console.log(dateSub);
				
				
			}
		}
		
	</script>


</body>
</html>