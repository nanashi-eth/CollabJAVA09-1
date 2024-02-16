package com.example.collabjava09;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "InstrumentoServletLista", value = "/instrumento-servlet-lista")
public class InstrumentoServletLista extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("listaInstrumentos") == null) {
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3307/java09", "root", "admin");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            Statement statement = null;
            ResultSet resultset = null;
            List<Instrumento> listaInstrumentos = new ArrayList<>();

            try {
                statement = connection.createStatement();
                resultset = statement.executeQuery("select * from instrumento");

                while (resultset.next()) {
                    String nombre = resultset.getString(2);
                    String familia = resultset.getString(3);
                    String foto = resultset.getString(4);
                    Date fecha = resultset.getDate(5);
                    Instrumento instrumento = new Instrumento(nombre, familia, foto, fecha);
                    listaInstrumentos.add(instrumento);
                }

                HttpSession session = request.getSession();
                session.setAttribute("listaInstrumentos", listaInstrumentos);
                request.getRequestDispatcher("jspList.jsp").forward(request, response);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (resultset != null) resultset.close();
                    if (statement != null) statement.close();
                    if (connection != null) connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        else {
            request.getRequestDispatcher("jspList.jsp").forward(request, response);
        }
    }
}
