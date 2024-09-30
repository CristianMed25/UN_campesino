/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Product;

import Structures.Doubly.DoublyLinkedList;
import Structures.Queue;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author samue
 */
public class Producto implements Serializable{
    protected String id;
    protected String idNum;
    protected String nombre;
    protected double precio;
    protected int cantidad;

    public Producto(String id, String nombre, double precio, int cantidad) {
        this.id = "P" + id;
        idNum = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public Producto(String nombre, double precio){
        this("N/A",nombre,precio,0);
    }
    
    public Producto(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdNum() {
        return idNum;
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
    
    public void escribir(DoublyLinkedList<Producto> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Productos/Producto.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Producto> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Productos/Producto.dat"));
            DoublyLinkedList<Producto> datosRecuperados = (DoublyLinkedList<Producto>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 
    
    public void escribirApartado(Queue<Producto> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Productos/ProductoApartado.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public Queue<Producto> leerApartado(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Productos/ProductoApartado.dat"));
            Queue<Producto> datosRecuperados = (Queue<Producto>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 

    @Override
    public String toString() {
        return "Producto{" + "\nid: " + id + "\nnombre:" + nombre + "\nprecio: $" + precio + "\ncantidad: " + cantidad + '}';
    }
}
