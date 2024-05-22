package com.mycompany.proyectotienda;

public class Computadores extends Producto implements IAplicacion{

    private String tarjetaGrafica;

    //constructor
    public Computadores(String nombre, double precio, int codigo, int almacenamiento, int ram, String color) {
        super(nombre, precio, codigo, almacenamiento, ram, color);
    }

    //metodos
    @Override
    public void realizarVenta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String AbrirApp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String ActualizarApp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String EliminarApp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //getter and setters
    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public String toString() {
        return "Computadores{" + "tarjetaGrafica=" + tarjetaGrafica + '}';
    }
    
}
