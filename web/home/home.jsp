<!DOCTYPE html>
<html lang="en">
   <head>
      <meta charset="UTF-8" />
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <title>Movies</title>

      <link rel="stylesheet" href="home.css" />
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
            <li><a href="#home" class="home-active">Movies</a></li>
            <li><a href="../aboutus.jsp">About Us</a></li>
            
            <li style="background-color: orange; padding: 5px;border-radius: 5px;"><a href="../user_review/review.jsp"><i class='bx bxs-star bx-flashing' ></i> Review-Feedback</a></li>
         </ul>
         <a href="http://localhost:8080/ABC_Cinema/register/login.jsp" class="button">Sign In</a>
      </header>
      <!-- Top Section -->
      <section class="home swiper" id="home">
         <div class="swiper-wrapper">
            <div class="swiper-slide container">
               <img src="Assets/images/home1.jpg" alt="" srcset="" />
               <div class="home-text">
                  <span></span>
                  <h1>John Wick :<br />Chapter 4</h1>
                  <br />
                  <a href="../bookings/book.jsp" class="button">Book Now</a>
                  <a href="https://youtu.be/qEVUtrk8_B4" class="play">
                     <i class="bx bx-play"></i>
                  </a>
               </div>
            </div>
            <div class="swiper-slide container">
               <img src="Assets/images/home2.jpg" alt="" srcset="" />
               <div class="home-text">
                  <span></span>
                  <h1>
                     Tranformers : <br />
                     Rise of the Beasts
                  </h1>
                  <br />
                  <a href="../bookings/book.jsp" class="button">Book Now</a>
                  <a href="https://youtu.be/WWWDskI46Js" class="play">
                     <i class="bx bx-play"></i>
                  </a>
               </div>
            </div>
            <div class="swiper-slide container">
               <img src="Assets/images/O1.jpg" alt="" srcset="" />
               <div class="home-text">
                  <span></span>
                  <h1>Oppenheimer</h1>
                  <br />
                  <a href="../bookings/book.jsp" class="button">Book Now</a>
                  <a href="https://youtu.be/bK6ldnjE3Y0" class="play">
                     <i class="bx bx-play"></i>
                  </a>
               </div>
            </div>
            <div class="swiper-slide container">
               <img src="Assets/images/Pathaan2.jpg" alt="" srcset="" />
               <div class="home-text">
                  <span></span>
                  <h1>Pathaan</h1>
                  <br />
                  <a href="../bookings/book.jsp" class="button">Book Now</a>
                  <a href="https://youtu.be/vqu4z34wENw" class="play">
                     <i class="bx bx-play"></i>
                  </a>
               </div>
            </div>
         </div>
         <div class="swiper-button-next"></div>
         <div class="swiper-button-prev"></div>
         <div class="swiper-pagination"></div>
         <div class="swiper-pagination"></div>
      </section>
      <!-- Movies -->
      <section class="movies" id="movies">
         <h2 class="heading">Now Playing</h2>
         <div class="movies-container">
            <div class="box">
               <div class="box-img">
                  <a href="../movies/now-playing/index1.jsp"><img src="Assets/images/m1.jpg" alt="" /></a>
               </div>
               <h3>John Wick :<br />Chapter 4</h3>
               <span>120 min | Action</span>
            </div>
            <div class="box">
               <div class="box-img">
                  <a href="../movies/now-playing/index6.jsp"><img src="Assets/images/m2.jpg" alt="" /></a>
               </div>
               <h3>Transformers : <br />Rise of the Beasts</h3>
               <span>120 min | Action</span>
            </div>
            <div class="box">
               <div class="box-img">
                  <a href="../movies/now-playing/index3.jsp"><img src="Assets/images/O2.jpeg" alt="" /></a>
               </div>
               <h3>Oppenheimer</h3>
               <span>120 min | Action</span>
            </div>
             <div class="box">
               <div class="box-img">
                  <a href="../movies/now-playing/index5.jsp"><img src="Assets/images/spiderman.jpg" alt="" /></a>
               </div>
               <h3>Spider-Man</h3>
               <span>120 min | Action</span>
            </div>
            <div class="box">
               <div class="box-img">
                  <a href="../movies/now-playing/index4.jsp"><img src="Assets/images/Pathaan1.jpg" alt="" /></a>
               </div>
               <h3>Pathaan</h3>
               <span>120 min | Action</span>
            </div>
           
            <div class="box">
               <div class="box-img">
                  <a href="../movies/now-playing/index2.jsp"><img src="Assets/images/missionImpossible.jpg" alt="" /></a>
               </div>
               <h3>Mission Impossible</h3>
               <span>120 min | Action</span>
            </div>
         </div>
      </section>

      <section class="upcoming" id="upcoming">
         <h1 class="heading">Coming Soon</h1>
         <div class="upcoming-container swiper">
            <div class="swiper-wrapper">
               <div class="swiper-slide box">
                  <div class="box-img">
                     <a href="../movies/upcoming/index5.jsp"><img src="Assets/images/barbie.jpg" alt="" id="" /></a>
                  </div>
                  <h3>Barbie</h3>
                  <span>Comedy | Fantasy</span>
               </div>
               <div class="swiper-slide box">
                  <div class="box-img">
                     <a href="../movies/upcoming/index3.jsp"><img src="Assets/images/salaar.jpg" alt="" /></a>
                  </div>
                  <h3>Salaar</h3>
                  <span>Action | Adventure | Thriller</span>
               </div>
               <div class="swiper-slide box">
                  <div class="box-img">
                     <a href="../movies/upcoming/index4.jsp"><img src="Assets/images/vaathi.png" alt="" /></a>
                  </div>
                  <h3>Vaathi</h3>
                  <span>Drama | Romance | Action</span>
               </div>
                             
            </div>
            <div class="swiper-button-next"></div>
            <div class="swiper-button-prev"></div>
            <div class="swiper-pagination"></div>
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
      <script src="main.js"></script>
   </body>
</html>

<%

%>
