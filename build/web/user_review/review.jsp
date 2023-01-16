<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8" />
    <title>Feedback</title>
    <link rel="stylesheet" href="review.css" />

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
          margin-top: -9rem;
          /*margin-bottom: -1rem;*/
       }
       
       .center form textarea{
          height: 10rem;
          width: 100%;
          overflow: hidden;
          outline: none;
          border: 1px solid #333;
          padding; 10px;
          resize: none;
          font-size: 17px;
       }
    </style>
  </head>
  <body>
    <input type="hidden" id="status" value="<%= request.getParameter("status") %>">
    <header>
      <a href="http://localhost:8080/ABC_Cinema/home/home.jsp" class="logo"> <i class="bx bxs-movie"></i>ABC Cinema </a>

      <div class="bx bx-menu" id="menu-icon"></div>
      <ul class="navbar">
        <li><a href="http://localhost:8080/ABC_Cinema/home/home.jsp" class="">Home</a></li>
        <li><a href="#AboutUs">About Us</a></li>
        
      </ul>
      <a href="../register/login.jsp" class="button">Sign In</a>
      
    </header>

    <div class="center">
      <h1>Give us your feedback </h1>
      <form method="get" action="../Reviews">
        <div class="txt_field">
           <input type="text" name="name" required />
          <label
            ><span><i class="bx bxs-user"></i></span> Username</label
          >
        </div>
        <div class="txt_field">
           <input type="text" name="email" required />
          <label
            ><span><i class="bx bxs-lock-alt"></i></span> Email</label
          >
        </div>
          <div class="txt_field">
           <input type="text" name="mobile" required />
          <label
            ><span><i class="bx bxs-lock-alt"></i></span> Mobile</label
          >
        </div>
     
         <div class="txt_field" >
            <textarea name="description" placeholder="Describe your experience" cols="30"></textarea>
        </div>
       
        <input type="submit" value="POST" />
      </form>
    </div>
    
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
   <link rel="stylesheet" href="alert/dist/sweetalert.css" >
   
   <script>
      var status = document.getElementById("status").value;
      if(status == "success"){
         swal("Submitted", "Your feedback submitted", "success");        
      }
   </script>  
  </body>
</html>
