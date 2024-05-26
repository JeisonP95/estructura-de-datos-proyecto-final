package com.mycompany.proyectotienda;

public class Vendedor extends Empleados implements ITrabajable{

    //atributos
    private int numVentas;

    //constructor
    public Vendedor(float valorHora, String nombre, int numTelefono, int id) {
        super(valorHora, nombre, numTelefono, id);
    }

    //metodos
    @Override
    public void salario() {
        System.out.println("Por ahora nada");
    }
    
    @Override
    public String ejecutarTrabajo() {
        return "Por ahora nada";
    }

    public void comision() {
        System.out.println("Por ahora nada");
    }

    //getters and setters
    public int getNumVentas() {
        return numVentas;
    }

    public void setNumVentas(int numVentas) {
        this.numVentas = numVentas;
    }
}
