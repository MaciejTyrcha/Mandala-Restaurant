<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: maciej
  Date: 07.09.18
  Time: 01:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit FoodCattegory</title>
</head>
<body>
<h3>Edycja kategorii</h3>
<form:form method="post" modelAttribute="foodCattegory">
    Nazwa: <form:input path="cattegoryName"/><form:errors path="cattegoryName"/><br>
    Danie: <form:select path="food" items="${allfoods}" itemValue="id" itemLabel="firstName"/><form:errors path="food"/> <br>
    <input type="submit" value="save">
</form:form>
</body>
</html>
