package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.abc.dbconnector.ConnectionProvider;
import java.sql.Statement;
import java.sql.Connection;

public final class userprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

   if (session.getAttribute("name") == null){
      response.sendRedirect("http://localhost:8080/ABC_Cinema/register/login.jsp");
   }

      out.write('\n');
      out.write('\n');

   Connection con = ConnectionProvider.getCon();
   Statement st = con.createStatement();
   String uid = (String)session.getAttribute("id");
   String uemail = (String)session.getAttribute("email");
   String upwd = (String)session.getAttribute("pwd");
   String uname = (String)session.getAttribute("name"); 
   String umobile = (String)session.getAttribute("mobile");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Profile</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"userprofile.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        \n");
      out.write("        <link\n");
      out.write("         rel=\"stylesheet\"\n");
      out.write("         href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\"\n");
      out.write("         />\n");
      out.write("      <link\n");
      out.write("         rel=\"stylesheet\"\n");
      out.write("         href=\"https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.css\"\n");
      out.write("         />\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <input type=\"checkbox\" id=\"check\">\n");
      out.write("        <label for =\"check\">\n");
      out.write("            <i class=\"fas  fa-bars\" id=\"btn\"></i>\n");
      out.write("            <i class=\"fas  fa-times\" id=\"cancel\"></i>\n");
      out.write("            \n");
      out.write("        </label>\n");
      out.write("        \n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("            <header>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <img src=\"images/pp.png\" alt=\"\" class=\"centerpp\"/>\n");
      out.write("                <div class =\"pp\">\n");
      out.write("                    <h1><b>");
      out.print(session.getAttribute("name"));
      out.write("</b></h1>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </header>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">Home </a></li>\n");
      out.write("                <li><a href=\"#\">Booking </a></li>\n");
      out.write("                <li><a href=\"#\">Payment </a></li>\n");
      out.write("                <!--<li><a href=\"#\">Seat Selection </a></li>-->\n");
      out.write("<!--                <li><a href=\"#\">Current Movies </a></li>\n");
      out.write("                <li><a href=\"#\">Upcoming Movies </a></li>-->\n");
      out.write("                <li><a href=\"../register/forgotPassword\">Change Password </a></li>\n");
      out.write("                <li><a href=\"../Logout\">Sign Out </a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>    \n");
      out.write("        \n");
      out.write("        <section>\n");
      out.write("            \n");
      out.write("            <table id=\"t01\" class=\"center\">\n");
      out.write("  <tr>\n");
      out.write("      \n");
      out.write("    <th>Register Number</th>\n");
      out.write("    <th>User Name</th>\t\t\n");
      out.write("    <th>Password </th>\n");
      out.write("    <th>E-Mail</th>\n");
      out.write("    <th>Contact Number</th>\n");
      out.write("    \n");
      out.write("  </tr>\n");
      out.write("       <tr>\n");
      out.write("            <td>");
      out.print( uid );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( uname );
      out.write("</td>            \n");
      out.write("            <td>");
      out.print( upwd );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( uemail );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( umobile );
      out.write("</td>\n");
      out.write("  <br>\n");
      out.write(" \n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <div class=\"ch\">\n");
      out.write("            <a href=\"#\"><h2 style=\"color: white;\">Need to change User Details?</h2></></a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("          \n");
      out.write("            <hr>\n");
      out.write("            <hr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("      <table id=\"t01\" class=\"center\">\n");
      out.write("  <tr>\n");
      out.write("    <th>Movie Number</th>\n");
      out.write("    <th>Movie Name</th>\t\t\n");
      out.write("    <th>Show Time</th>\n");
      out.write("    <th>Seat Num</th>\n");
      out.write("    <th>Ticket Price</th>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>");
      out.print(request.getParameter("movienum"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(request.getParameter("moviename"));
      out.write("</td>\t\t\n");
      out.write("    <td>");
      out.print(request.getParameter("time"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(request.getParameter("seat"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(request.getParameter("seat"));
      out.write("</td>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>");
      out.print(request.getParameter("movienum"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(request.getParameter("moviename"));
      out.write("</td>\t\t\n");
      out.write("    <td>");
      out.print(request.getParameter("time"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(request.getParameter("seat"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(request.getParameter("seat"));
      out.write("</td>\n");
      out.write("    \n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>");
      out.print(request.getParameter("movienum"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(request.getParameter("moviename"));
      out.write("</td>\t\t\n");
      out.write("    <td>");
      out.print(request.getParameter("time"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(request.getParameter("seat"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(request.getParameter("seat"));
      out.write("</td>\n");
      out.write("    \n");
      out.write("  </tr>\n");
      out.write("</table>      \n");
      out.write("            \n");
      out.write("                        <br>\n");
      out.write("                        <div class =\"ch\">\n");
      out.write("                        <a href=\"#\"><h2 style=\"color: white\">Need to change Booking Details?</h2></a>\n");
      out.write("                        </div>\n");
      out.write(" \n");
      out.write("        </section>\n");
      out.write("<!-- \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function preventBack() { window.history.forward(); }\n");
      out.write("        setTimeout(\"preventBack()\", 0);\n");
      out.write("        window.onunload = function () { null };\n");
      out.write("    </script>-->\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
