<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.abc.dbconnector.ConnectionProvider"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
   if (session.getAttribute("name") == null){
      response.sendRedirect("http://localhost:8080/ABC_Cinema/register/login.jsp");
   }
%>

<%
   Connection con = ConnectionProvider.getCon();
   Statement st = con.createStatement();
   String uid = (String)session.getAttribute("id");
   String uemail = (String)session.getAttribute("email");
   String upwd = (String)session.getAttribute("pwd");
   String uname = (String)session.getAttribute("name"); 
   String umobile = (String)session.getAttribute("mobile");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Profile</title>
        <link rel="stylesheet" href="userprofile.css">
        <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
        
        <link
         rel="stylesheet"
         href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css"
         />
      <link
         rel="stylesheet"
         href="https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.css"
         />
      
    </head>
    
    <body>
        
        <input type="checkbox" id="check">
        <label for ="check">
            <i class="fas  fa-bars" id="btn"></i>
            <i class="fas  fa-times" id="cancel"></i>
            
        </label>
        
        <div class="sidebar">
            <header>
            
                
                
                <img src="images/pp.png" alt="" class="centerpp"/>
                <div class ="pp">
                    <h1><b><%=session.getAttribute("name")%></b></h1>
                </div>
                
            </header>
            <ul>
                <li><a href="#">Home </a></li>
                <li><a href="#">Booking </a></li>
                <li><a href="#">Payment </a></li>
                <!--<li><a href="#">Seat Selection </a></li>-->
<!--                <li><a href="#">Current Movies </a></li>
                <li><a href="#">Upcoming Movies </a></li>-->
                <li><a href="../register/forgotPassword.jsp">Change Password </a></li>
                <li><a href="../Logout">Sign Out </a></li>
            </ul>

        </div>    
        
        <section>
            
            <table id="t01" class="center">
  <tr>
      
    <th>Register Number</th>
    <th>User Name</th>		
    <th>Password </th>
    <th>E-Mail</th>
    <th>Contact Number</th>
    
  </tr>
       <tr>
            <td><%= uid %></td>
            <td><%= uname %></td>            
            <td><%= upwd %></td>
            <td><%= uemail %></td>
            <td><%= umobile %></td>
  <br>
 

            </table>
            
            <br>
            
            <div class="ch">
            <a href="#"><h2 style="color: white;">Need to change User Details?</h2></></a>
            </div>
            
            
            <br>
            <br>
            <br>
            
            
            
            
          
            <hr>
            <hr>
            
            
           
            
            
            
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>


            
            
            
           
            
            
      <table id="t01" class="center">
  <tr>
    <th>Movie Number</th>
    <th>Movie Name</th>		
    <th>Show Time</th>
    <th>Seat Num</th>
    <th>Ticket Price</th>
  </tr>
  <tr>
    <td><%=request.getParameter("movienum")%></td>
    <td><%=request.getParameter("moviename")%></td>		
    <td><%=request.getParameter("time")%></td>
    <td><%=request.getParameter("seat")%></td>
    <td><%=request.getParameter("seat")%></td>
    
    
  </tr>
  <tr>
    <td><%=request.getParameter("movienum")%></td>
    <td><%=request.getParameter("moviename")%></td>		
    <td><%=request.getParameter("time")%></td>
    <td><%=request.getParameter("seat")%></td>
    <td><%=request.getParameter("seat")%></td>
    
  </tr>
  <tr>
    <td><%=request.getParameter("movienum")%></td>
    <td><%=request.getParameter("moviename")%></td>		
    <td><%=request.getParameter("time")%></td>
    <td><%=request.getParameter("seat")%></td>
    <td><%=request.getParameter("seat")%></td>
    
  </tr>
</table>      
            
                        <br>
                        <div class ="ch">
                        <a href="#"><h2 style="color: white">Need to change Booking Details?</h2></a>
                        </div>
 
        </section>
<!-- 
    <script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script>-->
        
    </body>
</html>
