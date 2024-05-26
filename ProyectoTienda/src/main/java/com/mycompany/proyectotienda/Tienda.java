package com.mycompany.proyectotienda;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
                "1. Desea agregar un celular?");
        System.out.println(
                "2. Desea agregar un computador?");

        opcion = scan.nextInt();
        scan.nextLine();

        switch (opcion) {
            case 1:
                //se piden los datos al usuarios
                System.out.println("Celular de 1 o 2 sim");
                int cantidadSim = scan.nextInt();
                scan.nextLine();
                System.out.println("Ingrese la marca");
                nombre = scan.nextLine();
                System.out.println("Ingrese el precio");
                precio = scan.nextDouble();
                System.out.println("Ingrese el codigo");
                codigo = scan.nextInt();
                System.out.println("Ingrese el almacenamiento(GB)");
                almacenamiento = scan.nextInt();
                System.out.println("Ingrese la ram(GB)");
                ram = scan.nextInt();
                scan.nextLine();
                System.out.println("Ingrese el color");
                color = scan.nextLine();

                boolean existe = true;

                for (Producto producto : productos) {
                    if (codigo == producto.getCodigo()) {
                        existe = false;
                    }
                }

                if (existe == true) {
                    //se inicializa el objeto
                    Celulares celular = new Celulares(cantidadSim, nombre, precio, codigo, almacenamiento, ram, color);

                    //se agrea computador a la lista de productos
                    productos.add(celular);
                } else {
                    System.out.println("El codigo ya existe");
                }

                break;
            case 2:
                //se piden los datos al usuarios
                System.out.println("Ingrese el nombre del procesador");
                String tarjetaGrafica = scan.nextLine();
                System.out.println("Ingrese la marca");
                nombre = scan.nextLine();
                System.out.println("Ingrese el precio");
                precio = scan.nextDouble();
                System.out.println("Ingrese el codigo");
                codigo = scan.nextInt();
                System.out.println("Ingrese el almacenamiento(GB)");
                almacenamiento = scan.nextInt();
                System.out.println("Ingrese la ram(GB)");
                ram = scan.nextInt();
                scan.nextLine();
                System.out.println("Ingrese el color");
                color = scan.nextLine();

                //se inicializa el objeto
                Computadores computadores = new Computadores(tarjetaGrafica, nombre, precio, codigo, almacenamiento, ram, color);

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
        System.out.println("Ingresa el codigo");
        int codigo = scan.nextInt();

        boolean exite = true;

        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                productoMostrar.add(producto);
            } else {
                exite = false;
            }
        }

        if (exite == true) {
            //mostrar productos
            for (Producto producto : productoMostrar) {
                if (producto instanceof Celulares) {
                    System.out.println(producto.toString());
                }

                if (producto instanceof Computadores) {
                    System.out.println(producto.toString());
                }
            }
        } else {
            System.out.println("el producto con el codigo " + codigo + " no se encuentra en el inventario");
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

        if (productos.size() > index) {
            if (productos.get(index) instanceof Celulares) {
                //se piden los datos al usuarios
                System.out.println("Celular de 1 o 2 sim");
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
                System.out.println("Ingrese el nombre del procesador");
                String tarjetaGrafica = scan.nextLine();
                System.out.println("Ingrese la marca");
                nombre = scan.nextLine();
                System.out.println("Ingrese el precio");
                precio = scan.nextDouble();
                System.out.println("Ingrese el codigo");
                codigo = scan.nextInt();
                System.out.println("Ingrese el almacenamiento(GB)");
                almacenamiento = scan.nextInt();
                System.out.println("Ingrese la ram(GB)");
                ram = scan.nextInt();
                scan.nextLine();
                System.out.println("Ingrese el color");
                color = scan.nextLine();

                //se inicializa el objeto
                Computadores computadores = new Computadores(tarjetaGrafica, nombre, precio, codigo, almacenamiento, ram, color);

                //se agrea computador a la lista de productos
                productos.set(index, computadores);
            }
        } else {
            System.out.println("Error! el indice no existe");
        }
    }

    public void eliminar() {
        Scanner scan = new Scanner(System.in);
        try {
            //pedir el numero del indice
            System.out.println("Ingrese el indice del objeto en la lista");
            int indice = scan.nextInt();

            //eliminar con numero de indice
            if (productos.size() > indice) {
                productos.remove(indice);
                System.out.println("Se a eliminado correctamente");
            } else {
                System.out.println("Error! el indice no existe");
            }
        } catch (InputMismatchException e) {
            System.out.println("Esta opción no es válida. Por favor, ingrese un número.");
            scan.next(); // Limpiar el buffer para el siguiente input
        }
    }

}
