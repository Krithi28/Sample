<%--
  Created by IntelliJ IDEA.
  User: 441691
  Date: 12/23/2014
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title> Zen Tool </title>
    <link rel="stylesheet" href="styles/bootstrap.min.css">
    <link rel="stylesheet" href="styles/bootstrap-theme.min.css">
    <script src="scripts/jquery.min.js"></script>
    <script src="scripts/bootstrapmin.js"></script>
    <link rel="stylesheet" type="text/css" href="styles/textbox.css">
    <style type="text/css">
        .bs-example {
            margin: 20px;
        }
    </style>
</head>
<body>
<div class="bs-example">
    <nav role="navigation" class="navbar navbar-default">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
            </button>
            <div id="logo">
                <img src="images/ask-logo.png"/>
            </div>
            <a class="navbar-brand">Zen Tool</a>
        </div>
        <!-- Collection of nav links and other content for toggling -->
        <div id="navbarCollapse" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="ProcessInputChangesetInfo.jsp">Add</a></li>
                <li><a href="ViewChangesetInfo.jsp">View</a></li>
            </ul>
        </div>

    </nav>
    <div id="askjeeves">
        <img src="images/jeeves.png"/>
        <span class="bubble">Watch this space for more information</span>
    </div>

</div>

</body>
</html>

