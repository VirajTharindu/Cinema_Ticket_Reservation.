<!DOCTYPE html>
<html lang="en">
   <head>
      <meta charset="UTF-8" />
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <title>Document</title>

      <link
         rel="stylesheet"
         href="movies.css"
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
            <li><a href="/../ABC_Cinema/home/home.jsp" class="home-active">Home</a></li>
            <li><a href="#AboutUs">About Us</a></li>
            <li><a href="#ContactUs">Contact Us</a></li>
         </ul>
         <a href="#" class="button">Sign In</a>
      </header>
      <section class="home swiper" id="home">
         <div class="swiper-wrapper">
            <div class="swiper-slide container">
               <img
                  src="Assets/images/JohnWick/home1.jpg"
                  alt=""
                  srcset=""
                  />
               <div class="home-text">
                  <span></span>
                  <h1>John Wick :<br />Chapter 4</h1>
                  <h3 class="genre">Action | Crime | Thriller</h3>
                  <br />
                  <a href="#" class="button">Book Now</a>
               </div>
            </div>
            <div class="swiper-slide container">
               <img
                  src="Assets/images/JohnWick/slide2.jpg"
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
                  John Wick uncovers a path to defeating The High Table. But before he
                  can earn his freedom, Wick must face off against a new enemy with
                  powerful alliances across the globe and forces that turn old friends
                  into foes.
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
                           src="Assets/images/JohnWick/cast1.jpg"
                           alt=""
                           id=""
                           />
                     </div>
                     <h4>Keanu Reeves</h4>
                  </div>
                  <div class="swiper-slide box">
                     <div class="box-img">
                        <img
                           src="Assets/images/JohnWick/cast2.jpg"
                           alt=""
                           id=""
                           />
                     </div>
                     <h4>Donnie Yen</h4>
                  </div>
                  <div class="swiper-slide box">
                     <div class="box-img">
                        <img
                           src="Assets/images/JohnWick/cast3.jpg"
                           alt=""
                           id=""
                           />
                     </div>
                     <h4>Hiroyuki Sanada</h4>
                  </div>
                  <div class="swiper-slide box">
                     <div class="box-img">
                        <img
                           src="Assets/images/JohnWick/cast4.jpg"
                           alt=""
                           id=""
                           />
                     </div>
                     <h4>Scott Adkins</h4>
                  </div>
                  <div class="swiper-slide box">
                     <div class="box-img">
                        <img
                           src="Assets/images/JohnWick/cast5.jpg"
                           alt=""
                           id=""
                           />
                     </div>
                     <h4>Ian McShane</h4>
                  </div>
                  <div class="swiper-slide box">
                     <div class="box-img">
                        <img
                           src="Assets/images/JohnWick/cast6.jpg"
                           alt=""
                           id=""
                           />
                     </div>
                     <h4>Rina Sawayama</h4>
                  </div>
                  <div class="swiper-slide box">
                     <div class="box-img">
                        <img
                           src="Assets/images/JohnWick/cast7.jpg"
                           alt=""
                           id=""
                           />
                     </div>
                     <h4>Lance Reddick</h4>
                  </div>
                  <div class="swiper-slide box">
                     <div class="box-img">
                        <img
                           src="Assets/images/JohnWick/cast8.jpg"
                           alt=""
                           id=""
                           />
                     </div>
                     <h4>Bill Skarsgård</h4>
                  </div>
                  <div class="swiper-slide box">
                     <div class="box-img">
                        <img
                           src="Assets/images/JohnWick/cast9.jpg"
                           alt=""
                           id=""
                           />
                     </div>
                     <h4>Laurence Fishburne</h4>
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
                           src="Assets/images/JohnWick/crew1.jpg"
                           alt=""
                           id=""
                           />
                     </div>
                  </div>
                  <div class="swiper-slide box">
                     <div class="box-img">
                        <img
                           src="Assets/images/JohnWick/crew2.jpg"
                           alt=""
                           id=""
                           />
                     </div>
                  </div>
                  <div class="swiper-slide box">
                     <div class="box-img">
                        <img
                           src="Assets/images/JohnWick/crew3.jpg"
                           alt=""
                           id=""
                           />
                     </div>
                  </div>
               </div>
               <div class="swiper-button-next"></div>
               <div class="swiper-button-prev"></div>
               <div class="swiper-pagination"></div>
            </div>
         </div>
      </section>

<!--      <section class="reviews">
         <div class="reviews-box">
            <h1>
               Reviews<span><i class="bx bxs-chevrons-right"></i></span>
            </h1>
         </div>
      </section>-->

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
      <script src="movie.js"></script>
   </body>
</html>
