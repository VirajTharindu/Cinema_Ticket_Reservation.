/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.book;

import com.abc.dbconnector.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shami
 */
public class AddToDB extends HttpServlet {
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      PrintWriter out = response.getWriter();
      HttpSession session = request.getSession();
      String uemail = (String) session.getAttribute("email");
      String date = (String)session.getAttribute("date");
      String uname = (String) session.getAttribute("name"); 
      int seat = (int) session.getAttribute("seat");
      Connection con = null;
//      out.print(uemail);
//      out.print(seat);
//      out.print(uname);
//      out.print(date);
   try{
         con = ConnectionProvider.getCon();
         PreparedStatement pst = con.prepareStatement("INSERT INTO bookings(name, email, date, seat) VALUES(?,?,?,?)");
         pst.setString(1, uname);
         pst.setString(2, uemail);
         pst.setString(3, date);
         pst.setInt(4, seat);

         int rowCount = pst.executeUpdate();
         
         if(rowCount > 0){
//            request.setAttribute("status", "success");
            response.sendRedirect("bookings/book.jsp");
         }else{
//            request.setAttribute("status", "failed");
//            response.sendRedirect("register/register.jsp?status=failed");
               out.print("Something went wrong");
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
