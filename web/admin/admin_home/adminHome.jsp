
<%
try {
    response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   response.addHeader("Pragma", "no-cache"); 
   response.addDateHeader ("Expires", 0);
    if (session.getAttribute("name") == null){
      response.sendRedirect("http://localhost:8080/ABC_Cinema/admin/adminLogin.jsp");
   }
    else {}
}
catch(Exception ex) {
    out.println(ex);
}
%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Home</title>
    <link rel="stylesheet" href="style.css">
    
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css"
    />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.css"
    />
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css" rel="stylesheet">
</head>

<body>
    <ul class="menu">

        <h1><img src="https://friconix.com/jpg/fi-snsuxx-user-shield-solid.jpg"
                alt="" width="40" style="border-radius: 10px;margin-left: 8px;margin-top: 1rem;"> </h1>
        <b class="b">ADMIN</b>
<!--        <i class="i">Space</i>-->
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
    <h1 style="text-transform: uppercase;" class="h">Welcome Admin</h1>
    <br>

    <div class="container">
        <fieldset class="info">
            Statistic 
            <br>
            <img src="img/logo1.png"
                alt="" width="50%" style="">
            <div class="logo">
                
                <i class="fas fa-chart-line"></i>
            </div>
            <div>
               <div
            </div>
        </fieldset>

        <fieldset class="info">
            Booking Details
            <br>
            <p>
                <br>
                Dernière connexion il y a 3 heures à Paris.
                <br>
                <button style="margin-top: 1rem;">Booking Data</button>
            </p>

            <div class="logo">
                <i class="fas fa-shield-alt"></i>
            </div>
        </fieldset>

        <div class="coordonate">
            <h2 style="margin-right: 10px;"><i class="fas fa-id-card" ></i> Contact Us</h2>
            <p>
                Please contact our dev team for more details.<br>
                <a href="#">contact</a>
            </p>
            <br>
            <p>
                <i class="fas fa-phone-square-alt"></i>
                <i class="fab fa-twitter-square"></i>
                <i class="fas fa-envelope"></i>
            </p>
        </div>

    </div>
</body>
<!--   <script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script>-->
</html>