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
import java.util.ArrayList;

public final class contacts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Realtime Chat App</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");

    String email               =  (String) session.getAttribute("email") ;
    ArrayList<String> contacts = (ArrayList<String>) request.getAttribute("contacts");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("    <section class=\"users\">\r\n");
      out.write("        <header>\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("                <img src=\"imageProfileServlet\" alt=\"\">\r\n");
      out.write("                <div class=\"details\">\r\n");
      out.write("                    <span>");
      out.print(email.substring(0,7));
      out.write("</span>\r\n");
      out.write("                    <p>status</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"#\" class=\"logout\">Logout</a>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class=\"search\">\r\n");
      out.write("            <span class=\"text\">Select an user to start chat</span>\r\n");
      out.write("            <input type=\"text\" placeholder=\"Enter name to search...\">\r\n");
      out.write("            <button><i class=\"fas fa-search\"></i></button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"users-list\">\r\n");
      out.write("            ");
 for (String user: contacts) { 
      out.write("\r\n");
      out.write("                <a href=\"chat?withClientId=");
      out.print(user);
      out.write('"');
      out.write('>');
      out.print(user);
      out.write("</a>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"javascript/users.js\"></script>\r\n");
      out.write("<style> @charset \"UTF-8\";\r\n");
      out.write("\r\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');\r\n");
      out.write("*{\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  font-family: 'Poppins', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("  min-height: 100vh;\r\n");
      out.write("  background: #f7f7f7;\r\n");
      out.write("  padding: 0 10px;\r\n");
      out.write("}\r\n");
      out.write(".wrapper{\r\n");
      out.write("  background: #fff;\r\n");
      out.write("  max-width: 450px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  border-radius: 16px;\r\n");
      out.write("  box-shadow: 0 0 128px 0 rgba(0,0,0,0.1),\r\n");
      out.write("              0 32px 64px -48px rgba(0,0,0,0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Login & Signup Form CSS Start */\r\n");
      out.write(".form{\r\n");
      out.write("  padding: 25px 30px;\r\n");
      out.write("}\r\n");
      out.write(".form header{\r\n");
      out.write("  font-size: 25px;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  padding-bottom: 10px;\r\n");
      out.write("  border-bottom: 1px solid #e6e6e6;\r\n");
      out.write("}\r\n");
      out.write(".form form{\r\n");
      out.write("  margin: 20px 0;\r\n");
      out.write("}\r\n");
      out.write(".form form .error-text{\r\n");
      out.write("  color: #721c24;\r\n");
      out.write("  padding: 8px 10px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  background: #f8d7da;\r\n");
      out.write("  border: 1px solid #f5c6cb;\r\n");
      out.write("  margin-bottom: 10px;\r\n");
      out.write("  display: none;\r\n");
      out.write("}\r\n");
      out.write(".form form .name-details{\r\n");
      out.write("  display: flex;\r\n");
      out.write("}\r\n");
      out.write(".form .name-details .field:first-child{\r\n");
      out.write("  margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write(".form .name-details .field:last-child{\r\n");
      out.write("  margin-left: 10px;\r\n");
      out.write("}\r\n");
      out.write(".form form .field{\r\n");
      out.write("  display: flex;\r\n");
      out.write("  margin-bottom: 10px;\r\n");
      out.write("  flex-direction: column;\r\n");
      out.write("  position: relative;\r\n");
      out.write("}\r\n");
      out.write(".form form .field label{\r\n");
      out.write("  margin-bottom: 2px;\r\n");
      out.write("}\r\n");
      out.write(".form form .input input{\r\n");
      out.write("  height: 40px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  padding: 0 10px;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  border: 1px solid #ccc;\r\n");
      out.write("}\r\n");
      out.write(".form form .field input{\r\n");
      out.write("  outline: none;\r\n");
      out.write("}\r\n");
      out.write(".form form .image input{\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write(".form form .button input{\r\n");
      out.write("  height: 45px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("  background: #333;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  margin-top: 13px;\r\n");
      out.write("}\r\n");
      out.write(".form form .field i{\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  right: 15px;\r\n");
      out.write("  top: 70%;\r\n");
      out.write("  color: #ccc;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  transform: translateY(-50%);\r\n");
      out.write("}\r\n");
      out.write(".form form .field i.active::before{\r\n");
      out.write("  color: #333;\r\n");
      out.write("  content: \"\\f070\";\r\n");
      out.write("}\r\n");
      out.write(".form .link{\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  margin: 10px 0;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write(".form .link a{\r\n");
      out.write("  color: #333;\r\n");
      out.write("}\r\n");
      out.write(".form .link a:hover{\r\n");
      out.write("  text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* Users List CSS Start */\r\n");
      out.write(".users{\r\n");
      out.write("  padding: 25px 30px;\r\n");
      out.write("}\r\n");
      out.write(".users header,\r\n");
      out.write(".users-list a{\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  padding-bottom: 20px;\r\n");
      out.write("  border-bottom: 1px solid #e6e6e6;\r\n");
      out.write("  justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write(".wrapper img{\r\n");
      out.write("  object-fit: cover;\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write(".users header img{\r\n");
      out.write("  height: 50px;\r\n");
      out.write("  width: 50px;\r\n");
      out.write("}\r\n");
      out.write(":is(.users, .users-list) .content{\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("}\r\n");
      out.write(":is(.users, .users-list) .content .details{\r\n");
      out.write("  color: #000;\r\n");
      out.write("  margin-left: 20px;\r\n");
      out.write("}\r\n");
      out.write(":is(.users, .users-list) .details span{\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("  font-weight: 500;\r\n");
      out.write("}\r\n");
      out.write(".users header .logout{\r\n");
      out.write("  display: block;\r\n");
      out.write("  background: #333;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  border: none;\r\n");
      out.write("  padding: 7px 15px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write(".users .search{\r\n");
      out.write("  margin: 20px 0;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write(".users .search .text{\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("}\r\n");
      out.write(".users .search input{\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  height: 42px;\r\n");
      out.write("  width: calc(100% - 50px);\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  padding: 0 13px;\r\n");
      out.write("  border: 1px solid #e6e6e6;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  border-radius: 5px 0 0 5px;\r\n");
      out.write("  opacity: 0;\r\n");
      out.write("  transition: all 0.2s ease;\r\n");
      out.write("}\r\n");
      out.write(".users .search input.show{\r\n");
      out.write("  opacity: 1;\r\n");
      out.write("  pointer-events: auto;\r\n");
      out.write("}\r\n");
      out.write(".users .search button{\r\n");
      out.write("  position: relative;\r\n");
      out.write("  z-index: 1;\r\n");
      out.write("  width: 47px;\r\n");
      out.write("  height: 42px;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  border: none;\r\n");
      out.write("  background: #fff;\r\n");
      out.write("  color: #333;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  border-radius: 0 5px 5px 0;\r\n");
      out.write("  transition: all 0.2s ease;\r\n");
      out.write("}\r\n");
      out.write(".users .search button.active{\r\n");
      out.write("  background: #333;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("}\r\n");
      out.write(".search button.active i::before{\r\n");
      out.write("  content: '\\f00d';\r\n");
      out.write("}\r\n");
      out.write(".users-list{\r\n");
      out.write("  max-height: 350px;\r\n");
      out.write("  overflow-y: auto;\r\n");
      out.write("}\r\n");
      out.write(":is(.users-list, .chat-box)::-webkit-scrollbar{\r\n");
      out.write("  width: 0px;\r\n");
      out.write("}\r\n");
      out.write(".users-list a{\r\n");
      out.write("  padding-bottom: 10px;\r\n");
      out.write("  margin-bottom: 15px;\r\n");
      out.write("  padding-right: 15px;\r\n");
      out.write("  border-bottom-color: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write(".users-list a:last-child{\r\n");
      out.write("  margin-bottom: 0px;\r\n");
      out.write("  border-bottom: none;\r\n");
      out.write("}\r\n");
      out.write(".users-list a img{\r\n");
      out.write("  height: 40px;\r\n");
      out.write("  width: 40px;\r\n");
      out.write("}\r\n");
      out.write(".users-list a .details p{\r\n");
      out.write("  color: #67676a;\r\n");
      out.write("}\r\n");
      out.write(".users-list a .status-dot{\r\n");
      out.write("  font-size: 12px;\r\n");
      out.write("  color: #468669;\r\n");
      out.write("  padding-left: 10px;\r\n");
      out.write("}\r\n");
      out.write(".users-list a .status-dot.offline{\r\n");
      out.write("  color: #ccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Chat Area CSS Start */\r\n");
      out.write(".chat-area header{\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  padding: 18px 30px;\r\n");
      out.write("}\r\n");
      out.write(".chat-area header .back-icon{\r\n");
      out.write("  color: #333;\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("}\r\n");
      out.write(".chat-area header img{\r\n");
      out.write("  height: 45px;\r\n");
      out.write("  width: 45px;\r\n");
      out.write("  margin: 0 15px;\r\n");
      out.write("}\r\n");
      out.write(".chat-area header .details span{\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("  font-weight: 500;\r\n");
      out.write("}\r\n");
      out.write(".chat-box{\r\n");
      out.write("  position: relative;\r\n");
      out.write("  min-height: 500px;\r\n");
      out.write("  max-height: 500px;\r\n");
      out.write("  overflow-y: auto;\r\n");
      out.write("  padding: 10px 30px 20px 30px;\r\n");
      out.write("  background: #f7f7f7;\r\n");
      out.write("  box-shadow: inset 0 32px 32px -32px rgb(0 0 0 / 5%),\r\n");
      out.write("              inset 0 -32px 32px -32px rgb(0 0 0 / 5%);\r\n");
      out.write("}\r\n");
      out.write(".chat-box .text{\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 45%;\r\n");
      out.write("  left: 50%;\r\n");
      out.write("  width: calc(100% - 50px);\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  transform: translate(-50%, -50%);\r\n");
      out.write("}\r\n");
      out.write(".chat-box .chat{\r\n");
      out.write("  margin: 15px 0;\r\n");
      out.write("}\r\n");
      out.write(".chat-box .chat p{\r\n");
      out.write("  word-wrap: break-word;\r\n");
      out.write("  padding: 8px 16px;\r\n");
      out.write("  box-shadow: 0 0 32px rgb(0 0 0 / 8%),\r\n");
      out.write("              0rem 16px 16px -16px rgb(0 0 0 / 10%);\r\n");
      out.write("}\r\n");
      out.write(".chat-box .outgoing{\r\n");
      out.write("  display: flex;\r\n");
      out.write("}\r\n");
      out.write(".chat-box .outgoing .details{\r\n");
      out.write("  margin-left: auto;\r\n");
      out.write("  max-width: calc(100% - 130px);\r\n");
      out.write("}\r\n");
      out.write(".outgoing .details p{\r\n");
      out.write("  background: #333;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  border-radius: 18px 18px 0 18px;\r\n");
      out.write("}\r\n");
      out.write(".chat-box .incoming{\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: flex-end;\r\n");
      out.write("}\r\n");
      out.write(".chat-box .incoming img{\r\n");
      out.write("  height: 35px;\r\n");
      out.write("  width: 35px;\r\n");
      out.write("}\r\n");
      out.write(".chat-box .incoming .details{\r\n");
      out.write("  margin-right: auto;\r\n");
      out.write("  margin-left: 10px;\r\n");
      out.write("  max-width: calc(100% - 130px);\r\n");
      out.write("}\r\n");
      out.write(".incoming .details p{\r\n");
      out.write("  background: #fff;\r\n");
      out.write("  color: #333;\r\n");
      out.write("  border-radius: 18px 18px 18px 0;\r\n");
      out.write("}\r\n");
      out.write(".typing-area{\r\n");
      out.write("  padding: 18px 30px;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write(".typing-area input{\r\n");
      out.write("  height: 45px;\r\n");
      out.write("  width: calc(100% - 58px);\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  padding: 0 13px;\r\n");
      out.write("  border: 1px solid #e6e6e6;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  border-radius: 5px 0 0 5px;\r\n");
      out.write("}\r\n");
      out.write(".typing-area button{\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  width: 55px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  background: #333;\r\n");
      out.write("  font-size: 19px;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  opacity: 0.7;\r\n");
      out.write("  pointer-events: none;\r\n");
      out.write("  border-radius: 0 5px 5px 0;\r\n");
      out.write("  transition: all 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write(".typing-area button.active{\r\n");
      out.write("  opacity: 1;\r\n");
      out.write("  pointer-events: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Responive media query */\r\n");
      out.write("@media screen and (max-width: 450px) {\r\n");
      out.write("  .form, .users{\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("  }\r\n");
      out.write("  .form header{\r\n");
      out.write("    text-align: center;\r\n");
      out.write("  }\r\n");
      out.write("  .form form .name-details{\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("  }\r\n");
      out.write("  .form .name-details .field:first-child{\r\n");
      out.write("    margin-right: 0px;\r\n");
      out.write("  }\r\n");
      out.write("  .form .name-details .field:last-child{\r\n");
      out.write("    margin-left: 0px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .users header img{\r\n");
      out.write("    height: 45px;\r\n");
      out.write("    width: 45px;\r\n");
      out.write("  }\r\n");
      out.write("  .users header .logout{\r\n");
      out.write("    padding: 6px 10px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("  }\r\n");
      out.write("  :is(.users, .users-list) .content .details{\r\n");
      out.write("    margin-left: 15px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .users-list a{\r\n");
      out.write("    padding-right: 10px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .chat-area header{\r\n");
      out.write("    padding: 15px 20px;\r\n");
      out.write("  }\r\n");
      out.write("  .chat-box{\r\n");
      out.write("    min-height: 400px;\r\n");
      out.write("    padding: 10px 15px 15px 20px;\r\n");
      out.write("  }\r\n");
      out.write("  .chat-box .chat p{\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("  }\r\n");
      out.write("  .chat-box .outogoing .details{\r\n");
      out.write("    max-width: 230px;\r\n");
      out.write("  }\r\n");
      out.write("  .chat-box .incoming .details{\r\n");
      out.write("    max-width: 265px;\r\n");
      out.write("  }\r\n");
      out.write("  .incoming .details img{\r\n");
      out.write("    height: 30px;\r\n");
      out.write("    width: 30px;\r\n");
      out.write("  }\r\n");
      out.write("  .chat-area form{\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("  }\r\n");
      out.write("  .chat-area form input{\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    width: calc(100% - 48px);\r\n");
      out.write("  }\r\n");
      out.write("  .chat-area form button{\r\n");
      out.write("    width: 45px;\r\n");
      out.write("  }\r\n");
      out.write("}</style>\r\n");
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
