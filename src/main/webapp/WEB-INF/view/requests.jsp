<%--
  Created by IntelliJ IDEA.
  User: Armat
  Date: 02.06.2020
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Id</th>
        <th>Request date</th>
        <th>Fibonacci Index</th>
        <th>Fibonacci Value</th>
        <th>Request status</th>
    </tr>
    <c:forEach var="tempRequest" items="${requests}">

        <tr>
            <td>${tempRequest.id}</td>
            <td>${tempRequest.dateTime}</td>
            <td>${tempRequest.fiboIndex}</td>
            <td>${tempRequest.fiboValue}</td>
            <td>${tempRequest.status}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
