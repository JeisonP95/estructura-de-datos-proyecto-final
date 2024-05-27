package com.mycompany.inventariotiendacelulares;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InventarioTiendaCelulares {

    public static void main(String[] args) {
        TiendaCelulares tienda = new TiendaCelulares();
        Scanner scan = new Scanner(System.in);
        int menu = 0;

        do {
            try {
                System.out.println("############# MENU CELULARES ###################");
                System.out.println("1.Agregar celular");
                System.out.println("2.Actualizar celular");
                System.out.println("3.Ver inventario de celulares");
                System.out.println("4.Ver celulares vendidos");
                System.out.println("5.Eliminar celular");
                System.out.println("6.Vender celular");
                System.out.println("7.Salir");
                System.out.println("#####################################");

                menu = scan.nextInt();

                switch (menu) {
                    case 1:
                        tienda.agregar();
                        break;
                    case 2:
                        tienda.actualizar();
                        break;
                    case 3:
                        tienda.mostrarListaCelulares();
                        break;
                    case 4:
                        tienda.mostrarListaCelularesVendidos();
                        break;
                    case 5:
                        tienda.eliminar();
                        break;
                    case 6:
                        tienda.vender();
                        break;
                    case 7:
                        System.out.println("Gracias por utilizar el programa");
                        break;
                    default:
                        System.out.println("Ingresa la opcion correcta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Esta opción no es válida. Por favor, ingrese un número.");
                scan.next();
            }
        } while (menu != 7);
    }
}
