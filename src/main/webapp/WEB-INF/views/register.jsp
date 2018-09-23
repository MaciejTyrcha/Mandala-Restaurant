<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: maciej
  Date: 06.09.18
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rejestracja użytkownika</title>
</head>
<body>
<div>
    <form:form method="post" modelAttribute="user">
        <fieldset>
            <legend>Podaj dane użytkownika</legend>
            <div>
                Login <form:input path="userName"/>
            </div>
            <div>
                Email <form:input path="email"/>
            </div>
            <div>
                Password <form:password path="password"/>
            </div>
        </fieldset>
        <fieldset>
            <span>
                <input type="reset" value="Wyczyść"/>
            </span>
            <span>
                <input type="submit" value="Wyślij"/>
            </span>
        </fieldset>
    </form:form>
</div>
</body>
</html>
