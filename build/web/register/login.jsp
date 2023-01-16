<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8" />
    <title>Login</title>
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
       .signup_link{
          margin-top: 1rem;
          margin-bottom: -1rem;
       }
    </style>
  </head>
  <body>
    <input type="hidden" id="status" value="<%= request.getParameter("status") %>">
    <header>
      <a href="http://localhost:8080/ABC_Cinema/home/home.jsp" class="logo"> <i class="bx bxs-movie"></i>ABC Cinema</a>

      <div class="bx bx-menu" id="menu-icon"></div>
      <ul class="navbar">
        <li><a href="http://localhost:8080/ABC_Cinema/home/home.jsp" class="">Home</a></li>
        <li><a href="../aboutus.jsp">About Us</a></li>
        
      </ul>
      <a href="../admin/adminLogin.jsp" class="button"><i class='bx bxs-shield bx-tada' ></i> ADMIN</a>
      
    </header>

    <div class="center">
      <h1>Login</h1>
      <form method="post" action="../Login">
        <div class="txt_field">
           <input type="text" name="username" required />
          <label
            ><span><i class="bx bxs-user"></i></span> Username</label
          >
        </div>
        <div class="txt_field">
           <input type="password" name="password" required />
          <label
            ><span><i class="bx bxs-lock-alt"></i></span> Password</label
          >
        </div>
         <div class="pass"><a href="forgotPassword.jsp">Forgot Password?</a></div>
        <input type="submit" value="Login" />
        <div class="signup_link">
          Not a member? <a href="register.jsp">Signup</a>
        </div>
        
      </form>
    </div>
    
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
   <link rel="stylesheet" href="alert/dist/sweetalert.css" >
   
   <script>
      var status = document.getElementById("status").value;
      if(status == "failed"){
         swal("Sorry", "Wrong Username or Password", "error");        
      }
      else if(status == "invalidEmail"){
         swal("Sorry", "Please enter your username", "error");        
      }
      else if(status == "invalidUpwd"){
         swal("Sorry", "Please enter your password", "error");        
      }
   </script>
   
  </body>
</html>
