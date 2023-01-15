/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.book;

import com.abc.dbconnector.ConnectionProvider;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.*;

public class Book extends HttpServlet {
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      String email = request.getParameter("email");
      String name = request.getParameter("name");
      String price = request.getParameter("movies");
      String date = request.getParameter("date");
      String seat = request.getParameter("seat");
      HttpSession session = request.getSession();
      RequestDispatcher dispatcher = null;
      
      session.setAttribute("email", email);
      PrintWriter out = response.getWriter();
//      out.println(seat);
//      out.println(date);
//      out.print(movie);
      
      int allSeat = Integer.parseInt(seat);
      int cost = Integer.parseInt(price);
      int fullPrice = allSeat * cost;
//      out.print(fullPrice);
      session.setAttribute("price", fullPrice);
      session.setAttribute("seat", allSeat);
      session.setAttribute("name", name);
      session.setAttribute("email", email);
      session.setAttribute("eachPrice", cost);
      session.setAttribute("date", date);
      response.sendRedirect("bookings/payment.jsp?price=fullPrice");
   }
}
