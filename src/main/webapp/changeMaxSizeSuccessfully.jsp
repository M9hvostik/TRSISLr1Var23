<%-- 
    Document   : changeMaxSizeSuccessfully
    Created on : 6 мая 2024 г., 19:57:57
    Author     : 0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change max size Successfully</title>
    </head>
    <body>
        <header><a href="${pageContext.request.contextPath}/fridge">Home</a></header>
        <h1>Изменение вместимости холодильника прошло успешно</h1>
        <p>Новый размер: ${maxSize}</p>
        <h2>Изъятые продукты:</h2>
        <table border="1">
        <tr>
            <th>id</th>
            <th>Name</th>
            <th>Production date</th>
            <th>Expiration date</th>
        </tr>
        <c:forEach items="${removedProduct}" var="product" varStatus="tierOneCount">
            <tr>
                <td>${tierOneCount.index}</td>
                <td>${product.name}</td>
                <td><fmt:formatDate value="${product.productionDate}" pattern="dd-MM-yyyy" /></td>
                <td><fmt:formatDate value="${product.expirationDate}" pattern="dd-MM-yyyy" /></td>
            </tr>
        </c:forEach>
    </table>
    </body>
</html>
