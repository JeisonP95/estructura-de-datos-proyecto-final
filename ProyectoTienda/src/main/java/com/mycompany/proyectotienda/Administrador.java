package com.mycompany.proyectotienda;

public class Administrador extends Empleados implements ITrabajable{

    //contructor
    public Administrador(float valorHora, String nombre, int numTelefono, int id) {
        super(valorHora, nombre, numTelefono, id);
    }
    
    //metodos
    public void organizarInventario(){
        System.out.println("por ahora nada");
    }

    @Override
    public void salario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String ejecutarTrabajo() {
        return "por ahora nada";
    }
}
