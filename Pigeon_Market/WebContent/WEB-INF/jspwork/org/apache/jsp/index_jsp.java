/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-09-09 01:07:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pigeonMarket.member.model.vo.Member;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/common/foot.jsp", Long.valueOf(1567991038268L));
    _jspx_dependants.put("/views/common/menubar.jsp", Long.valueOf(1567991038271L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.pigeonMarket.member.model.vo.Member");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/css/main.css\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("<title>비둘기 중고 장터</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"resources/images/dulgi.ico\"  type=\"image/x-icon\">\r\n");
      out.write("<link rel=\"icon\" href=\"resources/images/dulgi.ico\"  type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("@font-face{\r\n");
      out.write("    src: url(\"resources/assets/fonts/BMJUA_ttf.ttf\");\r\n");
      out.write("    font-family: \"Jua\";\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    #back {\r\n");
      out.write(" \tbackground-attachment: scroll,\t\t\t\t\t\t\tfixed;\r\n");
      out.write("\tbackground-color: #666;\r\n");
      out.write("\tbackground-image: url(\"resources/assets/css/images/overlay.jpg\"), url(\"resources/images/notebook.jpg\");\r\n");
      out.write("\tbackground-position: top left,\t\t\t\t\t\tcenter center;\r\n");
      out.write("\tbackground-repeat: repeat,\t\t\t\t\t\t\tno-repeat;\r\n");
      out.write("\tbackground-size: auto,\t\t\t\t\t\t\tcover;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tpadding: 12em 0 20em 0;\r\n");
      out.write("\ttext-align: center; \r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    font{\r\n");
      out.write("    text-algin:center;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<section id =\"back\" >\r\n");
      out.write("\t\t\t\t\t<font size=\"20\" color=\"yellow\" face=\"Jua\">Pigeon ONLINE CTC Market</font><br><br>\r\n");
      out.write("\t\t\t\t\t<p>Consumer To Consumer, 평화롭게&nbsp; <em>온라인으로 쉽게 중고거래 </em>&nbsp; 하세요</p>\r\n");
      out.write("\t\t\t\t\t<ul class=\"actions special\">\r\n");
      out.write("\t\t\t\t\t\t\t");
 if(loginUser == null){ 
      out.write("\r\n");
      out.write("\t\t\t\t<form id=\"loginForm\"\r\n");
      out.write("\t\t\t\t\taction=\"");
      out.print( request.getContextPath() );
      out.write("/login.me\" method=\"post\"\r\n");
      out.write("\t\t\t\t\tonsubmit=\"return validate();\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" onclick=\"login();\" class=\"button primary\">회원가입</a></li>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t");
}else { 
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"userInfo\">\r\n");
      out.write("\t\t\t\t\t<label>");
      out.print( loginUser.getUserName() );
      out.write("님의 방문을 환영합니다</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"btns\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"logoutBtn\" onclick=\"logout();\">로그아웃</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#main\" class=\"button\">사용방법</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t \t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<!-- Main -->\r\n");
      out.write("\t\t\t\t<section id=\"main\" class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<section class=\"box special\">\r\n");
      out.write("\t\t\t\t\t\t<header class=\"major\">\r\n");
      out.write("\t\t\t\t\t\t<!-- <font size=\"5\" color=\"Green\" face=\"Jua\">Simple한 중고거래!</font><br><br> -->\r\n");
      out.write("\t\t\t\t\t\t <h2>'벽돌' 없는 Simple한 개인간 중고 거래 사이트</h2>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"image featured\"><img src=\"resources/images/maybe.jpg\" alt=\"중고나라아웃\" height=\"393px\" /></span>\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<section class=\"box special features\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"features-row\">\r\n");
      out.write("\t\t\t\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"resources/images/sell.png\" width=\"70px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <span class=\"icon solid major fa-bolt accent2\"></span> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>1. 중고 물건을 업로드하세요.</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <p>판매자가 되고 싶다면 중고물품을 사진을 찍어서 업로드하세요.</p> -->\r\n");
      out.write("\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"resources/images/ok2.png\" width=\"70px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>2. 실제 판매자인지 확인 합니다.</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t<p>판매자의 사기 전적과 실제 판매자 정보를 저희가 확인 합니다.</p> -->\r\n");
      out.write("\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"features-row\">\r\n");
      out.write("\t\t\t\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"resources/images/sell2.png\" width=\"70px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>3. 셀러가 되셨습니다.</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <p>2번의 확인 절차가 끝났고 이제 판매자가 되셨습니다. 이제 본격적으로 거래를 시작하십시요.</p> -->\r\n");
      out.write("\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"resources/images/deal1.png\" width=\"70px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>4. 맘편히 안전거래를 하세요. </h3>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t<p>수수료는 없습니다. 멋진 거래가 되길 바라겠습니다. </p> -->\r\n");
      out.write("\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-6 col-12-narrower\">\r\n");
      out.write("\t\t\t\t\t\t\t<section class=\"box special\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"image featured\"><img src=\"resources/images/one.png\" alt=\"구매\" width=\"170\" height=\"300\" /></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>구매</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>구매 페이지로 바로 연결(로그인 한 사람만)</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"actions special\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print( contextPath);
      out.write("/list.pr\" class=\"button alt\">구매\r\n");
      out.write("\t\t\t\t\t\t\t\t\t 페이지 연결</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-6 col-12-narrower\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<section class=\"box special\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"image featured\"><img src=\"resources/images/two.jpg\" alt=\"판매\" width=\"170\" height=\"300\"/></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <ul class=\"actions special\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>판매</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>판매 페이지로 바로 연결(로그인 한 사람만)</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"actions special\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
if(loginUser != null){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"button alt\">판매 페이지 연결</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"button alt\" onclick=\"alert('로그인해주세요');\">판매 페이지 연결</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\t</section> \r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- CTA -->\r\n");
      out.write("\t\t\t\t<section id=\"cta\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<h2>이제는 복잡하게 거래하지마세요</h2>\r\n");
      out.write("\t\t\t\t\t<p>인증하고, 상품을 올리고, 판매하고, 입금받고! 간편한 여러분의 중고마켓!</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t<!-- <div class=\"row gtr-50 gtr-uniform\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <div class=\"col-8 col-12-mobilep\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" id=\"email\" placeholder=\"Email Address\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-4 col-12-mobilep\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"위로\" class=\"fit\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- </div> -->\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t<!-- Scripts -->\r\n");
      out.write("\t\t\t<script src=\"resources/assets/js/jquery.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"resources/assets/js/jquery.dropotron.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"resources/assets/js/jquery.scrollex.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"resources/assets/js/browser.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"resources/assets/js/breakpoints.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"resources/assets/js/util.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"resources/assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\tfunction login(){\r\n");
      out.write("\t\t\t//location.href=\"");
      out.print( request.getContextPath() );
      out.write("/views/member/memberJoinForm.jsp\";\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/joinForm.me\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
