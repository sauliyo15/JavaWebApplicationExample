<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejemplo HTML desde Servlet y JSP</title>
</head>
<body>
    <h1>Inicio desde una página JSP</h1>
    <form action="/myServlet2">
        <label for="nombre">Escribe tu nombre:</label>
        <input type="text" id="nombre" name="nombre">
        <input type="submit" value="Enviar">
    </form>
</body>
</html>