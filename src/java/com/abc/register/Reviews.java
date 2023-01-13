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
public class Reviews extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
     
       String uname = request.getParameter("name");
       String udesc = request.getParameter("description");
       String uemail = request.getParameter("email");
       String umobile = request.getParameter("mobile");
      HttpSession session = request.getSession();
       Connection con = null;
//       response.setContentType("jsp");

       try{
         con = ConnectionProvider.getCon();
         PreparedStatement pst = con.prepareStatement("INSERT INTO reviews(name, email, mobile, description) VALUES(?,?,?,?)");
         pst.setString(1, uname);
         pst.setString(2, uemail);         
         pst.setString(3, umobile);
         pst.setString(4, udesc);
         int rowCount = pst.executeUpdate();
         
         if(rowCount > 0){
            request.setAttribute("status", "success");
            response.sendRedirect("user_review/review.jsp?status=success");
         }else{
            request.setAttribute("status", "failed");
            response.sendRedirect("user_review/review.jsp?status=failed");
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
