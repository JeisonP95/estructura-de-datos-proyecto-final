package com.final_pencuejeisonsanchezvaleriaalonsoedwin.final_pencue.jeison.sanchez.valeria.alonso.edwin;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

    ArrayList<Producto> productos = new ArrayList<>();

    public void agregar() {
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        String nombre;
        double precio;
        int codigo;
        int almacenamiento;
        int ram;
        String color;

        System.out.println(
                "1. desea agregar un celular?");
        System.out.println(
                "2. desea agregar un computador?");

        opcion = scan.nextInt();
        scan.nextLine();

        switch (opcion) {
            case 1:
                //se piden los datos al usuarios
                System.out.println("Agregue el numero de sim que desea en su celular");
                int cantidadSim = scan.nextInt();
                scan.nextLine();
                System.out.println("Ingrese la marca");
                nombre = scan.nextLine();
                System.out.println("Ingrese el precio");
                precio = scan.nextDouble();
                System.out.println("Ingrese el codigo");
                codigo = scan.nextInt();
                System.out.println("Ingrese el almacenamiento");
                almacenamiento = scan.nextInt();
                System.out.println("Ingrese la ram");
                ram = scan.nextInt();
                scan.nextLine();
                System.out.println("Ingrese el color");
                color = scan.nextLine();

                //se inicializa el objeto
                Celulares celular = new Celulares(cantidadSim, nombre, precio, codigo, almacenamiento, ram, color);

                //se agrea computador a la lista de productos
                productos.add(celular);
                break;
            case 2:
                //se piden los datos al usuarios
                System.out.println("Ingrese el nombre de la tarjeta grafica");
                String tarjetaGrafica = scan.nextLine();
                System.out.println("Ingrese la marca");
                nombre = scan.nextLine();
                System.out.println("Ingrese el precio");
                precio = scan.nextDouble();
                System.out.println("Ingrese el codigo");
                codigo = scan.nextInt();
                System.out.println("Ingrese el almacenamiento");
                almacenamiento = scan.nextInt();
                System.out.println("Ingrese la ram");
                ram = scan.nextInt();
                scan.nextLine();
                System.out.println("Ingrese el color");
                color = scan.nextLine();

                //se inicializa el objeto
                Computadores computadores = new Computadores(nombre, precio, codigo, almacenamiento, ram, color);

                //se agrea computador a la lista de productos
                productos.add(computadores);
                break;
        }

    }

    public void consultar() {
        Scanner scan = new Scanner(System.in);

        //almacenar productos que se mostraran
        ArrayList<Producto> productoMostrar = new ArrayList<>();

        //pedir codigo
        System.out.println("Ingres el codigo");
        int codigo = scan.nextInt();

        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                productoMostrar.add(producto);
            }
        }

        //mostrar productos
        for (Producto producto : productoMostrar) {
            if (producto instanceof Celulares) {
                System.out.println(producto.toString());
            }

            if (producto instanceof Computadores) {
                System.out.println(producto.toString());
            }
        }
    }

    public void actualizar() {
        Scanner scan = new Scanner(System.in);

        //pedir indice
        System.out.println("Ingrese el indice de la lista de productos");
        int index = scan.nextInt();
        scan.nextLine();

        //atributos
        String nombre;
        double precio;
        int codigo;
        int almacenamiento;
        int ram;
        String color;

        if (productos.get(index) instanceof Celulares) {
            //se piden los datos al usuarios
            System.out.println("Agregue el numero de sim que desea en su celular");
            int cantidadSim = scan.nextInt();
            scan.nextLine();
            System.out.println("Ingrese la marca");
            nombre = scan.nextLine();
            System.out.println("Ingrese el precio");
            precio = scan.nextDouble();
            System.out.println("Ingrese el codigo");
            codigo = scan.nextInt();
            System.out.println("Ingrese el almacenamiento");
            almacenamiento = scan.nextInt();
            System.out.println("Ingrese la ram");
            ram = scan.nextInt();
            scan.nextLine();
            System.out.println("Ingrese el color");
            color = scan.nextLine();

            //se inicializa el objeto
            Celulares celular = new Celulares(cantidadSim, nombre, precio, codigo, almacenamiento, ram, color);

            //se agrea computador a la lista de productos
            productos.set(index, celular);
        }

        if (productos.get(index) instanceof Computadores) {
            //se piden los datos al usuarios
            System.out.println("Ingrese el nombre de la tarjeta grafica");
            String tarjetaGrafica = scan.nextLine();
            System.out.println("Ingrese la marca");
            nombre = scan.nextLine();
            System.out.println("Ingrese el precio");
            precio = scan.nextDouble();
            System.out.println("Ingrese el codigo");
            codigo = scan.nextInt();
            System.out.println("Ingrese el almacenamiento");
            almacenamiento = scan.nextInt();
            System.out.println("Ingrese la ram");
            ram = scan.nextInt();
            scan.nextLine();
            System.out.println("Ingrese el color");
            color = scan.nextLine();

            //se inicializa el objeto
            Computadores computadores = new Computadores(nombre, precio, codigo, almacenamiento, ram, color);

            //se agrea computador a la lista de productos
            productos.set(index, computadores);
        }
    }

    public void eliminar() {
        Scanner scan = new Scanner(System.in);
        //pedir el numero del indice
        System.out.println("Ingrese la posicion del objeto en la lista");
        int id = scan.nextInt();

        //eliminar con numero de indice
        productos.remove(id);
    }

}
