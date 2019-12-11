<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yakimaha
  Date: 11.12.2019
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
<h3>Наш суд самый лучший в мире суд</h3>
<c:url value="/causes" var="causes"/>
<a href="${causes}">Реестр справ</a>
<c:url value="/documents" var="documents"/>
<a href="${documents}">Реестр документів</a>
</body>
</html>
