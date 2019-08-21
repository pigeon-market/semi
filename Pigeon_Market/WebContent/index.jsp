<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="views/common/menubar.jsp" %>
	
	<%-- 
		
			
			
		2. Dynamic Web Project 생성
			1) New -> Dynamic Web Project 생성
			2) 프로젝트명 작성 후 Next
			3) 하단의에 Default output folder의 경로를  WebContent/WEB-INF/classes 변경(직접 입력하기) 후 Next
			
					** classes 폴더 위치를 바꾸는 이유 **
					
					1) Dynamic Web Project에 src폴더에서 작성된 자바코드는 자동으로 컴파일 되어  지정된 Default output folder 내부에 저장되는데
					톰캣을 이용하여 자바웹 어플리케이션 실행 시 톰캣이 직접적으로 사용하는 파일들은  프로젝트 전체가 아닌 WEB-INF폴더 하위 만을 읽는다!
					그래서 컴파일된 자바코드의 모음인 classes 폴더의 위치를 WEB-INF하위로 옮겨 자동으로 인식시킨다.(web.xml도 WEB-INF 아래에 있다!)
					
					2) 웹 어플리케이션의 실행 파일들을 배포를 위한 war 형식의 파일이 요구하는 구성으로 정리.
					
					* 프로젝트 생성 후 Java Build Path > Source 탭 > Default output folder 변경 방법은 추천 X
						=> 프로젝트폴더/.settings/org.eclipse.wst.common.component 파일 내부에 저장되는 
						   java-output-path 의 값이 변경되지 않는다!	
			
			4) Context root : 웹서버 실행 시 최상위 경로(root)의 이름을 지정해줌
				=> 프로젝트명과 동일하게(jspProject) 또는 간단히(jsp) 만들어주기
			
			5) Content directory 값을 WebContent 확인 후 , 
			   Generate web.xml deployment descriptor 체크하기(안그러면 web.xml 안생김 ..)
				=> web.xml이란 파일은 컴포넌트들을 설명하고, 각종 초기화 파라미터들과 서버 기능을 활용하기 위한 컨테이너가 관리하는 보안 제한 구역을 지정하는 파일
				      톰캣이 실행되면 이 파일을 읽어 초기화를 진행한다.
			
		
		3. new Server 서버 만들고 나서 셋팅하는 과정
			1) 왼쪽 아래의 Serve modules without publishing 체크박스 꼭 체크해주기
			       왜냐하면 ==> 내가 지정한 output folder에 복사가 돼야되는데 안할 시 이상한 경로로 저장이 됨
			2) 포트 번호들 바꾸기
			3) Server에 구동하고자 하는 프로젝트 올리기
			4) project 오른쪽 버튼 클릭 - Properties 클릭
			   project facets 설정 확인하기 -> sever 선택 안할 시 index.jsp의 상단 부분 오류날 수 있음
		
		4. 내가 앞으로 작성할 jsp 파일이 java 파일로 볼 수 있도록 저장되는 폴더가 필요함
			1) Servers/프로젝트명-config/context.xml 파일
		   	   ==> 내가 만들 프로젝트의 META-INF 안으로 복사 
		    2) context.xml 파일에 <Context> 태그 내부 속성으로 workDir="경로" 추가하여 경로 지정
		    		
		5. web.xml 파일 수정 ==> welcome file 수정
		
		6. index.jsp 파일 만들기
		
		
	 
		* 부가 작업
		1. Window - Perspective - Customize Perspective.. - Shortcuts탭 을 통해 많이 사용되는 것들 지정하기
		   Window - Show view를 통해 Navigator, Project Explorer, Console, Problems 셋팅하기
		
		2. new Jsp file을 했을 때 불필요한 부분 제거하는 방법
			- Windows - Preferences - Web - JSP Files - Editor - Templates

		
		
		asejitialsjtleisajtliasjtelisajtliasetaw
		
	 --%>
</body>
</html>