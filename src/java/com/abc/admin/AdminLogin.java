/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.admin;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shami
 */

public class AdminLogin extends HttpServlet {
 
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      
      String uname = request.getParameter("username");
      String upwd = request.getParameter("password");
      HttpSession session = request.getSession();
      RequestDispatcher dispatcher = null;   
      
   if(upwd.equals(null) || uname.equals("")){
      session.setAttribute("status", "invalidEmail");
      response.sendRedirect("register/login.jsp?status=invalidEmail");
   }
   if(upwd.equals(null) || upwd.equals("")){
      session.setAttribute("status", "invalidUpwd");
      response.sendRedirect("register/login.jsp?status=invalidUpwd");
   }
      
      try {
//          Connection con = ConnectionProvider.getCon();
//          PreparedStatement pst = con.prepareStatement("SELECT * FROM users WHERE uemail = ? AND upwd = ?");
//          pst.setString(1, uname);
//          pst.setString(2, upwd);
//          ResultSet rs = pst.executeQuery();
          
          if(uname.equals("admin") && upwd.equals("admin1234")){
              session.setAttribute("name", "uname");
              response.sendRedirect("admin/admin_home/adminHome.jsp");    
          }else{
             request.setAttribute("status", "failed");
             response.sendRedirect("admin/adminLogin.jsp?status=failed");            
          }      
          
      }catch(Exception e){
          e.printStackTrace();
      }
   }
}
