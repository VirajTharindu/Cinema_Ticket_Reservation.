package org.apache.jsp.register;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <title>Login</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"login.css\" />\r\n");
      out.write("\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\"\r\n");
      out.write("    />\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.css\"\r\n");
      out.write("    />\r\n");
      out.write("    <style>\r\n");
      out.write("       .signup_link{\r\n");
      out.write("          margin-top: 1rem;\r\n");
      out.write("          margin-bottom: -1rem;\r\n");
      out.write("       }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <input type=\"hidden\" id=\"status\" value=\"");
      out.print( request.getParameter("status") );
      out.write("\">\r\n");
      out.write("    <header>\r\n");
      out.write("      <a href=\"\" class=\"logo\"> <i class=\"bx bxs-movie\"></i>Movies </a>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"bx bx-menu\" id=\"menu-icon\"></div>\r\n");
      out.write("      <ul class=\"navbar\">\r\n");
      out.write("        <li><a href=\"http://localhost:8080/ABC_Cinema/home/home.jsp\" class=\"\">Home</a></li>\r\n");
      out.write("        <li><a href=\"#AboutUs\">About Us</a></li>\r\n");
      out.write("        <li><a href=\"#ContactUs\">Contact Us</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <a href=\"login.jsp\" class=\"button\">Sign In</a>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"center\">\r\n");
      out.write("      <h1>Login</h1>\r\n");
      out.write("      <form method=\"post\" action=\"../Login\">\r\n");
      out.write("        <div class=\"txt_field\">\r\n");
      out.write("           <input type=\"text\" name=\"username\" required />\r\n");
      out.write("          <label\r\n");
      out.write("            ><span><i class=\"bx bxs-user\"></i></span> Username</label\r\n");
      out.write("          >\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"txt_field\">\r\n");
      out.write("           <input type=\"password\" name=\"password\" required />\r\n");
      out.write("          <label\r\n");
      out.write("            ><span><i class=\"bx bxs-lock-alt\"></i></span> Password</label\r\n");
      out.write("          >\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"pass\">Forgot Password?</div>\r\n");
      out.write("        <input type=\"submit\" value=\"Login\" />\r\n");
      out.write("        <div class=\"signup_link\">\r\n");
      out.write("          Not a member? <a href=\"register.jsp\">Signup</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\" >\r\n");
      out.write("   \r\n");
      out.write("   <script>\r\n");
      out.write("      var status = document.getElementById(\"status\").value;\r\n");
      out.write("      if(status == \"failed\"){\r\n");
      out.write("         swal(\"Sorry\", \"Wrong Username or Password\", \"error\");        \r\n");
      out.write("      }\r\n");
      out.write("      else if(status == \"invalidEmail\"){\r\n");
      out.write("         swal(\"Sorry\", \"Please enter your username\", \"error\");        \r\n");
      out.write("      }\r\n");
      out.write("      else if(status == \"invalidUpwd\"){\r\n");
      out.write("         swal(\"Sorry\", \"Please enter your password\", \"error\");        \r\n");
      out.write("      }\r\n");
      out.write("   </script>\r\n");
      out.write("   \r\n");
      out.write("  </body>\r\n");
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
