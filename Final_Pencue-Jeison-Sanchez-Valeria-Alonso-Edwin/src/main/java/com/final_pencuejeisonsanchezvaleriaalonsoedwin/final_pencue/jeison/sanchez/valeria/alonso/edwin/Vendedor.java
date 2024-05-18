package com.final_pencuejeisonsanchezvaleriaalonsoedwin.final_pencue.jeison.sanchez.valeria.alonso.edwin;

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
        System.out.println("por ahora nada");
    }
    
    @Override
    public String ejecutarTrabajo() {
        return "por ahora nada";
    }

    public void comision() {
        System.out.println("por ahora nada");
    }

    //getters and setters
    public int getNumVentas() {
        return numVentas;
    }

    public void setNumVentas(int numVentas) {
        this.numVentas = numVentas;
    }
}
