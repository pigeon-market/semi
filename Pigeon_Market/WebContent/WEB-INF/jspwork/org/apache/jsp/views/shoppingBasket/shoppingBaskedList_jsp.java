/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-09-09 01:32:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.shoppingBasket;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.pigeonMarket.dealInfo.model.vo.Deal;
import com.pigeonMarket.member.model.vo.Member;

public final class shoppingBaskedList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/shoppingBasket/../common/foot.jsp", Long.valueOf(1567991038268L));
    _jspx_dependants.put("/views/shoppingBasket/../common/menubar.jsp", Long.valueOf(1567991038271L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.pigeonMarket.dealInfo.model.vo.Deal");
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


	Member m = (Member)session.getAttribute("loginUser");
	ArrayList<Deal> myList = (ArrayList<Deal>)request.getAttribute("myList");
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("table th {\r\n");
      out.write("\tpadding: 0.3em 0.3em;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tmargin-block-start: 0em;\r\n");
      out.write("\tmargin-block-end: 0em;\r\n");
      out.write("\tmargin-inline-start: 0px;\r\n");
      out.write("\tmargin-inline-end: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".titleimg {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 30%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#delete, #purchase {\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-size: 1.5em;\r\n");
      out.write("\tpadding: 10px 0px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#delete {\r\n");
      out.write("\tbackground: burlywood;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#purchase {\r\n");
      out.write("\tbackground: cornflowerblue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#delete:hover, #purchase:hover {\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tpadding-bottom: 0cm\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#infoImg {\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.html\">Home</a></li>\r\n");
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
      out.write("\t\t<section id=\"main\" class=\"container\">\r\n");
      out.write("\t\t\t<header>\r\n");
      out.write("\t\t\t\t<h2>MyPage</h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-12\">\r\n");
      out.write("\t\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"box alt\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row gtr-50 gtr-uniform\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"image fit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"location.href='");
      out.print(contextPath);
      out.write("/goMyInfo.me'\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"개인정보수정\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"image fit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"location.href='");
      out.print(contextPath);
      out.write("/Activity.me?status=all&page=1&group=15&period=&date='\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"활동조회\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"image fit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"location.href='");
      out.print(contextPath);
      out.write("/Activity.me?status=sell&page=1&group=15&period=&date='\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"판매조회\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"image fit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"location.href='");
      out.print(contextPath);
      out.write("/Activity.me?status=buy&page=1&group=15&period=&date='\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"구매조회\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"image fit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"location.href='");
      out.print(contextPath);
      out.write("/myShoppingBacket.me'\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"배송조회\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<section class=\"box\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"listTable\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th width=\"10%\">상품체크</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th width=\"10%\">No</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th width=\"25%\">상품사진</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th width=\"25%\">상품제목</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th width=\"15%\">판매자아이디</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th width=\"15%\">상품가격</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 for(int i = 0 ; i < myList.size() ; i++) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 String chId = "check"+i;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"info\"><input type=\"checkbox\" class=\"check\" id=\"");
      out.print( chId );
      out.write("\" value=\"");
      out.print( myList.get(i).getProductNo());
      out.write("\"> <label for=\"");
      out.print( chId );
      out.write("\"></label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"info\">");
      out.print( i+1 );
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"info\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.print( contextPath );
      out.write("/resources/thumbnail_uploadFiles/");
      out.print(myList.get(i).getName() );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth=\"100%\" height=\"100%\" class=\"titleimg\"></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"info\">");
      out.print( myList.get(i).getTitle() );
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"info\">");
      out.print( myList.get(i).getpId() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"info\">");
      out.print( myList.get(i).getPrice() );
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th colspan=\"4\"></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>총 금액</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th><input type=\"number\" id=\"total\" value=\"0\" readonly></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th colspan=\"3\"><div id=\"delete\" onclick=\"deleteList();\">선택 삭제</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th colspan=\"3\"><div id=\"purchase\" onclick=\"buyList();\">구입</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"\" id=\"postList\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"list\" value=\"\" id=\"list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"price\" value=\"\" id=\"price\">\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$(\".listTable .info\").click(function() {\r\n");
      out.write("\t\t\t\tvar num = $(this).parent().children().eq(1).text();\r\n");
      out.write("\t\t\t\tvar num1 = num-1\r\n");
      out.write("\t\t\t\tvar numing = \"check\"+num1\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tif($('input:checkbox[id='+numing+']').is(\":checked\")) {\r\n");
      out.write("\t\t\t\t\tconsole.log(\"1\");\r\n");
      out.write("\t\t\t\t\t$('input:checkbox[id='+numing+']').attr(\"checked\", false);\r\n");
      out.write("\t\t\t\t\tvar price = $(this).parent().children().eq(5).text();\r\n");
      out.write("\t\t\t\t\tvar intPrice = parseInt(price);\r\n");
      out.write("\t\t\t\t\tvar total = $('#total').val();\r\n");
      out.write("\t\t\t\t\tvar intTotal = parseInt(total);\r\n");
      out.write("\t\t\t\t\t$('#total').val(intTotal-intPrice);\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tconsole.log(\"2\");\r\n");
      out.write("\t\t\t\t\t$('input:checkbox[id='+numing+']').attr(\"checked\", true);\r\n");
      out.write("\t\t\t\t\tvar price = $(this).parent().children().eq(5).text();\r\n");
      out.write("\t\t\t\t\tvar intPrice = parseInt(price);\r\n");
      out.write("\t\t\t\t\tvar total = $('#total').val();\r\n");
      out.write("\t\t\t\t\tvar intTotal = parseInt(total);\r\n");
      out.write("\t\t\t\t\t$('#total').val(intTotal+intPrice);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t}).mouseenter(function() {\r\n");
      out.write("\t\t\t\t$(this).parent().css({\"cursor\": \"pointer\"});\r\n");
      out.write("\t\t\t\t$(this).parent().children().css({\"background\":\"yellow\"});\r\n");
      out.write("\t\t\t}).mouseout(function() {\r\n");
      out.write("\t\t\t\t$(this).parent().children().css({\"background\":\"white\"});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction buyList() {\r\n");
      out.write("\t\t\tvar productNo = \"\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\".check\").each(function() {\r\n");
      out.write("\t\t\t\tif($(this).is(\":checked\")) {\r\n");
      out.write("\t\t\t\t\tproductNo += $(this).val() + \",\";\r\n");
      out.write("\t\t\t\t}\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(productNo != \"\") {\r\n");
      out.write("\t\t\t$(\"#list\").val(productNo);\r\n");
      out.write("\t\t\tvar total =$(\"#total\").val();\r\n");
      out.write("\t\t\t$(\"#price\").val(total);\r\n");
      out.write("\t\t\t$(\"#postList\").attr(\"action\", \"");
      out.print(contextPath);
      out.write("/insertForm.pc\");\r\n");
      out.write("\t\t\t$(\"#postList\").submit();\r\n");
      out.write("\t\t\t\t\tconsole.log(\"실행\");\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction deleteList() {\r\n");
      out.write("\t\t\tvar productNo = \"\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\".check\").each(function() {\r\n");
      out.write("\t\t\t\tif($(this).is(\":checked\")) {\r\n");
      out.write("\t\t\t\t\tproductNo += $(this).val() + \",\";\r\n");
      out.write("\t\t\t\t}\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(productNo != \"\") {\r\n");
      out.write("\t\t\t\t$(\"#list\").val(productNo);\r\n");
      out.write("\t\t\t\t$(\"#postList\").attr(\"action\", \"");
      out.print( contextPath);
      out.write("/deleteForm.pc\");\r\n");
      out.write("\t\t\t\t$(\"#postList\").submit();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t</script>\r\n");
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
