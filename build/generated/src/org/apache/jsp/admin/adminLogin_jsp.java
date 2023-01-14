package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <title>ADMIN</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"admin.css\" />\n");
      out.write("\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.css\"\n");
      out.write("    />\n");
      out.write("    <style>\n");
      out.write("       .signup_link{\n");
      out.write("          margin-top: 1rem;\n");
      out.write("          margin-bottom: -1rem;\n");
      out.write("       }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <input type=\"hidden\" id=\"status\" value=\"");
      out.print( request.getParameter("status") );
      out.write("\">\n");
      out.write("    <header>\n");
      out.write("      <a href=\"\" class=\"logo\"> <i class=\"bx bxs-movie\"></i>Movies </a>\n");
      out.write("\n");
      out.write("      <div class=\"bx bx-menu\" id=\"menu-icon\"></div>\n");
      out.write("      <ul class=\"navbar\">\n");
      out.write("        <li><a href=\"http://localhost:8080/ABC_Cinema/home/home.jsp\" class=\"\">Home</a></li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      <a href=\"\" class=\"button\"><i class='bx bxs-shield bx-tada' ></i> ADMIN</a>\n");
      out.write("      \n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"center\">\n");
      out.write("      <h1>Login</h1>\n");
      out.write("      <form method=\"post\" action=\"../Login\">\n");
      out.write("        <div class=\"txt_field\">\n");
      out.write("           <input type=\"text\" name=\"username\" required />\n");
      out.write("          <label\n");
      out.write("            ><span><i class=\"bx bxs-user\"></i></span> Username</label\n");
      out.write("          >\n");
      out.write("        </div>\n");
      out.write("        <div class=\"txt_field\">\n");
      out.write("           <input type=\"password\" name=\"password\" required />\n");
      out.write("          <label\n");
      out.write("            ><span><i class=\"bx bxs-lock-alt\"></i></span> Password</label\n");
      out.write("          >\n");
      out.write("        </div>\n");
      out.write("        <div class=\"pass\">Forgot Password?</div>\n");
      out.write("        <input type=\"submit\" value=\"Login\" />\n");
      out.write("        <div class=\"signup_link\">\n");
      out.write("          Not a member? <a href=\"register.jsp\">Signup</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("   <link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\" >\n");
      out.write("   \n");
      out.write("   <script>\n");
      out.write("      var status = document.getElementById(\"status\").value;\n");
      out.write("      if(status == \"failed\"){\n");
      out.write("         swal(\"Sorry\", \"Wrong Username or Password\", \"error\");        \n");
      out.write("      }\n");
      out.write("      else if(status == \"invalidEmail\"){\n");
      out.write("         swal(\"Sorry\", \"Please enter your username\", \"error\");        \n");
      out.write("      }\n");
      out.write("      else if(status == \"invalidUpwd\"){\n");
      out.write("         swal(\"Sorry\", \"Please enter your password\", \"error\");        \n");
      out.write("      }\n");
      out.write("   </script>\n");
      out.write("   \n");
      out.write("  </body>\n");
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
