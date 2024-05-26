package com.mycompany.proyectotienda;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProyectoTienda {

    public static void main(String[] args) {
        //atributos
        Tienda tienda = new Tienda();
        ArrayList<Empleados> empleados = new ArrayList<>();
        ArrayList<Usuarios> usuarios = new ArrayList<>();
        ArrayList<Factura> factura = new ArrayList<>();

        //metodos llamados
        menuPrincipal(tienda, empleados, usuarios, factura);
    }

    public static void menuPrincipal(
            Tienda tienda, ArrayList<Empleados> empleados,
            ArrayList<Usuarios> usuarios, ArrayList<Factura> factura
    ) {
        Scanner scan = new Scanner(System.in);
        int menu = 0;

        do {
            try {
                System.out.println("############# MENU ###################");
                System.out.println("1.Tienda");
                System.out.println("2.Empleados");
                System.out.println("3.Usuarios");
                System.out.println("4.Crear Factura");
                System.out.println("5.Salir");
                System.out.println("#####################################");

                menu = scan.nextInt();

                switch (menu) {
                    case 1:
                        menuTienda(tienda);
                        break;
                    case 2:
                        menuEmpleados(empleados);
                        break;
                    case 3:
                        menuUsuarios(usuarios);
                        break;
                    case 4:
                        crearFactura(factura, usuarios);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Ingresa la opcion correcta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Esta opción no es válida. Por favor, ingrese un número.");
                scan.next(); // Limpiar el buffer para el siguiente input
            }

        } while (menu != 5);
    }

    public static void menuTienda(Tienda tienda) {
        Scanner scan = new Scanner(System.in);
        int menu = 0;

        do {
            try {
                System.out.println("############# MENU ###################");
                System.out.println("1.Agregar");
                System.out.println("2.Consultar");
                System.out.println("3.Actualizar");
                System.out.println("4.Eliminar");
                System.out.println("5.Salir");
                System.out.println("#####################################");

                menu = scan.nextInt();

                switch (menu) {
                    case 1:
                        tienda.agregar();
                        break;
                    case 2:
                        tienda.consultar();
                        break;
                    case 3:
                        tienda.actualizar();
                        break;
                    case 4:
                        tienda.eliminar();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Ingresa la opcion correcta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Esta opción no es válida. Por favor, ingrese un número.");
                scan.next(); // Limpiar el buffer para el siguiente input

            }
        } while (menu != 5);
    }

    public static void menuEmpleados(ArrayList<Empleados> empleados) {
        Scanner scan = new Scanner(System.in);
        int menu = 0;

        do {
            try {
                System.out.println("############# MENU ###################");
                System.out.println("1.Ingresar nuevo empleado");
                System.out.println("2.Mostrar todos los empleados");
                System.out.println("3.Salir");
                System.out.println("#####################################");

                menu = scan.nextInt();

                switch (menu) {
                    case 1:
                        menuIngresarEmpleados(empleados);
                        break;
                    case 2:
                        for (int i = 0; i < empleados.size(); i++) {
                            System.out.println("######## Lista empleados ######");
                            System.out.println(i + ". " + empleados.get(i));
                            System.out.println("##############################");
                        }

                        if (empleados.isEmpty()) {
                            System.out.println("####### Lista empleados ######");
                            System.out.println("En el momento no exiten empleados ingresados");
                            System.out.println("##############################");
                        }

                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Ingresa la opcion correcta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Esta opción no es válida. Por favor, ingrese un número.");
                scan.next(); // Limpiar el buffer para el siguiente input
            }
        } while (menu != 3);
    }

    public static void menuIngresarEmpleados(ArrayList<Empleados> empleados) {

        Scanner scan = new Scanner(System.in);

        int menu = 0;

        do {
            try {
                //variables
                float valorHora = 0;
                String nombre = "";
                int numTelefono = 0;
                int id = 0;

                //mensaje en consola
                System.out.println("############## MENU EMPLEADOS ###############");
                System.out.println("1.Administrador");
                System.out.println("2.Vendedor");
                System.out.println("3.Cajero");
                System.out.println("4.Salir");
                System.out.println("##############################################");

                menu = scan.nextInt();
                scan.nextLine();

                switch (menu) {
                    case 1:
                        //ingresar datos

                        System.out.println("Ingresa el nombre");
                        nombre = scan.nextLine();
                        System.out.println("Ingresa el Id");
                        id = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Ingresa el numero del telefono");
                        numTelefono = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Ingresa el valor de la hora");
                        valorHora = scan.nextFloat();
                        scan.nextLine();

                        //inicializar objeto
                        Administrador administrador = new Administrador(valorHora, nombre, numTelefono, id);

                        //guardar en la lista
                        empleados.add(administrador);
                        break;
                    case 2:
                        //ingresar datos
                        System.out.println("Ingresa el nombre");
                        nombre = scan.nextLine();
                        System.out.println("Ingresa el Id");
                        id = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Ingresa el numero del telefono");
                        numTelefono = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Ingresa el valor de la hora");
                        valorHora = scan.nextFloat();
                        scan.nextLine();
                        System.out.println("Ingrese numero de ventas: ");
                        int numVentas = scan.nextInt();
                        scan.nextLine();
                        //inicializar objeto
                        Vendedor vendedor = new Vendedor(valorHora, nombre, numTelefono, id);
                        //guardar en la lista
                        empleados.add(vendedor);
                        break;
                    case 3:
                        //ingresar datos
                        System.out.println("Ingresa el nombre");
                        nombre = scan.nextLine();
                        System.out.println("Ingresa el Id");
                        id = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Ingresa el numero del telefono");
                        numTelefono = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Ingresa el valor de la hora");
                        valorHora = scan.nextFloat();
                        scan.nextLine();

                        //inicializar objeto
                        Cajero cajero = new Cajero(valorHora, nombre, numTelefono, id);

                        //guardar en la lista
                        empleados.add(cajero);
                        break;
                    case 4:
                        break;
                    default:
                }
            } catch (InputMismatchException e) {
                System.out.println("Esta opción no es válida. Por favor, ingrese un número.");
                scan.next(); // Limpiar el buffer para el siguiente input
            }

        } while (menu != 4);
    }

    public static void menuUsuarios(ArrayList<Usuarios> usuarios) {
        Scanner scan = new Scanner(System.in);
        int menu = 0;

        do {
            try {
                System.out.println("############# MENU USUARIOS ##############");
                System.out.println("1.Agregar Usuario");
                System.out.println("2.Ver Usuarios");
                System.out.println("3.Salir");
                System.out.println("##########################################");

                menu = scan.nextInt();
                scan.nextLine();

                switch (menu) {
                    case 1:
                        System.out.println("Ingrese el nombre");
                        String nombre = scan.nextLine();
                        scan.nextInt();
                        System.out.println("Ingrese la cedula");
                        int cedula = scan.nextInt();

                        Usuarios usuario = new Usuarios(nombre, cedula);
                        usuarios.add(usuario);
                        break;
                    case 2:
                        System.out.println("############# Lista de usuarios #############");
                        for (int i = 0; i < usuarios.size(); i++) {
                            System.out.println(i + ". " + usuarios.get(i).toString());
                        }
                        System.out.println("##############################################");
                        break;
                    default:
                        System.out.println("Ingresa la opcion correcta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Esta opción no es válida. Por favor, ingrese un número.");
                scan.next(); // Limpiar el buffer para el siguiente input
            }
        } while (menu != 3);
    }

    public static void crearFactura(ArrayList<Factura> factura, ArrayList<Usuarios> usuarios) {
        Scanner scan = new Scanner(System.in);
        int menu = 0;

        do {
            try {
                System.out.println("Ingresa el indice del usuario");
                int indiceusuario = scan.nextInt();
                //Usuarios usuario = new Usuarios(nombre, menu);
                Date date = new Date();
                int hora = date.getHours();
                int fecha = date.getDay() + date.getMonth() + date.getYear();

            } catch (InputMismatchException e) {
                System.out.println("Esta opción no es válida. Por favor, ingrese un número.");
                scan.next(); // Limpiar el buffer para el siguiente input
            }
        } while (menu != 3);
    }
}
