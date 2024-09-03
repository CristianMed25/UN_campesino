/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Structures.Queue;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import Structures.DynamicArrayList;
import Structures.AVL;

/**
 *
 * @author samue
 */


public class Tarea implements Serializable{
    private int priority; 
    private String descripcion;
    private boolean completada;
    
    public Tarea (int priority, String descripcion, boolean completada){
        this.priority = priority;
        this.descripcion = descripcion;
        this.completada = false;
    }
    public Tarea(){}
    
    public int getPriority(){
        return priority;
    }
    
    public void setPriority(int priority){
        this.priority=  priority;
    }
    
    public String getDescription(){
        return descripcion;
    }
    
    public void setDescripcion (String descripcion){
        this.descripcion = descripcion;
    }
    
    
    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }  
    
     // Método para comparar tareas basado en prioridad y descripción (útil para el árbol AVL)
    public int compareTo(Tarea other) {
        if (this.priority == other.priority) {
            return this.descripcion.compareTo(other.descripcion);
        }
        return Integer.compare(this.priority, other.priority);
    }

    // Método toString para imprimir la tarea
    @Override
    public String toString() {
        return "\nTarea: " + descripcion + " \n(Prioridad: " + priority + "\n, Completada: " + completada+ ")";
    }
}


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
        return "\nTarea{" + "\nid: " + id + "\ndescripcion: " + descripcion + "\ncompletada: " + completada + '}';
    }
}
