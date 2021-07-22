<%--
  Created by IntelliJ IDEA.
  User: z50020261
  Date: 2021/7/2
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#ffe4c4">
<script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>


<h1 style="text-align: center">Welcome!${messageModel.object.username}</h1>
<div id="Info" style="text-align: center">
    User:${messageModel.object.username}
    <br>
    Password:${messageModel.object.password}
<%--    <a href="${pageContext.request.contextPath}/logout">注销</a>--%>
</div >

<script>
    alert("Success!")
</script>
</body>
</html>
