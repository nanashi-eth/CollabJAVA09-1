<!DOCTYPE html>
<html  lang="es">
<head>
    <title>Page Title</title>
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/style.css">
    <link rel="icon" type="image/png" href="<%= request.getContextPath() %>/resources/favicon.png">
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

<section>
    <% String ruta = request.getContextPath() + "/resources/" + clock.getZodiaco() + ".jpg"; %>
    <img class="img_zodiac" src="<%= ruta %>" alt="Zodiac Sign Image">
    <H3 class="text_zodiac"><%= clock.getZodiaco() %></H3>
    <div class="text_zodiac"><%= clock.getTextZodiaco(clock.getZodiaco())%></div>
</section>
<%--
<%@ include file="copyright.html" %>
--%>
<p>Pulsa <a href="index.jsp">aquí</a> para ver el origen.</p>
</body>
</html> 
