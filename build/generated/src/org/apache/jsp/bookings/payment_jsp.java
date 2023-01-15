package org.apache.jsp.bookings;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
 
   String price = (String)session.getAttribute("price");
   int cost = Integer.parseInt(price);

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Paypal Payment</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <main id=\"cart-main\">\n");
      out.write("        <div class=\"site-title text-center\">\n");
      out.write("            <h1 class=\"font-title\">Shopping Cart</h1>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"grid\">\n");
      out.write("                <div class=\"col-1\">\n");
      out.write("                    <div class=\"flex item justify-content-between\">\n");
      out.write("                        <div class=\"flex\">\n");
      out.write("                            <div class=\"img text-center\">\n");
      out.write("                                <img src=\"./assets/pro1.png\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"title\">\n");
      out.write("                                <h3>Canon EOS 1500D</h3>\n");
      out.write("                                <span>Electronics</span>\n");
      out.write("\n");
      out.write("                                <div class=\"buttons\">\n");
      out.write("                                    <button type=\"submit\"><i class=\"fas fa-chevron-up\"></i> </button>\n");
      out.write("                                    <input type=\"text\" class=\"font-title\" value=\"1\">\n");
      out.write("                                    <button type=\"submit\"><i class=\"fas fa-chevron-down\"></i> </button>\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"#\">Save for later</a> |\n");
      out.write("                                <a href=\"#\">Delete From Cart</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"price\">\n");
      out.write("                            <h4 class=\"text-red\">");
      out.print( cost );
      out.write("</h4>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-2\">\n");
      out.write("                    <div class=\"subtotal text-center\">\n");
      out.write("                        <h3>Price Details</h3>\n");
      out.write("\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"flex justify-content-between\">\n");
      out.write("                                <label for=\"price\">Products ( 3 items ) : </label>\n");
      out.write("                                <span>$399</span>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"flex justify-content-between\">\n");
      out.write("                                <label for=\"price\">Delivery Charges : </label>\n");
      out.write("                                <span>Free</span>\n");
      out.write("                            </li>\n");
      out.write("                            <hr>\n");
      out.write("                            <li class=\"flex justify-content-between\">\n");
      out.write("                                <label for=\"price\">Amout Payble : </label>\n");
      out.write("                                <span class=\"text-red font-title\">$399</span>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div id=\"paypal-payment-button\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"https://www.paypal.com/sdk/js?client-id=ATqJoT8uledW83BN2RvdA4o9tptMnGw4EUVlV1na6YHhKgqXEHcJXE8t0EZLGsDr4mybfMJ5nXxL10vQ&disable-funding=credit,card\"></script>\n");
      out.write("    <script src=\"index.js\"></script>\n");
      out.write("</body>\n");
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
