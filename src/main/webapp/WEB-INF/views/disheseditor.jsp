<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Untitled Cafe. Dishes editor.</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/own.css">
</head>

<body>
<nav class="navbar navbar-default navbar-fixed-top" id="my-navbar">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="" class="navbar-brand">Untitled Cafe</a>
        </div>

        <div class="collapse navbar-collapse" id="navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="login">Login</a></li>
                <li><a href="signup">Sign up</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="padding40 container-fluid">
    <h1>Welcome to Untitled Cafe</h1>
    <div class="navbar">
        <div class="navbar-inner">
            <div class="container">
                <ul class="nav">
                    <li>
                        <a href="signup">Sign UP</a>
                    </li>
                    <li>
                        <a href="signin">Sign IN</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>

    <div class="hero-unit">
        <h1>Marketing stuff!</h1>

        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>

        <a href="#" class="btn btn-large btn-success">Get Started</a>
    </div>



</div>
<div class="body">
    <h2> Some information about session</h2>
</div>

<div class="bottom">
    <h3>Bottom</h3>
</div>
</div>

<script src="<%=request.getContextPath()%>/assets/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/assets/js/bootstrap.js"></script>
</body>
</html>
