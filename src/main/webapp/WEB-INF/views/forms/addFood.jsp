<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: maciej
  Date: 06.09.18
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl">
<head>

    <meta charset="utf-8">
    <title> Restauracja Mandala </title>
    <meta name="description" content="Strona poświęcona restauracji Mandala w Zabrzu">
    <meta name="keywords" content="restauracja, dobre jedzenie, jedzenie, kuchnia, najlepsza restauracja, restauracja w zabrzu, zabrze">
    <meta name="author" content="Maciej Tyrcha">

    <meta http-equiv="x-Ua-Compatible" content="IE=edge,chrome=1"/>

    <link rel="stylesheet" href="../style.css"/>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700&amp;subset=latin-ext" rel="stylesheet"/>

    <style>
        <%@include file="../style.css"%>
    </style>

</head>
<body>

<h3>Dodaj danie:</h3>
<form:form method="post" modelAttribute="food">
    Nazwa: <form:input path="foodName"/><form:errors path="foodName"/> <br>
    Opis: <form:input path="foodDescription"/><form:errors path="foodDescription"/> <br>
    Cena: <form:input path="price"/><form:errors path="price"/> <br>
    <input type="submit" class="button"value="Dodaj">
</form:form>

</body>
</html>
