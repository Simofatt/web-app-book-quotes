/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.85
 * Generated at: 2023-03-17 18:58:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/Simofatt/workspace2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/test/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153377882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1678212913362L));
    _jspx_dependants.put("/WEB-INF/taglibs.jsp", Long.valueOf(1678214133056L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Les JSPs ne permettent que GET, POST ou HEAD. Jasper permet aussi OPTIONS");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>LoginAsAClient</title>\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Kanit:wght@900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@200&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Square+Peg&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../login.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <nav>\r\n");
      out.write("        <a href=\"acceuil.html\">\r\n");
      out.write("            <h2 class=\"logo\">L'Y<span>DEC</span></h2>\r\n");
      out.write("        </a>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"title\">\r\n");
      out.write("        <h2>Log in to L'Y<span>DEC</span></h2>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("	  \r\n");
      out.write(" ");
 
 
    Boolean auth = (Boolean) request.getAttribute("auth") ;
    String error =  (String)request.getParameter("error") ; 
	  
 if (auth != null && auth.booleanValue()) {
	  if(auth) {
		  response.sendRedirect("contactsServlet");
    }
    } 

 

if (error != null) {

	 
      out.write("\r\n");
      out.write("     <p> MOT DE PASSE OU EMAIL INCORRECT </p>\r\n");
      out.write("    ");
 
}
  
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <form method=\"post\" action=\"login\">\r\n");
      out.write("          \r\n");
      out.write("            <div class=\"txt-field\">\r\n");
      out.write("                <input type=\"email\" name=\"email\" class=\"txt-css\" required>\r\n");
      out.write("                <label>Email</label>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"txt-field\">\r\n");
      out.write("                <input type=\"password\" name=\"password\" class=\"txt-css\" required>\r\n");
      out.write("                <label>Password</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <label><input id=\"checkbox\" type=\"checkbox\" name=\"connect\">Auto login </label>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("                <input class=\"login-btn\" type=\"submit\" value=\"login\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"P1\">\r\n");
      out.write("                <p>Don't you have an account? <a href=\"login\" class=\"sign-in\"> Sign in </a> </p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
