/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-09-06 04:22:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pigeonMarket.member.model.vo.Member;

public final class memberJoinForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/member/../common/menubar.jsp", Long.valueOf(1567743683507L));
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- <script type=\"text/JavaScript\" src=\"http://code.jquery.com/jquery-1.7.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/JavaScript\" src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t\tfunction openDaumZipAddress() {\r\n");
      out.write("\r\n");
      out.write("\t\t\tnew daum.Postcode({\r\n");
      out.write("\r\n");
      out.write("\t\t\t\toncomplete:function(data) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tjQuery(\"#postcode1\").val(data.postcode1);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tjQuery(\"#postcode2\").val(data.postcode2);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tjQuery(\"#zonecode\").val(data.zonecode);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tjQuery(\"#address\").val(data.address);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tjQuery(\"#address_etc\").focus();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tconsole.log(data);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t}).open();\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("     -->\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\t  .outer{\r\n");
      out.write("\t\twidth:600px;\r\n");
      out.write("\t\theight:500px;\r\n");
      out.write("\t /* background:black;\r\n");
      out.write("\t\tcolor:white;  */\r\n");
      out.write("\t\tmargin-left:auto;\r\n");
      out.write("\t\tmargin-right:auto;\r\n");
      out.write("\t\tmargin-top:50px;\r\n");
      out.write("\t}  \r\n");
      out.write("\t#idCheck:hover, #joinBtn:hover, #goMain:hover {\r\n");
      out.write("\t\tcursor:pointer;\r\n");
      out.write("\t}\r\n");
      out.write(" \t #joinForm table{\r\n");
      out.write("\t\twidth:100%;\r\n");
      out.write("\t\tmargin-left:auto;\r\n");
      out.write("\t\tmargin-right:auto;\r\n");
      out.write("\t}\r\n");
      out.write(" \t#joinForm td{\r\n");
      out.write("\t\ttext-align:right;\r\n");
      out.write("\t} \r\n");
      out.write("\t#idCheck{\r\n");
      out.write("\t\ttext-align:left;\r\n");
      out.write("\t}\r\n");
      out.write("\t #joinBtn{\r\n");
      out.write("\t\tbackground:yellowgreen;\r\n");
      out.write("\t}\r\n");
      out.write("\t#joinBtn, #goMain{\r\n");
      out.write("\t\tdisplay:inline-block;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("/* \t.main{ margin: 0 auto;\r\n");
      out.write("    width: 40%;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.main h4{ margin: 60px auto;\r\n");
      out.write("\ttext-align: center; font-size: 2em; } */\r\n");
      out.write("\t\r\n");
      out.write("\tfieldset{\r\n");
      out.write("\t    border: none;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfieldset > div{ \r\n");
      out.write("\t    position: relative;\r\n");
      out.write("\t    margin-bottom: 10px;\r\n");
      out.write("\t}    \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t#wrap_gender{\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    display: flex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".gender{\r\n");
      out.write("    display: block;\r\n");
      out.write("    height: 100%; width: 50%;\r\n");
      out.write("    border-right: 1px solid #ccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".gender > label {\r\n");
      out.write("    display: block;\r\n");
      out.write("    /*width: 100%; height: 100%;*/\r\n");
      out.write("    padding: 10px 0;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 0.8em;\r\n");
      out.write("    color: #666;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".gender_act{\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    height: 100%; width: 50%;\r\n");
      out.write("    background-color: #45a049;\r\n");
      out.write("    color:#fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".gender_act > label {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    width: 100%; height: 100%;\r\n");
      out.write("    padding: 10px 0;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 0.8em;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 회원가입 페이지에서도 menubar는 노출되도록 -->\r\n");
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
      out.write("\r\n");
      out.write("            <!DOCTYPE html>\r\n");
      out.write("            <html>\r\n");
      out.write("\r\n");
      out.write("            <head>\r\n");
      out.write("                <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("                <title>Insert title here</title>\r\n");
      out.write("                <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("                <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/css/main.css\" />\r\n");
      out.write("                <link rel=\"shortcut icon\" href=\"dulgi.ico\">\r\n");
      out.write("                <link rel=\"icon\" href=\"dulgi.ico\">\r\n");
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
      out.write("                    })\r\n");
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
      out.write("\t\t\t\t\t\t\t<li><input type=\"text\" name=\"userPwd\" class=\"text-field\" placeholder=\"패스워드\"></li>\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"generic.html\">소개</a></li>\r\n");
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
      out.write("/inquirylist.in\">관리자\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t문의사항</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/review.re\">리뷰</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"mypage.html\">mypage</a></li>\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Option Three</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Option Four</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
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
      out.write("\t\t");
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
      out.write("\t\r\n");
      out.write("\t<div class=\"outer\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t<!-- \t<div class=\"main\"> -->\r\n");
      out.write("\t\t<h4 align=\"center\">회원가입</h4>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\t\t <form id=\"joinForm\" action=\"");
      out.print( request.getContextPath() );
      out.write("/insert.me\" method=\"post\" onsubmit=\"return joinValidate();\"> \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\r\n");
      out.write("                <label for=\"name\"></label>\r\n");
      out.write("                <input type=\"text\" id=\"name\" name=\"userId\" placeholder=\"* 아이디\" onblur=\"ck_name()\" required >\r\n");
      out.write("                <span id=\"MsgName\" class=\"none\"></span>               \r\n");
      out.write("                                             \r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t\t<div id=\"idCheck\"> 중복확인</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t  <label for=\"pwd\"></label> \r\n");
      out.write("\t\t\t\t \t  <input type=\"password\" id=\"pwd\" maxlength=\"15\" name=\"userPwd\" placeholder=\"* 비밀번호\" onblur=\"ck_pwd()\" required>\r\n");
      out.write("                      <span id=\"MsgPw\" class=\"none\"></span>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<label for=\"pwd_ck\"></label> \r\n");
      out.write("\t\t\t\t<input type=\"password\" id=\"pwd_ck\" maxlength=\"15\"  name=\"userPwd2\" placeholder=\"* 비밀번호 확인\" onblur=\"ck_pwd2()\" required>\r\n");
      out.write("                <span id=\"MsgPwck\" class=\"none\"></span>\r\n");
      out.write("\t\t\t\t<!-- <td><label id=\"pwdResult\"></label></td> -->\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<label for=\"name\"></label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"name\"  maxlength=\"5\" name=\"userName\" placeholder=\"*이름\" required>\r\n");
      out.write("                <span id=\"MsgName\" class=\"none\"></span>\r\n");
      out.write("                \r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<label for=\"birthDate\"></label> \r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"name\" maxlength=\"8\" name=\"birthDate\" placeholder=\"* 주민등록번호(19951105)\" required>\r\n");
      out.write("                <span id=\"MsgName\" class=\"none\"></span>\r\n");
      out.write("               \r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<label for=\"gender\"></label> \r\n");
      out.write("\t\t\t\t<input type=\"text\" maxlength=\"1\" name=\"gender\" placeholder=\"성별(M/F)기입\">\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t <label for=\"email\"></label> \r\n");
      out.write("\t\t\t\t <input type=\"email\" id=\"email\" name=\"email\" placeholder=\"이메일(ex@codepen.com)\" onblur=\"ck_email()\"> \r\n");
      out.write("                 <span id=\"MsgId\" class=\"none\"></span>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<label for=\"phone\"></label> \r\n");
      out.write("\t\t\t\t<input type=\"text\" maxlength=\"13\" name=\"phone\" placeholder=\"* 연락처(010-1234-5678)\">\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<label for=\"address\"></label> \r\n");
      out.write("\t\t\t\t<!--<input type=\"text\" name=\"address\" placeholder=\"주소\"> -->\r\n");
      out.write("\t\t\t\t우편번호 : <input type=\"text\" name=\"address\" style=\"width:80px; height:26px;\" />\r\n");
      out.write("\t\t\t\t<button type=\"button\" style=\"width:60px; height:32px;\" onclick=\"openZipSearch()\">검색</button><br>\r\n");
      out.write("\t\t\t\t주소 : <input type=\"text\" name=\"addr1\" style=\"width:300px; height:30px;\" readonly /><br>\r\n");
      out.write("\t\t\t\t상세 : <input type=\"text\" name=\"addr2\" style=\"width:300px; height:30px;\" />\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- <input id=\"postcode1\" type=\"text\" value=\"\" style=\"width:80px;\" readonly/>\r\n");
      out.write("\t\t\t\t&nbsp;-&nbsp;\r\n");
      out.write("\t\t\t\t<input id=\"postcode2\" type=\"text\" value=\"\" style=\"width:80px;\" readonly/>\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<input id=\"zonecode\" type=\"text\" value=\"\" style=\"width:80px;\" readonly/>\r\n");
      out.write("\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t<input type=\"button\" onClick=\"openDaumZipAddress();\" value = \"주소 찾기\" />\r\n");
      out.write("\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"address\" name=\"address\" value=\"\" style=\"width:480px;\" readonly/>\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"address_etc\" name=\"address\" value=\"\" style=\"width:240px;\"/> -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"btns\" align=\"center\">\r\n");
      out.write("\t\t\t\t<div id=\"goMain\" onclick=\"goMain();\">메인으로</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"submit\" ");
      out.write(" value=\"가입하기\" id=\"joinBtn\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t<!-- \t</div> -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction goMain(){\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print( request.getContextPath() );
      out.write("\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction joinValidate(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 아이디 검사\r\n");
      out.write("\t\t\tif(!(/^[a-z][a-z\\d]{3,11}$/i.test($(\"#joinForm input[name=userId]\").val()))){\r\n");
      out.write("\t\t\t\t$(\"#joinForm input[name=userId]\").focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 비밀번호와 비밀번호 확인 일치하는지\r\n");
      out.write("\t\t\tif($(\"#joinForm input[name=userPwd]\").val() != $(\"#joinForm input[name=userPwd2]\").val()){\r\n");
      out.write("\t\t\t\t$(\"#pwdResult\").text(\"비밀번호 불일치\").css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 이름 검사\r\n");
      out.write("\t\t\tif(!(/^[가-힣]{2,}$/.test($(\"#joinForm input[name=userName]\").val()))){\r\n");
      out.write("\t\t\t\t$(\"#joinForm input[name=userName]\").focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar isUsable = false;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#idCheck\").click(function(){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar userId = $(\"#joinForm input[name=userId]\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl:\"idCheck.me\",\r\n");
      out.write("\t\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\t\tdata:{userId:userId.val()},\r\n");
      out.write("\t\t\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif(result == \"fail\"){ // 사용불가\r\n");
      out.write("\t\t\t\t\t\t\talert(\"사용할수 없는 아이디 입니다!\");\r\n");
      out.write("\t\t\t\t\t\t\tuserId.focus();\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}else{ // 사용가능\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tif(confirm(\"사용 가능한 아이디입니다. 사용하시겠습니까?\")){\r\n");
      out.write("\t\t\t\t\t\t\t\tuserId.attr(\"readonly\", \"true\"); // 더 이상 바꿀수 없도록\r\n");
      out.write("\t\t\t\t\t\t\t\tisUsable = true;\r\n");
      out.write("\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\tuserId.focus();\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif(isUsable){\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#joinBtn\").removeAttr(\"disabled\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\terror:function(){\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"서버 통신 안됨\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// id,pw,email 유효성\r\n");
      out.write("function ck_email(){\r\n");
      out.write("        var email = document.getElementById(\"email\")\r\n");
      out.write("        var MsgId = document.getElementById(\"MsgId\")\r\n");
      out.write("        var isEmail = /([\\w\\-]+\\@[\\w\\-]+\\.[\\w\\-]+)/\r\n");
      out.write("\r\n");
      out.write("        if(!isEmail.test(email.value)){\r\n");
      out.write("            MsgId.style.display=\"block\";\r\n");
      out.write("            MsgId.className='error'\r\n");
      out.write("            MsgId.innerHTML=\"이메일 형식을 확인하세요\"\r\n");
      out.write("            email.focus()\r\n");
      out.write("            return false;\r\n");
      out.write("        } else{\r\n");
      out.write("            MsgId.className='vaild'\r\n");
      out.write("            MsgId.innerHTML=\"ok\"\r\n");
      out.write("        }   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function ck_pwd(){\r\n");
      out.write("        var pwd = document.getElementById(\"pwd\")\r\n");
      out.write("        var MsgPw = document.getElementById(\"MsgPw\")\r\n");
      out.write("        var isPwd = /^(?=.*[a-zA-Z])((?=.*\\d)|(?=.*\\W)).{6,20}$/\r\n");
      out.write("        \r\n");
      out.write("        if(!isPwd.test(pwd.value)){\r\n");
      out.write("            MsgPw.style.display=\"block\";\r\n");
      out.write("            MsgPw.className='error'\r\n");
      out.write("            MsgPw.innerHTML=\"숫자포함 최소 6자리 이상\"\r\n");
      out.write("            pwd.focus()\r\n");
      out.write("            return false;\r\n");
      out.write("        } else{\r\n");
      out.write("            MsgPw.className='vaild'\r\n");
      out.write("            MsgPw.innerHTML=\"ok\"\r\n");
      out.write("        }   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function ck_pwd2(){\r\n");
      out.write("        var pwd_ck = document.getElementById(\"pwd_ck\")\r\n");
      out.write("        var pwd = document.getElementById(\"pwd\").value\r\n");
      out.write("        var MsgPwck = document.getElementById(\"MsgPwck\")\r\n");
      out.write("        \r\n");
      out.write("        if(pwd_ck.value!=pwd){\r\n");
      out.write("            MsgPwck.style.display=\"block\";\r\n");
      out.write("            MsgPwck.className='error'\r\n");
      out.write("            MsgPwck.innerHTML=\"비밀번호가 일치하지 않습니다.\"\r\n");
      out.write("            pwd_ck.focus()\r\n");
      out.write("            return false;\r\n");
      out.write("        } else{\r\n");
      out.write("            MsgPwck.className='vaild'\r\n");
      out.write("            MsgPwck.innerHTML=\"ok\"\r\n");
      out.write("        }   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function ck_name(){\r\n");
      out.write("        var name = document.getElementById(\"name\")\r\n");
      out.write("        var MsgName = document.getElementById(\"MsgName\")\r\n");
      out.write("        \r\n");
      out.write("        if(name.value==''){\r\n");
      out.write("            MsgName.style.display=\"block\";\r\n");
      out.write("            MsgName.className='error'\r\n");
      out.write("            MsgName.innerHTML=\"2자 이상 입력하세요.\"\r\n");
      out.write("            name.focus()\r\n");
      out.write("            return false;\r\n");
      out.write("        } else{\r\n");
      out.write("            MsgName.className='vaild'\r\n");
      out.write("            MsgName.innerHTML=\"ok\"\r\n");
      out.write("        }   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function ck_gender(){\r\n");
      out.write("    var wrap_gender = document.getElementById(\"wrap_gender\")\r\n");
      out.write("    var man = document.getElementById(\"man\")\r\n");
      out.write("    var woman = document.getElementById(\"woman\")\r\n");
      out.write("    var MsgGender = document.getElementById(\"MsgGender\")\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    if(man.checked){\r\n");
      out.write("        document.getElementById(\"wrap_man\").className='gender_act';\r\n");
      out.write("        document.getElementById(\"wrap_woman\").className='gender';\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    if(woman.checked){\r\n");
      out.write("        document.getElementById(\"wrap_woman\").className='gender_act';\r\n");
      out.write("        document.getElementById(\"wrap_man\").className='gender';\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" function openZipSearch() {\r\n");
      out.write("\tnew daum.Postcode({\r\n");
      out.write("\t\toncomplete: function(data) {\r\n");
      out.write("\t\t\t$('[name=address]').val(data.zonecode); // 우편번호 (5자리)\r\n");
      out.write("\t\t\t$('[name=addr1]').val(data.address);\r\n");
      out.write("\t\t\t$('[name=addr2]').val(data.buildingName);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}).open();\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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