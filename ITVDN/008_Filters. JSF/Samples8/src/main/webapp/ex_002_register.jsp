<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 16.05.2018
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form method="post" action="controller?action=register">
    <p><input type="text" name="name" size="10"/></p>
    <p><input type="password" name="password" size="10" /></p>
    <p>
        <select size="3" name="admin">
            <option value = "true">Admin</option>
            <option value = "false">User</option>
        </select>
    </p>
    <p><input type="submit" value="Register" /></p>

</form>

</body>
</html>
