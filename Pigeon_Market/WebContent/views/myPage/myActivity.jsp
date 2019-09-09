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

							<span class="image fit"	onclick="location.href='<%=contextPath%>/Activity.me?status=all&page=&group=&period=&date='">
								<input type="button" value="활동조회">
							</span>

						</div>
						<div class="col">
							<span class="image fit" onclick="location.href='<%=contextPath%>/Activity.me?status=sell&page=&group=&period=&date='">
								<input type="button" value="판매조회">
															</span>
						</div>
						<div class="col">
							<span class="image fit" onclick="location.href='<%=contextPath%>/Activity.me?status=buy&page=&group=&period=&date='">
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
				
					<div id="filterForm">
						<table>
							<tr>
								<td>페이지당 갯수</td>
								<td><input type="radio" name="group" id="group1" value="10"><label for="group1">10</td>
								<td><input type="radio" name="group" id="group2" value="15"><label for="group2">15</td>
								<td><input type="radio" name="group" id="group3" value="20"><label for="group3">20</td>
								<td><input type="radio" name="group" id="group4" value="30"><label for="group4">30</td>
								<td><input type="number" min="5" max="50" id="group" value="" placeholder="5~50"></td>
							</tr>
							<tr>
								<td>기간</td>
								<td><input type="radio" name="period" id="period1" value="90"><label for="period1">90일</td>
								<td><input type="radio" name="period" id="period2" value="180"><label for="period2">180일</td>
								<td><input type="radio" name="period" id="period3" value="365"><label for="period3">365일</td>
								<td><input type="radio" name="period" id="period4" value="all"><label for="period4">모든일</td>
								<td><input type="number" name="period" min="1" max="99999" id="period" value=""></td>
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
							onclick="location.href='<%=contextPath%>/Activity.me?status=<%=a.getStatus() %>&page=1&group=<%=pi.getBoardLimit() %>&period=<%=a.getPeriod() %>'">
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
							onclick="location.href='<%=contextPath%>/Activity.me?status=<%=a.getStatus() %>&page=<%= currentPage-1 %>&group=<%=pi.getBoardLimit() %>&period=<%=a.getPeriod() %>'">
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
							onclick="location.href='<%=contextPath%>/Activity.me?status=<%=a.getStatus() %>&page=<%= p %>&group=<%=pi.getBoardLimit() %>&period=<%=a.getPeriod() %>'">
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
							onclick="location.href='<%=contextPath%>/Activity.me?status=<%=a.getStatus() %>&page=<%= currentPage+1 %>&group=<%=pi.getBoardLimit() %>&period=<%=a.getPeriod() %>'">
							&gt;</button>
						<%
							}
						%>

						<!-- 맨끝으로(>>) -->
						<button
							onclick="location.href='<%=contextPath%>/Activity.me?status=<%=a.getStatus() %>&page=<%= maxPage %>&group=<%=pi.getBoardLimit() %>&period=<%=a.getPeriod() %>'">
							&gt;&gt;</button>

					</div>
					<form method="post">
					<div>
						<input type="hidden" name="no" id="detailNo" value="">
					<input type="hidden" name="st" id="detailSt" value="">
					
					</div>
						
				</form>
				</section>

			</div>
		</div>

		</section>



	</div>

	<%@ include file="../common/foot.jsp"%>

	<script>
	
	var groupNum = <%= pi.getBoardLimit() %>;
	var periodAdd = <%= a.getPeriod() %>;
	
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
			
			
			$('#group').on("change paste keyup", function() {
				groupNum = $('#group').val();
				$('#group').val(groupNum);
			});
			
			$('#period').on("change paste keyup", function() {
				periodAdd = $('#period').val();

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
						
			if($('input[name="group"]:checked').val() != null) {
				groupNum = $('input[name="group"]:checked').val();
				$('#group').val(groupNum);
			}
			
			
			
			if($('input[name="period"]:checked').val() != null) {
				periodAdd = $('input[name="period"]:checked').val();
				
				if(periodAdd == "all") {
					$('#period').val(99999);
				}else{
					$('#period').val(periodAdd);
				}
				periodAdd = $('#period').val();

			}
			
			
			
			if(groupNum<5 || groupNum > 50) {
				alert("갯수를 다시 입력해주세요");
			}else{
				location.href="<%=contextPath%>/Activity.me?status=<%=a.getStatus() %>&page=1&group="+groupNum+"&period="+periodAdd
			}
			
					
		}
		
				
		
	</script>


</body>
</html>