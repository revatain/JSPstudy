/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.72
 * Generated at: 2023-04-07 02:50:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch19;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ch19.*;

public final class post_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/ch19/footer.jsp", Long.valueOf(1586096586000L));
    _jspx_dependants.put("/ch19/js_css.html", Long.valueOf(1585754478000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("ch19");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      ch19.PBlogMgr pmgr = null;
      pmgr = (ch19.PBlogMgr) _jspx_page_context.getAttribute("pmgr", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (pmgr == null){
        pmgr = new ch19.PBlogMgr();
        _jspx_page_context.setAttribute("pmgr", pmgr, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');

	String id = (String) session.getAttribute("idKey");
	if (id == null)
		response.sendRedirect("login.jsp");
	PMemberBean mbean = pmgr.getPMember(id);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("<title>PhotoBlog</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css\" />\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script src=\"http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#imageCanvas {\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	left: 0;\r\n");
      out.write("	top: 0;\r\n");
      out.write("	pointer-events: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#img_id {\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	left: 0;\r\n");
      out.write("	top: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".post_form_container {\r\n");
      out.write("	max-width: 550px;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".post_form {\r\n");
      out.write("	padding: 40px;\r\n");
      out.write("	background-color: #fff;\r\n");
      out.write("	border: 1px solid #e6e6e6;\r\n");
      out.write("	margin: 0 0 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".post_form .title {\r\n");
      out.write("	margin: 0 10px 40px;\r\n");
      out.write("	font-weight: 400;\r\n");
      out.write("	font-size: 30px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".post_form .preview {\r\n");
      out.write("	margin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".post_form .preview .upload {\r\n");
      out.write("	max-width: 300px;\r\n");
      out.write("	height: 300px;\r\n");
      out.write("	border: 1px solid #e6e6e6;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".plus_icon {\r\n");
      out.write("	width: 80px;\r\n");
      out.write("	height: 80px;\r\n");
      out.write("	border-radius: 50%;\r\n");
      out.write("	margin: 0 auto 10px;\r\n");
      out.write("	border: 1px solid dodgerblue;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".plus_icon span {\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	display: block;\r\n");
      out.write("	width: 2px;\r\n");
      out.write("	height: 30px;\r\n");
      out.write("	background: dodgerblue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".plus_icon span:nth-child(2) {\r\n");
      out.write("	transform: rotate(90deg);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".post_form p {\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".post_form input[type=file] {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	background: 0 0;\r\n");
      out.write("	border: 1px solid #efefef;\r\n");
      out.write("	border-radius: 3px;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("	color: #262626;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("	padding: 7px 8px 7px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".post_form textarea {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	background: 0 0;\r\n");
      out.write("	border: 1px solid #efefef;\r\n");
      out.write("	border-radius: 3px;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("	color: #262626;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("	padding: 7px 8px 7px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".submit_btn {\r\n");
      out.write("	background: #3897f0;\r\n");
      out.write("	border-color: #3897f0;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	border-radius: 3px;\r\n");
      out.write("	border-style: solid;\r\n");
      out.write("	border-width: 1px;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("	font-weight: 600;\r\n");
      out.write("	line-height: 28px;\r\n");
      out.write("	outline: none;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".box {\r\n");
      out.write("	width: 36px;\r\n");
      out.write("	height: 36px;\r\n");
      out.write("	border-radius: 70%;\r\n");
      out.write("	overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".profile {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("	object-fit: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".box1 {\r\n");
      out.write("	width: 56px;\r\n");
      out.write("	height: 56px;\r\n");
      out.write("	border-radius: 30%;\r\n");
      out.write("	overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".profile1 {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("	object-fit: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("</style>");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function send() {\r\n");
      out.write("		document.frm.submit();\r\n");
      out.write("	}\r\n");
      out.write("	function goURL(url) {\r\n");
      out.write("		document.frm1.action = url;\r\n");
      out.write("		document.frm1.submit();\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div data-role=\"page\" align=\"center\">\r\n");
      out.write("		<div data-role=\"header\">\r\n");
      out.write("			<table>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td align=\"left\" width=\"200\">\r\n");
      out.write("						<h1 style=\"font-family: fantasy;\" align=\"left\">PhotoBlog</h1>\r\n");
      out.write("					</td>\r\n");
      out.write("					<td><a style=\"font-size: 40px;\"\r\n");
      out.write("						href=\"javascript:goURL('home.jsp','')\">H</a> <a\r\n");
      out.write("						style=\"font-size: 40px;\" href=\"javascript:goURL('post.jsp','')\">P</a>\r\n");
      out.write("					</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						<div class=\"box\" style=\"background: #BDBDBD;\">\r\n");
      out.write("							<img class=\"profile\" src=\"photo/");
      out.print(mbean.getProfile());
      out.write("\" width=\"30\"\r\n");
      out.write("								height=\"30\" onclick=\"location='logout.jsp'\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div data-role=\"content\">\r\n");
      out.write("			<form method=\"post\" name=\"frm\" action=\"pBlogPost\"\r\n");
      out.write("				enctype=\"multipart/form-data\" class=\"post_form\">\r\n");
      out.write("				<div class=\"preview\">\r\n");
      out.write("					<div class=\"upload\">\r\n");
      out.write("						<div class=\"post_btn\">\r\n");
      out.write("							<div class=\"plus_icon\"></div>\r\n");
      out.write("							<p>포스트 이미지 추가</p>\r\n");
      out.write("							<canvas id=\"imageCanvas\"></canvas>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>\r\n");
      out.write("					<input type=\"file\" name=\"photo\" id=\"id_photo\" required=\"required\">\r\n");
      out.write("				</p>\r\n");
      out.write("				<p>\r\n");
      out.write("					<textarea name=\"message\" cols=\"50\" rows=\"5\"\r\n");
      out.write("						placeholder=\"message 등록해 주세요.\"></textarea>\r\n");
      out.write("				</p>\r\n");
      out.write("				<input type=\"hidden\" value=\"");
      out.print(id);
      out.write("\" name=\"id\"> \r\n");
      out.write("				<input type=\"button\" value=\"저장\" onclick=\"send()\">\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("		<form method=\"post\" name=\"frm1\"></form>\r\n");
      out.write("		");
      out.write("<div data-role=\"footer\" data-position=\"fixed\">\r\n");
      out.write("	<h3 style=\"font-family: fantasy;\">PhotoBlog</h3>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("		var fileInput = document.querySelector(\"#id_photo\"), button = document\r\n");
      out.write("				.querySelector(\".input-file-trigger\"), the_return = document\r\n");
      out.write("				.querySelector(\".file-return\");\r\n");
      out.write("		// Show image\r\n");
      out.write("		fileInput.addEventListener('change', handleImage, false);\r\n");
      out.write("		var canvas = document.getElementById('imageCanvas');\r\n");
      out.write("		var ctx = canvas.getContext('2d');\r\n");
      out.write("\r\n");
      out.write("		function handleImage(e) {\r\n");
      out.write("			var reader = new FileReader();\r\n");
      out.write("			reader.onload = function(event) {\r\n");
      out.write("				var img = new Image();\r\n");
      out.write("				img.onload = function() {\r\n");
      out.write("					canvas.width = 300;\r\n");
      out.write("					canvas.height = 300;\r\n");
      out.write("					ctx.drawImage(img, 0, 0, 300, 300);\r\n");
      out.write("				};\r\n");
      out.write("				img.src = event.target.result;\r\n");
      out.write("			};\r\n");
      out.write("			reader.readAsDataURL(e.target.files[0]);\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
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