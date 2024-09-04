/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.User;
import Classes.Pendientes;
import Classes.Tarea;
import Structures.AVL;
import Structures.Queue;


/**
 *
 * @author samue
 */
public class Trabajador extends Usuario{
    private Queue<Tarea> tareas;
    private AVL<Pendientes> daily;

    public Trabajador(int id, String nombre, String user, String pasword) {
        super(id, nombre, user, pasword);
        this.tareas = null;
        this.daily = null;
    }

    public Queue<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(Queue<Tarea> tareas) {
        this.tareas = tareas;
    }
    
    public AVL<Pendientes> getDaily(){
        return daily;
    }
    
    public void setDaily (AVL<Pendientes> daily){
        this.daily = daily;
    }
       
}
