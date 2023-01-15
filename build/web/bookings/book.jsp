
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
      <a href="" class="logo"> <i class="bx bxs-movie"></i>ABC Cinema</a>

      <div class="bx bx-menu" id="menu-icon"></div>
      <ul class="navbar">
        <li><a href="http://localhost:8080/ABC_Cinema/home/home.jsp" class="">Home</a></li>
        <li><a href="#AboutUs">About Us</a></li>
        <li><a href="#ContactUs">Contact Us</a></li>
      </ul>
      <a href="login.jsp" class="button">Sign In</a>
    </header>
    <div class="center">
      <h1>Register</h1>
      <form method="post" action="../Register" style="margin-top: -10px;">
        <div class="txt_field">
          <input type="text" name="name" required />
          <label
            ><span><i class="bx bxs-user"></i></span> Username</label
          >
        </div>
        <div class="txt_field">
          <input type="password" name="pwd" required />
          <label
            ><span><i class="bx bxs-lock-alt"></i></span> Password</label
          >
        </div>
        <div class="txt_field">
          <input type="password" name="re_pwd" required />
          <label
            ><span><i class="bx bxs-lock-alt"></i></span> Re-enter your
            password</label
          >
        </div>
        <div class="txt_field">
          <input type="email" name="email" required />

          <label
            ><span><i class="bx bxs-envelope"></i></span> Email</label
          >
        </div>
         <div class="txt_field">
          <input type="text" name="contact" required />

          <label
            ><span><i class='bx bx-mobile'></i></span> Contact Number</label
          >
        </div>
         <div class="signup_link">
          Already Registered ? <a href="login.jsp">Sign In</a>
         </div>
        <input type="submit" value="Continue" onclick="fun()" />      
      </form>
    </div>
     
   <script src="vendor/jquery/jquery.min.js"></script>  
   <script src="js/main.js"></script> 
   <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
   <link rel="stylesheet" href="alert/dist/sweetalert.css" >
   
<!--   <script>
      var status = document.getElementById("status").value;
      if(status == "success"){
         swal("Congrats", "Account created successfully", "success"); 
      }
   </script>-->
  </body>
</html>
