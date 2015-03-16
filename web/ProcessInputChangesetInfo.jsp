<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Get Input Values </title>
    <link rel="stylesheet" href="styles/bootstrapmin.css">
    <script src="scripts/jquery.min.js"></script>
    <script src="scripts/bootstrapmin.js"></script>
    <link rel="stylesheet" type="text/css" href="styles/textbox.css">
</head>
<body>

    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand">
                    <img src="images/ask-logo.png" align="left" height="35" width="46">
                </a>
                <a class="navbar-brand">Zen Tool</a>
            </div>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="index.jsp"> Back </a></li>
                <li><a href="index.jsp"> Home </a></li>
            </ul>
        </div>
    </nav>
</div>
<div class="panel panel-default">
    <div class="panel-body">Add data content</div>
</div>
<div class="search-wrapper">
    <form action="ProcessInputChangesetInfoServlet" method="post" name="myForm">
        <center>
            <table>
                <tr>
                    <td> Category/Tagg:</td>
                    <td><input type="text" class="search-box" name="category" id="category" pattern="[a-zA-z ]+" placeholder="Enter the category" required/></td>
                </tr>
                <br/>
                <tr>
                    <td> Changeset:</td>
                    <td><input type="url" class="search-box" id="changeset" name="changeset" pattern="https?://.,{1,}+" placeholder="Enter the changeset url" required/></td>
                </tr>
                <br/>
                <tr>
                    <td> Ticket:</td>
                    <td><input type="url" class="search-box" id="ticket" name="ticket" pattern="https?://.,{1,}+" placeholder="Enter the ticket url" required/></td>
                </tr>
                <br/>
                <tr>
                    <td> Wiki-documentation:</td>
                    <td><input type="url" class="search-box" id="doc" name="doc" pattern="https?://.,{1,}+" placeholder="Enter the wiki-documentation url" required/></td>
                </tr>
                <br/>
                <tr>
                    <td> Comments:</td>
                    <td><input type="text" class="search-box" id="comments" name="comments" pattern="[a-zA-Z0-9 ]+" placeholder="Enter comments if any"/></td>
                </tr>
                <br/>
            </table>

            <input type="submit" class="btn" value="Add"/>
        </center>
    </form>
</div>
</body>
</html>
