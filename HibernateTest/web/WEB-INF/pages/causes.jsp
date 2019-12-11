<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>causes</title>
</head>
<body>
<h2>Cause list</h2>
<style>
    table {
        width: 100%; /* Ширина таблицы */
        background: white; /* Цвет фона таблицы */
        color: black; /* Цвет текста */
        border-spacing: 1px; /* Расстояние между ячейками */
    }
    td, th {
        background: wheat; /* Цвет фона ячеек */
        padding: 5px; /* Поля вокруг текста */
    }
</style>
<table>
    <tr>
        <th>CauseID</th>
        <th>Номер справи</th>
        <th>Стан справи</th>
        <th>Суддя по справі</th>
        <th>Користувач, що створив</th>
        <th>Користувач, що редагував</th>
    </tr>
    <c:forEach var="cause" items="${causesList}">
        <tr>
            <td>${cause.causeid}</td>
            <td>${cause.causegnum}</td>
            <td>${cause.causestate.causestatename}</td>
            <td>${cause.arbitrator.username}</td>
            <td>${cause.createuser.username}</td>
            <td>${cause.changeuser.username}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
