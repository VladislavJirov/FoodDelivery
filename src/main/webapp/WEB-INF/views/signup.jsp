<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign UP</title>
</head>
<body>
<h1>Sign UP</h1>
<form action="signup"  method="post">
    <div>Login: <input type="text" name="login" placeholder="Login"/></div>
    <div>Password: <input type="text" name="password" placeholder="Password"/></div>
    <div>First Name: <input type="text" name="firstName" placeholder="First name"/></div>
    <div>Last Name: <input type="text" name="lastName" placeholder="Last name"/></div>
    <div>E-mail: <input type="text" name="email" placeholder="E-mail"/></div>
    <input type="submit" value="Sign Up">
</form>
</body>
</html>
