package com.mycompany.proyectotienda;

public class Cajero extends Empleados implements ITrabajable{

    public Cajero(float valorHora, String nombre, int numTelefono, int id) {
        super(valorHora, nombre, numTelefono, id);
    }

    @Override
    public void salario() {
        System.out.println("Por ahora nada");
    }
    
    @Override
    public String ejecutarTrabajo() {
        return "Por ahora nada";
    }
    
}
