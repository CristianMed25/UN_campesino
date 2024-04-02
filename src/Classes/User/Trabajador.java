/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.User;
import Classes.Tarea;
import Structures.Queue;


/**
 *
 * @author samue
 */
public class Trabajador extends Usuario{
    private Queue<Tarea> tareas;

    public Trabajador(String id, String nombre, String user, String pasword) {
        super("T"+id, nombre, user, pasword);
        this.tareas = null;
    }

    public Queue<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(Queue<Tarea> tareas) {
        this.tareas = tareas;
    }
       
}
