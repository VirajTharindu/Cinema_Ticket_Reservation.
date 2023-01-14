package org.apache.jsp.bookings;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class seat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("    <title>Movie Seat Booking</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("     <header>\n");
      out.write("         <a href=\"\" class=\"logo\"> <i class=\"bx bxs-movie\"></i>Movies </a>\n");
      out.write("\n");
      out.write("         <div class=\"bx bx-menu\" id=\"menu-icon\"></div>\n");
      out.write("         <ul class=\"navbar\">\n");
      out.write("            <li><a href=\"/../ABC_Cinema/home/home.jsp\" class=\"home-active\">Home</a></li>\n");
      out.write("            <li><a href=\"#AboutUs\">About Us</a></li>\n");
      out.write("            <li><a href=\"#ContactUs\">Contact Us</a></li>\n");
      out.write("         </ul>\n");
      out.write("         <a href=\"#\" class=\"button\">Sign In</a>\n");
      out.write("      </header>\n");
      out.write("     \n");
      out.write("    <div class=\"movie-container\">\n");
      out.write("      <label>Pick a movie:</label>\n");
      out.write("      <select id=\"movie\">\n");
      out.write("        <option value=\"10\">Avengers: Endgame ($10)</option>\n");
      out.write("        <option value=\"12\">Joker ($12)</option>\n");
      out.write("        <option value=\"8\">Toy Story 4 ($8)</option>\n");
      out.write("        <option value=\"9\">The Lion King ($9)</option>\n");
      out.write("      </select>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <ul class=\"showcase\">\n");
      out.write("      <li>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <small>N/A</small>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("      <li>\n");
      out.write("        <div class=\"seat selected\"></div>\n");
      out.write("        <small>Selected</small>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("      <li>\n");
      out.write("        <div class=\"seat occupied\"></div>\n");
      out.write("        <small>Occupied</small>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("       <div class=\"screen\"><p style=\"color: black;\">This side is the screen.</p></div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("        <div class=\"seat\"></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <p class=\"text\">\n");
      out.write("      You have selected <span id=\"count\">0</span> seats for a price of $<span id=\"total\">0</span>\n");
      out.write("    </p>\n");
      out.write("    \n");
      out.write("     <!-- Footer -->\n");
      out.write("      <section class=\"footer\">\n");
      out.write("         <a hret=\"#\" class=\"logo\"> <i class=\"bx bxs-movie\"></i> Movies </a>\n");
      out.write("         <div class=\"social\">\n");
      out.write("            <a href=\"#\"><i class=\"bx bxl-facebook\"></i></a>\n");
      out.write("            <a href=\"#\"><i class=\"bx bxl-twitter\"></i></a>\n");
      out.write("            <a href=\"#\"><i class=\"bx bxl-instagram\"></i></a>\n");
      out.write("            <a href=\"#\"><i class=\"bx bxl-tiktok\"></i></a>\n");
      out.write("         </div>\n");
      out.write("      </section>\n");
      out.write("    <script src=\"script.js\"></script>\n");
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
