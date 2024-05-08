<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Change</title>

</head>
<body>
    <header><a href="${pageContext.request.contextPath}/fridge">Home</a></header>
<form method="post" action="${pageContext.request.contextPath}/changeProduct">
    <label for="productId"> Id
        <input type="number" id="productId" name="productId">
    </label>
    <label for="name"> Name
        <input type="text" id="name" name="name">
    </label>
    <label for="productionDate"> Production date
        <input type="date" id="productionDate" name="productionDate">
    </label>
    <label for="expirationDate"> Expiration date
        <input type="date" id="expirationDate" name="expirationDate">
    </label>
       <input type="submit" value="Update">
</form>
</body>
</html>
