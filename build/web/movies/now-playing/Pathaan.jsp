<!DOCTYPE html>
<html lang="en">
   <head>
      <meta charset="UTF-8" />
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <title>Document</title>

      <link
         rel="stylesheet"
         href="Assets/styles/movies.css"
         />
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
         <a href="" class="logo"> <i class="bx bxs-movie"></i>Movies </a>

         <div class="bx bx-menu" id="menu-icon"></div>
         <ul class="navbar">
            <li><a href="/../ABC_Cinema/home/home.jsp" class="home-active">Movies</a></li>
            <li><a href="#AboutUs">About Us</a></li>
            <li><a href="#ContactUs">Contact Us</a></li>
         </ul>
         <a href="#" class="button">Sign In</a>
      </header>
      <section class="home swiper" id="home">
         <div class="swiper-wrapper">
            <div class="swiper-slide container">
               <img
                  src="Assets/images/pathaan/Pathaan1.jpg"
                  alt=""
                  srcset=""
                  />
               <div class="home-text">
                  <span></span>
                  <h1>Pathaan</h1>
                  <h3 class="genre">Action | Adventure | Thriller</h3>
                  <br />
                  <a href="#" class="button">Book Now</a>
               </div>
            </div>
            <div class="swiper-slide container">
               <img
                  src="Assets/images/pathaan/Pathaan2.jpg"
                  alt=""
                  srcset=""
                  id="second-slide"
                  />
               <a href="#" class="button-secondslide">Book Now</a>
            </div>
            <a href="" class="play">
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
                  Somewhere in the dystopian Middle East, grand houses that once
                  housed the wealthy are now homes of the city's most-dangerous
                  criminals. An undercover cop, his ex-con, and others will take down
                  the drug lord who killed his own father.
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
                        <img
                           src="Assets/images/pathaan/cast1.jpg"
                           alt=""
                           id=""
                           />
                     </div>
                     <h4>Shah Rukh Khan</h4>
                  </div>
                  <div class="swiper-slide box">
                     <div class="box-img">
                        <img
                           src="Assets/images/pathaan/cast2.jpg"
                           alt=""
                           id=""
                           />
                     </div>
                     <h4>Deepika Padukone</h4>
                  </div>
                  <div class="swiper-slide box">
                     <div class="box-img">
                        <img
                           src="Assets/images/pathaan/cast3.jpg"
                           alt=""
                           id=""
                           />
                     </div>
                     <h4>John Abraham</h4>
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
                        <img
                           src="Assets/images/pathaan/crew1.jpg"
                           alt=""
                           id=""
                           />
                        <h4>Siddharth Anand(story)</h4>
                     </div>
                  </div>
                  <div class="swiper-slide box">
                     <div class="box-img">
                        <img
                           src="Assets/images/pathaan/crew2.png"
                           alt=""
                           id=""
                           />
                        <h4>Shridhar Raghavan(screenplay)</h4>
                     </div>
                  </div>
                  <div class="swiper-slide box">
                     <div class="box-img">
                        <img
                           src="Assets/images/pathaan/crew3.jpg"
                           alt=""
                           id=""
                           />
                        <h4>Abbas Tyrewala(dialogue)</h4>
                     </div>
                  </div>
               </div>
            </div>
            <div class="swiper-button-next"></div>
            <div class="swiper-button-prev"></div>
            <div class="swiper-pagination"></div>
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
         <a hret="#" class="logo"> <i class="bx bxs-movie"></i> Movies </a>
         <div class="social">
            <a href="#"><i class="bx bxl-facebook"></i></a>
            <a href="#"><i class="bx bxl-twitter"></i></a>
            <a href="#"><i class="bx bxl-instagram"></i></a>
            <a href="#"><i class="bx bxl-tiktok"></i></a>
         </div>
      </section>

      <div class="youtube-player-overlay active">
         <div class="youtube-player-popup"></div>
      </div>

      <script src="https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.js"></script>
      <script src="Assets/js/movie.js"></script>
   </body>
</html>
