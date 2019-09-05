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

							<table class="listTable">
								<tr>
									<th width="10%">상품체크</th>
									<th width="10%">No</th>
									<th width="25%">상품사진</th>
									<th width="25%">상품제목</th>
									<th width="15%">판매자아이디</th>
									<th width="15%">상품가격</th>
								</tr>
								<% for(int i = 0 ; i < myList.size() ; i++) { %>
								<tr>
									<% String chId = "check"+i;%>
									
									<th class="info"><input type="checkbox" class="check" id="<%= chId %>" value="<%= myList.get(i).getProductNo()%>"> <label for="<%= chId %>"></label></th>
									<th class="info"><%= i+1 %></th>
									<th class="info"><img
										src="<%= contextPath %>/resources/thumbnail_uploadFiles/<%=myList.get(i).getName() %>"
										width="100%" height="100%" class="titleimg"></th>
									<th class="info"><%= myList.get(i).getTitle() %></th>
									<th class="info"><%= myList.get(i).getpId() %>
									<th class="info"><%= myList.get(i).getPrice() %></th>
								</tr>
								<% } %>
								<tr>
									<th colspan="4"></th>
									<th>총 금액</th>
									<th><input type="number" id="total" value="0" readonly></th>
								</tr>
								<tr>
									<th colspan="3"><div id="delete" onclick="deleteList();">선택 삭제</div></th>
									<th colspan="3"><div id="purchase" onclick="buyList();">구입</div></th>
								</tr>

							</table>
							
							<form action="" id="postList" method="post">
								<input type="hidden" name="list" value="" id="list">
								<input type="hidden" name="price" value="" id="price">
							</form>



					</section>
				</div>
			</div>
		</section>
	</div>
	<script>
		
		$(function() {
			$(".listTable .info").click(function() {
				var num = $(this).parent().children().eq(1).text();
				var num1 = num-1
				var numing = "check"+num1


				if($('input:checkbox[id='+numing+']').is(":checked")) {
					console.log("1");
					$('input:checkbox[id='+numing+']').attr("checked", false);
					var price = $(this).parent().children().eq(5).text();
					var intPrice = parseInt(price);
					var total = $('#total').val();
					var intTotal = parseInt(total);
					$('#total').val(intTotal-intPrice);
				}else{
					console.log("2");
					$('input:checkbox[id='+numing+']').attr("checked", true);
					var price = $(this).parent().children().eq(5).text();
					var intPrice = parseInt(price);
					var total = $('#total').val();
					var intTotal = parseInt(total);
					$('#total').val(intTotal+intPrice);
				}

			}).mouseenter(function() {
				$(this).parent().css({"cursor": "pointer"});
				$(this).parent().children().css({"background":"yellow"});
			}).mouseout(function() {
				$(this).parent().children().css({"background":"white"});
			});
			
			
		});
		
		function buyList() {
			var productNo = "";
			
			$(".check").each(function() {
				if($(this).is(":checked")) {
					productNo += $(this).val() + ",";
				}	
			
			});
			
			if(productNo != "") {
			$("#list").val(productNo);
			var total =$("#total").val();
			$("#price").val(total);
			$("#postList").attr("action", "<%=contextPath%>/insertForm.pc");
			$("#postList").submit();
					console.log("실행");
			};
		}
		
		function deleteList() {
			var productNo = "";
			
			$(".check").each(function() {
				if($(this).is(":checked")) {
					productNo += $(this).val() + ",";
				}	
				
			});
			
			if(productNo != "") {
				$("#list").val(productNo);
				$("#postList").attr("action", "<%= contextPath%>/insertForm.pc");
				$("#postList").submit();

				};
			
			
		}
				
	</script>

	<%@ include file="../common/foot.jsp"%>

</body>
</html>