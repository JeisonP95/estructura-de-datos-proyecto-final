package com.sanchezdarcypencuejesus.proyectofinal;

public abstract class Productos {

    protected String nombre;
    protected double precio;
    protected String codigo;
    protected int almacenamiento;
    protected int ram;
    protected String color;

    public Productos(String nombre, double precio, String codigo, int almacenamiento, int ram, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.color = color;
    }
    
    public abstract String realizarVenta();
}

