package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.SQLException;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

   if (session.getAttribute("pwd") == null){
      response.sendRedirect("http://localhost:8080/ABC_Cinema/register/login.jsp");
   }

      out.write("\r\n");
      out.write("\r\n");

   PrintWriter output = response.getWriter();
   Connection con = ConnectionProvider.getCon();
   Statement st = con.createStatement();
   String uid = (String)session.getAttribute("id");
   String uemail = (String)session.getAttribute("email");
   String upwd = (String)session.getAttribute("pwd");
   String uname = (String)session.getAttribute("name"); 
   String umobile = (String)session.getAttribute("mobile");
   
   con = ConnectionProvider.getCon();
   PreparedStatement pst = con.prepareStatement("SELECT * FROM bookings WHERE email = (SELECT uemail FROM users WHERE uemail = ?)");
   pst.setString(1, uemail);
   ResultSet rs = pst.executeQuery();
//   output.print(uemail);
   
//   output.print(seat);

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>User Profile</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"userprofile.css\">\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <link\r\n");
      out.write("         rel=\"stylesheet\"\r\n");
      out.write("         href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\"\r\n");
      out.write("         />\r\n");
      out.write("      <link\r\n");
      out.write("         rel=\"stylesheet\"\r\n");
      out.write("         href=\"https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.css\"\r\n");
      out.write("         />\r\n");
      out.write("      \r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <input type=\"checkbox\" id=\"check\">\r\n");
      out.write("        <label for =\"check\">\r\n");
      out.write("            <i class=\"fas  fa-bars\" id=\"btn\"></i>\r\n");
      out.write("            <i class=\"fas  fa-times\" id=\"cancel\"></i>\r\n");
      out.write("            \r\n");
      out.write("        </label>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"sidebar\">\r\n");
      out.write("            <header>\r\n");
      out.write("            \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <img src=\"images/pp.png\" alt=\"\" class=\"centerpp\"/>\r\n");
      out.write("                <div class =\"pp\">\r\n");
      out.write("                    <h1><b>");
      out.print(session.getAttribute("name"));
      out.write("</b></h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </header>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"/../ABC_Cinema/home/home.jsp\">Home </a></li>\r\n");
      out.write("                <li><a href=\"#\">Booking </a></li>\r\n");
      out.write("                <li><a href=\"#\">Payment </a></li>\r\n");
      out.write("                <!--<li><a href=\"#\">Seat Selection </a></li>-->\r\n");
      out.write("<!--                <li><a href=\"#\">Current Movies </a></li>\r\n");
      out.write("                <li><a href=\"#\">Upcoming Movies </a></li>-->\r\n");
      out.write("                <li><a href=\"../register/forgotPassword.jsp\">Change Password </a></li>\r\n");
      out.write("                <li><a href=\"../Logout\">Sign Out </a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>    \r\n");
      out.write("        \r\n");
      out.write("        <section>\r\n");
      out.write("            \r\n");
      out.write("            <table id=\"t01\" class=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("      \r\n");
      out.write("    <th>Register Number</th>\r\n");
      out.write("    <th>User Name</th>\t\t\r\n");
      out.write("    <th>Password </th>\r\n");
      out.write("    <th>E-Mail</th>\r\n");
      out.write("    <th>Contact Number</th>\r\n");
      out.write("    \r\n");
      out.write("  </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td>");
      out.print( uid );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print( uname );
      out.write("</td>            \r\n");
      out.write("            <td>");
      out.print( upwd );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print( uemail );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print( umobile );
      out.write("</td>\r\n");
      out.write("  <br>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("            \r\n");
      out.write("            <br>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"ch\">\r\n");
      out.write("            <a href=\"#\"><h2 style=\"color: white;\">Need to change User Details?</h2></></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("          \r\n");
      out.write("            <hr>\r\n");
      out.write("            <hr>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("           \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("           \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("      <table id=\"t01\" class=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("<!--    <th>Movie Number</th>\r\n");
      out.write("    <th>Movie Name</th>\t\t-->\r\n");
      out.write("    <th>Show Time</th>\r\n");
      out.write("    <th>Seat Num</th>\r\n");
      out.write("    <th>Ticket Price</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
 
        while(rs.next()){ 
     
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("    <td>");
      out.print( rs.getString("date") );
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print( rs.getString("seat") );
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

   }

      out.write("\r\n");
      out.write("</table>      \r\n");
      out.write("            \r\n");
      out.write("                        <br>\r\n");
      out.write("                        <div class =\"ch\">\r\n");
      out.write("                        <a href=\"#\"><h2 style=\"color: white\">Need to change Booking Details?</h2></a>\r\n");
      out.write("                        </div>\r\n");
      out.write(" \r\n");
      out.write("        </section>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function preventBack() { window.history.forward(); }\r\n");
      out.write("        setTimeout(\"preventBack()\", 0);\r\n");
      out.write("        window.onunload = function () { null };\r\n");
      out.write("    </script>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
