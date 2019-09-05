<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList, 
	com.pigeonMarket.product.model.vo.*, com.pigeonMarket.category.model.vo.*"%>
<% 
	ProductSale pr = (ProductSale)request.getAttribute("p");
	ArrayList<Attachment> fileList = (ArrayList<Attachment>)request.getAttribute("fileList");
	Attachment titleImg = fileList.get(0);
%>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	.textAtea th {
		padding: 0.3em 0.3em;
		text-align: center;
		font-size: 1em;
		}
	p {
 		display: block;
   		margin-block-start: 0em;
   		margin-block-end: 0em;
   		margin-inline-start: 0px;
   		margin-inline-end: 0px;
		}
	#titleImg{
		width:100%;
		height:40%;
		}	
	#cancel, #payment{
		 height: 50px;
		 text-align:center;
		 font-size: 1.5em;				 
		 padding: 10px 0px;
		 color: white;
		 }
	 #cancel{	 
		background: burlywood;
		 }
	 #payment{	 
		background:cornflowerblue;
		 }
	 #cancel:hover, #payment:hover{
		 cursor: pointer;
		 }	
	 


</style>
</head>
<body>

	<%@ include file="../common/menubar.jsp"%>
	<section id="main" class="container">
		<header>
			<h2>주문/결제</h2>
		</header>
		<form action="">
		<table class="textAtea">
			<tr>
				<th width="25%" height="60px">판매자</th>
				<th width="25%">상품사진</th>
				<th width="25%">상품제목</th>
				<th width="25%">상품가격</th>
			</tr>
			<tr>
				<th><%= pr.getpId() %></th>
				<th>
					<img id="titleImg" src="<%= contextPath %>/resources/thumbnail_uploadFiles/<%= titleImg.getChangeName()%>" >
				</th>
				<th><%= pr.getProductTitle() %></th>
				<th><%= pr.getPrice() %>원</th>
			</tr>
			<tr>
				<th height="60px"  colspan="3" style="text-align:right;">총상품금액 </th>
				<th><%= pr.getPrice() %>원</th>
			</tr>
			<tr>
				<th height="60px"  colspan="3"  style="text-align:right;">배송비</th>
				<th>3000원</th>
			</tr>
			<tr>
				<th  height="60px"  colspan="3"  style="text-align:right;">총 결제금액</th>
				<th><%= pr.getPrice() + 3000 %>원</th>
			</tr>
		</table>
		<table class="textAtea">
			<tr>
				<th width="25%" height="60px" > 배송지 &nbsp; 정보</th>
				<th colspan="3"></th>
			</tr>
			<tr>
				<th>이름</th>
				<th colspan="3"  class="cost1" > <input type="text" name="userName" value="아무개"></th>
			</tr>
			<tr>
				<th>연락처</th>
				<th colspan="3"  class="cost1" > <input type="text" name="phone" value="010 7797 7310"></th>
			</tr>
			<tr>
				<th>주소</th>
				<th colspan="3"  class="cost1" > <input type="text" name="address" value="서울시...."></th>
			</tr>
			<tr>
				<th>배송메모</th>
				<th colspan="3"  class="cost1" ><input type="text" name="memo" value=""></th>
			</tr>
		</table>
		<table class="textAtea">
			<tr>
				<th width="50%" height="60px"  >결제 방법</th>
				<th>신용카드</th>
			</tr>
			<tr>
				<th>카드 종류</th>
				<th>
					<div class="selectric ">
						<select id="card">
							<option value="">카드 선택</option>
							<option value="SHINHAN" selected="">신한</option>
							<option value="KB">KB국민</option>
							<option value="SAMSUNG">삼성</option>
							<option value="BC">BC</option>
							<option value="HYUNDAI">현대</option>
							<option value="WOORI">우리</option>
							<option value="HANA">하나</option>
							<option value="KEB">하나(구, 외환)</option>
							<option value="NH">NH채움</option>
							<option value="LOTTE">롯데</option>
							<option value="CITI">씨티</option>
							<option value="KAKAO">카카오뱅크</option>
							<option value="KBANK">케이뱅크</option>
							<option value="IBK">IBK기업</option>
							<option value="GWANGJU">광주</option>
							<option value="SUHYUP">수협</option>
							<option value="SHINHYUP">신협</option>
							<option value="POST">우체국카드</option>
							<option value="FSB">저축은행</option>
							<option value="JUNBOOK">전북</option>
							<option value="JEJU">제주</option>
							<option value="KDB">산은캐피탈</option>
							<option value="MG">MG새마을카드</option>
						</select>
					</div>
				</th>
			</tr>
			<tr>
				<th>할부 기간</th>
				<th><div class="selectric " >
						<select id="Card_month">
							<option value="">할부 선택</option>
							<option value="0" selected="">일시불</option>
							<option value="1">1개월</option>
							<option value="2">2개월</option>
							<option value="3">3개월</option>
							<option value="4">4개월</option>
							<option value="5">5개월</option>
							<option value="6">6개월</option>
							<option value="7">7개월</option>
							<option value="8">8개월</option>
							<option value="9">9개월</option>
							<option value="10">10개월</option>
							<option value="11">11개월</option>
							<option value="12">12개월</option>
						</select>
					</div>
				</th>
			</tr>
			<tr>
				<th height="60px" style="font-size:1.5em">총금액</th>
				<th style="font-size:1.5em">33000원</th>
			</tr>
			<tr>
				<th><div id="cancel">취소하기</div></th>
				<th><div id="payment">결제하기</div></th>
				</tr>
		</table>
	</form>
	</section>
				
	<%@ include file="../common/foot.jsp"%>

</body>
</html>