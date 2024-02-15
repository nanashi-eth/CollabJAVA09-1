<!DOCTYPE html>
<html  lang="es">
<head>
<title>Page Title</title>
</head>
<body>
<%@page language="java" import="java.util.*" %>
<H1>Bienvenido a JSPCalendar</H1>

<P>La fecha que has escogido es:</P>
<%-- Obtener la fecha de la sesión --%>
<% Date fecha = (Date) session.getAttribute("fecha"); %>

<%-- Crear una instancia de JspCalendar pasando la fecha como parámetro --%>
<jsp:useBean id="clock" class="com.example.collabjava09.JspCalendar">
    <%
        clock.updateTime(fecha);
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
