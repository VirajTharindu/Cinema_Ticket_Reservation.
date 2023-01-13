<%
   if (session.getAttribute("name") == null){
      response.sendRedirect("http://localhost:8080/ABC_Cinema/admin/adminLogin.jsp");
   }
%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.abc.dbconnector.ConnectionProvider"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
   Connection con = ConnectionProvider.getCon();
   Statement st = con.createStatement();

   String qry = "SELECT * FROM reviews";

   ResultSet rs = st.executeQuery(qry);
%>

<!DOCTYPE html>
<html lang="en">

   <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>User Reviews</title>
      <link rel="stylesheet" href="style.css">
      <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css" rel="stylesheet">
      
   </head>
   <style>
    
   </style>
   <body>
      <ul class="menu">

         <h1><img src="https://www.shareicon.net/data/256x256/2016/04/14/492851_admin_256x256.png"
                  alt="" width="40" style="border-radius: 10px;margin-left: 8px;margin-top: 1rem;"> </h1>
         <b class="b">ADMIN</b>
         <i class="i">Space</i>
         <hr>
               <div class="text">
            <li class="item" style="background-color: #AB263A"><a href="adminHome.jsp"><i class="fas fa-home"></i>Home</a></li>
            <li class="item"><a href="userAccounts.jsp"><i class="fa fa-user" aria-hidden="true"></i>User Accounts</a>
            </li>
            <li class="item"><a href="updateMovies.jsp"><i class="fa fa-film" aria-hidden="true"></i> Update Movies</a></li> 
            <li class="item"><a href="userReviews.jsp"><i class="fa fa-comments" aria-hidden="true"></i>User Reviews</a></li> 
            <li class="item" style="background-image: linear-gradient(to right, black, rgba(255,0,0,0)); border: 3px solid black;"><a href="../../AdminLogout"><i class='bx bx-log-out'></i> Logout</a></li> 
        </div>
      </ul>

      <br>
      <h1 style="text-transform: uppercase;" class="h">User Reviews</h1>
      <br>

      <div class="container">
         <table border="1" id="datatable">
               <tbody>
                  <tr>
                     <th>count</th>
                     <th>Name</th>
                     <th>Email</th>                    
                     <th>Mobile</th>
                     <th>Description</th>
                  </tr>

                  <%
                     while (rs.next()) {
                        // out.println("\n"+rs.getString(2)+"\n");
                        // out.println("\n"+rs.(4)+"\n");
                  %>
                        <tr>
                           <td><%=rs.getString("count")%></td>
                           <td><%=rs.getString("name")%></td>
                           <td><%=rs.getString("email")%></td>
                           <td><%=rs.getString("mobile")%></td>
                           <td><%=rs.getString("description")%></td>                  
                        </tr>
               </tbody>
               <%
                  }
               %>
            </table>
      </div>
   </body>

</html>
