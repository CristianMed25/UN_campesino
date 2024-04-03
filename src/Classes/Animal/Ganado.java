/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Animal;

import Classes.Tarea;
import Structures.Doubly.DoublyLinkedList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import structures.DynamicArrayList;

/**
 *
 * @author samue
 */
public class Ganado {
    protected String id;
    protected String tipo;
    protected DynamicArrayList<Tarea> necesidades;
    protected DoublyLinkedList<Animal> animales;

    public Ganado(String id, String tipo, DynamicArrayList<Tarea> necesidades) {
        this.id = "G" + id;
        this.tipo = tipo;
        this.necesidades = necesidades;
    }
    
    public Ganado(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public DynamicArrayList<Tarea> getNecesidades() {
        return necesidades;
    }

    public void setNecesidades(DynamicArrayList<Tarea> necesidades) {
        this.necesidades = necesidades;
    }

    public DoublyLinkedList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(DoublyLinkedList<Animal> animales) {
        this.animales = animales;
    }
    
    public void escribir(DoublyLinkedList<Ganado> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Ganado.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Ganado> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Ganado.dat"));
            DoublyLinkedList<Ganado> datosRecuperados = (DoublyLinkedList<Ganado>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        }   
}
