/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanchezdarcypencuejesus.proyectofinal;


public class vendedor extends Empleados implements iTrabajable{
    public int numVentas;

    public vendedor(int numVentas, String nombre, int id, float valorHora, int numTelefono) {
        super(nombre, id, valorHora, numTelefono);
        this.numVentas = numVentas;
    }

    @Override
    float salario() {
        return getValorHora()*70+numVentas;
    }
    @Override
    public String ejecutarTrabajo(){
        return ("El vendedor atiende los clientes ");
    }
}
