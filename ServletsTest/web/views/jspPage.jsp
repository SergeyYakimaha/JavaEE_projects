<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 07.01.2020
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP page</title>
</head>
<body>
    <jsp:useBean id="user" class="app.entites.User" scope="session" />
    <jsp:setProperty name="user" property="*" />

    <h4>Name: </h4> <jsp:getProperty name="user" property="name"/>
    <h4>Password: </h4> <jsp:getProperty name="user" property="password"/>
    <h4>Age: </h4> <jsp:getProperty name="user" property="age"/>
</body>
</html>
