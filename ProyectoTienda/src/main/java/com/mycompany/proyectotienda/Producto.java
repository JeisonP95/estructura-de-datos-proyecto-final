package com.mycompany.proyectotienda;

public abstract class Producto {

    private String nombre;
    private double precio;
    private int codigo;
    private int almacenamiento;
    private int ram;
    private String color;

    public abstract void realizarVenta();

    public Producto(String nombre, double precio, int codigo, int almacenamiento, int ram, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", codigo=" + codigo + ", almacenamiento=" + almacenamiento + ", ram=" + ram + ", color=" + color + '}';
    }
    
}
