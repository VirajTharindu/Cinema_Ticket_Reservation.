package org.apache.jsp.admin.admin_005fhome;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');

try {
    response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   response.addHeader("Pragma", "no-cache"); 
   response.addDateHeader ("Expires", 0);
    if (session.getAttribute("name") == null){
      response.sendRedirect("http://localhost:8080/ABC_Cinema/admin/adminLogin.jsp");
   }
    else {}
}
catch(Exception ex) {
    out.println(ex);
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Admin Home</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("    \r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\"\r\n");
      out.write("    />\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.css\"\r\n");
      out.write("    />\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <ul class=\"menu\">\r\n");
      out.write("\r\n");
      out.write("        <h1><img src=\"https://friconix.com/jpg/fi-snsuxx-user-shield-solid.jpg\"\r\n");
      out.write("                alt=\"\" width=\"40\" style=\"border-radius: 10px;margin-left: 8px;margin-top: 1rem;\"> </h1>\r\n");
      out.write("        <b class=\"b\">ADMIN</b>\r\n");
      out.write("<!--        <i class=\"i\">Space</i>-->\r\n");
      out.write("        <hr>\r\n");
      out.write("        <div class=\"text\">\r\n");
      out.write("            <li class=\"item\" style=\"background-color: #AB263A\"><a href=\"adminHome.jsp\"><i class=\"fas fa-home\"></i>Home</a></li>\r\n");
      out.write("            <li class=\"item\"><a href=\"userAccounts.jsp\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i>User Accounts</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"item\"><a href=\"updateMovies.jsp\"><i class=\"fa fa-film\" aria-hidden=\"true\"></i> Update Movies</a></li> \r\n");
      out.write("            <li class=\"item\"><a href=\"userReviews.jsp\"><i class=\"fa fa-comments\" aria-hidden=\"true\"></i>User Reviews</a></li> \r\n");
      out.write("            <li class=\"item\" style=\"background-image: linear-gradient(to right, black, rgba(255,0,0,0)); border: 3px solid black;\"><a href=\"../../AdminLogout\"><i class='bx bx-log-out'></i> Logout</a></li> \r\n");
      out.write("        </div>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("    <h1 style=\"text-transform: uppercase;\" class=\"h\">Welcome Admin</h1>\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <fieldset class=\"info\">\r\n");
      out.write("            Statistic \r\n");
      out.write("            <br>\r\n");
      out.write("            <img src=\"img/logo1.png\"\r\n");
      out.write("                alt=\"\" width=\"50%\" style=\"\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                \r\n");
      out.write("                <i class=\"fas fa-chart-line\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("               <div\r\n");
      out.write("            </div>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("\r\n");
      out.write("        <fieldset class=\"info\">\r\n");
      out.write("            Booking Details\r\n");
      out.write("            <br>\r\n");
      out.write("            <p>\r\n");
      out.write("                <br>\r\n");
      out.write("                Dernière connexion il y a 3 heures à Paris.\r\n");
      out.write("                <br>\r\n");
      out.write("                <button style=\"margin-top: 1rem;\">Booking Data</button>\r\n");
      out.write("            </p>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <i class=\"fas fa-shield-alt\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"coordonate\">\r\n");
      out.write("            <h2><i class=\"fas fa-id-card\" style=\"margin-right: 10px;\"></i> Contact Us</h2>\r\n");
      out.write("            <p>\r\n");
      out.write("                Please contact our dev team for more details.<br>\r\n");
      out.write("                <a href=\"#\">contact</a>\r\n");
      out.write("            </p>\r\n");
      out.write("            <br>\r\n");
      out.write("            <p>\r\n");
      out.write("                <i class=\"fas fa-phone-square-alt\"></i>\r\n");
      out.write("                <i class=\"fab fa-twitter-square\"></i>\r\n");
      out.write("                <i class=\"fas fa-envelope\"></i>\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("        function preventBack() { window.history.forward(); }\r\n");
      out.write("        setTimeout(\"preventBack()\", 0);\r\n");
      out.write("        window.onunload = function () { null };\r\n");
      out.write("    </script>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
