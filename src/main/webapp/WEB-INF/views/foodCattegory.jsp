<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maciej
  Date: 07.09.18
  Time: 00:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>foodCattegories</title>
</head>
<body>
<h3>Food Cattegories:</h3>
<ol>
    <c:forEach var="cattegory" items="${foodCattegory}">
        <ul>
          <li>${cattegory.cattegoryName}
            <a href="/foodCattegory/${cattegory.id}/edit">Edytuj</a>
            <a href="/foodCattegory/${cattegory.id}/delete">Usuń</a>
          </li>
        </ul>
    </c:forEach>
</ol>
</body>
</html>