<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--@elvariable id="order" type="com.epam.vzhirov.fooddelivery.model.Order"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<head>
    <fmt:bundle basename="welcome">
        <fmt:message key="hello"></fmt:message>
    </fmt:bundle>
    <link rel="stylesheet" type="text/css" href="index.css">
    <title>Food Delivery Service </title>
</head>
<body>
<h1>Dishes list below</h1>

<c:forEach items="${order.dishes}" var="dishName">

    <h2>${dishName.name}</h2>

    <blockquote class="nice-site">
        <c:forEach items="${dishName.ingredients}" var="ingrEntry">
            <div>${ingrEntry.key.name}</div>
        </c:forEach>
    </blockquote>

    <h3> Raw price: ${order.rawPrice}</h3>

</c:forEach>

</body>
