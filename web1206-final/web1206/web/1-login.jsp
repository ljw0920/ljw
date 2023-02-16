<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2022/12/6
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登入</title>
</head>
<body>

<script>
    window.onload = function() {
        // console.log(document.cookie);
        // console.log(getCookie("username"))
        // console.log(getCookie("password"))

        if(getCookie("remPwd") == "1"){
            document.getElementsByName("username")[0].value = getCookie("username")
            document.getElementsByName("password")[0].value = getCookie("password")
            document.getElementsByName("remPwd")[0].checked = true;
        } else {
            document.getElementsByName("username")[0].value = "";
            document.getElementsByName("password")[0].value = "";
            document.getElementsByName("remPwd")[0].checked = false;
        }
    }

    function getCookie(cname) {
        var name = cname + "=";
        var ca = document.cookie.split(';');
        for(var i = 0; i < ca.length; i++) {
            var c = ca[i];
            while (c.charAt(0) == ' ') {
                c = c.substring(1);
            }
            if (c.indexOf(name)  == 0) {
                return c.substring(name.length, c.length);
            }
        }
        return "";
    }
</script>



<form action="/login" method="post">
    用户名<input type="text" name="username"><br>
    密码 <input type="password" name="password"><br>

    <input type="checkbox" name="remPwd" value="1"> 记住密码<br>
    <input type="submit" value="login">
</form>


</body>
</html>
