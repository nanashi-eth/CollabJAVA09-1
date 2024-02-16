<!DOCTYPE html>
<html  lang="es">
<head>
    <title>Page Title</title>
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/style.css">
</head>
<body>
<%@page language="java" import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.text.ParseException" %>
<H1>Bienvenido a JSPCalendar</H1>

<P>La fecha que has escogido es:</P>
<%-- Crear una instancia de JspCalendar pasando la fecha como parámetro --%>
<jsp:useBean id="clock" class="com.example.collabjava09.JspZodiac">
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
            
        clock.updateTime(fechaNacimiento);
    %>    
</jsp:useBean>

<!-- Resto del código para mostrar la fecha -->

<UL>
<LI>Día: <%= clock.getDayOfMonth() %>
<LI>Mes: <%= clock.getMonthInt() %>
</UL>

<section>
    <% String ruta = request.getContextPath() + "/resources/" + clock.getZodiaco() + ".jpg"; %>
    <img class="img_zodiac" src="<%= ruta %>" alt="Zodiac Sign Image">
    <p class="text_title"><%= clock.getZodiaco() %></p>
    <div class="text_zodiac"><%= clock.getTextZodiaco(clock.getZodiaco())%></div>
</section>
<%--
<%@ include file="copyright.html" %>
--%>
<p>Pulsa <a href="index.jsp">aquí</a> para ver el origen.</p>
</body>
</html> 
