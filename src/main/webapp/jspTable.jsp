<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.example.collabjava09.Instrumento" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>

<% try {
    Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
    throw new RuntimeException(e);
} %>

<HTML>
<HEAD>
    <TITLE> Tabla de Instrumentos </TITLE>
    <% String ruta = request.getContextPath() + "/css/style.css"; %>
    <link rel="stylesheet" type="text/css" href="<%= ruta %>" />
</HEAD>

<BODY>
<H1> La gran tabla babilónica de los instrumentos </H1>

<%
    Connection connection = null;
    try {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/java09", "root", "admin");
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

    Statement statement = null;
    try {
        statement = connection.createStatement();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    ResultSet resultset =
            null;
    try {
        resultset = statement.executeQuery("select * from instrumento");
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
%>
<% List<Instrumento> listaInstrumentos = new ArrayList<>(); %>
<% while (resultset.next()) {
    Instrumento instrumento = null;
    String nombre = resultset.getString(2);
    String familia = resultset.getString(3);
    String foto = resultset.getString(4);
    Date fecha = resultset.getDate(5);
    instrumento = new Instrumento(nombre, familia, foto, fecha);
    listaInstrumentos.add(instrumento);
} %>
<section>
    <h2>INSTRUMENTOS DE LA FAMILIA DE CUERDA PULSADA</h2>
    <div class="tabla">
    <TABLE BORDER="1">
        <TR>
            <TH>Nombre</TH>
            <TH>Familia</TH>
            <TH>Fecha</TH>
        </TR>
        <% for(Instrumento inst : listaInstrumentos) if (inst.getFamilia().equals("Cuerda pulsada")) { %>
        <TR>
            <TD><%= inst.getNombre() %></TD>
            <TD><%= inst.getFamilia() %></TD>
            <TD><%= inst.getFecha() %></TD>
        </TR>
        <% } %>
    </TABLE>
    </div>
</section>
<br><br><br>
<section>
    <h2>INSTRUMENTOS DE LA FAMILIA DE VIENTO METAL</h2>
    <TABLE BORDER="1">
        <TR>
            <TH>Nombre</TH>
            <TH>Familia</TH>
            <TH>Fecha</TH>
        </TR>
        <% for(Instrumento inst : listaInstrumentos) if (inst.getFamilia().equals("Viento metal")) { %>
        <TR>
            <TD><%= inst.getNombre() %></TD>
            <TD><%= inst.getFamilia() %></TD>
            <TD><%= inst.getFecha() %></TD>
        </TR>
        <% } %>
    </TABLE>
</section>
<p>Pulsa <a href="index.jsp">aquí</a> para ver el origen.</p>
</BODY>
</HTML>
