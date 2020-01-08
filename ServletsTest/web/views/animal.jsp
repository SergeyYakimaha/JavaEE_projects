<%--
  Created by IntelliJ IDEA.
  User: yakimaha
  Date: 08.01.2020
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Animal</title>
</head>
<body>
<h2 style="color: cornflowerblue">Cat from attribute</h2>
<h2>Cat name = ${cat.name}</h2>
<h2>Cat color = ${cat.color}</h2>
<h2 style="color: cornflowerblue">Dog from session</h2>
<h2>Dog name = ${sessionScope.dog.name}</h2>
<h2>Dog color = ${sessionScope.dog.color}</h2>
<h2 style="color: cornflowerblue">Cat from session</h2>
<h2>Cat name = ${sessionScope.cat.name}</h2>
<h2>Cat color = ${sessionScope.cat.color}</h2>
</body>
</html>
