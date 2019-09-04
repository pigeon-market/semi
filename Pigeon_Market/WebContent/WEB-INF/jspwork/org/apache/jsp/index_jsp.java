
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
    _jspx_dependants.put("/views/common/foot.jsp", Long.valueOf(1567479183322L));
    _jspx_dependants.put("/views/common/menubar.jsp", Long.valueOf(1567488984529L));
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
      out.write("<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");

	Member loginUser = (Member)session.getAttribute("loginUser");
	
	// 세션에 담겨있는 메세지 받기
	String msg = (String)session.getAttribute("msg");
	
	String contextPath = request.getContextPath();

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/css/main.css\" />\t\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"dulgi.ico\">\r\n");
      out.write("<link rel=\"icon\" href=\"dulgi.ico\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("  \t\tfunction showPopup() { window.open(\"login.html\", \"a\", \"width=350, height=450, left=600, top=50\"); }\r\n");
      out.write(" </script>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar msg = \"");
      out.print( msg );
      out.write("\";\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\tif(msg != \"null\"){\r\n");
      out.write("\t\t\talert(msg);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//세션에 담긴 메세지 한번만 출력하고 삭제하기\r\n");
      out.write("\t\t\t");
 session.removeAttribute("msg"); 
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header id=\"header\">\r\n");
      out.write("\t\t\t\t\t<h1><a href=\"");
      out.print( request.getContextPath());
      out.write("\">처음으로</a></h1>\r\n");
      out.write("\t\t\t\t\t<nav id=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"icon solid fa-angle-down\">메뉴</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"generic.html\">소개</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/list.no\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/event.eo\">이벤트</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/inquiry.in\">문의사항</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/inquirylist.in\">관리자 문의사항</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/review.re\">리뷰</a></li> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"mypage.html\">mypage</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">관리자메뉴</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/member.mim\">회원 정보 관리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/black.bl\">블랙리스트 관리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Option Three</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Option Four</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><input type=\"button\" value=\"Login\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/test.us'\"></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- Scripts -->\r\n");
      out.write("\t\t\t<script src=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/js/jquery.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/js/jquery.dropotron.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/js/jquery.scrollex.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/js/browser.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/js/breakpoints.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/js/util.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"");
      out.print( request.getContextPath());
      out.write("/resources/assets/js/main.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t<section id=\"banner\">\r\n");
      out.write("\t\t\t\t\t<h2>Dove Market</h2>\r\n");
      out.write("\t\t\t\t\t<p>비둘기를 팔지 않아요. 여러분이 직접 물건을 사고 팔면 됩니다.</p>\r\n");
      out.write("\t\t\t\t\t<ul class=\"actions special\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"button primary\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"button\">사용방법</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Main -->\r\n");
      out.write("\t\t\t\t<section id=\"main\" class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<section class=\"box special\">\r\n");
      out.write("\t\t\t\t\t\t<header class=\"major\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>평화 비둘기 마켓에 대해 소개 하겠습니다. \r\n");
      out.write("\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t부제목 / 내용 </h2>\r\n");
      out.write("\t\t\t\t\t\t\t<p>간단한 소개 내용 : 추가 예정</p>\r\n");
      out.write("\t\t\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"image featured\"><img src=\"images/dedove.jpg\" alt=\"힙합비둘기\" width=\"1200px\" height=\"393px\" /></span>\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<section class=\"box special features\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"features-row\">\r\n");
      out.write("\t\t\t\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon solid major fa-bolt accent2\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>아이템1</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>내용 </p>\r\n");
      out.write("\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon solid major fa-chart-area accent3\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>아이템2</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>내용 </p>\r\n");
      out.write("\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"features-row\">\r\n");
      out.write("\t\t\t\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon solid major fa-cloud accent4\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>아이템3</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>내용 </p>\r\n");
      out.write("\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon solid major fa-lock accent5\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>아이템4</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>내용 </p>\r\n");
      out.write("\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-6 col-12-narrower\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<section class=\"box special\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"image featured\"><img src=\"images/pic02.jpg\" alt=\"\" /></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>구매</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>구매 페이지로 바로 연결(로그인 한 사람만)</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"actions special\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print( contextPath);
      out.write("/list.pr\" class=\"button alt\">구매 페이지 연결</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-6 col-12-narrower\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<section class=\"box special\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"image featured\"><img src=\"images/pic03.jpg\" alt=\"\" /></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>판매</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>판매 페이지로 바로 연결(로그인 한 사람만)</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"actions special\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"button alt\">판매 페이지 연결</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- CTA -->\r\n");
      out.write("\t\t\t\t<section id=\"cta\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<h2>위 버튼이 안눌러지시면</h2>\r\n");
      out.write("\t\t\t\t\t<p>바로 가입 하세요. 여러분의 중고 마켓이 생깁니다.</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row gtr-50 gtr-uniform\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-8 col-12-mobilep\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" id=\"email\" placeholder=\"Email Address\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-4 col-12-mobilep\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"login\" class=\"fit\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<footer id=\"footer\">\r\n");
      out.write("\t<ul class=\"icons\">\r\n");
      out.write("\t\t<li><a href=\"#\" class=\"icon brands fa-twitter\"><span class=\"label\">Twitter</span></a></li>\r\n");
      out.write("\t\t<li><a href=\"#\" class=\"icon brands fa-facebook-f\"><span class=\"label\">Facebook</span></a></li>\r\n");
      out.write("\t\t<li><a href=\"#\" class=\"icon brands fa-instagram\"><span class=\"label\">Instagram</span></a></li>\r\n");
      out.write("\t\t<li><a href=\"#\" class=\"icon brands fa-google-plus\"><span class=\"label\">Google+</span></a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<ul class=\"copyright\">\r\n");
      out.write("\t\t<li>&copy; Korea.KH 학원.오늘도 평화롭조.</li><li>E-mail: <a href=\"#\">1234@naver.com</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<!-- Scripts -->\r\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.dropotron.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.scrollex.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/browser.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/breakpoints.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/util.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
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

