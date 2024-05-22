package com.mycompany.proyectotienda;

import java.util.Date;
import java.util.ArrayList;

public class Factura {

    private Date FechaCompra;
    private int valor;
    private int Hora;
    private ArrayList<Producto> producto;

    public Factura(Date FechaCompra, int valor, int Hora, ArrayList<Producto> producto) {
        this.FechaCompra = FechaCompra;
        this.valor = valor;
        this.Hora = Hora;
        this.producto = producto;
    }

    public Date getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(Date FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Factura{" + "FechaCompra=" + FechaCompra + ", valor=" + valor + ", Hora=" + Hora + ", producto=" + producto + '}';
    }

}
