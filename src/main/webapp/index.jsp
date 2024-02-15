<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.ParseException" %>
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
<form action="jspCalendar.jsp" id="zodiacForm">
    <strong>Introduce tu nombre, por favor</strong>
    <label>
        <input type="text" name="name"/>
    </label>
    <br><br>
    <strong>Introduce tu fecha de nacimiento, por favor</strong>
    <label>
        <input type="date" id="fechaNac" name="fechanac"/>
    </label>
    <button type="button" onclick="submitForm()">Ver Zodíaco</button>
</form>

<script>
    function submitForm() {
        <c:choose>
            <c:when test='${param.fechanac != null}'>
        <%
        // Retrieve the date value from request parameters
        String fechaNacimientoString = request.getParameter("fechanac");

        // Parse the date string into a Java Date object
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = sdf.parse(fechaNacimientoString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        // Convert Java Date object to SQL Date object
        java.sql.Date sqlFechaNacimiento = new java.sql.Date(fechaNacimiento.getTime());
        %>
        <%-- Almacenar la fecha en la sesión --%>
        <% session.setAttribute("fecha", fechaNacimiento); %>
            </c:when>
        </c:choose>
        // Submit the form programmatically
        // Get the value of the date input field
        var fechaNacValue = document.getElementById("fechaNac").value;

        // Check if the date input is not empty
        if (fechaNacValue.trim() !== '') {
            // Submit the form
            document.getElementById("zodiacForm").submit();
        } else {
            // Inform the user that the date input is required
            alert("Por favor, introduce tu fecha de nacimiento.");
        }
    }
</script>
<br>
<c:forEach begin="0" step="1" end="3">
    <p> COMPRO ORO </p>
</c:forEach>
<p>Con JavaBeans: Pulsa <a href="jspCalendar.jsp">aquí</a> para ver saber en que momento estamos</p>
<c:choose>
    <c:when test='${param.fechanac != null}'>
        <%
            // Retrieve the date value from request parameters
            String fechaNacimientoString = request.getParameter("fechanac");

            // Parse the date string into a Java Date object
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaNacimiento = null;
            try {
                fechaNacimiento = sdf.parse(fechaNacimientoString);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            // Convert Java Date object to SQL Date object
            java.sql.Date sqlFechaNacimiento = new java.sql.Date(fechaNacimiento.getTime());
        %>
        &lt;%&ndash; Crear una fecha &ndash;%&gt;
        <% Date fechaEjemplo = new Date(); %>

        &lt;%&ndash; Almacenar la fecha en la sesión &ndash;%&gt;
        <% session.setAttribute("fecha", fechaNacimiento); %>

        <a href="jspCalendar.jsp">Ir a página destino con fecha</a>
        <!-- Display parsed dates using HTML p elements -->
        <p>Fecha de nacimiento (Java Date): <%= fechaNacimiento %>
        </p>
        <p>Fecha de nacimiento (SQL Date): <%= sqlFechaNacimiento %>
        </p>
    </c:when>
</c:choose>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>