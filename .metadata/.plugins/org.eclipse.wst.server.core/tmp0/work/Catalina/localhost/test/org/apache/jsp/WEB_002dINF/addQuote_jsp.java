/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.85
 * Generated at: 2023-05-01 03:12:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import comm.octest.beans.Flyweight;
import comm.octest.beans.Message;
import comm.octest.beans.QuoteManager;

public final class addQuote_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1678212913362L));
    _jspx_dependants.put("/WEB-INF/ressources/css/addQuote.css", Long.valueOf(1682901775624L));
    _jspx_dependants.put("/WEB-INF/taglibs.jsp", Long.valueOf(1678214133056L));
    _jspx_dependants.put("/WEB-INF/navBar.jsp", Long.valueOf(1682910496571L));
    _jspx_dependants.put("jar:file:/C:/Users/Simofatt/workspace3/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/test/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153377882000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("comm.octest.beans.QuoteManager");
    _jspx_imports_classes.add("comm.octest.beans.Flyweight");
    _jspx_imports_classes.add("comm.octest.beans.Message");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Book Quotes</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\r\n");
      out.write("    <style>   ");
      out.write("@charset \"UTF-8\";\r\n");
      out.write("    @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');\r\n");
      out.write("        /* center the image */\r\n");
      out.write("           *{\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                font-family: 'Poppins', sans-serif;\r\n");
      out.write("            }\r\n");
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
      out.write("            left: 100px;\r\n");
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
      out.write("            color: white;\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .nav-link:hover {\r\n");
      out.write("            color: yellow;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar-nav {\r\n");
      out.write("            margin-left: auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar-nav>li {\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .resize-none {\r\n");
      out.write("            resize: none;\r\n");
      out.write("        }");
      out.write(" </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
  String success =  (String)request.getParameter("success") ; 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

int user_id = (int) session.getAttribute("user_id");
Flyweight quoteNotification = new QuoteManager();
List<Flyweight> notifications = quoteNotification.getNotification(user_id);  
int countNotif = notifications.size() ;
String emailNavBar= (String ) session.getAttribute("email") ;

Message message = new Message() ; 
List<Message> msgNotification = message.notification(emailNavBar) ;
int countMsgNotif = msgNotification.size() ;


      out.write("\r\n");
      out.write("\r\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark \">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.html\">Book Quotes</a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\"\r\n");
      out.write("            aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("            <ul class=\"navbar-nav\">\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"sharedQuotes\">Home</a>\r\n");
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
      out.write("                        <a class=\"dropdown-item\" href=\"favQuotes\">Favorite Quotes</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"addQuotes\">Add Quote</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"settings\">Account Settings</a>\r\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Sign Out</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                 \r\n");
      out.write("                <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"notifDropdown\" role=\"button\" data-toggle=\"dropdown\"\r\n");
      out.write("                        aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                        <i class=\"far fa-bell\"></i>\r\n");
      out.write("                        <span class=\"badge badge-warning\">");
      out.print(countNotif );
      out.write("</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                  \r\n");
      out.write("                   <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"notifDropdown\">\r\n");
      out.write("                   \r\n");
      out.write("                    ");
for (Flyweight notifs : notifications ) { 
                    	int id_quote = notifs.getId_quote() ; 
                     
      out.write("\r\n");
      out.write("                \r\n");
      out.write("               \r\n");
      out.write("                 <a class=\"dropdown-item\" href=\"sharedQuotes?id_quote=");
      out.print(id_quote);
      out.write("\">New Quote added!</a>\r\n");
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">View All Notifications</a>\r\n");
      out.write("    \r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                          <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"notifDropdown\" role=\"button\" data-toggle=\"dropdown\"\r\n");
      out.write("                        aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                         <i class=\"far fa-envelope\"></i>\r\n");
      out.write("                        <span class=\"badge badge-warning\">");
      out.print(countMsgNotif );
      out.write("</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                  \r\n");
      out.write("                   <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"notifDropdown\">\r\n");
      out.write("                   \r\n");
      out.write("                    ");
for (Message msgNotif : msgNotification ) { 
                    	String id_from = msgNotif.getFrom() ; 
                    	Message msg = new Message() ;
                    	String  from_name = msg.getName(id_from) ; 
                    	String msgs= msgNotif.getMsg() ;
                     
      out.write("\r\n");
      out.write("                \r\n");
      out.write("               \r\n");
      out.write("                 <a class=\"dropdown-item\" href=\"chat?withClientId=");
      out.print(id_from);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(from_name );
      out.write(" : \"");
      out.print(msgs );
      out.write("\" </a>\r\n");
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">View All Messages</a>\r\n");
      out.write("    \r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</li>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        setInterval(function() {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: \"/notifications\",\r\n");
      out.write("                type: \"GET\",\r\n");
      out.write("                dataType: \"json\",\r\n");
      out.write("                success: function(response) {\r\n");
      out.write("                	 var notifications = JSON.parse(json);\r\n");
      out.write("                     var notificationsHtml = '';\r\n");
      out.write("                     for (var i = 0; i < notifications.length; i++) {\r\n");
      out.write("                         notificationsHtml += '<a class=\"dropdown-item\" href=\"#\">' + notifications[i] + '</a>';\r\n");
      out.write("                     }\r\n");
      out.write("                     document.getElementById('notifications').innerHTML = notificationsHtml;\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }, 5000); // Récupérer les notifications toutes les 5 secondes\r\n");
      out.write("    });\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    <div class=\"container my-4\">\r\n");
      out.write("        <h2>Add a Quote</h2>\r\n");
      out.write("        <br>\r\n");
      out.write("        ");

        if (success != null) {
	 
      out.write("\r\n");
      out.write("     <p> Quote bien ajoute </p>\r\n");
      out.write("    ");
 
}
  
      out.write("\r\n");
      out.write("        <form method=\"post\" action=\"addQuote\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"bookName\">Book Name:</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"bookName\" name=\"name_book\">\r\n");
      out.write("            </div>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"bookName\">Type:</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"bookName\" name=\"book_type\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"authorName\">Author Name:</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"authorName\" name=\"name_author\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"quote\">Quote:</label>\r\n");
      out.write("                <textarea class=\"form-control resize-none\" id=\"quote\" rows=\"3\" name=\"quote_text\"></textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"d-flex justify-content-center\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary mx-3\">Add Quote</button>\r\n");
      out.write("                <button type=\"reset\" class=\"btn btn-secondary mx-3\">Clear</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $('.favorite').on('click', function () {\r\n");
      out.write("            $(this).toggleClass('active');\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
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
