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

        if (cantidadSim < 1 || cantidadSim > 2) {
            System.out.println("Error! no se puede guardar otro numero que no sea 1 o 2");
            return null;
        }

        System.out.println("Ingrese la marca");
        String nombre = scan.nextLine();

        System.out.println("Ingrese el precio");
        double precio = scan.nextDouble();

        System.out.println("Ingrese el codigo");
        int codigo = scan.nextInt();

        for (Celulares listaCelulare : listaCelulares) {
            if (codigo == listaCelulare.getCodigo()) {
                System.out.println("Lo sentimos ya existe este codigo");
                return null;
            }
        }

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

        if (celular != null) {
            listaCelulares.add(celular);
            System.out.println("Se agrego correctamente");
        }
    }

    public void actualizar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresar el indice del producto que deseas actualizar");
        int indice = scan.nextInt();

        if (this.listaCelulares.size() > indice) {
            Celulares celular = pedirDatosCelular();
            if (celular != null) {
                this.listaCelulares.set(indice, celular);
                System.out.println("Equipo actualizado");
            }
        } else {
            System.out.println("El dispositivo no se encuentra dentro de la lista");
        }
    }

    public void mostrarListaCelulares() {
        if (!this.listaCelulares.isEmpty()) {
            System.out.println("\n----------------Lista de celulares en venta--------------------");

            for (Celulares celular : listaCelulares) {
                System.out.println(celular.toString());
            }

            System.out.println("---------------------------------------------------------------\n");
        } else {
            System.out.println("Esta lista esta vacia!");
        }
    }

    public void mostrarListaCelularesVendidos() {
        if (!this.listaCelularesVendidos.isEmpty()) {
            System.out.println("\n----------------Lista de celulares vendidos--------------------");

            for (Celulares vendido : listaCelularesVendidos) {
                System.out.println(vendido.toString());
            }

            System.out.println("--------------------------------------------------------------- \n");
        } else {
            System.out.println("Esta lista esta vacia!");
        }
    }

    public void eliminar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrece el inice del producto que deseas eliminar");
        int indice = scan.nextInt();

        if (listaCelulares.size() > indice) {
            listaCelulares.remove(indice);
            System.out.println("Se elimino correctamente");
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

            //agregar a la lista
            this.listaCelularesVendidos.add(celular);
            this.listaCelulares.remove(indice);
        } else {
            System.out.println("Error el indice no existe dentro de la lista");
        }
    }

    private void mostrarFactura(String nombreVendedor, Celulares celular, String fechaDeCompra) {
        System.out.println("-------------------Factura-------------");
        System.out.println("Fecha de compra: " + fechaDeCompra);
        System.out.println("Nombre de tienda: Movil Mania ");
        System.out.println("Nombre del vendedor: " + nombreVendedor);
        System.out.println("Marca: " + celular.getNombre());
        System.out.println("Color: " + celular.getColor());
        System.out.println("Almacenamiento: " + celular.getAlmacenamiento());
        System.out.println("Cantidad de ram: " + celular.getRam());
        System.out.println("Codigo: " + celular.getCodigo());
        System.out.println("---------------------------------------");
        System.out.println("Precio: " + celular.getPrecio());
        System.out.println("Vendido");
        System.out.println("---------------------------------------");
        
    }
}
