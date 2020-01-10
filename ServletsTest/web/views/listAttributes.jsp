<%--
  Created by IntelliJ IDEA.
  User: yakimaha
  Date: 08.01.2020
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List attributes</title>
</head>
<body>

<c:set var="test" value="Cow" scope="page" />
<c:set var="param1" value="page" scope="page" />
<% String test = "Fish"; %>

<h3>pageScope.param1 = ${pageScope.param1}</h3>
<h3>sessionScope.param1 = ${sessionScope.param1}</h3>
<h3>applicationScope.param1 = ${applicationScope.param1}</h3>

<h2 style="color: cornflowerblue">Cat from attribute</h2>
<h2>Cat name = ${cat.name}</h2>
<h2>Cat color = ${cat.color}</h2>

<h2 style="color: cornflowerblue">Cat from pageScope</h2>
<h2>Cat name = ${pageScope.name}</h2>
<h2>Cat color = ${pageScope.color}</h2>

<h2>Test value = ${pageScope.test}</h2>
<h2>Test applicationScope value = ${applicationScope.test}</h2>

<h2 style="color: cornflowerblue">Cat from requestScope</h2>
<h2>Cat name = ${requestScope.cat.name}</h2>
<h2>Cat color = ${requestScope.cat.color}</h2>

<h2 style="color: cornflowerblue">Cat from sessionScope</h2>
<h2>Cat name = ${sessionScope.cat.name}</h2>
<h2>Cat color = ${sessionScope.cat.color}</h2>

<h2 style="color: cornflowerblue">Cat from applicationScope</h2>
<h2>Fish name = ${applicationScope.cat.name}</h2>
<h2>Fish color = ${applicationScope.cat.name}</h2>

</body>
</html>
