/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author 57315
 */
import java.io.Serializable;
/**
 *
 * @author 57315
 */
public class Pendientes implements Serializable, Comparable<Pendientes>{
    private int priority; 
    private String descripcion;
    private boolean completada;
    
    public Pendientes (int priority, String descripcion, boolean completada){
        this.priority = priority;
        this.descripcion = descripcion;
        this.completada = false;
    }
    public Pendientes(){}
    
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
    @Override
    public int compareTo(Pendientes other) {
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

