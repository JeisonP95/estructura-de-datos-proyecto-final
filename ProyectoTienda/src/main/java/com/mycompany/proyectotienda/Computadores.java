package com.mycompany.proyectotienda;

public class Computadores extends Producto implements IAplicacion {

    String procesador;

    //constructor
    public Computadores(String procesador, String nombre, double precio, int codigo, int almacenamiento, int ram, String color) {
        super(nombre, precio, codigo, almacenamiento, ram, color);
        this.procesador = procesador;
    }

    //metodos
    @Override
    public void realizarVenta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String AbrirApp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String ActualizarApp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String EliminarApp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //getter and setters
    public String getTarjetaGrafica() {
        return procesador;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.procesador = tarjetaGrafica;
    }

    @Override
    public String toString() {
        return "COMPUTADORES" + "\nProcesador: " + procesador + "\nMarca: " + getNombre() + "\nAlmacenamiento: " + getAlmacenamiento() + "\nRam: " + getRam() + "\nColor: " + getColor() + "\nPrecio: " + getPrecio();
    }

}
