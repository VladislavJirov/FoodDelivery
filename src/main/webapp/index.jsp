<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Untitled Cafe</title>
</head>
<body>
<div class="header-panel">
    <div class="navigation">
        <ul>
            <li>
                <a href="signup.jsp">Sign UP</a>
            </li>
            <li>
                <a href="signin.jsp">Sign IN</a>
            </li>
        </ul>
    </div>
    <div class="greeting">
        <h1>Hello ${name} Welcome to Untitled Cafe Website</h1>
    </div>
</div>
<div class="body">
    <h2> Some information about session</h2>
    <pre> ${session} </pre>
</div>

<div class="bottom">
    <h3>Bottom</h3>
</div>
</body>
</html>
