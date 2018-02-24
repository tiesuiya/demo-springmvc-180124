<!doctype html>
<%--
  Created by IntelliJ IDEA.
  User: Hong
  Date: 2018/2/24
  Time: 上午11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/resources/js/jquery_2.1.4.min.js"></script>
</head>
<body style="background-image: url('http://img.zcool.cn/community/01826f5788901c0000012e7e8110fa.jpg@1280w_1l_2o_100sh.jpg');background-repeat: no-repeat;">
<div id="loginContainer">
    <input type="text" id="userName" style="width:300px; height:30px;"/>
    <input type="password" id="passWord" style="width:300px; height:30px;"/>
    <input type="button" id="loginButton" value="登录"/>
</div>
<script>
    $("#loginButton").click(function () {
        var userName = $("#userName").val();
        var passWord = $("#passWord").val();
        $.ajax({
            url: "/login",
            data: {
                userName: userName,
                passWord: passWord
            },
            type: 'post',
            success: function (data, status) {
                if (data == "1") {
                    alert("登录成功！>>>" + data);
                } else {
                    alert("登录失败！>>>" + data);
                }
            }
        });
    });
</script>

</body>
</html>
