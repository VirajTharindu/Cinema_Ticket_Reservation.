package org.apache.jsp.user_005freview;

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <title>Star Rating Form | CodingNepal</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"index.css\" />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"\n");
      out.write("    />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"post\">\n");
      out.write("        <div class=\"text\">Thanks for rating us!</div>\n");
      out.write("        <div class=\"edit\">EDIT</div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"user-info\"></div>\n");
      out.write("\n");
      out.write("      <div class=\"star-widget\">\n");
      out.write("        <form action=\"#\">\n");
      out.write("          <input type=\"radio\" name=\"rate\" value=\"5\" id=\"rate-5\" />\n");
      out.write("          <label for=\"rate-5\" class=\"fas fa-star\"></label>\n");
      out.write("          <input type=\"radio\" name=\"rate\" value=\"4\" id=\"rate-4\" />\n");
      out.write("          <label for=\"rate-4\" class=\"fas fa-star\"></label>\n");
      out.write("          <input type=\"radio\" name=\"rate\" value=\"3\" id=\"rate-3\" />\n");
      out.write("          <label for=\"rate-3\" class=\"fas fa-star\"></label>\n");
      out.write("          <input type=\"radio\" name=\"rate\" value=\"2\" id=\"rate-2\" />\n");
      out.write("          <label for=\"rate-2\" class=\"fas fa-star\"></label>\n");
      out.write("          <input type=\"radio\" name=\"rate\" value=\"1\" id=\"rate-1\" />\n");
      out.write("          <label for=\"rate-1\" class=\"fas fa-star\"></label>\n");
      out.write("\n");
      out.write("          <header></header>\n");
      out.write("          <div class=\"textarea\">\n");
      out.write("            <textarea\n");
      out.write("              cols=\"30\"\n");
      out.write("              placeholder=\"Describe your experience..\"\n");
      out.write("            ></textarea>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"btn\">\n");
      out.write("            <button type=\"submit\">Post</button>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("      const btn = document.querySelector(\"button\");\n");
      out.write("      const post = document.querySelector(\".post\");\n");
      out.write("      const widget = document.querySelector(\".star-widget\");\n");
      out.write("      const editBtn = document.querySelector(\".edit\");\n");
      out.write("      btn.onclick = () => {\n");
      out.write("        widget.style.display = \"none\";\n");
      out.write("        post.style.display = \"block\";\n");
      out.write("        editBtn.onclick = () => {\n");
      out.write("          widget.style.display = \"block\";\n");
      out.write("          post.style.display = \"none\";\n");
      out.write("        };\n");
      out.write("        return false;\n");
      out.write("      };\n");
      out.write("    </script>\n");
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
