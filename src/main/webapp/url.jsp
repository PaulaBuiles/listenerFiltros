<%--
  Created by IntelliJ IDEA.
  User: Paula
  Date: 25/04/2023
  Time: 9:47 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Que deseas hacer:</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<h1>Servlet consola</h1>
<form action="${pageContext.request.contextPath}/http-request" method="get">
    <div class="clearfix">
        <button value="list" type="submit">Ver lista</button>
    </div>
</form>
<h1>Products xls servlet/Excel</h1>
<form action="${pageContext.request.contextPath}/productos" method="get">
    <button value="list" type="submit">Ver lista</button>
</form>
<h1>Products json servlet</h1>
<form action="${pageContext.request.contextPath}/productos.json" method="get">
    <button value="list" type="submit">Ver lista formato json</button>
</form>
<h1>Hora servlet</h1>
<form action="${pageContext.request.contextPath}/hora-Servlet" method="get">
    <button value="list" type="submit">Ver hora</button>

</form>
<h1>Buscar producto por id</h1>
<div class="code-container">
    <a href="product.jsp">Producto id</a>
</div>
<h1>Listener</h1>
<form action="${pageContext.request.contextPath}/http-listener" method="get">
    <button value="list" type="submit">Ver listener</button>
</form>
</body>
</html>
