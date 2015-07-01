<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Untitled Cafe</title>

    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/own.css">
</head>

<body>
    <nav class="navbar navbar-default navbar-static-top" id="my-navbar">
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

     <div class="container">
        <div class="row">
            <div class="col-md-12 text-center">
                <h1 class="text-inverse">Welcome to Untitled Cafe</h1>
                <p class="text-inverse">Lorem ipsum dolor sit amet, consectetur adipisici eli.</p>
                <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                <br>
            </div>
        </div>
    </div>
</div>

<%--<ol class="breadcrumb">
    <li><a href="#">Home</a></li>
    <li><a href="#">Library</a></li>
    <li class="active">Data</li>
</ol>
Inside ROW
--%>
    <footer class="footer">
        <div class="container">
            <p class="text-muted">Place sticky footer content here.</p>
        </div>
    </footer>


<script src="<%=request.getContextPath()%>/assets/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/assets/js/bootstrap.js"></script>
</body>
</html>
