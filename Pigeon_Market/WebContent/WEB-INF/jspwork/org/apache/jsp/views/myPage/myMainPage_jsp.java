/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-09-09 04:57:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.myPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pigeonMarket.member.model.vo.Member;
import java.util.ArrayList;
import com.pigeonMarket.dealInfo.model.vo.Activity;
import com.pigeonMarket.member.model.vo.Member;

public final class myMainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/myPage/../common/menubar.jsp", Long.valueOf(1568004619611L));
    _jspx_dependants.put("/views/myPage/../common/foot.jsp", Long.valueOf(1567998724610L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.pigeonMarket.dealInfo.model.vo.Activity");
    _jspx_imports_classes.add("com.pigeonMarket.member.model.vo.Member");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

	Member m = (Member) session.getAttribute("loginUser");

	ArrayList<Activity> aList = (ArrayList<Activity>) request.getAttribute("aList");
	ArrayList<String> range = (ArrayList<String>) request.getAttribute("range");

	int maxNum = 0;
	int viewNum = 0;
	String status = "";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>수정중</title>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("<style>\r\n");
      out.write(".row {\r\n");
      out.write("\tmargin: auto !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("hr {\r\n");
      out.write("\tborder: 1px solid rgba(79, 106, 228, 0.685);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".listTable {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tpadding-left: 2%;\r\n");
      out.write("\tpadding-right: 2%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".imgDiv, .statusDiv, .titleDiv {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#info {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#infoImg {\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body class=\"is-preload\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        ");

	Member loginUser = (Member)session.getAttribute("loginUser");

	// 세션에 담겨있는 메세지 받기
	String msg = (String) session.getAttribute("msg");

	String contextPath = request.getContextPath();


      out.write("\r\n");
      out.write("\r\n");
      out.write("             \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\">\r\n");
      out.write("\t\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"resources/images/dulgi.ico\">\r\n");
      out.write("<link rel=\"icon\" href=\"resources/images/dulgi.ico\">\r\n");
      out.write("</script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/css/main.css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                    function showPopup() {\r\n");
      out.write("                        window.open(\"login.html\", \"a\", \"width=350, height=450, left=600, top=50\");\r\n");
      out.write("                    }\r\n");
      out.write("                </script>\r\n");
      out.write("                <script>\r\n");
      out.write("                    var msg = \"");
      out.print( msg );
      out.write("\";\r\n");
      out.write("                    $(function() {\r\n");
      out.write("                        if (msg != \"null\") {\r\n");
      out.write("                            alert(msg);\r\n");
      out.write("\r\n");
      out.write("                            //세션에 담긴 메세지 한번만 출력하고 삭제하기\r\n");
      out.write("                            ");
 session.removeAttribute("msg"); 
      out.write("\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form id=\"loginForm\" action=\"");
      out.print(request.getContextPath());
      out.write("/login.me\" method=\"post\" onsubmit=\"return validate();\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"loginArea\">\r\n");
      out.write("\t\t\t<header id=\"header\">\r\n");
      out.write("\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("\">처음으로</a>\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t<nav id=\"nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t");

							if (loginUser == null) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><input type=\"text\" name=\"userId\" class=\"text-field\" placeholder=\"아이디\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><input type=\"password\" name=\"userPwd\" class=\"text-field\" placeholder=\"패스워드\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"btns\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"loginBtn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"로그인\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t");

							} else {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><label>");
      out.print(loginUser.getUserName());
      out.write("님의 방문을 환영합니다</label></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"btns\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"logoutBtn\" onclick=\"logout();\">로그아웃</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"icon solid fa-angle-down\">메뉴</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/list.no\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/event.eo\">이벤트</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/inquiry.in\">문의사항</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/review.re\">리뷰</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/myPage.me\">마이페이지</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t ");
if(loginUser != null && loginUser.getUserId().equals("admin")){ 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">관리자메뉴</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/member.mim\">회원\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t정보 관리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/black.bl\">블랙리스트\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t관리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/inquirylist.in\">문의사항\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t 관리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Scripts -->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.dropotron.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.scrollex.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/browser.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/breakpoints.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/util.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction logout(){\r\n");
      out.write("\t\t\t\tlocation.href='");
      out.print(request.getContextPath());
      out.write("/logout.me';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"page-wrapper\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Main -->\r\n");
      out.write("\t\t<section id=\"main\" class=\"container\"> <header>\r\n");
      out.write("\t\t<h2>MyPage</h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-15\">\r\n");
      out.write("\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t<div class=\"box alt\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row gtr-50 gtr-uniform\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"image fit\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"location.href='");
      out.print(contextPath);
      out.write("/goMyInfo.me'\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"button\" value=\"개인정보수정\">\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"image fit\"\tonclick=\"location.href='");
      out.print(contextPath);
      out.write("/Activity.me?status=all&page=1&group=15&period=&date='\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"활동조회\">\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"image fit\" onclick=\"location.href='");
      out.print(contextPath);
      out.write("/Activity.me?status=sell&page=1&group=15&period=&date='\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"판매조회\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"image fit\" onclick=\"location.href='");
      out.print(contextPath);
      out.write("/Activity.me?status=buy&page=1&group=15&period=&date='\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"구매조회\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"image fit\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"location.href='");
      out.print(contextPath);
      out.write("/myShoppingBacket.me'\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"장바구니\">\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Text -->\r\n");
      out.write("\t\t\t\t<section class=\"box\">\r\n");
      out.write("\t\t\t\t<form method=\"post\" id=\"form\" action=\"\">\r\n");
      out.write("\t\t\t\t\t<h2>최근 활동 기록</h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");

						while (maxNum < aList.size()) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<h3>");
      out.print(aList.get(maxNum).getaDate());
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");

						for (int i = maxNum; i < Integer.parseInt(range.get(viewNum)); i++) {
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");

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
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"listTable\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.print(aList.get(i).getbNo());
      out.write("\"> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"hidden\" value=\"");
      out.print(aList.get(i).getStatus());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"statusDiv\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(status);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"imgDiv\">\r\n");
      out.write("\t\t\t\t\t\t\t");

								if (aList.get(i).getChangeName() != null) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      out.print(contextPath);
      out.write("/resources/thumbnail_uploadFiles/");
      out.print(aList.get(i).getChangeName());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"250px\" height=\"150px\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"titleDiv\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(aList.get(i).getTitle());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t");

						maxNum = Integer.parseInt(range.get(viewNum));
							viewNum = viewNum + 1;
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"no\" id=\"no\" value=\"\"> <input\r\n");
      out.write("\t\t\t\t\t\ttype=\"hidden\" name=\"st\" id=\"st\" value=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!DOCTYPE html>\r\n");
      out.write("    <html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("        <title>Insert title here</title>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <footer id=\"footer\">\r\n");
      out.write("            <ul class=\"icons\">\r\n");
      out.write("                <li><a href=\"#\" class=\"icon brands fa-twitter\"><span class=\"label\">Twitter</span></a></li>\r\n");
      out.write("                <li><a href=\"#\" class=\"icon brands fa-facebook-f\"><span class=\"label\">Facebook</span></a></li>\r\n");
      out.write("                <li><a href=\"#\" class=\"icon brands fa-instagram\"><span class=\"label\">Instagram</span></a></li>\r\n");
      out.write("                <li><a href=\"#\" class=\"icon brands fa-google-plus\"><span class=\"label\">Google+</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"copyright\">\r\n");
      out.write("                <li>&copy; Korea.KH 학원.오늘도 평화롭조.</li>\r\n");
      out.write("                <li>E-mail: <a href=\"#\">1234@naver.com</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("    </html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\".listTable div\").mouseenter(function() {\r\n");
      out.write("\t\t\t$(this).parent().css({\"cursor\": \"pointer\", \"background\":\"yellow\"});\r\n");
      out.write("\t\t}).click(function() {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar no = $(this).parent().children().eq(0).val();\r\n");
      out.write("\t\t\tvar st = $(this).parent().children().eq(1).val();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar checkSt = st.indexOf(\"_\");\r\n");
      out.write("\t\t\tvar st = st.substring(0, checkSt);;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(st == \"sell\" || st == \"buy\") {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$('#no').val(no);\r\n");
      out.write("\t\t\t\t$('#st').val(st);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$('#form').attr(\"action\", \"");
      out.print(contextPath);
      out.write("/detailView.deal\");\r\n");
      out.write("\t\t\t\t\t\t\t$('#form').submit();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t}).mouseout(function() {\r\n");
      out.write("\t\t\t\t$(this).parent().css({\r\n");
      out.write("\t\t\t\t\t\"background\" : \"white\",\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
