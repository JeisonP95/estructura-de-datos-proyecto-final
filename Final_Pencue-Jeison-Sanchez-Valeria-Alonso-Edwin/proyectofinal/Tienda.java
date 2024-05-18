package com.sanchezdarcypencuejesus.proyectofinal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Tienda {
    private List<Productos> listaProductos;
    
    public Tienda(List<Productos> listaproductos ) {
        this.listaProductos = listaproductos;
    }
    public void agregarProducto(Productos producto) {
        
        listaProductos.add(producto);
    }
    public void eliminarProducto(Productos producto){
        listaProductos.remove(producto);
    }
    public void consultarProducto(Productos[] producto){
         for (int i = 0; i < producto.length; i++) {
             System.out.println(i+1 +" "+producto[i]);
         }
    }
    public void actualizarProducto(Productos[] productos, int indice, Productos nuevoProducto) {
        if (indice >= 0 && indice < productos.length) {
            productos[indice] = nuevoProducto;
            System.out.println("Producto actualizado con éxito.");
        } else {
            System.out.println("Índice fuera de rango. No se pudo actualizar el producto.");
        }
    }
}
