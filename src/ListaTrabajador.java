/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 57315
 */
import java.util.Scanner;
import Classes.User.Trabajador;
import Classes.Tarea;
import Structures.Doubly.DoublyQueue;

public class ListaTrabajador {
    public static void main (String[] args){
        //crearemos el trabajador
        Trabajador trabajador = new Trabajador ("1", "Juan","j1", "Juan1");
        
        //creacion de la cola de tareas
        DoublyQueue <Tarea> colaTareas = new DoublyQueue<>();
        // Tareas 
        colaTareas.enqueue(new Tarea("1", "Dar de comer a las vacas", false));
        colaTareas.enqueue(new Tarea("2", "Limpiar las vacas", false));
        colaTareas.enqueue(new Tarea("3", "Cepillar las vacas", false));
         
        //asignarle esas tareas al trabajador
        trabajador.setTareas(colaTareas);
        
        //preguntas para el trabajador
        Scanner scanner = new Scanner (System.in);
        System.out.println("¿Deseas ver la lista de atreas? (si/no)");
        String ans= scanner.nextLine();
        
        if (ans.equalsIgnoreCase ("si")){
            DoublyQueue<Tarea> tareasDelTrabajador =trabajador.getTareas();
            
            System.out.println("Tareas de "+trabajador.getNombre()+ " son: ");
            while (!tareasDelTrabajador.isEmpty()) {
                Tarea tarea= tareasDelTrabajador.dequeue();
                 System.out.println("ID: " + tarea.getId() + ", Descripción: " + tarea.getDescripcion() + ", Completada: " + tarea.isCompletada());
            }
            
              // Preguntar al usuario si quiere modificar la lista de tareas
            System.out.println("¿Desea modificar la lista de tareas? (si/no)");
            ans = scanner.nextLine();
            
            if (ans.equalsIgnoreCase("si")){
                System.out.println("1. ¿Desea marcar una tarea como compeltada? (1)");
                System.out.println("2. ¿Desea agregar una nueva tarea? (2)");
                ans =scanner.nextLine();
                
                if (ans.equalsIgnoreCase ("1")){
                    System.out.println("Ingrese el ID de la tarea completada: ");
                    String idTarea = scanner.nextLine();
                    trabajador.marcarTareaComoCompletada(idTarea);
                    System.out.println("Tarea marcada como completada correctamente.");
                } else if (ans.equalsIgnoreCase("2")){
                    System.out.println("INgrese la nueva tarea: ");
                    String descripcionTarea= scanner.nextLine();
                    Tarea nuevaTarea= new Tarea (Integer.toString(trabajador.getTareas().size()+1), descripcionTarea, false);
                    trabajador.agregarTarea(nuevaTarea);
                    System.out.println("Nueva tarea agregada correctamete.");
                }
            }
            
        }
        scanner.close();
    }
}
