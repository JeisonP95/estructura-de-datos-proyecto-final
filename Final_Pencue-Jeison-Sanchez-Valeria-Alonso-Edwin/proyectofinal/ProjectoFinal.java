package com.sanchezdarcypencuejesus.proyectofinal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ProjectoFinal {

    public static void main(String[] args) {
        Tienda tienda = new Tienda(new ArrayList<>());
        Productos cel1= new Celulares(1,"iphone12",123000,"1223",256,8,"blanco");
        
        tienda.agregarProducto(cel1);
        System.out.println(tienda);
        
    }
        
}

