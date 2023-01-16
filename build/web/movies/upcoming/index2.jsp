<%-- 
    Document   : index2
    Created on : Jan 3, 2023, 10:50:32 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
            <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Upcoming Movies2</title>
        
        
    <link rel="stylesheet" href="index2.css" />
    <!-- CSS only -->
    <!-- JavaScript Bundle with Popper -->
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css"
    />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.css"
    />

    </head>
    <body>
                <!-- Navbar -->
    <header>
      <a href="http://localhost:8080/ABC_Cinema/home/home.jsp" class="logo"> <i class="bx bxs-movie"></i>ABC Cinema </a>

         <div class="bx bx-menu" id="menu-icon"></div>
         <ul class="navbar">
            <li><a href="/../ABC_Cinema/home/home.jsp" class="home-active">Home</a></li>
           <li><a href="../../aboutus.jsp">About Us</a></li>
            
            <li style="background-color: orange; padding: 5px;border-radius: 5px;"><a href="../../user_review/review.jsp"><i class='bx bxs-star bx-flashing' ></i> Review</a></li>
         </ul>
         <a href="http://localhost:8080/ABC_Cinema/register/login.jsp" class="button">Sign In</a>
    </header>
    <section class="home swiper" id="home">
      <div class="swiper-wrapper">
        <div class="swiper-slide container">
            
          
          <img src="images/Pathaan.jpg" alt=""/>
          
          <div class="home-text">
            <span>By Siddharth Anand</span>
            <h1>
              Pathaan <br />
              
            </h1>
            <h3 class="genre"> Action| Crime| Drama</h3>
            <br />
            <a href="../../bookings/book.jsp" class="button">Book Now</a>
          </div>
        </div>
        <div class="swiper-slide container">
            
          
          <img src="images/Pathaan2.jpg" alt=""/>
          
          <a href="../../bookings/book.jsp" class="button-secondslide">Book Now</a>
        </div>
        <a href="https://youtu.be/4xl9KfUg8Lc" class="play">
          <i class="bx bx-play"></i>
        </a>
      </div>
      <div class="swiper-button-next"></div>
      <div class="swiper-button-prev"></div>
      <div class="swiper-pagination"></div>
    </section>

    <section class="desc-movie">
      <div class="desc-box">
        <h1 class="heading">Storyline</h1>
        <div class="story">
          <span>
            Pathaan is an agent who is trying to mess with a badass criminal with his spy team.
          </span>
        </div>
        <div class=""></div>
      </div>

      <div class="cast-crew">
        <div class="cast swiper">
          <h1 class="heading">
            Cast<span><i class="bx bxs-chevron-right"></i></span>
          </h1>
          <div class="swiper-wrapper">
            <div class="swiper-slide box">
              <div class="box-img">
                  
                
                <img src="images/srk.jpeg" alt=""/>
                
              </div>
              <h4>Sha Rukh Khan</h4>
            </div>
            <div class="swiper-slide box">
              <div class="box-img">
                  
                
                <img src="images/dk.jpg" alt=""/>
                
              </div>
              <h4>Dimple Kapadia</h4>
            </div>
            <div class="swiper-slide box">
              <div class="box-img">
                  
                
                
                <img src="images/dp.jpg" alt=""/>
                
              </div>
              <h4>Deepika Padukone</h4>
            </div>
            <div class="swiper-slide box">
              <div class="box-img">
                  
                
               
                <img src="images/ja.jpg" alt=""/>
                
              </div>
              <h4>John Abraham</h4>
            </div>
            <div class="swiper-slide box">
              <div class="box-img">
                  
                               
              <img src="images/gc.jpeg" alt=""/>
                
              </div>
              <h4>Gavie Chahal</h4>    
            </div>
            <div class="swiper-slide box">
              <div class="box-img">
                  
                               
                <img src="images/ar.jpg" alt=""/>
                
              </div>
              <h4>Ashutosh Rana</h4>  
            </div>
          </div>
          <div class="swiper-button-next"></div>
          <div class="swiper-button-prev"></div>
          <div class="swiper-pagination"></div>
        </div>
        <div class="crew swiper">
          <h1 class="heading">
            Crew <span><i class="bx bxs-chevron-right"></i></span>
          </h1>
          <div class="swiper-wrapper">
            <div class="swiper-slide box">
              <div class="box-img">
                  
                
                
                <img src="images/ac.jpg" alt=""/>
                
              </div>
              <h4> Aditya Chopra</h4>
              <h5><em>Producer</em></h5>
            </div>
            <div class="swiper-slide box">
              <div class="box-img">
                  
                
                
                <img src="images/sa.jpg" alt=""/>
                
              </div>
              <h4>Siddharth Anand</h4>
              <h5><em>Director</em></h5>
            </div>
          </div>
            
            
            
          <div class="swiper-button-next"></div>
          <div class="swiper-button-prev"></div>
          <div class="swiper-pagination"></div>
        </div>
      </div>
    </section>

    <section class="reviews">
      <div class="reviews-box">
        <h1>
          Reviews<span><i class="bx bxs-chevrons-right"></i></span>
        </h1>
      </div>
    </section>

    <!-- Footer -->
    <section class="footer">
       <a hret="#" class="logo"> <i class="bx bxs-movie"></i> ABC Cinema </a>
      <div class="social">
        <a href="#"><i class="bx bxl-facebook"></i></a>
        <a href="#"><i class="bx bxl-twitter"></i></a>
        <a href="#"><i class="bx bxl-instagram"></i></a>
        <a href="#"><i class="bx bxl-tiktok"></i></a>
      </div>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.js"></script>
    <script src="index2.js"></script>    
        
    </body>
</html>
