/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.85
 * Generated at: 2023-04-10 17:57:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/ressources/css/profile.css", Long.valueOf(1681148678756L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1678212913362L));
    _jspx_dependants.put("/WEB-INF/taglibs.jsp", Long.valueOf(1678214133056L));
    _jspx_dependants.put("/WEB-INF/navBar.jsp", Long.valueOf(1681149448250L));
    _jspx_dependants.put("jar:file:/C:/Users/Simofatt/workspace3/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/test/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153377882000L));
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Book Quotes</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\r\n");
      out.write("    <style>");
      out.write("@charset \"UTF-8\";\r\n");
      out.write("  .favorite {\r\n");
      out.write("            color: blue;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .favorite.active {\r\n");
      out.write("            color: red;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* center the image */\r\n");
      out.write("        .card-img {\r\n");
      out.write("            display: block;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            top: 45px;\r\n");
      out.write("            left: 10px;\r\n");
      out.write("\r\n");
      out.write("            max-width: 200px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* style for profile dropdown */\r\n");
      out.write("        .dropdown-menu-right {\r\n");
      out.write("            right: 0;\r\n");
      out.write("            left: auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar {\r\n");
      out.write("            background-color: #333;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar-brand {\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .nav-link {\r\n");
      out.write("\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .navbar-nav>li {\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            background: -webkit-linear-gradient(left, #3931af, #00c6ff);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .emp-profile {\r\n");
      out.write("            padding: 3%;\r\n");
      out.write("            margin-top: 3%;\r\n");
      out.write("            margin-bottom: 3%;\r\n");
      out.write("            border-radius: 0.5rem;\r\n");
      out.write("            background: #fff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-img {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-img img {\r\n");
      out.write("            width: 70%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-img .file {\r\n");
      out.write("            position: relative;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("            margin-top: -20%;\r\n");
      out.write("            width: 70%;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 0;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("            background: #212529b8;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-img .file input {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            opacity: 0;\r\n");
      out.write("            right: 0;\r\n");
      out.write("            top: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-head h5 {\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-head h6 {\r\n");
      out.write("            color: #0062cc;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-edit-btn {\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 1.5rem;\r\n");
      out.write("            width: 70%;\r\n");
      out.write("            padding: 2%;\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("            color: #6c757d;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .proile-rating {\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("            color: #818182;\r\n");
      out.write("            margin-top: 5%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .proile-rating span {\r\n");
      out.write("            color: #495057;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-head .nav-tabs {\r\n");
      out.write("            margin-bottom: 5%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-head .nav-tabs .nav-link {\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("            border: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-head .nav-tabs .nav-link.active {\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-bottom: 2px solid #0062cc;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-work {\r\n");
      out.write("            padding: 14%;\r\n");
      out.write("            margin-top: -15%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-work p {\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("            color: #818182;\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("            margin-top: 10%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-work a {\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: #495057;\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-work ul {\r\n");
      out.write("            list-style: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-tab label {\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-tab p {\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("            color: #0062cc;\r\n");
      out.write("        }");
      out.write(" </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.html\">Book Quotes</a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\"\r\n");
      out.write("            aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("            <ul class=\"navbar-nav\">\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"index\">Home</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"myQuotes\">My Quotes</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\r\n");
      out.write("                        data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                        Community\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"people\">People</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"discussion\">Discussions</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"addQuote\">Add Quotes</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"profileDropdown\" role=\"button\"\r\n");
      out.write("                        data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                        <i class=\"fas fa-user\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"profileDropdown\">\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"profile\">Profile</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"\">Friends</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"discussion\">Discussions</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"FavQuotes\">Favorite Quotes</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"addQuotes\">Add Quote</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"settings\">Account Settings</a>\r\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Sign Out</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"notifDropdown\" role=\"button\" data-toggle=\"dropdown\"\r\n");
      out.write("                        aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                        <i class=\"far fa-bell\"></i>\r\n");
      out.write("                        <span class=\"badge badge-warning\">3</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"notifDropdown\">\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Notification 1</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Notification 2</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Notification 3</a>\r\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">View All Notifications</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("                        <i class=\"far fa-envelope\"></i>\r\n");
      out.write("                        <span class=\"badge badge-danger\">1</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("    <div class=\"container emp-profile\">\r\n");
      out.write("        <form method=\"post\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"profile-img\">\r\n");
      out.write("                        <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS52y5aInsxSm31CvHOFHWujqUx_wWTS9iM6s7BAm21oEN_RiGoog\"\r\n");
      out.write("                            alt=\"\" />\r\n");
      out.write("                        <div class=\"file btn btn-lg btn-primary\">\r\n");
      out.write("                            Change Photo\r\n");
      out.write("                            <input type=\"file\" name=\"file\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"profile-head\">\r\n");
      out.write("                        <h5>\r\n");
      out.write("                            Kshiti Ghelani\r\n");
      out.write("                        </h5>\r\n");
      out.write("                        <h6>\r\n");
      out.write("                            Morroco,Casablanca\r\n");
      out.write("                        </h6>\r\n");
      out.write("                        <p class=\"proile-rating\">RANKINGS : <span>8/10</span></p>\r\n");
      out.write("                        <ul class=\"nav nav-tabs\" id=\"myTab\" role=\"tablist\">\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link active\" id=\"home-tab\" data-toggle=\"tab\" href=\"#home\" role=\"tab\"\r\n");
      out.write("                                    aria-controls=\"home\" aria-selected=\"true\">About</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" id=\"profile-tab\" data-toggle=\"tab\" href=\"#profile\" role=\"tab\"\r\n");
      out.write("                                    aria-controls=\"profile\" aria-selected=\"false\">Quotes</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-2\">\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"settings\" class=\"profile-edit-btn\" style=\"text-decoration-line: none;\"> Edit\r\n");
      out.write("                        Profile</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"profile-work\">\r\n");
      out.write("                        <p>Highlights</p>\r\n");
      out.write("                        <a href=\"\" class=\" text-muted small text-truncate\"><i\r\n");
      out.write("                                class=\"fas fa-quote-left fa-fw text-muted\"></i> 1,433 quotes</a><br>\r\n");
      out.write("\r\n");
      out.write("                        <a href=\"\" class=\" text-muted small text-truncate\"><i\r\n");
      out.write("                                class=\"fas fa-user-friends fa-fw text-muted\"></i> 1,046 friends</a><br>\r\n");
      out.write("\r\n");
      out.write("                        <a class=\" text-muted small text-truncate\"><i class=\"fas fa-heart\"></i>\r\n");
      out.write("                            1,046 Likes</a>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <div class=\"tab-content profile-tab\" id=\"myTabContent\">\r\n");
      out.write("                        <div class=\"tab-pane fade show active\" id=\"home\" role=\"tabpanel\" aria-labelledby=\"home-tab\">\r\n");
      out.write("                            <br> <br>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <label>Full Name</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <p>Kshiti Ghelani</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <label>Email</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <p>kshitighelani@gmail.com</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <label>Country</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <p>Morocco</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <label>City/Region</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <p>Casablanca</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <label>Address Line 1</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <p>48 Rue mustapha elmanfalouti</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"tab-pane fade\" id=\"profile\" role=\"tabpanel\" aria-labelledby=\"profile-tab\">\r\n");
      out.write("                            <div class=\"card mb-4\">\r\n");
      out.write("                                <div class=\"row no-gutters\">\r\n");
      out.write("                                    <div class=\"col-md-4\">\r\n");
      out.write("                                        <img src=\"https://images.pexels.com/photos/156917/pexels-photo-156917.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940\"\r\n");
      out.write("                                            class=\"card-img\" alt=\"The Hobbit\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-8\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <h5 class=\"card-title\">The Hobbit</h5>\r\n");
      out.write("                                            <p class=\"card-text\">\"In a hole in the ground there lived a hobbit.\"</p>\r\n");
      out.write("                                            <p class=\"card-text\"><small class=\"text-muted\">Published: 1937</small></p>\r\n");
      out.write("                                            <p class=\"card-text\"><small class=\"text-muted\">Author : Cooleen\r\n");
      out.write("                                                    Hover</small></p>\r\n");
      out.write("                                            <p class=\"card-text\"><small class=\"text-muted\">Added By: <a href=\"#\">Sarah\r\n");
      out.write("                                                        Jones</a></small></p>\r\n");
      out.write("                                            <a href=\"#\" class=\"card-link favorite\"><i class=\"fas fa-heart\"></i> Love</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"card mb-4\">\r\n");
      out.write("                                <div class=\"row no-gutters\">\r\n");
      out.write("                                    <div class=\"col-md-4\">\r\n");
      out.write("                                        <img src=\"https://images.pexels.com/photos/156917/pexels-photo-156917.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940\"\r\n");
      out.write("                                            class=\"card-img\" alt=\"The Hobbit\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-8\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <h5 class=\"card-title\">The Hobbit</h5>\r\n");
      out.write("                                            <p class=\"card-text\">\"In a hole in the ground there lived a hobbit.\"</p>\r\n");
      out.write("                                            <p class=\"card-text\"><small class=\"text-muted\">Published: 1937</small></p>\r\n");
      out.write("                                            <p class=\"card-text\"><small class=\"text-muted\">Author : Cooleen\r\n");
      out.write("                                                    Hover</small></p>\r\n");
      out.write("                                            <p class=\"card-text\"><small class=\"text-muted\">Added By: <a href=\"#\">Sarah\r\n");
      out.write("                                                        Jones</a></small></p>\r\n");
      out.write("                                            <a href=\"#\" class=\"card-link favorite\"><i class=\"fas fa-heart\"></i> Love</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\" https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $('.favorite').on('click', function () {\r\n");
      out.write("            $(this).toggleClass('active');\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>");
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
