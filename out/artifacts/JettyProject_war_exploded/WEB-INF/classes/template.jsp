<%--
  Created by IntelliJ IDEA.
  User: 441691
  Date: 2/24/2015
  Time: 5:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Zen Tool</title>
  <link rel="stylesheet" href="styles/layout.css" type="text/css" />
  <script type='text/javascript'>
    window.history.forward();
   /* function noBack()
    {
      window.history.forward();
    }*/
  </script>
  <script type="text/javascript" src="scripts/piecemaker/swfobject/swfobject.js"></script>
  <script type="text/javascript">
    var flashvars = {};
    flashvars.cssSource = "scripts/piecemaker/piecemaker.css";
    flashvars.xmlSource = "scripts/piecemaker/piecemaker.xml";
    var params = {};
    params.play = "false";
    params.menu = "false";
    params.scale = "showall";
    params.wmode = "transparent";
    params.allowfullscreen = "true";
    params.allowscriptaccess = "sameDomain";
    params.allownetworking = "all";
    swfobject.embedSWF('scripts/piecemaker/piecemaker.swf', 'piecemaker',
            '960', '430', '10', null, flashvars, params, null);
  </script>
</head>

<body bgcolor="white" id="top" <%--onload="noBack();" --%>onpageshow="if (event.persisted) noBack();" onunload="">
<div class="wrapper col1">
  <div id="topbar" class="clear">
    <form action="#" method="post" id="search">
    </form>
  </div>
</div>
<div class="wrapper col2">
  <div id="header" class="clear">
    <div class="fl_left">
      <h1>Zen Tool</h1>
      <p>Add and View Data</p>
    </div>
  </div>
</div>
</body>
</html>
