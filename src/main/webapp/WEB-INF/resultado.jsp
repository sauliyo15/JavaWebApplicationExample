<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejemplo HTML desde Servlet y JSP</title>
</head>
<body>
    <h1>Mensaje de bienvenida</h1>
    <h3>Bienvenido/a <u><%= request.getAttribute("nombre") %></u></h3>
</body>
</html>