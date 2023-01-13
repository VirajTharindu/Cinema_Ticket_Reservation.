package org.apache.jsp.register;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgotPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <title>Register Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"login.css\" />\n");
      out.write("\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.css\"  \n");
      out.write("    />\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("       \n");
      out.write("       .center{\n");
      out.write("          margin-top: 0.1rem;\n");
      out.write("       }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("     \n");
      out.write("     <input type=\"hidden\" id=\"status\" value=\"");
      out.print( request.getParameter("status") );
      out.write("\">\n");
      out.write("     \n");
      out.write("    <header>\n");
      out.write("      <a href=\"\" class=\"logo\"> <i class=\"bx bxs-movie\"></i>Movies </a>\n");
      out.write("\n");
      out.write("      <div class=\"bx bx-menu\" id=\"menu-icon\"></div>\n");
      out.write("      <ul class=\"navbar\">\n");
      out.write("        <li><a href=\"#home\" class=\"\">Home</a></li>\n");
      out.write("        <li><a href=\"#AboutUs\">About Us</a></li>\n");
      out.write("        <li><a href=\"#ContactUs\">Contact Us</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <a href=\"login.jsp\" class=\"button\">Sign In</a>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"center\">\n");
      out.write("      <h1>Register</h1>\n");
      out.write("      <form method=\"post\" action=\"../ForgotPassword\" style=\"margin-top: -10px;\">\n");
      out.write("        <div class=\"txt_field\">\n");
      out.write("          <input type=\"text\" name=\"email\" required />\n");
      out.write("          <label\n");
      out.write("            ><span><i class=\"bx bxs-user\"></i></span> Email</label\n");
      out.write("          >\n");
      out.write("        </div>\n");
      out.write("        <div class=\"txt_field\">\n");
      out.write("          <input type=\"password\" name=\"newpwd\" required />\n");
      out.write("          <label\n");
      out.write("            ><span><i class=\"bx bxs-lock-alt\"></i></span> Password</label\n");
      out.write("          >\n");
      out.write("        </div>     \n");
      out.write("        <div class=\"txt_field\">\n");
      out.write("          <input type=\"email\" name=\"mobile\" required />\n");
      out.write("\n");
      out.write("          <label\n");
      out.write("            ><span><i class=\"bx bxs-envelope\"></i></span> Mobile</label\n");
      out.write("          >\n");
      out.write("        </div>       \n");
      out.write("         <div class=\"signup_link\">\n");
      out.write("          Back to Login ? <a href=\"login.jsp\">Sign In</a>\n");
      out.write("         </div>\n");
      out.write("        <input type=\"submit\" value=\"Continue\" onclick=\"fun()\" />      \n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("   <script src=\"vendor/jquery/jquery.min.js\"></script>  \n");
      out.write("   <script src=\"js/main.js\"></script> \n");
      out.write("   <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("   <link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\" >\n");
      out.write("   \n");
      out.write("   <script>\n");
      out.write("      var status = document.getElementById(\"status\").value;\n");
      out.write("      if(status == \"success\"){\n");
      out.write("         swal(\"Congrats\", \"Account Updated successfully\", \"success\"); \n");
      out.write("      }else{\n");
      out.write("         swal(\"Sorry\", \"Wrong Username or Password\", \"error\");\n");
      out.write("      }\n");
      out.write("   </script>\n");
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
