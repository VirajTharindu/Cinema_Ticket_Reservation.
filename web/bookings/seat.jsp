<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="style.css" />
    <title>Movie Seat Booking</title>
    
    
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
     <header>
         <a href="" class="logo"> <i class="bx bxs-movie"></i>Movies </a>

         <div class="bx bx-menu" id="menu-icon"></div>
         <ul class="navbar">
            <li><a href="/../ABC_Cinema/home/home.jsp" class="home-active">Home</a></li>
            <li><a href="#AboutUs">About Us</a></li>
            
         </ul>
         <a href="#" class="button">Sign In</a>
      </header>
     
    <div class="movie-container">
      <label>SELECT A MOVIE </label>
      <select id="movie">
        <option value="10">Oppenheimer ($10)</option>
        <option value="12">John Wick ($12)</option>
        <option value="8">Mission Impossible 4 ($8)</option>
        <option value="9">Transformers ($9)</option>
      </select>
    </div>

    <ul class="showcase">
      <li>
        <div class="seat"></div>
        <small>N/A</small>
      </li>

      <li>
        <div class="seat selected"></div>
        <small>Selected</small>
      </li>

      <li>
        <div class="seat occupied"></div>
        <small>Occupied</small>
      </li>
    </ul>

    <div class="container">
       <div class="screen"><p style="color: black;">This side is the screen.</p></div>
      <div class="row">
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
      </div>
      <div class="row">
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
      </div>

      <div class="row">
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
      </div>

      <div class="row">
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
      </div>

      <div class="row">
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
      </div>

      <div class="row">
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
        <div class="seat"></div>
      </div>
    </div>

    <p class="text">
      SEAT SELECTED <span id="count">0</span> <br>PRICE $<span id="total">0</span>
    </p>
    
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
     <script>
         const container = document.querySelector('.container');
         const seats = document.querySelectorAll('.row .seat:not(.occupied');
         const count = document.getElementById('count');
         const total = document.getElementById('total');
         const movieSelect = document.getElementById('movie');

         populateUI();
         let ticketPrice = +movieSelect.value;

         // Save selected movie index and price
         function setMovieData(movieIndex, moviePrice) {
           localStorage.setItem('selectedMovieIndex', movieIndex);
           localStorage.setItem('selectedMoviePrice', moviePrice);
         }

         // update total and count
         function updateSelectedCount() {
           const selectedSeats = document.querySelectorAll('.row .seat.selected');

           const seatsIndex = [...selectedSeats].map((seat) => [...seats].indexOf(seat));

           localStorage.setItem('selectedSeats', JSON.stringify(seatsIndex));

           //copy selected seats into arr
           // map through array
           //return new array of indexes

           const selectedSeatsCount = selectedSeats.length;

           count.innerText = selectedSeatsCount;
           total.innerText = selectedSeatsCount * ticketPrice;
         }

         // get data from localstorage and populate ui
         function populateUI() {
           const selectedSeats = JSON.parse(localStorage.getItem('selectedSeats'));
           if (selectedSeats !== null && selectedSeats.length > 0) {
             seats.forEach((seat, index) => {
               if (selectedSeats.indexOf(index) > -1) {
                 seat.classList.add('selected');
               }
             });
           }

           const selectedMovieIndex = localStorage.getItem('selectedMovieIndex');

           if (selectedMovieIndex !== null) {
             movieSelect.selectedIndex = selectedMovieIndex;
           }
         }

         // Movie select event
         movieSelect.addEventListener('change', (e) => {
           ticketPrice = +e.target.value;
           setMovieData(e.target.selectedIndex, e.target.value);
           updateSelectedCount();
         });

         // Seat click event
         container.addEventListener('click', (e) => {
           if (e.target.classList.contains('seat') && !e.target.classList.contains('occupied')) {
             e.target.classList.toggle('selected');

             updateSelectedCount();
           }
         });

         // intial count and total
         updateSelectedCount();

     </script>
  </body>
</html>
