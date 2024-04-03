/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Product;

/**
 *
 * @author samue
 */
public class Producto {
    protected String id;
    protected String nombre;
    protected double precio;
    protected int cantidad;
    protected boolean apartado;

    public Producto(String id, String nombre, double precio, int cantidad) {
        this.id = "P" + id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.apartado = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isApartado() {
        return apartado;
    }

    public void setApartado(boolean apartado) {
        this.apartado = apartado;
    }   
}
