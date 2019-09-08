<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.ArrayList, 
	com.pigeonMarket.product.model.vo.*, com.pigeonMarket.category.model.vo.*"%>
<%
	ArrayList<String> list = (ArrayList<String>) request.getAttribute("list");
	ArrayList<Attachment> fileList = (ArrayList<Attachment>) request.getAttribute("file");
	Attachment titleImg = fileList.get(0);

	Member m = (Member) request.getSession().getAttribute("loginUser");

	String productNo = list.get(0);
	String productOkNo = list.get(1);
	String paymentNo = list.get(2);
	String pId = list.get(3);
	String bId = list.get(4);
	String cName = list.get(5);
	String title = list.get(6);
	String cont = list.get(7);
	String price = list.get(8);
	String reg = list.get(9);
	String appr = list.get(10);
	String dealDate = list.get(11);

	for (int i = 0; i < list.size(); i++) {
		if (list.get(i) == null) {
			switch (i) {

				case 1 :
					productOkNo = "";
					break;
				case 2 :
					paymentNo = "";
					break;
				case 3 :
					pId = "";
					break;
				case 4 :
					bId = "";
					break;
				case 5 :
					cName = "";
					break;
				case 6 :
					title = "";
					break;
				case 7 :
					cont = "";
					break;
				case 8 :
					price = "";
					break;
				case 9 :
					reg = "";
					break;
				case 10 :
					appr = "";
					break;
				case 11 :
					dealDate = "";
					break;

			}
		}
	}

	String st = "";

	if (dealDate == null) {
		if (appr == null) {
			st = "판매중";
		} else {
			st = "승인대기중";
		}
	} else {
		st = "판매완료";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.detail {
	width: 100%;
	height: 700px;
}

.imgDiv {
	display: inline;
	margin-left: auto;
	margin-right: auto;
}

.textsize>textarea {
	resize: none;
	font-size: 0.7em;
}

#basket, #myPage {
	height: 50px;
	text-align: center;
	font-size: 1.5em;
	padding: 10px 0px;
	color: white;
}

#black {
	height: 40px;
	text-align: center;
	font-size: 1.5em;
	padding: 10px 0px;
	color: white;
}

#basket {
	background: burlywood;
}

#myPage {
	background: cornflowerblue;
}

#black {
	background: tomato;
}

#inquiry {
	height: 100%;
	text-align: center;
	font-size: 1.5em;
	padding: 30px 0px;
	color: white;
	background: darkgrey;
}

#inFormation {
	text-align: center;
}

#question {
	text-align: center;
}

#basket:hover, #myPage:hover, #black:hover, #question:hover {
	cursor: pointer;
}

#blackRrea {
	padding: 0 0 0 0;
}

.diaArea {
	padding-top: 0;
	padding-bottom: 0;
}
</style>
</head>
<body>

	<%@ include file="../common/menubar.jsp"%>


	<div id="main" class="container">
		<header>
			<h2>상세정보</h2>
		</header>



		<form method="post">
			
			
			<%
				if (productOkNo == "") {
			%>

			<button onclick="location.href='<%=contextPath%>'">제품페이지
				바로가기</button>

			<%
				} else {
			%>

			<button onclick="updateProduct();'">수정하기</button>

			<%
				}
			%>
			<%
				if(appr == "") {
			%>

			<button onclick="deleteProduct();">삭제하기</button>

			<%
				 }
			%>
<input type="hidden" id="prNo" name="no" value="<%=productNo %>">

		</form>

		<table class="detail">
			<tr>
				<th rowspan="6" width="50%">
					<div class="img0">
						<img id="titleImg"
							src="<%=contextPath%>/resources/thumbnail_uploadFiles/<%=titleImg.getChangeName()%>"
							width="100%" height="100%">
					</div>
				</th>
				<th width="12.5%">제목</th>
				<th colspan="5"><%=title%></th>
			</tr>
			<tr>
				<th>판매가격</th>
				<th><%=price%>원</th>
				<th width=15%>제품상태</th>
				<th><%=st%></th>
			</tr>
			<tr>
				<th>판매자ID</th>
				<th><%=pId%></th>
				<th>구매자ID</th>
				<th><%=bId%></th>

			</tr>
			<tr>
				<th>제품승인날짜</th>
				<th><%=appr%></th>
				<th>제품구매날짜</th>
				<th><%=dealDate%></th>
			</tr>


			<tr>
				<%
						if ((m.getUserId()).equals(pId)) {
					%>
				<td colspan="1" id="inFormation"><div>등록번호</div></td>
				<td colspan="1" id="inFormation"><div><%=productNo%></div></td>
				<td colspan="1" id="inFormation"><div>판매번호</div></td>
				<td colspan="1" id="inFormation"><div><%=productOkNo%></div></td>
				<td colspan="1" id="inFormation"><div>구매번호</div></td>
				<td colspan="1" id="inFormation"><div><%=paymentNo%></div></td>
				<%
						} else {
					%>
				<td colspan="1" id="inFormation"><div>판매번호</div></td>
				<td colspan="2" id="inFormation"><div><%=productOkNo%></div></td>
				<td colspan="1" id="inFormation"><div>구매번호</div></td>
				<td colspan="2" id="inFormation"><div><%=paymentNo%></div></td>
				<%
						}
					%>

			</tr>
			<tr>
				<th colspan="6"
					style="border-top: 2px solid rgba(241, 218, 7, 0.945)">상품정보</th>
			</tr>
			<tr>
				<th colspan="6">
					<div class="imgArea" aligeo;="center">
						<%
								for (int i = 1; i < fileList.size(); i++) {
							%>
						<div class="imgDiv" alige="center">
							<img
								src="<%=contextPath%>/resources/thumbnail_uploadFiles/<%=fileList.get(i).getChangeName()%>"
								width="33%" height="33%">
						</div>
						<%
								}
							%>
					</div>
				</th>
			</tr>
			<tr>
				<th colspan="6">
					<div class="textsize">
						<pre><%=cont%></pre>
					</div>
				</th>
			</tr>

		</table>


	</div>
	<script>
			function deleteProduct() {
				
				
				
				//location.href="<%=contextPath%>/delete.pr";
			}
			
			function updateProduct() {
				
				location.href="<%=contextPath%>/updateDetail.pr";
				
			}
			
		
		
		</script>

	<%@ include file="../common/foot.jsp"%>
</body>
</html>
