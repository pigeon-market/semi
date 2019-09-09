<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.pigeonMarket.inquiry.model.vo.Inquiry, com.pigeonMarket.member.model.vo.Member" %>
<%
	Inquiry i = (Inquiry)request.getAttribute("i");

	String userId = ((Member)request.getSession().getAttribute("loginUser")).getUserId();
	
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	.outer{
		width:70%;
		color:black;
		margin-left:auto;
		margin-right:auto;
		margin-top:50px;
	}
	table, td{
		border:1px solid white;
	}
	.tableArea{
		margin-left:auto;
		margin-right:auto;
	}
	#content{
	}
	.replyArea{
		width:70%;
		color:black;
		margin-left:auto;
		margin-right:auto;
	}
	.replySelectArea{
		color:black;
		margin-left:auto;
		margin-right:auto;
	}
</style>
</head>
<body>

<%@ include file="../common/menubar.jsp" %>
		

		
	<div class="outer">
		<br>
		
		<h2 align="center">문의사항 상세보기</h2>
		
		<div class="tableArea">
			
			<table align="center" width="800px">
				
				<tr>
					<td>문의번호</td>
					<td><%= i.getInquiryNo() %></td>
					<td colspan="2">제목</td>
					<td colspan="2"><%= i.getInquiryTitle() %></td>
				</tr>
				<tr>
					<td>문의자 아이디</td>
					<td colspan="2"><%= i.getUserId() %></td>
					<td>문의 등록일</td>
					<td colspan="2"><%= i.getInquiryDate() %></td>
				</tr>
				<tr>
					<td>내용</td>
					<td colspan="5">
						<p id="content"><%= i.getInquiryContent() %></p>
					</td>
				</tr>
			</table>
			
			<div class="replyArea">
		<!-- 댓글 작성하는 div -->
		<div class="replyWriterArea">
			<table align="center">
				<tr>
					<td>댓글작성</td>
					<td><textarea rows="3" cols="40" id="replyContent" style="resize:none;"></textarea></td>
					<td><input type="button" id="addReply" value="댓글등록"></td>
				</tr>
			</table>
		</div>
		
		<!-- 댓글 리스트 보여주는 div -->
		<div id="replySelectArea">
			<table id="replySelectTable" border="1" align="center">
			
			</table>
		</div>
		
	</div>

	
	<script>
	// 댓글 리스트 출력하는 함수
	function selectRlist(){
		
		// 전달하고자 하는 게시글 번호
		var nno = <%= i.getInquiryNo() %>;
		
		$.ajax({
			url:"rlist.in",
			data:{nno:nno},
			type:"get",
			success:function(list){
				
				var $replyTable = $("#replySelectTable"); // <table></table>
				
				$replyTable.html(""); // 기존 테이블 정보 초기화
				
				$.each(list, function(index, value){
					
					var $tr = $("<tr>");
					var $writerTd = $("<td>").text(value.userId).css("width", "100px");
					var $contentTd = $("<td>").text(value.rContent).css("width", "400px");
					var $dateTd = $("<td>").text(value.createDate).css("width", "200px");
					
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
			var nno = <%= i.getInquiryNo() %>;
			var writer = "<%= loginUser.getUserId() %>";
			
			console.log(writer);
			
			$.ajax({
				url:"rinsert.in",
				type:"post",
				data:{content:content, nno:nno, writer:writer},
				success:function(){
					selectRlist();
					
					$("#replyContent").val("");
					
					console.log("성공");	
				},
				error:function(){
					console.log("실패1");

				}
			});
			
		});
		
	});
	
	</script>
			
		
			
			<div align="center">
				<form action="<%= contextPath %>/inquirylist.in" method="post">
				<input type="submit" value="이전으로">
					</form>
			</div>
		</div>
	</div>
	
	<%@ include file="../common/foot.jsp" %>



</body>
</html>