package org.apache.jsp.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <head>\r\n");
      out.write("      <meta charset=\"UTF-8\" />\r\n");
      out.write("      <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("      <title>Movies</title>\r\n");
      out.write("\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"home.css\" />\r\n");
      out.write("      <link\r\n");
      out.write("         rel=\"stylesheet\"\r\n");
      out.write("         href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\"\r\n");
      out.write("         />\r\n");
      out.write("      <link\r\n");
      out.write("         rel=\"stylesheet\"\r\n");
      out.write("         href=\"https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.css\"\r\n");
      out.write("         />\r\n");
      out.write("   </head>\r\n");
      out.write("   <body>\r\n");
      out.write("      <!-- Navbar -->\r\n");
      out.write("      <header>\r\n");
      out.write("         <a href=\"\" class=\"logo\"> <i class=\"bx bxs-movie\"></i>ABC Cinema </a>\r\n");
      out.write("\r\n");
      out.write("         <div class=\"bx bx-menu\" id=\"menu-icon\"></div>\r\n");
      out.write("         <ul class=\"navbar\">\r\n");
      out.write("            <li><a href=\"#home\" class=\"home-active\">Movies</a></li>\r\n");
      out.write("            <li><a href=\"#AboutUs\">About Us</a></li>\r\n");
      out.write("            <li><a href=\"#ContactUs\">Contact Us</a></li>\r\n");
      out.write("            <li style=\"background-color: orange; padding: 5px;border-radius: 5px;\"><a href=\"../user_review/review.jsp\"><i class='bx bxs-star bx-flashing' ></i> Review</a></li>\r\n");
      out.write("         </ul>\r\n");
      out.write("         <a href=\"http://localhost:8080/ABC_Cinema/register/login.jsp\" class=\"button\">Sign In</a>\r\n");
      out.write("      </header>\r\n");
      out.write("      <!-- Top Section -->\r\n");
      out.write("      <section class=\"home swiper\" id=\"home\">\r\n");
      out.write("         <div class=\"swiper-wrapper\">\r\n");
      out.write("            <div class=\"swiper-slide container\">\r\n");
      out.write("               <img src=\"Assets/images/home1.jpg\" alt=\"\" srcset=\"\" />\r\n");
      out.write("               <div class=\"home-text\">\r\n");
      out.write("                  <span></span>\r\n");
      out.write("                  <h1>John Wick :<br />Chapter 4</h1>\r\n");
      out.write("                  <br />\r\n");
      out.write("                  <a href=\"#\" class=\"button\">Book Now</a>\r\n");
      out.write("                  <a href=\"#\" class=\"play\">\r\n");
      out.write("                     <i class=\"bx bx-play\"></i>\r\n");
      out.write("                  </a>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"swiper-slide container\">\r\n");
      out.write("               <img src=\"Assets/images/home2.jpg\" alt=\"\" srcset=\"\" />\r\n");
      out.write("               <div class=\"home-text\">\r\n");
      out.write("                  <span></span>\r\n");
      out.write("                  <h1>\r\n");
      out.write("                     Tranformers : <br />\r\n");
      out.write("                     Rise of the Beasts\r\n");
      out.write("                  </h1>\r\n");
      out.write("                  <br />\r\n");
      out.write("                  <a href=\"#\" class=\"button\">Book Now</a>\r\n");
      out.write("                  <a href=\"#\" class=\"play\">\r\n");
      out.write("                     <i class=\"bx bx-play\"></i>\r\n");
      out.write("                  </a>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"swiper-slide container\">\r\n");
      out.write("               <img src=\"Assets/images/O1.jpg\" alt=\"\" srcset=\"\" />\r\n");
      out.write("               <div class=\"home-text\">\r\n");
      out.write("                  <span></span>\r\n");
      out.write("                  <h1>Oppenheimer</h1>\r\n");
      out.write("                  <br />\r\n");
      out.write("                  <a href=\"#\" class=\"button\">Book Now</a>\r\n");
      out.write("                  <a href=\"#\" class=\"play\">\r\n");
      out.write("                     <i class=\"bx bx-play\"></i>\r\n");
      out.write("                  </a>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"swiper-slide container\">\r\n");
      out.write("               <img src=\"Assets/images/Pathaan2.jpg\" alt=\"\" srcset=\"\" />\r\n");
      out.write("               <div class=\"home-text\">\r\n");
      out.write("                  <span></span>\r\n");
      out.write("                  <h1>Pathaan</h1>\r\n");
      out.write("                  <br />\r\n");
      out.write("                  <a href=\"#\" class=\"button\">Book Now</a>\r\n");
      out.write("                  <a href=\"#\" class=\"play\">\r\n");
      out.write("                     <i class=\"bx bx-play\"></i>\r\n");
      out.write("                  </a>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"swiper-button-next\"></div>\r\n");
      out.write("         <div class=\"swiper-button-prev\"></div>\r\n");
      out.write("         <div class=\"swiper-pagination\"></div>\r\n");
      out.write("         <div class=\"swiper-pagination\"></div>\r\n");
      out.write("      </section>\r\n");
      out.write("      <!-- Movies -->\r\n");
      out.write("      <section class=\"movies\" id=\"movies\">\r\n");
      out.write("         <h2 class=\"heading\">Now Playing</h2>\r\n");
      out.write("         <div class=\"movies-container\">\r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("               <div class=\"box-img\">\r\n");
      out.write("                  <a href=\"../movies/now-playing/index1.jsp\"><img src=\"Assets/images/m1.jpg\" alt=\"\" /></a>\r\n");
      out.write("               </div>\r\n");
      out.write("               <h3>John Wick :<br />Chapter 4</h3>\r\n");
      out.write("               <span>120 min | Action</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("               <div class=\"box-img\">\r\n");
      out.write("                  <a href=\"../movies/now-playing/index6.jsp\"><img src=\"Assets/images/m2.jpg\" alt=\"\" /></a>\r\n");
      out.write("               </div>\r\n");
      out.write("               <h3>Transformers : <br />Rise of the Beasts</h3>\r\n");
      out.write("               <span>120 min | Action</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("               <div class=\"box-img\">\r\n");
      out.write("                  <a href=\"../movies/now-playing/index3.jsp\"><img src=\"Assets/images/O2.jpeg\" alt=\"\" /></a>\r\n");
      out.write("               </div>\r\n");
      out.write("               <h3>Oppenheimer</h3>\r\n");
      out.write("               <span>120 min | Action</span>\r\n");
      out.write("            </div>\r\n");
      out.write("             <div class=\"box\">\r\n");
      out.write("               <div class=\"box-img\">\r\n");
      out.write("                  <a href=\"../movies/now-playing/index5.jsp\"><img src=\"Assets/images/spiderman.jpg\" alt=\"\" /></a>\r\n");
      out.write("               </div>\r\n");
      out.write("               <h3>Spider-Man</h3>\r\n");
      out.write("               <span>120 min | Action</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("               <div class=\"box-img\">\r\n");
      out.write("                  <a href=\"../movies/now-playing/index4.jsp\"><img src=\"Assets/images/Pathaan1.jpg\" alt=\"\" /></a>\r\n");
      out.write("               </div>\r\n");
      out.write("               <h3>Pathaan</h3>\r\n");
      out.write("               <span>120 min | Action</span>\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("               <div class=\"box-img\">\r\n");
      out.write("                  <a href=\"../movies/now-playing/index2.jsp\"><img src=\"Assets/images/missionImpossible.jpg\" alt=\"\" /></a>\r\n");
      out.write("               </div>\r\n");
      out.write("               <h3>Mission Impossible</h3>\r\n");
      out.write("               <span>120 min | Action</span>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("      <section class=\"upcoming\" id=\"upcoming\">\r\n");
      out.write("         <h1 class=\"heading\">Coming Soon</h1>\r\n");
      out.write("         <div class=\"upcoming-container swiper\">\r\n");
      out.write("            <div class=\"swiper-wrapper\">\r\n");
      out.write("               <div class=\"swiper-slide box\">\r\n");
      out.write("                  <div class=\"box-img\">\r\n");
      out.write("                     <a href=\"../movies/upcoming/index5.jsp\"><img src=\"Assets/images/barbie.jpg\" alt=\"\" id=\"\" /></a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <h3>Barbie</h3>\r\n");
      out.write("                  <span>Comedy | Fantasy</span>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"swiper-slide box\">\r\n");
      out.write("                  <div class=\"box-img\">\r\n");
      out.write("                     <a href=\"../movies/upcoming/index3.jsp\"><img src=\"Assets/images/salaar.jpg\" alt=\"\" /></a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <h3>Salaar</h3>\r\n");
      out.write("                  <span>Action | Adventure | Thriller</span>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"swiper-slide box\">\r\n");
      out.write("                  <div class=\"box-img\">\r\n");
      out.write("                     <a href=\"../movies/upcoming/index4.jpg\"><img src=\"Assets/images/vaathi.png\" alt=\"\" /></a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <h3>Vaathi</h3>\r\n");
      out.write("                  <span>Drama | Romance | Action</span>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"swiper-slide box\">\r\n");
      out.write("                  <div class=\"box-img\">\r\n");
      out.write("                     <a href=\"../movies/upcoming/\"><img src=\"Assets/images/\" alt=\"\" /></a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <h3></h3>\r\n");
      out.write("                  <span>120 min | Action</span>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"swiper-slide box\">\r\n");
      out.write("                  <div class=\"box-img\">\r\n");
      out.write("                     <a href=\"../movies/upcoming/\"><img src=\"Assets/images/\" alt=\"\" /></a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <h3></h3>\r\n");
      out.write("                  <span>120 min | Action</span>\r\n");
      out.write("               </div>                 \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"swiper-button-next\"></div>\r\n");
      out.write("            <div class=\"swiper-button-prev\"></div>\r\n");
      out.write("            <div class=\"swiper-pagination\"></div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("      <!-- Footer -->\r\n");
      out.write("      <section class=\"footer\">\r\n");
      out.write("         <a hret=\"#\" class=\"logo\"> <i class=\"bx bxs-movie\"></i> ABC Cinema </a>\r\n");
      out.write("         <div class=\"social\">\r\n");
      out.write("            <a href=\"#\"><i class=\"bx bxl-facebook\"></i></a>\r\n");
      out.write("            <a href=\"#\"><i class=\"bx bxl-twitter\"></i></a>\r\n");
      out.write("            <a href=\"#\"><i class=\"bx bxl-instagram\"></i></a>\r\n");
      out.write("            <a href=\"#\"><i class=\"bx bxl-tiktok\"></i></a>\r\n");
      out.write("         </div>\r\n");
      out.write("      </section>\r\n");
      out.write("      <script src=\"https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.js\"></script>\r\n");
      out.write("      <script src=\"main.js\"></script>\r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");



      out.write('\r');
      out.write('\n');
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
