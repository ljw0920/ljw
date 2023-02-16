<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2022/12/6
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>结账页面</title>
</head>
<body>

结账页面
<form action="/pay" method="post">

    <%
        HttpSession httpSession = request.getSession();
        String[] checkProducts = (String[]) httpSession.getAttribute("checkProducts");
        for(String product: checkProducts) {
            out.println("<input type='checkbox' name='product' value="+product+">商品"+product+"<br>");
        }
    %>

    <input type="submit">

</form>

</body>
</html>
