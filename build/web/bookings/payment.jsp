<%@page import="java.io.PrintWriter"%>
<!doctype html>
<% 
   PrintWriter output = response.getWriter();
   
   Integer price = (Integer)session.getAttribute("price");
   Integer seat = (Integer)session.getAttribute("seat");
//   Integer eachSeat = (Integer)session.getAttribute("eachPrice");
//   out.print(price);
   
  // int cost = Integer.parseInt(price);
   String name = (String)session.getAttribute("name");
   String email = (String)session.getAttribute("email");
   String date = (String)session.getAttribute("date");
//   output.print(date);
//%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Paypal Payment</title>

    <link rel="stylesheet" href="style.css">
</head>
<body>
    <main id="cart-main">
        <div class="site-title text-center">
            <h1 class="font-title">Cart</h1>
        </div>

        <div class="container">
            <div class="grid">
                <div class="col-1">
                    <div class="flex item justify-content-between">
                        <div class="flex">
                            <div class="img text-center">
<!--                                <img src="./assets/pro1.png" alt="">-->
                            </div>
                            <div class="title">
                                <!--<h3>Canon EOS 1500D</h3>-->
                                <span>Name : <%= name %></span><br><span>Email : <%= email %></span>
                                <br><span>Date : <%= date %> </span>

                                <div class="buttons">
                                    <button type="submit"><i class="fas fa-chevron-up"></i> </button>
                                    <!--<input type="text" class="font-title" value="1">-->
                                    <button type="submit"><i class="fas fa-chevron-down"></i> </button>
                                </div>
<!--                                <a href="#">Save for later</a> |
                                <a href="#">Delete From Cart</a>-->
                            </div>
                        </div>
                        <div class="price">
                            <h4 class="text-red"></h4>
                        </div>
                    </div>
                </div>
                <div class="col-2">
                    <div class="subtotal text-center">
                        <h3>Price Details</h3>

                        <ul>
                            <li class="flex justify-content-between">
                                <!--<label for="price">Products (  ) : </label>-->
                                <label for="price">Selected Seats : <%= seat %></label>
                               
                                <span> </span>
                            </li>

                            <hr>
                            <li class="flex justify-content-between">
                                <label for="price">Amount Payable : </label>
                                <span class="text-red font-title"> $<%= price %> </span>
                                <input type="hidden" value="<%= price %>" id="amount" />
                            </li>
                        </ul>
                        <div id="paypal-payment-button">

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>


    <script src="https://www.paypal.com/sdk/js?client-id=Acyvryh7EZKSYyYP2AUGA5yms5dPGT1b5ir_uEjzdY04JTQsPcUO7AoJZb1x36mC18fuRBENax96pcSi&disable-funding=credit,card"></script>
    <script src="index.js"></script>
</body>
</html>
