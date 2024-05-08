<%-- 
    Document   : errorFridgeIsFull
    Created on : 6 мая 2024 г., 19:39:38
    Author     : 0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ERROR Fridge is full</title>
    
    </head>
    <body>
        <header><a href="${pageContext.request.contextPath}/fridge">Home</a></header>
        <h1>Холодильник переполнен! В него нельзя положить продукт.</h1>
        <p>Вместимость холодильника: ${maxSize}</p>
    </body>
</html>
