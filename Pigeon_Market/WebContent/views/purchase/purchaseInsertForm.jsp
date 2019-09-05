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
<script src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js" type="text/javascript"></script>

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
		</table>
		<table class="textAtea">
			<tr>
				<th width="25%" height="60px" > 배송지 &nbsp; 정보</th>
				<th colspan="3"></th>
			</tr>
			<tr>
				<th>이름</th>
				<th colspan="3"  class="cost1" > <input type="text" name="userName" value="<%= loginUser.getUserName() %>" readOnly></th>
			</tr>
			<tr>
				<th>연락처</th>
				<th colspan="3"  class="cost1" > <input type="text" name="phone" value="<%= loginUser.getPhone() %>" readOnly></th>
			</tr>
			<tr>
				<th>주소</th>
				<th colspan="3"  class="cost1" > <input type="text" name="address" value="<%= loginUser.getAddress()%>" readOnly></th>
			</tr>
		</table>
		<table class="textAtea">
			<tr>
				<th width="50%" height="60px" >결제 수단</th>
				<th><div class="selectric" >
						<select id="pay_method">
							<option value="">결제 수단</option>
							<option value="card" selected="">신용카드</option>
							<option value="trans">실시간 계좌이체</option>
							<option value="vbank">가상계좌</option>
							<option value="phone">핸드폰소액결제</option>
						</select>
					</div>
				</th>
			</tr>
			<tr>
				<th height="60px" style="font-size:1.5em">총금액</th>
				<th style="font-size:1.5em"><%= pr.getPrice() %>원</th>
			</tr>
			<tr>
				<th><div id="cancel">취소하기</div></th>
				<th><div id="payment" onclick=" requestPay();">결제하기</div></th>
				</tr>
		</table>
	</form>	
	</section>
	 <script>
	 
		 var IMP = window.IMP; // 생략해도 괜찮습니다.
		IMP.init("imp23410003"); // "imp00000000" 대신 발급받은 "가맹점 식별코드"를 사용합니다.
		
    	function requestPay() {
      		// IMP.request_pay(param, callback) 호출
      		
      		var pm = $("#pay_method").val(); 
      		var price = <%= pr.getPrice()%>;
      		var userName = "<%= loginUser.getUserName()%>";
      		var phone = <%= loginUser.getPhone()%>;
      		var address = "<%= loginUser.getAddress()%>";
      		var bId = "<%= loginUser.getUserId()%>";
      		var pNo = <%= pr.getProductOkNo() %>;
      		var email = "<%= loginUser.getEmail() %>";
      		var priceList = <%= pr.getPrice()%>;
      		var msg = "";
    		IMP.request_pay({
    		    pg : "inicis",
    		    pay_method : pm,
    		    name : '주문명:결제테스트',
    		    amount : price,
    		    buyer_name : userName,
    		    buyer_tel : phone,
    		    buyer_addr : address,
    		    buyer_email : email
    		    
    		},  function(rsp) {
    		    if ( rsp.success ) {
					$.ajax({
    	      			url:"insert.pc", 
    	      			data : {impUid: rsp.imp_uid, bId:bId, pNo:pNo, amount:rsp.paid_amount },
    	      			type : "post",
    	      		success : function(result){
    				},
    				error : function(){
    						
    				}
    			
    		    });
					msg = '결제가 완료 되었습니다.';
    		    } else {
    		        msg = '결제에 실패하였습니다.';
    		        msg += '에러내용 : ' + rsp.error_msg;
    		    }

    		    alert(msg);
    		});
    }
  </script>
				
	<%@ include file="../common/foot.jsp"%>

</body>
</html>