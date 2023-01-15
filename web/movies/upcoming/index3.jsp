<%-- 
    Document   : index3
    Created on : Jan 3, 2023, 12:56:42 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

            <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Upcoming Movies3</title>
        
        
    <link rel="stylesheet" href="index3.css" />
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
      <a href="" class="logo"> <i class="bx bxs-movie"></i>ABC Cinema </a>

         <div class="bx bx-menu" id="menu-icon"></div>
         <ul class="navbar">
            <li><a href="/../ABC_Cinema/home/home.jsp" class="home-active">Home</a></li>
           <li><a href="#AboutUs">About Us</a></li>
            <li><a href="#ContactUs">Contact Us</a></li>
            <li style="background-color: orange; padding: 5px;border-radius: 5px;"><a href="../../user_review/review.jsp"><i class='bx bxs-star bx-flashing' ></i> Review</a></li>
         </ul>
         <a href="http://localhost:8080/ABC_Cinema/register/login.jsp" class="button">Sign In</a>     
    </header>
    <section class="home swiper" id="home">
      <div class="swiper-wrapper">
        <div class="swiper-slide container">
            
          
          
          <img src="images/salaar2.jpg" alt=""/>
          <img src="images/salaar2.jpg" alt=""/>
          
          
          <div class="home-text">
            <span>By Prashanth Neel</span>
            <h1>
              Salaar <br />
              
            </h1>
            <h3 class="genre">Action | Adventure | Thriller</h3>
            <br />
            <a href="#" class="button">Book Now</a>
          </div>
        </div>
        <div class="swiper-slide container">
            
            
    
          <img src="images/salaar.jpg" alt=""/>
          
          <a href="#" class="button-secondslide">Book Now</a>
        </div>
        <a href="https://youtu.be/qJ8tXs0dmZk" class="play">
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
            A heroic person tries to dominant against his enemy group.
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
                  
                
                <img src="images/pr.jpg" alt=""/>
                
              </div>
              <h4>Prabhas</h4>
            </div>
            <div class="swiper-slide box">
              <div class="box-img">
                  
                
                
                <img src="images/sh.jpg" alt=""/>
                
              </div>
              <h4>Shruti Haasan</h4>
            </div>
            <div class="swiper-slide box">
              <div class="box-img">
                  
                
                
                <img src="images/ss.jpg" alt=""/>
                
              </div>
              <h4> Singh Srinidhi Shetty</h4>
            </div>
            <div class="swiper-slide box">
              <div class="box-img">
                  
                
                
                <img src="images/pv.jpg" alt=""/>
                
              </div>
              <h4>Prithviraj Sukumaran</h4>
            </div>
            <div class="swiper-slide box">
              <div class="box-img">
                  
                
                <img src="images/eb.jpg" alt=""/>
                
              </div>
              <h4>Emily Blunt</h4>    
            </div>
            <div class="swiper-slide box">
              <div class="box-img">
                  
                
                
                <img src="images/mc.jpg" alt=""/>
                
                
              </div>
              <h4>Meenakshi Chaudhary</h4>  
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
                  
                
                
                
                <img src="images/pn.jpg" alt=""/>
                
              </div>
              <h4>Prashanth Neel</h4>
              <h5><em>Director</em></h5>
            </div>
            <div class="swiper-slide box">
              <div class="box-img">
                  
                
                
                <img src="images/rb.jpg" alt=""/>
                
              </div>
                <h4>Ravi Basrur</h4>
              <h5><em>Music Director</em></h5>
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
      <a href="#" class="logo"> </i> Terms & Conditions </a>
      <a href="#" class="logo"> </i> Privacy & Policy </a>
      
      <div class="social">
        <a href="#"><i class="bx bxl-facebook"></i></a>
        <a href="#"><i class="bx bxl-twitter"></i></a>
        <a href="#"><i class="bx bxl-instagram"></i></a>
        <a href="#"><i class="bx bxl-tiktok"></i></a>
      </div>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.js"></script>
    <script src="index3.js"></script>
 
    
    </body>
</html>
