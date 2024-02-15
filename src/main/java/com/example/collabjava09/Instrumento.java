package com.example.collabjava09;

import java.util.Date;

public class Instrumento {
    private String nombre;
    private String familia;
    private String foto;
    private Date fecha;


    public Instrumento(String nombre, String familia, String foto, Date fecha) {
        this.nombre = nombre;
        this.familia = familia;
        this.foto = foto;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
