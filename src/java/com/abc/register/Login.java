/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.register;

import com.abc.dbconnector.ConnectionProvider;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
  
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      
      String uemail = request.getParameter("username");
      String upwd = request.getParameter("password");
      HttpSession session = request.getSession();
      RequestDispatcher dispatcher = null;   
      
   if(upwd.equals(null) || uemail.equals("")){
      session.setAttribute("status", "invalidEmail");
      response.sendRedirect("register/login.jsp?status=invalidEmail");
   }
   if(upwd.equals(null) || upwd.equals("")){
      session.setAttribute("status", "invalidUpwd");
      response.sendRedirect("register/login.jsp?status=invalidUpwd");
   }
      
      try {
          Connection con = ConnectionProvider.getCon();
          PreparedStatement pst = con.prepareStatement("SELECT * FROM users WHERE uemail = ? AND upwd = ?");
          pst.setString(1, uemail);
          pst.setString(2, upwd);
          ResultSet rs = pst.executeQuery();
          
          if(rs.next()){
              session.setAttribute("name", rs.getString("uname"));
              session.setAttribute("email", rs.getString("uemail"));
              session.setAttribute("pwd", rs.getString("upwd"));
              session.setAttribute("mobile", rs.getString("umobile"));
              session.setAttribute("id", rs.getString("uid"));
              response.sendRedirect("user/userprofile.jsp?name=rs.getString(\"uname\")");    
          }else{
             request.setAttribute("status", "failed");
             response.sendRedirect("register/login.jsp?status=failed");            
          }      
          
      }catch(SQLException e){
          e.printStackTrace();
      }
   }
}
