/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

/**
 *
 * @author 57315
 */
import Classes.Pendientes;
import java.util.Random;

public class GeneradorTareas {
    static String[] descripciones = {
        "Alimentar a los animales", "Reparar la cerca", "Regar los cultivos",
        "Recolectar huevos", "Limpiar el granero", "Podar los árboles",
        "Cosechar frutas", "Revisar el sistema de riego", "Preparar la comida",
        "Sembrar nuevas semillas"
    };

    public static Pendientes generarTareaAleatoria() {
        Random random = new Random();
        int prioridad = random.nextInt(5) + 1; // Prioridad entre 1 y 5
        String descripcion = descripciones[random.nextInt(descripciones.length)];
        return new Pendientes(prioridad, descripcion, false);
    }

    public static Pendientes[] generarPendientes(int cantidad) {
        Pendientes[] tareas = new Pendientes[cantidad];
        for (int i = 0; i < cantidad; i++) {
            tareas[i] = generarTareaAleatoria();
        }
        return tareas;
    }
}
