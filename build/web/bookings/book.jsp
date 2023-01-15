
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8" />
    <title>Register Page</title>
    <link rel="stylesheet" href="book.css" />

    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css"
    />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.css"  
    />
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

            <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.3/themes/smoothness/jquery-ui.css" crossorigin="anonymous" referrerpolicy="no-referrer"/>
            <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.3/jquery-ui.min.js" crossorigin="anonymous" referrerpolicy="no-referrer" ></script>
    
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
      <h1>Book</h1>
      <form method="post" action="../Book" style="margin-top: -10px;">
        <div class="txt_field">
          <input type="email" name="email" required />
          <label
            ><span><i class="bx bxs-envelope"></i></span> Email</label
          >
        </div>
        <div class="txt_field">
          <input type="text" name="name" required />
          <label
            ><span><i class="bx bxs-star"></i></span> Name</label
          >
        </div>
        <div class="txt_field">
           <select class="movie" name="movies">
              <option value="12">Spider-Man ($12)</option>
              <option value="10">Oppenheimer ($10)</option>
              <option value="9">Transformers ($9)</option>
              <option value="8">Pathaan ($8)</option>
              <option value="7">John Wick ($7)</option>              
           </select>
          <label style="padding-bottom: 55px; "  
             ><span><i class="bx bxs-movie"></i></span> Select a Movie<br> </label
          >
        </div>
        <div class="txt_field">
           <input type="text" id="datepicker"  name="date"/>
          <label
             ><span><i class="bx bxs-calendar"></i></span> Select a Date<br> </label
          >
        </div>
         <div class="txt_field">
          <input type="number" name="seat" min="1" max="30" required />
          <label
            ><span><i class='bx bx-chair bx-flip-horizontal' ></i></span> Seats</label
          >
        </div>
<!--         <div class="signup_link">
          Already Registered ? <a href="login.jsp">Sign In</a>
         </div>-->
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
<script>
   $(function () {
                $("#datepicker").datepicker({
                    beforeShowDay: function (d) {
                        var day = d.getDay();
                        return [day != 0 && day != 5 && day != 6 && day != 7];
                    },
                });
            });</script>

  </body>
</html>
