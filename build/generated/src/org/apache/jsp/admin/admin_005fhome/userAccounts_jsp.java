package org.apache.jsp.admin.admin_005fhome;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.abc.dbconnector.ConnectionProvider;
import java.sql.Statement;
import java.sql.Connection;

public final class userAccounts_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

   Connection con = ConnectionProvider.getCon();
   Statement st = con.createStatement();

   String qry = "SELECT * FROM users";

   ResultSet rs = st.executeQuery(qry);

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("   <head>\n");
      out.write("      <meta charset=\"UTF-8\">\n");
      out.write("      <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("      <title>Users</title>\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("      <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("   </head>\n");
      out.write("\n");
      out.write("   <body>\n");
      out.write("      <ul class=\"menu\">\n");
      out.write("\n");
      out.write("         <h1><img src=\"https://www.shareicon.net/data/256x256/2016/04/14/492851_admin_256x256.png\"\n");
      out.write("                  alt=\"\" width=\"40\" style=\"border-radius: 10px;margin-left: 8px;margin-top: 1rem;\"> </h1>\n");
      out.write("         <b class=\"b\">ADMIN</b>\n");
      out.write("         <i class=\"i\">Space</i>\n");
      out.write("         <hr>\n");
      out.write("         <div class=\"text\">\n");
      out.write("               <li class=\"item\" style=\"background-color: #10707f\"><a href=\"\"><i class=\"fas fa-home\"></i>Home</a></li>\n");
      out.write("            <li class=\"item\"><a href=\"\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i></i>User's Accounts</a></li>      \n");
      out.write("         </div>\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("      <br>\n");
      out.write("      <h1 style=\"text-transform: uppercase;\" class=\"h\">User Account Details...</h1>\n");
      out.write("      <br>\n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("         <table border=\"1\" id=\"datatable\">\n");
      out.write("               <tbody>\n");
      out.write("                  <tr>\n");
      out.write("                     <th>uname</th>\n");
      out.write("                     <th>email</th>\n");
      out.write("                     <th>password</th>\n");
      out.write("                     <th>mobile</th>                 \n");
      out.write("                  </tr>\n");
      out.write("\n");
      out.write("                  ");

                     while (rs.next()) {
                        // out.println("\n"+rs.getString(2)+"\n");
                        // out.println("\n"+rs.(4)+"\n");
                  
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                           <td>");
      out.print(rs.getString("uname"));
      out.write("</td>\n");
      out.write("                           <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("                           <td>");
      out.print(rs.getString("password"));
      out.write("</td>\n");
      out.write("                           <td>");
      out.print(rs.getString("mobile"));
      out.write("</td>                  \n");
      out.write("                        </tr>\n");
      out.write("               </tbody>\n");
      out.write("               ");

                  }
               
      out.write("\n");
      out.write("            </table>\n");
      out.write("      </div>\n");
      out.write("   </body>\n");
      out.write("\n");
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
