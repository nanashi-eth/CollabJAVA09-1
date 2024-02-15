<!DOCTYPE html>
<html  lang="es">
<head>
<title>Page Title</title>
</head>
<body>
<%@page language="java" import="java.util.*" %>
<H1>Bienvenido a JSPCalendar</H1>

<P>La fecha que has escogido es:</P>
<%-- Obtener la fecha de la sesi�n --%>
<% Date fecha = (Date) session.getAttribute("fecha"); %>

<%-- Crear una instancia de JspCalendar pasando la fecha como par�metro --%>
<jsp:useBean id="clock" class="com.example.collabjava09.JspCalendar">
    <%
        clock.updateTime(fecha);
    %>
</jsp:useBean>

<!-- Resto del c�digo para mostrar la fecha -->

<UL>
<LI>D�a: <%= clock.getDayOfMonth() %>
<LI>Mes: <%= clock.getMonthInt() %>
<LI>A�o: <%= clock.getYear() %>
</UL>
<%-- Check for AM or PM --%>
<%! int time = Calendar.getInstance().get(Calendar.AM_PM); %>
<%
if (time == Calendar.AM) {
%>
Buenos d�as
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
<p>Pulsa <a href="index.jsp">aqu�</a> para ver el origen.</p>
</body>
</html> 
