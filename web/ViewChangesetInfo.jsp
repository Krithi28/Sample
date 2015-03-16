<%@ page import="com.mongodb.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>

<%--
  Created by IntelliJ IDEA.
  User: 441691
  Date: 1/7/2015
  Time: 5:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title> View Data Here </title>
    <link rel="stylesheet" href="styles/bootstrapmin.css">
    <script src="scripts/jquery.min.js"></script>
    <script src="scripts/bootstrapmin.js"></script>
    <link rel="stylesheet" type="text/css" href="styles/textbox.css">
    <script>
        function ChooseCategory(data) {
            document.getElementById("other").value = data.value;
        }
    </script>
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
    <div class="panel-body">View data content</div>
</div>
<div class="search-wrapper">
    <form action="ViewChangesetInfoServlet" method="post" name="myForm">
        <center>
            <table>

                <tr>
                    <td> Category/Tagg:</td>

                    <td><select class="search-box" id="sel1" onchange="ChooseCategory(this)" name="select" required>
                        <option value=""> Please select</option>
                        <%
                            ArrayList<String> result = new ArrayList<String>();
                            try {
                                Mongo mongo = new Mongo("10.0.77.216", 27017);
                                DB db = mongo.getDB("zentooldb");
                                DBCollection table = db.getCollection("addcontent");

                                BasicDBObject query = new BasicDBObject();
                                BasicDBObject field = new BasicDBObject();
                                field.put("category", 1);
                                DBCursor cursor = db.getCollection(String.valueOf(table)).find(query, field);
                                while (cursor.hasNext()) {
                                    BasicDBObject obj = (BasicDBObject) cursor.next();
                                    result.add(obj.getString("category"));
                                }
                        %>
                        <%-- <%
                             Object value = request.getAttribute("category");
                         %>--%>
                        <c:forEach var="item" items="<%= result%>">
                            <option>${item}</option>
                        </c:forEach>
                        <%
                            } catch (Exception ee) {
                                ee.printStackTrace();
                            }
                        %>
                    </select></td>
                    <br/>
                <tr>
                    <td> Other:</td>
                    <td><input type="text" class="search-box" name="other" id="other" required/></td>
                    <br/>
                </tr>
            </table>
            <input type="submit" class="btn" value="View"/>
        </center>
    </form>
</div>
</body>
</html>