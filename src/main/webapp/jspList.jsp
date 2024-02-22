<%@ page import="com.example.collabjava09.Instrumento" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
    <title>Lista</title>
    <% String ruta = request.getContextPath() + "/css/style.css"; %>
    <link rel="stylesheet" type="text/css" href="<%= ruta %>" />
    <link rel="icon" type="image/png" href="<%= request.getContextPath() %>/resources/favicon.png">
</head>
<body>
<% List<Instrumento> listaInstrumentos = (List<Instrumento>) session.getAttribute("listaInstrumentos"); %>
<% ruta = request.getContextPath() + "/resources/"; %>
<div id="divLista">
    <% for(Instrumento inst : listaInstrumentos) { %>
        <article>
            <img class="img_instrumento" src="<%= ruta + inst.getFoto() %>" alt="foto_de_instrumento"/>
            <br>
            <h3> <%= inst.getNombre() %></h3>
            <br>
            <p> <%= inst.getFamilia() %></p>
            <br>
            <p> <%= inst.getFecha() %></p>
        </article>
    <% } %>
</div>
</body>
</html>
