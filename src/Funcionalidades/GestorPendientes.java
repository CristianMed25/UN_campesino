/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;

/**
 *
 * @author 57315
 */


import Classes.Pendientes;
import Structures.AVL;
import java.util.List;

public class GestorPendientes {

    private AVL<Pendientes> avlTree;

    public GestorPendientes() {
        avlTree = new AVL<>();
    }

    // Método para agregar una nueva pendiente al gestor
    public void agregarPendiente(int prioridad, String descripcion) {
        Pendientes nuevaPendiente = new Pendientes(prioridad, descripcion, false);
        avlTree.insert(nuevaPendiente);
        System.out.println("Pendiente agregada: " + nuevaPendiente);
    }

    // Método para marcar una pendiente como completada
    public void marcarCompletada(Pendientes pendiente) {
        pendiente.setCompletada(true);
        System.out.println("Pendiente completada: " + pendiente);
    }

   // Método para eliminar una pendiente del gestor
    public void eliminarPendiente(int prioridad, String descripcion) {
        Pendientes pendienteAEliminar = new Pendientes(prioridad, descripcion, false);
        if (avlTree.remove(pendienteAEliminar)) {
            System.out.println("Pendiente eliminada: " + pendienteAEliminar);
        } else {
            System.out.println("No se encontró la pendiente para eliminar: " + pendienteAEliminar);
        }
    }

    // Método para buscar pendientes con una prioridad exacta
    public List<Pendientes> buscarPorPrioridadExacta(int prioridad) {
        List<Pendientes> pendientes = avlTree.buscarPorPrioridadExacta(prioridad);
        if (pendientes.isEmpty()) {
            System.out.println("No se encontraron pendientes con la prioridad: " + prioridad);
        } else {
            System.out.println("Pendientes encontradas con la prioridad " + prioridad + ": " + pendientes);
        }
        return pendientes;
    }

    // Método para buscar pendientes con una prioridad mayor o igual a una prioridad dada
    public List<Pendientes> buscarPorPrioridad(int prioridad) {
        List<Pendientes> pendientes = avlTree.buscarPorPrioridad(prioridad);
        if (pendientes.isEmpty()) {
            System.out.println("No se encontraron pendientes con prioridad mayor o igual a: " + prioridad);
        } else {
            System.out.println("Pendientes encontradas con prioridad mayor o igual a " + prioridad + ": " + pendientes);
        }
        return pendientes;
    }

    // Método para mostrar todas las pendientes en orden de prioridad
    public void mostrarPendientesOrdenadas() {
        System.out.println("Pendientes ordenadas por prioridad:");
        avlTree.printSorted();
    }
}
