<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList, 
	com.pigeonMarket.product.model.vo.*, com.pigeonMarket.category.model.vo.*"%>
<% 
	ProductSale pr = (ProductSale)request.getAttribute("p");
	ArrayList<Attachment> fileList = (ArrayList<Attachment>)request.getAttribute("fileList");
	Attachment titleImg = fileList.get(0);
	
	String pNo = Integer.toString((pr.getProductOkNo()));
%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	 .detail{
		width: 100%;
		height: 700px;
		}
	.imgDiv{				
		display:inline;
		margin-left: auto;
		margin-right: auto;
	}			
	.textsize > textarea {
		resize: none;
		font-size: 0.7em;
	}
	#basket, #purchase{
		 height: 50px;
		 text-align:center;
		 font-size: 1.5em;				 
		 padding: 10px 0px;
		 color: white;
	 }
	 #black{
	  	height: 40px;
		text-align:center;
		font-size: 1.5em;				 
		padding: 10px 0px;
		color: white;
		
	 }
	#basket{	 
		background: burlywood;
	}
	#purchase{	 
		background:cornflowerblue;
	}
	#black{
		background:tomato;
	}
	#addReply{
		height: 100%;
		text-align:center;
		font-size: 1.5em;				 
		padding: 30px 0px;
		color: white;	 
		background:darkgrey;
	}
	#inFormation{
		text-align:center;
		border-right:2px solid rgba(241, 218, 7, 0.945);
	}
	
	#question{
		text-align:center;
	}
		 
	#basket:hover, #purchase:hover, #black:hover,#inFormation:hover,#question:hover, #addReply:hover	{
		cursor:pointer;
	}
	#blackRrea{
		padding: 0 0 0 0 ;
	}
	.diaArea{
		padding-top: 0;
		padding-bottom: 0;
	}

</style>
</head>
<body>

	<%@ include file="../common/menubar.jsp"%>


	<div id="main" class="container">
	<header>
		<h2>상품구매</h2>
	</header>					
	<div>
		<table class="detail">
			<tr>
				<th rowspan="5" width="50%">
					<div class = "img0">
						<img id="titleImg" src="<%= contextPath %>/resources/thumbnail_uploadFiles/<%= titleImg.getChangeName()%>"  width = "100%" height = "100%" >
					</div>
				</th>
				<th width="12.5%">제목</th>
				<th colspan="3"><%= pr.getProductTitle() %></th>
			</tr>
			<tr>
				<th>판매자ID</th>	
				<th colspan="2"><%= pr.getpId() %></th>
				<th id="diaArea"><div id ="black" onclick="blackUser();">신고하기</div></th>					
			</tr>
			<tr>
				<th>판매가격</th>	
				<th colspan="2"><%= pr.getPrice() %>원</th>
				<th></th>
			</tr>
			<tr>
				<th>제품승인날짜</th>	
				<th colspan="2"><%= pr.getApprovalDate() %></th>
				<th></th>							
			</tr>
			<tr>
				<td colspan="2" class="diaArea"><a href="<%= contextPath%>/insert.sm?pNo=<%= pr.getProductOkNo()%>"><div id = "basket">장바구니</div></a></td>
				<td colspan="2" class="diaArea"><a  href="<%= contextPath%>/insertForm.pc?list=<%= pNo%>"><div id = "purchase">구매</div></a></td>			
			</tr>
			<tr>
				<td colspan="1" id="inFormation"><div>상품정보</div></td>
				<td colspan="4" id="question"><div>상품문의</div></td>
			</tr>
			<tr>
				<th colspan="5" style="border-top :2px solid rgba(241, 218, 7, 0.945)">상품정보</th>
			</tr>
			<tr>
				<th colspan="5">
					<div class = "imgArea" alige= "center">
						<% for(int i=1; i<fileList.size(); i++) {%>
							<div class = "imgDiv" alige= "center"><img src="<%= contextPath %>/resources/thumbnail_uploadFiles/<%= fileList.get(i).getChangeName()%>"   width="33%" height="33%"> </div>
						<%} %>
					</div>
				</th>
			</tr>
			<tr>
				<th colspan="5">
					<div class = "textsize">
<pre><%= pr.getProductContents()%></pre>
					</div>
				</th>
			</tr>
			<tr>
				<th colspan="5">상품문의</th>								
			</tr>
			<tr>
				<th colspan="3">
					<div class = "textsize">
						<textarea rows="3"  id="replyContent" ></textarea>
					</div>
				</th>
				<td colspan="2"><div id="addReply">문의하기</div></td>
			</tr>
		</table>
		
		<table id="replySelectTable" border="1" align="center">
			
		</table>						
	</div>
	
	<script>
		function blackUser(){
			var reason = window.prompt("신고사유를 적어주세요");
			var pId = "<%= pr.getpId() %>";
			
			location.href="<%= request.getContextPath() %>/insert.bl?reason=" + reason + "&pId="+pId ;
		}
		
		function selectRlist(){
			
			// 전달하고자 하는 게시글 번호
			var pNo = <%= pr.getProductOkNo() %>;
			
			$.ajax({
				url:"productReviewlist.pr",
				data:{pNo:pNo},
				type:"get",
				success:function(list){
					
					var $replyTable = $("#replySelectTable"); // <table></table>
					
					$replyTable.html(""); // 기존 테이블 정보 초기화
					
					$.each(list, function(index, value){	
						
						var $tr = $("<tr>");
						var $writerTd = $("<td>").text(value.writer);
						var $contentTd = $("<td>").text(value.content);
						var $dateTd = $("<td>").text(value.createDate);
						
						$tr.append($writerTd);
						$tr.append($contentTd);
						$tr.append($dateTd);
						
						$replyTable.append($tr);
						
					});
					
					
				},
				error:function(){
					console.log("통신 실패");
				}
			});
			
			
		}
		
		$(function(){
			selectRlist();
			
		
			
			$("#addReply").click(function(){

				var content = $("#replyContent").val();
				var pNo = <%= pr.getProductOkNo() %>;
				var writer = "<%= loginUser.getUserId() %>";
				
				$.ajax({
					url:"productReviewinsert.pr",
					type:"post",
					data:{content:content, pNo:pNo, writer:writer},
					success:function(){
						selectRlist();
						
						$("#replyContent").val("");
						
					}
				});
				
			});
			
		});
	</script>
	
		<%@ include file="../common/foot.jsp"%>

</body>
</html>