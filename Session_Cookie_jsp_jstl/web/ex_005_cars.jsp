<%@ page import="ex_005_servlet_and_dao.DAOFactory" %>
<%@ page import="ex_005_servlet_and_dao.CarsshopDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="ex_005_servlet_and_dao.Car" %><%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 31.01.2018
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cars</title>
</head>
<body>

     <h1>All cars:</h1>

     <%!DAOFactory daoFactory = DAOFactory.getInstance();%>
     <%!CarsshopDAO carsshopDAO = daoFactory.getCarsshopDAO();%>
     <%!List<Car> cars = carsshopDAO.getAll();%>

     <table cellpadding="1" cellspacing="1" border="1">

         <tr>
             <td>Id</td>
             <td>Mark</td>
             <td>Model</td>
             <td>Price</td>
         </tr>
     <% for (Car car : cars) {%>

         <tr>
             <td><%=car.getId()%></td>
             <td><%=car.getMark()%></td>
             <td><%=car.getModel()%></td>
             <td><%=car.getPrice()%></td>
         </tr>
         <% }%>
     </table>

</body>
</html>
