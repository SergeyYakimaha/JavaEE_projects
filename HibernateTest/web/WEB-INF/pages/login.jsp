<%--
  Created by IntelliJ IDEA.
  User: yakimaha
  Date: 19.12.2019
  Time: 8:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Вход в систему</title>
</head>
<body>
<form action="handler.php">
    <p><b>Как по вашему мнению расшифровывается аббревиатура &quot;ОС&quot;?</b></p>
    <p><input type="radio" name="answer" value="a1">Офицерский состав<Br>
        <input type="radio" name="answer" value="a2">Операционная система<Br>
        <input type="radio" name="answer" value="a3">Большой полосатый мух</p>
    <p><input type="submit"></p>
</form>

</body>
</html>
