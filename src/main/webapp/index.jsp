<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<h1><%= "Hola primero inicia sesión" %>
</h1>
<br/>
<h1>Ir al login</h1>
<form action="${pageContext.request.contextPath}/http-request" method="post">
    <button value="list" type="submit">Login</button>
</form>
<h1>Ir a las url</h1>
<div class="code-container">
    <a href="url.jsp">Ir</a>
</div>
<%--<h1>Servlet consola</h1>
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
</form>--%>
<%--<form action="${pageContext.request.contextPath}/id-servlet" method="post">
    <button value="list" type="submit">Ver producto</button>--%>
</form>
</body>
</html>