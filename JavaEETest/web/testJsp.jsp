<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 26.11.2019
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>

    <%@ page import = "somePackage.Cart" %>

    <% Cart cart = (Cart) session.getAttribute("cart"); %>

    <p>Наименование товара: <%= cart.getName() %> </p>
    <p>Количетство товара: <%= cart.getQuantity() %> </p>

</body>
</html>
