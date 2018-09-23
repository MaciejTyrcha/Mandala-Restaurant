<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maciej
  Date: 06.09.18
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<html lang="pl">
<head>

    <meta charset="utf-8">
    <title> Restauracja Mandala </title>
    <meta name="description" content="Strona poświęcona restauracji Mandala w Zabrzu">
    <meta name="keywords" content="restauracja, dobre jedzenie, jedzenie, kuchnia, najlepsza restauracja, restauracja w zabrzu, zabrze">
    <meta name="author" content="Maciej Tyrcha">

    <meta http-equiv="x-Ua-Compatible" content="IE=edge,chrome=1"/>

    <link rel="stylesheet" href="style.css"/>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700&amp;subset=latin-ext" rel="stylesheet"/>

    <style>
        <%@include file="style.css"%>
    </style>

</head>
<body>

<header>
    <nav>

        <div id="naglowekLewy">
            <h1>Ul. Wolności, 41-800 Zabrze</h1>
        </div>
        <div id="naglowekPrawy">
            <h1> ZADZWOŃ: 783-707-711</h1>
        </div>
        <div style="clear:both;"></div>


        <div id="mainHeader">
            <div id="headerLewy">

            </div>

            <div id="headerPrawy">

                <ul class="menu">

                    <li><a href="/home">Home</a></li>
                    <li><a href="/about">O nas</a></li>
                    <li><a href="/menu">Menu</a></li>
                    <li><a href="/galeria">Galeria</a></li>
                    <li><a href="/kontakt">Kontakt</a></li>
                    <li><a href="/rezerwacja">Rezerwacja stolika</a></li>

                </ul>
            </div>
            <div style="clear:both;"></div>

        </div>

    </nav>
</header>







<div id="main4">
    <div class="centered1">
        <p>Zrób rezerwację</p>
    </div>
</div>
<div style="clear:both;"></div>


<div class="probaHome1">

    <div class="probaHome2">

    </div>
    <div class="probaHome3">


        <span class="solidBlackBottom"> Rezerwacja:  </span><br/>
        <input name="Imię" type="text" placeholder="Twoje imię"/> <br/>
        <input name="Nazwisko" type="date" placeholder="Data rezerwacji"/><br/>
        <input name="IloscOsob" type="number" placeholder="Ilość osób"/><br/>
        <input name="NrTelefonu" type="tel" placeholder="Nr telefonu"/><br/>
        <textarea name="Komentarz" cols="50" rows="10">Napisz jeżeli masz jakieś pytania </textarea> <br/>

        <a href="<c:url value="/rezerwacja"/>">
            <input type="submit" class="button" value="Wyślij"/>
        </a>
    </div>
    <div class="probaHome2">

    </div>

    <div style="clear:both;"></div>

</div>








<footer class="footer">

    <div class="footerMain1">
    </div>


    <div class="footerMain2">
        <div class="footerMain21">
            <div class="footerMain211">
                <span class="solidWhiteFooterThick"> Restauracja Mandala </span>
                <ul>
                    <li class="li1">Ul. Wolności 515 <br/> 41-800 Zabrze <br/> Polska</li>
                    <li class="li1">783-707-711</li>
                    <li class="li1">mandala@gmail.com</li>
                </ul>
            </div>
        </div>

        <div class="footerMain22">
            <div class="footerMain211">
                <span class="solidWhiteFooterThick"> Szybkie linki </span>
                <ul class="menu1">
                    <li class="li2"><a href="/home">Home</a></li>
                    <li class="li2"><a href="/menu">Menu</a></li>
                    <li class="li2"><a href="/galeria">Galeria</a></li>
                    <li class="li2"><a href="/rezerwacja">Rezerwacja</a></li>
                </ul>
            </div>
        </div>
        <div class="footerMain21">
            <div class="footerMain211">
                <span class="solidWhiteFooterThick"> Śledź nas na </span>
                <p class="solidGreyParagraph">Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                    Vivamus blandit quis lacus id pellentesque.
                    Aliquam eleifend bibendum mauris nec convallis.
                    In finibus ornare justo ut sagittis.</p>

            </div>
        </div>



    </div>

    <div class="footerMain1">
    </div>

    <div style="clear:both;"></div>

    <div class="footerMain3">
    </div>
    <div class="footerMain4">
        <p class="solidGreyParagraph">  Copyright &copy; 2018 Restauracja Mandala, Zabrze, Polska</p>
    </div>
    <div class="footerMain4">
        <p class="solidGreyParagraph2"> <a href="/about"><span> O nas   </span></a>
            <a href="/kontakt"><span> Kontakt</span></a></p>

    </div>
    <div class="footerMain3">
    </div>
    <div style="clear:both;"></div>

</footer>




<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script>

    $(document).ready(function() {


        var NavY = $('#mainHeader').offset().top;

        var stickyNav = function(){
            var ScrollY = $(window).scrollTop();

            if (ScrollY > NavY) {
                $('#mainHeader').addClass('sticky');
            }
            else {
                $('#mainHeader').removeClass('sticky');
            }

        };
        stickyNav();

        $(window).scroll(function() {
            stickyNav();
        });


    });

</script>

</body>
</html>

</body>
</html>
