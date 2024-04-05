/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Classes.Animal.Ave;
import Structures.Doubly.DoublyLinkedList;
import Structures.Queue;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import Structures.DynamicArrayList;

/**
 *
 * @author samue
 */
public class Tarea implements Serializable{
    private String id;
    private String descripcion;
    private boolean completada;

    public Tarea(String id, String descripcion) {
        this.id = "T" + id;
        this.descripcion = descripcion;
        this.completada = false;
    }
    
    public Tarea(){}

    public String getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }  
    
    public void escribir(Queue<Tarea> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Tareas/Tareas.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public Queue<Tarea> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Tareas/Tareas.dat"));
            Queue<Tarea> datosRecuperados = (Queue<Tarea>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 
    
    public void escribirNecesidad(DynamicArrayList<Tarea> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Tareas/necesidadesCultivos.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DynamicArrayList<Tarea> leerNecesidad(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Tareas/necesidadesCultivos.dat"));
            DynamicArrayList<Tarea> datosRecuperados = (DynamicArrayList<Tarea>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        }  

    @Override
    public String toString() {
        return "\nTarea{" + "id=" + id + ", descripcion=" + descripcion + ", completada=" + completada + '}';
    }
}
