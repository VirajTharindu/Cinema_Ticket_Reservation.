
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8" />
    <title>Register Page</title>
    <link rel="stylesheet" href="aboutus.css" />

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
          margin-top: 3rem;
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
       
      </ul>
      <a href="register/login.jsp" class="button">Sign In</a>
    </header>
    <div class="center">
      <h1>About Us</h1>
      <form style="margin-top: 1rem;">
        <div class="txt_field">
           <h4>ABC is our movie showwing company registered under government authoriities. we provide all the regular services for our valuable customers through our system. ticket bookings, ticket booking payments, suppplying movie details, & supplying booking details are our main services.</h4>
        </div>
        <div class="txt_field">
           <h3>our main employees are...</h3>
           <ul>
              <li>Hitihami M Bandara</li>
              <li> Kasthuri A Arachchi</li>
              <li> Dissanayake Dissanayake</li>
              <li> Prathibha Wickramasinghe</li> 
              <li>Lunukotuwe Dissanayake</li>
              <li> Mangalagama jayarathna</li>
           </ul>           
        </div>
      </form>
    </div>
     
   <script src="vendor/jquery/jquery.min.js"></script>  
   <script src="js/main.js"></script> 
   <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
   <link rel="stylesheet" href="alert/dist/sweetalert.css" >
   
  </body>
</html>
