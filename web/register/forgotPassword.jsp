
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8" />
    <title>Register Page</title>
    <link rel="stylesheet" href="login.css" />

    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css"
    />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.css"  
    />
    
    <style>
       
       .center{
          margin-top: 0.1rem;
       }
    </style>
  </head>
  <body>
     
     <input type="hidden" id="status" value="<%= request.getParameter("status") %>">
     
    <header>
      <a href="" class="logo"> <i class="bx bxs-movie"></i>Movies </a>

      <div class="bx bx-menu" id="menu-icon"></div>
      <ul class="navbar">
        <li><a href="#home" class="">Home</a></li>
        <li><a href="#AboutUs">About Us</a></li>
        <li><a href="#ContactUs">Contact Us</a></li>
      </ul>
      <a href="login.jsp" class="button">Sign In</a>
    </header>
    <div class="center">
      <h1>Set New Password</h1>
      <form method="post" action="../ForgotPassword" style="margin-top: -10px;">
        <div class="txt_field">
          <input type="text" name="email" required />
          <label
            ><span><i class="bx bxs-user"></i></span> Email</label
          >
        </div>
        <div class="txt_field">
          <input type="password" name="newpwd" required />
          <label
            ><span><i class="bx bxs-lock-alt"></i></span>New Password</label
          >
        </div>     
        <div class="txt_field">
          <input type="text" name="mobile" required />

          <label
            ><span><i class="bx bxs-envelope"></i></span> Mobile</label
          >
        </div>       
         <div class="signup_link">
          Back to Login ? <a href="login.jsp">Sign In</a>
         </div>
        <input type="submit" value="Continue" onclick="fun()" />      
      </form>
    </div>
     
   <script src="vendor/jquery/jquery.min.js"></script>  
   <script src="js/main.js"></script> 
   <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
   <link rel="stylesheet" href="alert/dist/sweetalert.css" >
   
   <script>
      var status = document.getElementById("status").value;
      if(status == "success"){
         swal("Congrats", "Account Updated successfully", "success"); 
      }
      if(status == "failed"){
         swal("Congrats", "Something went wrong try again", "error"); 
      }
   </script>
  </body>
</html>
