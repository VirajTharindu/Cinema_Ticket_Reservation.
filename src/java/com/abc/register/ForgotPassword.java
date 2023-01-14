/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.register;

import com.abc.dbconnector.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shami
 */
public class ForgotPassword extends HttpServlet {

  
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      String email = request.getParameter("email");
      String mobile = request.getParameter("mobile");
      String newpassword = request.getParameter("newpwd");         

int check=0;

try{
        Connection con= ConnectionProvider.getCon();
        Statement st = con.createStatement();
        ResultSet rs= st.executeQuery("SELECT * FROM users WHERE uemail='"+email+"' and umobile='"+mobile+"' ");
        
        while(rs.next()){
            check=1;
            st.executeUpdate("UPDATE users SET upwd='"+newpassword+"' WHERE uemail='"+email+"'");
            response.sendRedirect("register/forgotPassword.jsp?status=success");
        }
        if(check==0){
            response.sendRedirect("register/forgotPassword.jsp?status=failed");
        }
        
}catch(Exception e){
    System.out.print(e);
}
   }
}
