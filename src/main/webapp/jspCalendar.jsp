<!DOCTYPE html>
<html  lang="es">
<head>
<title>Page Title</title>
</head>
<body>
<%@page language="java" import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.text.ParseException" %>
<H1>Bienvenido a JSPCalendar</H1>

<P>La fecha que has escogido es:</P>
<%-- Crear una instancia de JspCalendar pasando la fecha como parámetro --%>
<jsp:useBean id="clock" class="com.example.collabjava09.JspCalendar">
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
<LI>Año: <%= clock.getYear() %>
</UL>
<%-- Check for AM or PM --%>
<%! int time = Calendar.getInstance().get(Calendar.AM_PM); %>
<%
if (time == Calendar.AM) {
%>
Buenos días
<%
}
else {
%>
Buenas tardes
<%
}
%>
<%--
<%@ include file="copyright.html" %>
--%>
<p>Pulsa <a href="index.jsp">aquí</a> para ver el origen.</p>
</body>
</html> 
