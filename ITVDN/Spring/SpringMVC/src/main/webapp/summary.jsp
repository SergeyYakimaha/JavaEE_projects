<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 27.12.2019
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Summary</title>
</head>
<body>
    <h2>User name : <%= request.getParameter("name") %></h2>
    <h2>User surname : <%= request.getParameter("surname") %></h2>
    <h2>User years : <%= request.getParameter("years") %></h2>

    <h2>User name : ${user.name}</h2>
    <h2>User surname : ${user.surname}</h2>
    <h2>User years : ${user.years}</h2>
</body>
</html>
