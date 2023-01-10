<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Home</title>
    <link rel="stylesheet" href="style.css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css" rel="stylesheet">
</head>

<body>
    <ul class="menu">

        <h1><img src="https://www.shareicon.net/data/256x256/2016/04/14/492851_admin_256x256.png"
                alt="" width="40" style="border-radius: 10px;margin-left: 8px;margin-top: 1rem;"> </h1>
        <b class="b">ADMIN</b>
<!--        <i class="i">Space</i>-->
        <hr>
        <div class="text">
            <li class="item" style="background-color: #AB263A"><a href="adminHome.jsp"><i class="fas fa-home"></i>Home</a></li>
            <li class="item"><a href="userAccounts.jsp"><i class="fa fa-user" aria-hidden="true"></i>User's Accounts</a>
            </li> 
            <li class="item"><a href="userReviews.jsp"><i class="fa fa-comments" aria-hidden="true"></i></i>User Reviews</a></li> 
        </div>
    </ul>

    <br>
    <h1 style="text-transform: uppercase;" class="h">Welcome Admin</h1>
    <br>

    <div class="container">
        <fieldset class="info">
            Statistic 
            <br>
            <img src="img/logo1.png"
                alt="" width="50%" style="">
            <div class="logo">
                
                <i class="fas fa-chart-line"></i>
            </div>
            <p>A warm welcome and lots of good wishes on becoming part of our growing team. <br> Congratulations and                 on behalf of all the members. We are all happy <br> and excited about your input and contribution to                  our company.</p>
        </fieldset>

        <fieldset class="info">
            Booking Details
            <br>
            <p>
                <br>
                Dernière connexion il y a 3 heures à Paris.
                <br>
                <button style="margin-top: 1rem;">Booking Data</button>
            </p>

            <div class="logo">
                <i class="fas fa-shield-alt"></i>
            </div>
        </fieldset>

        <div class="coordonate">
            <h2><i class="fas fa-id-card" style="margin-right: 10px;"></i> ContactUs for dev</h2>
            <p>
                Please contact our dev taem. Our all member are studing at NSBM <br>
                <a href="#">contact></a>
            </p>
            <br>
            <p>
                <i class="fas fa-phone-square-alt"></i>
                <i class="fab fa-twitter-square"></i>
                <i class="fas fa-envelope"></i>
            </p>
        </div>

    </div>
</body>

</html>