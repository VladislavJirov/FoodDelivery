<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign UP</title>
</head>
<body>
<h1>Sign UP</h1>
<form action="<c:url value="/signup"/>" method="post">
    <div>First Name: <input type="text" name="firstName" placeholder="First name"/></div>
    <div>Login: <input type="text" name="login" placeholder="Login"/></div>
    <div>E-mail: <input type="text" name="email" placeholder="E-mail"/></div>
    <div>Password: <input type="password" name="password" placeholder="Password"/></div>
    <button type="submit">Sign Up</button>
</form>
</body>
</html>
