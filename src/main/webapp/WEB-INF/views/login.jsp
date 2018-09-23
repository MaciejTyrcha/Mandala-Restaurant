<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maciej
  Date: 06.09.18
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logowanie</title>
    <style>
        div {
            margin: 5px;
        }
    </style>
</head>
<body>
<div>
    <form method="post" action="home.jsp">
        <fieldset>
            <legend>Podaj dane logowania</legend>
            <div>
                <input type="text" name="userName" placeholder="Podaj login"/>
            </div>
            <div>
                <input type="password" name="password" placeholder="Podaj hasło"/>
            </div>
        </fieldset>
        <fieldset>
            <input type="submit" value="Zaloguj"/>
        </fieldset>
        <c:if test="${param.error != null}">
            <fieldset>
                <label style="color: red">Błędne dane logowania</label>
            </fieldset>
        </c:if>
    </form>
</div>
</body>
</html>
