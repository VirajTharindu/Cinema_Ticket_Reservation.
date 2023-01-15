package org.apache.jsp.seat_005fbooking;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" />\r\n");
      out.write("    <title>Movie Seat Booking</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"movie-container\">\r\n");
      out.write("      <label>Pick a movie:</label>\r\n");
      out.write("      <select id=\"movie\">\r\n");
      out.write("        <option value=\"10\">Avengers: Endgame ($10)</option>\r\n");
      out.write("        <option value=\"12\">Joker ($12)</option>\r\n");
      out.write("        <option value=\"8\">Toy Story 4 ($8)</option>\r\n");
      out.write("        <option value=\"9\">The Lion King ($9)</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"showcase\">\r\n");
      out.write("      <li>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <small>N/A</small>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("      <li>\r\n");
      out.write("        <div class=\"seat selected\"></div>\r\n");
      out.write("        <small>Selected</small>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("      <li>\r\n");
      out.write("        <div class=\"seat occupied\"></div>\r\n");
      out.write("        <small>Occupied</small>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"screen\"></div>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("        <div class=\"seat\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <p class=\"text\">\r\n");
      out.write("      You have selected <span id=\"count\">0</span> seats for a price of $<span id=\"total\">0</span>\r\n");
      out.write("    </p>\r\n");
      out.write("    <script src=\"script.js\"></script>\r\n");
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
