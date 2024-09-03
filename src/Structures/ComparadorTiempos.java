/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structures;

import Classes.Pendientes;

/**
 *
 * @author 57315
 */

public class ComparadorTiempos {

    public static void medirInsercion(AVL<Pendientes> avl, BST<Pendientes> bst, Pendientes[] tareas) {
        long tiempoInicio, tiempoFin;

        // Insertar en AVL
        tiempoInicio = System.nanoTime();
        for (Pendientes tarea : tareas) {
            avl.insert(tarea);
        }
        tiempoFin = System.nanoTime();
        System.out.println("Tiempo de inserción en AVL: " + (tiempoFin - tiempoInicio) + " nanosegundos");

        // Insertar en BST
        tiempoInicio = System.nanoTime();
        for (Pendientes tarea : tareas) {
            bst.insert(tarea);
        }
        tiempoFin = System.nanoTime();
        System.out.println("Tiempo de inserción en BST: " + (tiempoFin - tiempoInicio) + " nanosegundos");
    }
    
     public static void medirBusqueda(AVL<Pendientes> avl, BST<Pendientes> bst, Pendientes tareaABuscar) {
        long tiempoInicio, tiempoFin;

        // Búsqueda en AVL
        tiempoInicio = System.nanoTime();
        boolean encontradoEnAVL = avl.contains(tareaABuscar);
        tiempoFin = System.nanoTime();
        System.out.println("Tiempo de búsqueda en AVL: " + (tiempoFin - tiempoInicio) + " nanosegundos. Encontrado: " + encontradoEnAVL);

        // Búsqueda en BST
        tiempoInicio = System.nanoTime();
        boolean encontradoEnBST = (bst.search(tareaABuscar) != null);
        tiempoFin = System.nanoTime();
        System.out.println("Tiempo de búsqueda en BST: " + (tiempoFin - tiempoInicio) + " nanosegundos. Encontrado: " + encontradoEnBST);
    }
}

