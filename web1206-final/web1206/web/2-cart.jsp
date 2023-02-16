<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2022/12/6
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物</title>
</head>
<body>

购物车
<form action="/checkProduct" method="post">

    <!--
    <input type="checkbox" name="product" value="p1">商品1<br>
    <input type="checkbox" name="product" value="p2">商品2<br>
    <input type="checkbox" name="product" value="p3">商品3<br>
    <input type="checkbox" name="product" value="p4">商品4<br>
    <input type="checkbox" name="product" value="p5">商品5<br>
    -->
    <%
        HttpSession httpSession = request.getSession();
        String[] products = (String[]) httpSession.getAttribute("products");
        for(String product: products) {
           out.println("<input type='checkbox' name='product' value="+product+">商品"+product+"<br>");
        }
    %>

    <input type="submit">
</form>


</body>
</html>
