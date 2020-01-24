<%--
  Created by IntelliJ IDEA.
  User: yakimaha
  Date: 24.01.2020
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>First filter</title>
</head>
<body>
    <c:forEach items="${filters}" var="filter">
        <p>${filter}</p>
    </c:forEach>
    <c:forEach items="${sessionFilterList}" var="item">
        <p>${item}</p>
    </c:forEach>
</body>
</html>
