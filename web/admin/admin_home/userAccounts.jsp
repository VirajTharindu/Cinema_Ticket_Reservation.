
<%@page import="java.sql.ResultSet"%>
<%@page import="com.abc.dbconnector.ConnectionProvider"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
   Connection con = ConnectionProvider.getCon();
   Statement st = con.createStatement();

   String qry = "SELECT * FROM users";
   String count = "SELECT COUNT(uid) FROM users";

   ResultSet rs = st.executeQuery(qry);
%>

<!DOCTYPE html>
<html lang="en">

   <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Users</title>
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
         <i class="i"></i>
         <hr>
         <div class="text">
            <li class="item" style="background-color: #AB263A"><a href="adminHome.jsp"><i class="fas fa-home"></i>Home</a></li>
            <li class="item active"><a href="userAccounts.jsp"><i class="fa fa-user" aria-hidden="true"></i></i>User Accounts</a></li>
            <li class="item"><a href="userReviews.jsp"><i class="fa fa-comments" aria-hidden="true"></i></i>User Reviews</a></li>
         </div>
      </ul>

      <br>
      <h1 style="text-transform: uppercase;" class="h">User Account Details...</h1>
      
      <br>

      <div class="container">
         <table id="datatable">
               <tbody>
                  <tr>
                     <th>ID</th>
                     <th>Name</th>
                     <th>Email</th>
                     <th>Password</th>
                     <th>Mobile</th> 
                     <th colspan="2">Actions</th>
                  </tr>

                  <%
                     while (rs.next()) {
                        // out.println("\n"+rs.getString(2)+"\n");
                      // out.println("\n"+rs.(4)+"\n");                 
                  %>
                        <tr>
                           <td><%=rs.getString("uid")%></td>
                           <td><%=rs.getString("uname")%></td>
                           <td><%=rs.getString("uemail")%></td>
                           <td><%=rs.getString("upwd")%></td>
                           <td><%=rs.getString("umobile")%></td>
                           <td class="crud"><a href="">Delete</a></td>
                           <td class="crud"><a href="">Edit</a></td>
                        </tr>                       
               </tbody>
               <%
                  }
               %>
            </table>
      </div>
   </body>

</html>
