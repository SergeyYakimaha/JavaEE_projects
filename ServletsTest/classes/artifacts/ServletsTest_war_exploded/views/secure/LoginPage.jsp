<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 10.01.2020
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="j_security_check" method="post">
        Username: <input type="text" name="j_username"/> </br>
        Password: <input type="password" name="j_password"/> </br>
        <input type="submit" value="login"/>
    </form>
</body>
</html>
