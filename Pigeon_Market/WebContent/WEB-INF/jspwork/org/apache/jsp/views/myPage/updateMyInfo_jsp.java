/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-09-04 04:27:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.myPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pigeonMarket.member.model.vo.Member;
import com.pigeonMarket.member.model.vo.Member;

public final class updateMyInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/myPage/../common/menubar.jsp", Long.valueOf(1567561920754L));
    _jspx_dependants.put("/views/myPage/../common/foot.jsp", Long.valueOf(1567561920808L));
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

      out.write('\n');
      out.write('\n');

	Member m = (Member)request.getAttribute("me");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>수정중</title>\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, user-scalable=no\" />\n");
      out.write("<style>\n");
      out.write(".col-3 {\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        ");

	Member loginUser = (Member)session.getAttribute("loginUser");
	
	// 세션에 담겨있는 메세지 받기
	String msg = (String)session.getAttribute("msg");
	
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
      out.write("\r\n");
      out.write("                <link rel=\"shortcut icon\" href=\"dulgi.ico\">\r\n");
      out.write("                <link rel=\"icon\" href=\"dulgi.ico\">\r\n");
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
      out.write("            </head>\r\n");
      out.write("\r\n");
      out.write("            <body>\r\n");
      out.write("                <header id=\"header\">\r\n");
      out.write("                    <h1><a href=\"");
      out.print( request.getContextPath());
      out.write("\">처음으로</a></h1>\r\n");
      out.write("                    <nav id=\"nav\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\" class=\"icon solid fa-angle-down\">메뉴</a>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"generic.html\">소개</a></li>\r\n");
      out.write("                                    <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/list.no\">공지사항</a></li>\r\n");
      out.write("                                    <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/event.eo\">이벤트</a></li>\r\n");
      out.write("                                    <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/inquiry.in\">문의사항</a></li>\r\n");
      out.write("                                    <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/inquirylist.in\">관리자 문의사항</a></li>\r\n");
      out.write("                                    <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/review.re\">리뷰</a></li>\r\n");
      out.write("                                    <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/myPage.me\">mypage</a></li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\">관리자메뉴</a>\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/member.mim\">회원 정보 관리</a></li>\r\n");
      out.write("                                            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/black.bl\">블랙리스트 관리</a></li>\r\n");
      out.write("                                            <li><a href=\"#\">Option Three</a></li>\r\n");
      out.write("                                            <li><a href=\"#\">Option Four</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><input type=\"button\" value=\"Login\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/test.us'\"></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- Scripts -->\r\n");
      out.write("                <script src=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/js/jquery.min.js\"></script>\r\n");
      out.write("                <script src=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/js/jquery.dropotron.min.js\"></script>\r\n");
      out.write("                <script src=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/js/jquery.scrollex.min.js\"></script>\r\n");
      out.write("                <script src=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/js/browser.min.js\"></script>\r\n");
      out.write("                <script src=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/js/breakpoints.min.js\"></script>\r\n");
      out.write("                <script src=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/js/util.js\"></script>\r\n");
      out.write("                <script src=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </body>\r\n");
      out.write("\r\n");
      out.write("            </html>");
      out.write("\n");
      out.write("\t<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- Main -->\n");
      out.write("\t\t<section id=\"main\" class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-12\">\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Text -->\n");
      out.write("\t\t\t\t<section class=\"box\">\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<h2>이메일 변경</h2>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<input type=\"text\"> @\n");
      out.write("\t\t\t\t\t<input type=\"text\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<section class=\"box\">\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<h2>주소지 변경</h2>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<section class=\"box\">\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<h2>핸드폰번호 변경</h2>\n");
      out.write("\t\t\t\t\t<input type=\"number\" placeholder=\"-를 제외하고 적어주세요\">\n");
      out.write("\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<section class=\"box\">\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<h2>탈퇴하기</h2>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"userId\" placeholder=\"아이디를 다시 입력해주세요.\">\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"userPwd\" placeholder=\"비밀번호를 다시 입력해주세요.\">\n");
      out.write("\t\t\t\t\t<button value=\"withdrawal\">탈퇴하기</button>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</section>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\n");
      out.write("        <title>Insert title here</title>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <footer id=\"footer\">\n");
      out.write("            <ul class=\"icons\">\n");
      out.write("                <li><a href=\"#\" class=\"icon brands fa-twitter\"><span class=\"label\">Twitter</span></a></li>\n");
      out.write("                <li><a href=\"#\" class=\"icon brands fa-facebook-f\"><span class=\"label\">Facebook</span></a></li>\n");
      out.write("                <li><a href=\"#\" class=\"icon brands fa-instagram\"><span class=\"label\">Instagram</span></a></li>\n");
      out.write("                <li><a href=\"#\" class=\"icon brands fa-google-plus\"><span class=\"label\">Google+</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"copyright\">\n");
      out.write("                <li>&copy; Korea.KH 학원.오늘도 평화롭조.</li>\n");
      out.write("                <li>E-mail: <a href=\"#\">1234@naver.com</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    </html>");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("\n");
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
