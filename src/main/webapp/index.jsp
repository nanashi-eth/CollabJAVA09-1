<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<h1>BIENVENIDO A LA PRÁCTICA 9 DE PSP</h1>
<h2>Autores</h2>
<p>Pablo Rodríguez Zambrana</p>
<p>Daniel Rosales Rodríguez</p>
<p>En esta página podrás averiguar tu signo del zodiaco y ver una colección de instrumentos musicales</p>
<form action="jspZodiac.jsp" id="zodiacForm">
    <strong>Introduce tu nombre, por favor</strong>
    <label>
        <input type="text" name="name"/>
    </label>
    <br><br>
    <strong>Introduce tu fecha de nacimiento, por favor</strong>
    <label>
        <input type="date" id="fechaNac" name="fechanac" required/>
    </label>
    <input type="submit" value="Ver Zodiaco"/>
</form>
<br/>

<p>Pulsa <a href="instrumento-servlet-tabla">aquí</a> para ver la gran tabla.</p>
<p>Pulsa <a href="instrumento-servlet-lista">aquí</a> para ver la gran lista.</p>
</body>

</html>