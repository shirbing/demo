<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/9
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.3.1.min%20.js"></script>
    <script type="text/javascript">
        $(function () {
           $("#f1").change(function () {
               var data=new FormData($("#form1")[0]);
               $.ajax({
                   type:"post",
                   url:"uploadmyfile1",
                   data:data,
                   cache:false,
                   processData:false,
                   contentType:false,
                   beforeSend:function () {
                    },
                   success:function (msg) {

                     //  $("#img1").attr("src", msg);

                       $(document).ready(function(){
                           $("#img1").prop("src",msg);
                           $("#img1").bind("load",function(){

                               var width = 200;
                               var height = 150;
                               var image = $(this);
                               if (image.width() > image.height()){
                                   if(image.width()>width){
                                       image.width(width);
                                       image.height(width/image.width()*image.height());
                                   }
                               }else{
                                   if(image.height()>height){
                                       image.height(height);
                                       image.width(height/image.height()*image.width());
                                   }
                               }
                           });
                       });

                   },
                    error:function () {
                    }
               });
           });
        });
    </script>

</head>
<body>
    <form method="post" enctype="multipart/form-data" id="form1">
        <input type="file" name="myfile" id="f1"><img src=""  id="img1"><br>
    </form>
</body>
</html>
