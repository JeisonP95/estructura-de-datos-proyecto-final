package com.mycompany.inventariotiendacelulares;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TiendaCelulares {

    private ArrayList<Celulares> listaCelulares = new ArrayList<>();
    private ArrayList<Celulares> listaCelularesVendidos = new ArrayList<>();

    private Celulares pedirDatosCelular() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Celular de 1 o 2 sim");
        int cantidadSim = scan.nextInt();
        scan.nextLine();

        System.out.println("Ingrese la marca");
        String nombre = scan.nextLine();

        System.out.println("Ingrese el precio");
        double precio = scan.nextDouble();

        System.out.println("Ingrese el codigo");
        int codigo = scan.nextInt();

        System.out.println("Ingrese el almacenamiento(GB)");
        int almacenamiento = scan.nextInt();

        System.out.println("Ingrese la ram(GB)");
        int ram = scan.nextInt();
        scan.nextLine();

        System.out.println("Ingrese el color");
        String color = scan.nextLine();

        Celulares celular = new Celulares(nombre, precio, codigo, almacenamiento, ram, color, cantidadSim);

        return celular;
    }

    public void agregar() {
        Celulares celular = pedirDatosCelular();
        listaCelulares.add(celular);
    }

    public void actualizar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrece el inice del producto que deseas actualizar");
        int indice = scan.nextInt();

        if (this.listaCelulares.size() > indice) {
            Celulares celular = pedirDatosCelular();
            this.listaCelulares.set(indice, celular);
        } else {
            System.out.println("el dispositivo no se encuentra dentro de la lista");
        }
    }

    public void mostrarListaCelulares() {
        System.out.println("----------------Lista de celulares en venta--------------------");

        for (Celulares listaCelulares : listaCelulares) {
            System.out.println(listaCelulares.toString());
        }

        System.out.println("---------------------------------------------------------------");
    }

    public void mostrarListaCelularesVendidos() {
        System.out.println("----------------Lista de celulares vendidos--------------------");

        for (Celulares listaCelularesVendido : listaCelularesVendidos) {
            System.out.println(listaCelularesVendido.toString());
        }

        System.out.println("---------------------------------------------------------------");
    }

    public void eliminar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrece el inice del producto que deseas eliminar");
        int indice = scan.nextInt();

        if (listaCelulares.size() > indice) {
            listaCelularesVendidos.add(listaCelulares.get(indice));
            listaCelulares.remove(indice);
        } else {
            System.out.println("El producto con el indice: " + indice + " no existe");
        }
    }

    public void vender() {
        Scanner scan = new Scanner(System.in);

        //pedir el nombre del vendedor
        System.out.println("Ingresa el nombre del vendedor: ");
        String vendedor = scan.nextLine();

        //pedir el indice del producto el cual se va a vender
        System.out.println("Ingresa el indice del producto a vender: ");
        int indice = scan.nextInt();

        if (indice < listaCelulares.size()) {
            //treaer el celular a vender
            Celulares celular = listaCelulares.get(indice);

            //crear variable fechaActual y traer en local la fecha actual la cual se va a enviar por parametro
            LocalDate date = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaActual = date.format(formatter);

            //llammar metodo mostrarfactura y enviar los parametros
            mostrarFactura(vendedor, celular, fechaActual);
        } else {
            System.out.println("Error el indice no existe dentro de la lista");
        }
    }

    private void mostrarFactura(String nombreVendedor, Celulares celular, String fechaDeCompra) {
        System.out.println("-------------------Factura-------------");
        System.out.println("nombre del vendedor: " + nombreVendedor);
        System.out.println("marca: " + celular.getNombre());
        System.out.println("precio: " + celular.getNombre());
        System.out.println("color: " + celular.getNombre());
        System.out.println("cantidad de ram: " + celular.getNombre());
        System.out.println("fecha de compra: " + fechaDeCompra);
        System.out.println("nombre de tienda: " + celular.getNombre());
        System.out.println("codigo: " + celular.getNombre());
        System.out.println("almacenamiento: " + celular.getNombre());
        System.out.println("---------------------------------------");
    }
}
