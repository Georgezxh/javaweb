<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<html>

<%--<style >--%>
<%--    /*border: 3px solid #73AD21;*/--%>
<%--    body{--%>
<%--        /*background-image: url("../images/a.jpg");*/--%>
<%--        background-repeat: no-repeat;--%>
<%--        background-size: cover;--%>
<%--    }--%>

<%--</style>--%>
<body bgcolor="#ffe4c4">
<script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
<link rel="stylesheet"  type="text/css">
<div style="text-align: center;margin-top: 300px">
    <form action="login" role="form" id="loginform">
        User:<input name="username" type="text" placeholder="Please input username"
                    value="${messageModel.object.username}" id="username">
        <br>
        Password:<input name="password" type="text" placeholder="Please input password" id="password">
        <br>
        <span id="msg" style="color: red; ">${messageModel.msg}</span>
        <button type="submit" id="loginBtn">Login</button>

    </form>
    <a href="register.jsp">
        <button type="button" id="regBtn">Register</button>
    </a>
<%--    <form action="register" role="form" >--%>
<%--        <span id="msg2" style="color: red; ">${messageModel.msg}</span>--%>

<%--    </form>--%>

</div>
<script>
    $(document).ready(function () {
        $("#loginBtn").click(function () {
            <%--$.post({--%>
            <%--    url:"${pageContext.request.contextPath}",--%>
            <%--    data:{'name':$("#username").val(), 'pwd':$("#password").val()},--%>
            <%--    success:function (data) {--%>
            <%--        alert(data)--%>
            <%--if(data.toString()=="right"){--%>
            <%--    $(location).attr('href', "${pageContext.request.contextPath}/book/allBook");--%>
            <%--}--%>
            <%--if(data.toString()=="false"){--%>
            <%--    alert("用户名不存在");--%>
            <%--}--%>
            <%--if (data.toString()== "passnot"){--%>
            <%--    alert("密码错误")--%>
            <%--}--%>
            // }
            // });
            var x = $("#username").val();
            var y = $("#password").val();
            if (x == null || x.trim() === "" || y == null || y.trim() === "") {
                alert("请输入用户名和密码！");
            }
        });
    });


    //         if ("用户名和密码不能为空！".equals(request.getSession().getAttribute("msg"))) {
    // // <script type="text/javascript">
    //             alert("用户名或者密码错误！");
    //         }
    <%--</script>--%>


    <%--<%--%>

</script>


</body>
</html>