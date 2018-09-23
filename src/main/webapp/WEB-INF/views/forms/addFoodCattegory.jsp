<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maciej
  Date: 07.09.18
  Time: 00:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj kategorię</title>
</head>
<body>
<h3>Dodaj kategorię:</h3>
<form:form method="post" modelAttribute="foodCattegory">
    Nazwa: <form:input path="cattegoryName"/><form:errors path="cattegoryName"/><br>
    <%--Danie: <form:select path="food" items="${allfoods}" itemValue="id" itemLabel="foodName"/><form:errors path="food"/> <br>--%>

    <%--Danie: <form:select path="food"><form:options items="${allfoods}" itemValue="id" itemLabel="foodName" /></form:select><form:errors path="food"/>--%>
    <select name="foodCattegory">
        <c:forEach items="${allfoods}" var="food">
            <option value="${food.id}">${food.foodName}</option>
        </c:forEach>
    </select>



    <input type="submit" value="Dodaj">
</form:form>
</body>
</html>