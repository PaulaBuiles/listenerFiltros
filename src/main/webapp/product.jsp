<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Formulario básico</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<h1>Buscar Producto por Id</h1>
<form action="${pageContext.request.contextPath}/id-servlet" method="GET">
  <label >Id del producto a buscar: </label>
  <label>
    <input type="text" name="id" required>
  </label><br>
  <input type="submit" value="Enviar">
</form>
</body>
</html>

