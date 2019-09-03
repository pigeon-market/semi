<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	input[id="check"] + label {
		display: inline-block;
        width: 20px;
        height: 20px;
        border: 2px solid #bcbcbc;
        cursor: pointer;
         }	
	input[id="check"]:checked + label {
   		background-color: #666666;
		}
	input[id="check"] {
 		display: none;
		}
			
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
	.titleimg{
		width:100%;
		height: 30%;
		}
				
	#delete, #purchase{
		 height: 50px;
		 text-align:center;
		 font-size: 1.5em;				 
		 padding: 10px 0px;
		 color: white;
		}
	#delete{	 
		background: burlywood;
		 }
	 #purchase{	 
		background:cornflowerblue;
		 }
	 #delete:hover, #purchase:hover{
		 cursor: pointer;
		 padding-bottom: 0cm
		 }

</style>
</head>
<body>

	<%@ include file="../common/menubar.jsp"%>
		
		<section id="main" class="container">
					<header>
						<h2>장바구니</h2>
					</header>
							<table>
								<tr>
									<th width="25%">상품체크</th>
									<th width="25%">상품사진</th>
									<th width="25%">상품제목</th>
									<th width="25%">상품가격</th>
								</tr>
								<tr>
									<th><input type="checkbox" name="check" id="check" value="no1">
											<label for="check"></label>
										
									</th>
									<th><img src="images/20190822115044853001.jpg"  width = "100%" height = "100%" class="titleimg"></th>
									<th>바지팔아요</th>
									<th>30000원</th>
								</tr>
								<tr>
									<th colspan="2"><div id="delete">선택 삭제</div></th>
									<th colspan="2"><div id="purchase">구입</div></th>
								</tr>

							</table>
					
				</section>
	
	<%@ include file="../common/foot.jsp"%>

</body>
</html>