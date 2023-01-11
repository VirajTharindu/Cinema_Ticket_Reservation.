
package com.abc.admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shami
 */
public class AdminLogout extends HttpServlet {
  @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      HttpSession session = request.getSession(false);
		if (session != null) {
			session.removeAttribute("uname");
            }
//     session.invalidate();
     response.sendRedirect("admin/adminLogin.jsp");
   }   
}
