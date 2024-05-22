package com.mycompany.proyectotienda;

public abstract class Empleados {

    private float valorHora;
    private String nombre;
    private int numTelefono;
    private int id;

    public abstract void salario();

    public Empleados(float valorHora, String nombre, int numTelefono, int id) {
        this.valorHora = valorHora;
        this.nombre = nombre;
        this.numTelefono = numTelefono;
        this.id = id;
    }
    
     public Empleados() {
        this.valorHora = 0;
        this.nombre = "";
        this.numTelefono = 0;
        this.id = 0;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
