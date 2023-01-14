
package com.abc.register;

import com.abc.dbconnector.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shami
 */
@WebServlet(urlPatterns = {"/Register"})
public class Register extends HttpServlet {

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

       PrintWriter out = response.getWriter();
       RequestDispatcher dispatcher = null ;

       String uname = request.getParameter("name");
       String upwd = request.getParameter("pwd");
       String uemail = request.getParameter("email");
       String umobile = request.getParameter("contact");
       HttpSession session = request.getSession();
       Connection con = null;
//       response.setContentType("jsp");

      if(upwd.equals(null) || uemail.equals("")){
         session.getAttribute(uname);
         response.sendRedirect("register/login.jsp?status=invalidEmail");
      }


       try{
         con = ConnectionProvider.getCon();
         PreparedStatement pst = con.prepareStatement("INSERT INTO users(uname, uemail, upwd, umobile) VALUES(?,?,?,?)");
         pst.setString(1, uname);
         pst.setString(2, uemail);
         pst.setString(3, upwd);
         pst.setString(4, umobile);

         int rowCount = pst.executeUpdate();
         
         if(rowCount > 0){
            request.setAttribute("status", "success");
            response.sendRedirect("register/register.jsp?status=success");
         }else{
            request.setAttribute("status", "failed");
            response.sendRedirect("register/register.jsp?status=failed");
         }
         
       }catch(Exception e){
          e.printStackTrace();
       }finally{
         try {
            con.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
       }
   }
}
