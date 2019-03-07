<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/9
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JQuery</title>
    <style type="text/css">
        #id1{
            background-color: #00aa00;
            width: 200px;
            height: 50px;
        }
        .c1{
            background-color: #00aa00;
        }
        .c2{
            background-color: #202020;
        }
    </style>
    <script type="text/javascript" src="js/jquery-3.3.1.min%20.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn1").click(function () {
               // $("#id1").toggle();
                //$("#id1").addClass("c1");
                 $("#id1").toggleClass("c2");
                //alert($("#id1").html());
            });
        });

    </script>
</head>
<body>
    <input type="button" id="btn1" value="click"><br>
    <div id="id1">

    </div>
</body>
</html>
