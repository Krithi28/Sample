<%--
  Created by IntelliJ IDEA.
  User: 441691
  Date: 12/30/2014
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script>
    $(document).ready(function(){
      $("button").click(function(){
        $.getJSON("demo_ajax_json.js",function(result){
          $.each(result, function(i, field){
            $("div").append(field + " ");
          });
        });
      });
    });
  </script>
</head>
<body>

<button>Get JSON data</button>
<div></div>

</body>
</html>

