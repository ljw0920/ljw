<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2022/12/6
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>

<%
    out.println("欢迎你：" + request.getSession().getAttribute("username"));
%>


</body>
</html>
