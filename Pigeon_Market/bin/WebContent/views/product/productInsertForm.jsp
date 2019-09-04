<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	.outer{
		width:1000px;
		height:650px;
		background:black;
		color: white;
		margin-left:auto;
		margin-right:auto;
		margin-top:50px;
	}
	table{
		border: 1px solid white;
	}
	.insertArea{
		width:500px;
		height:450px;
		margin-left:auto;
		margin-right:auto;	
	}
	.btnArea{
		width:150px;
		margin-left:auto;
		margin-right:auto;		
	}
	#titleImgArea{
		width:350px;
		height:200px;
		border:2px dashed darkgray;
		display:table-cell;
	}
	#contentImgArea1, #contentImgArea2, #contentImgArea3{
		width:150px;
		height:100px;
		border:2px dashed darkgray;
		display:table-cell;
	}
	#titleImgArea:hover, #contentImgArea1:hover,
	#contentImgArea2:hover,#contentImgArea3:hover{
		cursor:pointer;
	}

</style>
</head>
<body>
	
	<%@ include file="../common/menubar.jsp" %>
	
	<div class="outer">
		<Br>
		<h2 align="center">사진 게시판 작성</h2>
		
		<!-- 파일 업로드를 위해 enctype을 지정해줘야된다. -->
		<form action="<%= contextPath %>/insert.pr" method="post" enctype="multipart/form-data">
			<div class="insertArea">
				
				<table align="center">
					<tr>
						<td width="100px">제목</td>
						<td colspan="3"><input type="text" size="45" name="title"></td>
					</tr>
					<tr>
						<td>대표이미지</td>
						<td colspan="3">
							<div id="titleImgArea">
								<img id="titleImg" width="350" height="200">							
							</div>
						</td>							
					</tr>
					<tr>
						<td>내용이미지</td>
						<td>
							<div id="contentImgArea1">
								<img id="contentImg1" width="120" height="100">							
							</div>
						</td>
						<td>
							<div id="contentImgArea2">
								<img id="contentImg2" width="120" height="100">							
							</div>
						</td>
						<td>
							<div id="contentImgArea3">
								<img id="contentImg3" width="120" height="100">							
							</div>
						</td>
					</tr>
					<tr>
						<td>내용</td>
						<td colspan="3"><textarea name ="content" rows="5" cols="50" style="resize:none;"></textarea></td>
					</tr>				
				</table>
				<!-- 파일 업로드 하는 div -->
				<div id="fileArea">
					<input type="file" multiple name="thumbnailImg1" id="thumbnailImg1" onchange="loadImg(this,1);">
					<input type="file" multiple name="thumbnailImg2" id="thumbnailImg2" onchange="loadImg(this,2);">
					<input type="file" multiple name="thumbnailImg3" id="thumbnailImg3" onchange="loadImg(this,3);">
					<input type="file" multiple name="thumbnailImg4" id="thumbnailImg4" onchange="loadImg(this,4);">
				</div>
				
				<script>
					// 미리보기 이미지 영역을 클릭할 때 파일 첨부 창이 뜨도록!
					$(function(){
						$("#fileArea").hide();
						
						$("#titleImgArea").click(function(){
							$("#thumbnailImg1").click();
						});
						$("#contentImgArea1").click(function(){
							$("#thumbnailImg2").click();
						});
						$("#contentImgArea2").click(function(){
							$("#thumbnailImg3").click();
						});
						$("#contentImgArea3").click(function(){
							$("#thumbnailImg4").click();
						});
					})
					
					// 파일 첨부했을 때 미리보기 공간에 미리보기 가능하게 하는 함수
					// [참고] https://developer.mozilla.org/ko/docs/Web/API/FileReader
 					function loadImg(value, num){
						// value => input태그
						// num => 조건문으로 작업
						
						// file이 존재하는지
						if(value.files && value.files[0]){
							
							// 파일을 읽어 들일 FileReader객체 생성
							var reader = new FileReader();
							
							// 파일 읽기가 다 완료되었을 때 실행되는 메소드
							reader.onload = function(e){
								
								switch(num){
									case 1: $("#titleImg").attr("src",e.target.result); break; // data:URL 
									case 2: $("#contentImg1").attr("src",e.target.result); break; 
									case 3: $("#contentImg2").attr("src",e.target.result); break; 
									case 4: $("#contentImg3").attr("src",e.target.result); break; 
								}
							}
							
							// 파일 읽어주는 메소드
							reader.readAsDataURL(value.files[0]);
							
							
						}
						
						
						
					}
				
				</script>			
			</div>
			<br>
			<!-- 버튼들이 위치할 div -->
			<div class="btnArea">
				<button type="reset">취소하기</button>
				<button type="submit">작성완료</button>
			
			</div>
		
		</form>
		
		
	
	</div>

</body>
</html>