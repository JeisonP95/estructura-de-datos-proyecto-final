package com.mycompany.proyectotienda;

public class Celulares extends Producto implements IAplicacion {

    int cantidadSim;

    //constructor
    public Celulares(int cantidadSim, String nombre, double precio, int codigo, int almacenamiento, int ram, String color) {
        super(nombre, precio, codigo, almacenamiento, ram, color);
        this.cantidadSim = cantidadSim;
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
    public int getCantidadSim() {
        return cantidadSim;
    }

    public void setCantidadSim(int cantidadSim) {
        this.cantidadSim = cantidadSim;
    }

    @Override
    public String toString() {
        return "CELULARES" + "\nCantidad Sim: " + cantidadSim + "\nMarca: " + getNombre() + "\nAlmacenamiento: " + getAlmacenamiento()  + "\nRam: " + getRam() + "\nColor: " + getColor() + "\nPrecio: " + getPrecio() ;
    }

}
