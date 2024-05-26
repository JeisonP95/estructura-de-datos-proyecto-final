package com.mycompany.inventariotiendacelulares;

public class Celulares {

    private String nombre;
    private double precio;
    private int codigo;
    private int almacenamiento;
    private int ram;
    private String color;
    int cantidadSim;

    public Celulares(String nombre, double precio, int codigo, int almacenamiento, int ram, String color, int cantidadSim) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.color = color;
        this.cantidadSim = cantidadSim;
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

    public int getCantidadSim() {
        return cantidadSim;
    }

    public void setCantidadSim(int cantidadSim) {
        this.cantidadSim = cantidadSim;
    }

    @Override
    public String toString() {
        return "CELULARES" + "\nMarca: " + nombre + "\nCelular de: " +cantidadSim+ " Sim " + "\nColor: " + color +"\nAlmacenamiento: " + almacenamiento + " GB" +"\nRam: " + ram + "\nCodigo: " + codigo + "\nPrecio: " + precio;
    }
    

}
