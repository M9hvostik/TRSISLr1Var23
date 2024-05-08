<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <header><a href="${pageContext.request.contextPath}/fridge">Home</a></header>
    <p>
        Максимальный размер холодильника: ${maxSize}
        <form method="post" action="${pageContext.request.contextPath}/changeMaxSizeFridge">
        <label for="maxSize"> Вместимость холодильника:
            <input type="number" id="maxSize" name="maxSize">
        </label>
           <input type="submit" value="Change">
        </form>
    </p>
    <table border="1">
        <tr>
            <th>id</th>
            <th>Name</th>
            <th>Production date</th>
            <th>Expiration date</th>
            <th>Take product</th>
        </tr>
        <c:forEach items="${fridge}" var="product" varStatus="tierOneCount">
            <tr>
                <td>${tierOneCount.index}</td>
                <td>${product.name}</td>
                <td><fmt:formatDate value="${product.productionDate}" pattern="dd-MM-yyyy" /></td>
                <td><fmt:formatDate value="${product.expirationDate}" pattern="dd-MM-yyyy" /></td>
                <td><a href="${pageContext.servletContext.contextPath}/take?productId=${tierOneCount.index}">Take</a></td>
                
            </tr>
        </c:forEach>
    </table>
<a href="${pageContext.request.contextPath}/put">Put product</a>
<a href="${pageContext.servletContext.contextPath}/changeProduct">Change product</a>

</body>
</html>
