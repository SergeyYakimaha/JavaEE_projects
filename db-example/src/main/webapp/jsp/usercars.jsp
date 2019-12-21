<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Already registered!
    </div>
    <table border="1">
        <tr>
            <th>User ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Cars model</th>
        </tr>
        <c:forEach items="${userListCarMap}" var="entry">
            <tr>
                <td>${entry.key.id}</td>
                <td>${entry.key.firstName}</td>
                <td>${entry.key.lastName}</td>
                <td>${entry.key.getCarsModel()}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>