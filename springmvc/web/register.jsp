<%--
  Created by IntelliJ IDEA.
  User: z50020261
  Date: 2021/7/16
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#ffe4c4">
<script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
<link rel="stylesheet"  type="text/css">
<div style="text-align: center;margin-top: 300px">
    <form action="register" role="form" >
        User:<input name="username" type="text" placeholder="Please input username" id="username"
                    value="${messageModel.object.username}">
        <br>
        Password:<input name="password" type="text" placeholder="Please input password" id="password">
        <br>
        <span id="msg" style="color: red; ">${messageModel.msg}</span>
        <button type="submit" id="regBtn">Register</button>
    </form>

</div>
<script>
    $(document).ready(function () {
        $("#regBtn").click(function () {
            var x = $("#username").val();
            var y = $("#password").val();
            if (x == null || x.trim() === "" || y == null || y.trim() === "") {
                alert("请输入用户名和密码！");
            }
        });
    });
</script>
</body>
</html>
