package Tests;

/**
 *
 * @author 57315
 */

import Structures.ComparadorTiempos;
import Classes.Pendientes;
import Structures.BST;
import Structures.AVL;
import java.util.List;

public class TestAVLBST {
    public static void main(String[] args) {
        // Inicialización de los árboles
        AVL<Pendientes> avl = new AVL<>();
        BST<Pendientes> bst = new BST<>();

        // Generar tareas aleatorias
        Pendientes[] tareas = GeneradorTareas.generarPendientes(1000000); // Genera 100000 tareas

        // Medir tiempos de inserción
        ComparadorTiempos.medirInsercion(avl, bst, tareas);

        // Buscar tareas con prioridad >= 4 y medir tiempos
        int prioridadBuscada = 4;

        long tiempoInicio, tiempoFin;

        // Medir tiempo de búsqueda en AVL
        tiempoInicio = System.nanoTime();
        List<Pendientes> tareasConAltaPrioridadAVL = avl.buscarPorPrioridad(prioridadBuscada);
        tiempoFin = System.nanoTime();
        System.out.println("Tiempo de búsqueda en AVL: " + (tiempoFin - tiempoInicio) + " nanosegundos");
        System.out.println("Tareas con prioridad >= " + prioridadBuscada + " en AVL: " + tareasConAltaPrioridadAVL.size());

        // Medir tiempo de búsqueda en BST
        tiempoInicio = System.nanoTime();
        List<Pendientes> tareasConAltaPrioridadBST = bst.buscarPorPrioridad(prioridadBuscada);
        tiempoFin = System.nanoTime();
        System.out.println("Tiempo de búsqueda en BST: " + (tiempoFin - tiempoInicio) + " nanosegundos");
        System.out.println("Tareas con prioridad exacta " + prioridadBuscada + " en BST: " + tareasConAltaPrioridadBST.size());

        // Imprimir las tareas encontradas si es necesario
        // System.out.println("Tareas en AVL: " + tareasConAltaPrioridadAVL);
        // System.out.println("Tareas en BST: " + tareasConAltaPrioridadBST);
    }
}
