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


   if (session.getAttribute("name") == null){
      response.sendRedirect("http://localhost:8080/ABC_Cinema/admin/adminLogin.jsp");
   }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Admin Home</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    \n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.css\"\n");
      out.write("    />\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <ul class=\"menu\">\n");
      out.write("\n");
      out.write("        <h1><img src=\"https://cdn.imgbin.com/21/4/22/imgbin-computer-icons-login-user-system-administrator-admin-L1LTfM47FsD3A2gus0rdy8WpJ.jpg\"\n");
      out.write("                alt=\"\" width=\"40\" style=\"border-radius: 10px;margin-left: 8px;margin-top: 1rem;\"> </h1>\n");
      out.write("        <b class=\"b\">ADMIN</b>\n");
      out.write("<!--        <i class=\"i\">Space</i>-->\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"text\">\n");
      out.write("            <li class=\"item\" style=\"background-color: #AB263A\"><a href=\"adminHome.jsp\"><i class=\"fas fa-home\"></i>Home</a></li>\n");
      out.write("            <li class=\"item\"><a href=\"userAccounts.jsp\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i>User Accounts</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"item\"><a href=\"userReviews.jsp\"><i class=\"fa fa-comments\" aria-hidden=\"true\"></i>Add Movies</a></li> \n");
      out.write("            <li class=\"item\"><a href=\"userReviews.jsp\"><i class=\"fa fa-comments\" aria-hidden=\"true\"></i>User Reviews</a></li> \n");
      out.write("            <li class=\"item\" style=\"background-image: linear-gradient(to right, black, rgba(255,0,0,0)); border: 3px solid black;\"><a href=\"../AdminLogout\"><i class='bx bx-log-out'></i> Logout</a></li> \n");
      out.write("        </div>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <h1 style=\"text-transform: uppercase;\" class=\"h\">Welcome Admin</h1>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <fieldset class=\"info\">\n");
      out.write("            Statistic \n");
      out.write("            <br>\n");
      out.write("            <img src=\"img/logo1.png\"\n");
      out.write("                alt=\"\" width=\"50%\" style=\"\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                \n");
      out.write("                <i class=\"fas fa-chart-line\"></i>\n");
      out.write("            </div>\n");
      out.write("            <p>A warm welcome and lots of good wishes on becoming part of our growing team. <br> Congratulations and                 on behalf of all the members. We are all happy <br> and excited about your input and contribution to                  our company.</p>\n");
      out.write("        </fieldset>\n");
      out.write("\n");
      out.write("        <fieldset class=\"info\">\n");
      out.write("            Booking Details\n");
      out.write("            <br>\n");
      out.write("            <p>\n");
      out.write("                <br>\n");
      out.write("                Dernière connexion il y a 3 heures à Paris.\n");
      out.write("                <br>\n");
      out.write("                <button style=\"margin-top: 1rem;\">Booking Data</button>\n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <i class=\"fas fa-shield-alt\"></i>\n");
      out.write("            </div>\n");
      out.write("        </fieldset>\n");
      out.write("\n");
      out.write("        <div class=\"coordonate\">\n");
      out.write("            <h2><i class=\"fas fa-id-card\" style=\"margin-right: 10px;\"></i> Contact Us</h2>\n");
      out.write("            <p>\n");
      out.write("                Please contact our dev team for more details.<br>\n");
      out.write("                <a href=\"#\">contact</a>\n");
      out.write("            </p>\n");
      out.write("            <br>\n");
      out.write("            <p>\n");
      out.write("                <i class=\"fas fa-phone-square-alt\"></i>\n");
      out.write("                <i class=\"fab fa-twitter-square\"></i>\n");
      out.write("                <i class=\"fas fa-envelope\"></i>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
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
