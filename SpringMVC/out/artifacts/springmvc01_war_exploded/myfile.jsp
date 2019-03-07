<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/9
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form action="uploadmyfile" enctype="multipart/form-data" method="post">
        文件:<input type="file" name="myfile"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
