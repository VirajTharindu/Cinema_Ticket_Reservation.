
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.abc.dbconnector.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
//   try {
//          Connection con = ConnectionProvider.getCon();
//          PreparedStatement pst = con.prepareStatement("SELECT * FROM bookings");
//          ResultSet rs = pst.executeQuery();
//          session.setAttribute("id", rs.getString("id"));
//  
//      }catch(SQLException e){
//          e.printStackTrace();
//      }
   
   Integer price = (Integer)session.getAttribute("price");
   Integer seat = (Integer)session.getAttribute("seat");
   String name = (String)session.getAttribute("name");
   String email = (String)session.getAttribute("email");
   String date = (String)session.getAttribute("date");
//   Integer id = (Integer)session.getAttribute("id");

   
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment Successful</title>

    <!-- FONT AWESOME ICONS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css" integrity="sha512-1PKOgIY59xJ8Co8+NE6FZ+LOAZKjy+KY8iq0G4B3CyeY6wYHN3yt9PW0XpSriVlkMXe40PTKnXrLnZ9+fkDaog==" crossorigin="anonymous" />
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <link rel="stylesheet" href="style.css">

</head>
<body>
<main id="cart-main">

    <div class="site-title text-center">
        <div><img src="./assets/checked.png" alt=""></div>
        <h1 class="font-title">Payment Done Successfully...!</h1>
        <input type="hidden" id="name" value="<%= name %>" />
        <input type="hidden" id="email" value="<%= email %>" />
        <input type="hidden" id="seat" value="<%= seat %>" />
        <input type="hidden" id="date" value="<%= date %>" />
        <input type="hidden" id="price" value="<%= price %>" />
        <a href="../AddToDB"><button type="button" class="btn btn-primary btn-lg" onclick="sendMail()">Back To Booking & Send a reciept.</button><a/>
           
    </div>

</main>

</body>

<script src="mail.js"></script>
<script type="text/javascript"
        src="https://cdn.jsdelivr.net/npm/@emailjs/browser@3/dist/email.min.js">
</script>
<script type="text/javascript">
   (function(){
      emailjs.init("HT94bLSUqQ16SetOg");
   })();
</script>
</html>
