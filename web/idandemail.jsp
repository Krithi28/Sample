<%--
  Created by IntelliJ IDEA.
  User: 441691
  Date: 12/30/2014
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<script>
  function createJSON() {
    jsonObj = [];
    $("input[class=email]").each(function() {

      var id = $(this).attr("title");
      var email = $(this).val();

      item = {};
      item ["title"] = id;
      item ["email"] = email;

      jsonObj.push(item);
    });

    console.log(jsonObj);
    jsonString = JSON.stringify(jsonObj);
    alert(jsonString);
  }
</script>
<body>

<input type="text" id="title"><br/>
<input type="text" id="email"><br/>
<input type="button" name="Enter" value="Click" onclick="createJSON();">

</body>
</html>
