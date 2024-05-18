package com.final_pencuejeisonsanchezvaleriaalonsoedwin.final_pencue.jeison.sanchez.valeria.alonso.edwin;

import java.util.ArrayList;

public class Usuarios {

    private String nombre;
    private int cedula;

    public Usuarios(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", cedula=" + cedula + '}';
    }
}
