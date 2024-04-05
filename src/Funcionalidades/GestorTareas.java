/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionalidades;

import Classes.Animal.Ganado;
import Classes.Cultivo.Cultivo;
import Classes.Tarea;
import Classes.User.Trabajador;
import Structures.Queue;
import java.util.Scanner;
import structures.DynamicArrayList;

/**
 *
 * @author CristianM
 */
public class GestorTareas {
    public static final Tarea tarea = new Tarea();   
    public static final Ganado ganado= new Ganado(); 
    
    private static Queue <Tarea> colaTareas = tarea.leer();
    private static DynamicArrayList<Tarea>  necesidadesAnimales = new DynamicArrayList<>();
    private static DynamicArrayList<Tarea>  necesidadesCultivos = new DynamicArrayList<>();
    
//Para creación de archivos
//    private static Queue <Tarea> colaTareas; 

//    public GestorTareas() {
//        this.colaTareas          = new Queue<>();
//    }
    //crearemos el trabajador
    public static Tarea verTarea(){
        return colaTareas.peek();
    }
    
    public static void encolarTarea(Tarea testQueue){
        colaTareas.enqueue(testQueue);
        System.out.println("Tarea añadida");
        tarea.escribir(colaTareas);
    }
    
    public static Tarea desencolarTarea(){
        Tarea tarea = colaTareas.dequeue();
        System.out.println("Tarea terminada");
        tarea.escribir(colaTareas);
        return tarea;
    } 
    
    public static void editarDescripcion(String descripcion){
        Tarea tareaEditar = verTarea();
        tareaEditar.setDescripcion(descripcion);
        desencolarTarea();
        colaTareas.pushFront(tareaEditar);
        System.out.println("Primera tarea en cola editada");
        tarea.escribir(colaTareas);
    }  
    
    public static void agregarNecesidadAnimal(String id, String descripcion){
        Tarea tarea = new Tarea(id, descripcion);
        necesidadesAnimales.pushFront(tarea);
        ganado.escribirNecesidad(necesidadesAnimales);
    }
    
    public static void agregarNecesidadAnimal(Tarea tarea){
        necesidadesAnimales.pushFront(tarea);
        ganado.escribirNecesidad(necesidadesAnimales);
    }
    
    public static void eliminarNecesidadAnimalReciente(){
        necesidadesAnimales.popFront();
        System.out.println("Necesidad más reciente eliminada");
        ganado.escribirNecesidad(necesidadesAnimales);
    }
    
    public static Tarea buscarNecesidadAnimal(String id){
        for(int i = 0; i < necesidadesAnimales.length();i++){
            Tarea TareaEncontrado = necesidadesAnimales.find(i);
            if(TareaEncontrado.getId().equals(id)){
                return TareaEncontrado;
            }
        }   
        System.out.println("No se encontro el elemento con id " + id);
        return null;
    }
    
    public static void agregarNecesidadCultivo(String id, String descripcion){
        Tarea tarea = new Tarea(id, descripcion);
        necesidadesCultivos.pushFront(tarea);
        tarea.escribirNecesidad(necesidadesCultivos);
    }
    
    public static void agregarNecesidadCultivo(Tarea tarea){
        necesidadesCultivos.pushFront(tarea);
        tarea.escribirNecesidad(necesidadesCultivos);
    }
    
    public static void eliminarNecesidadCultivoReciente(){
        necesidadesCultivos.popFront();
        System.out.println("Necesidad"
                + " más reciente eliminada");
        tarea.escribirNecesidad(necesidadesCultivos);
    }
    
    public static Tarea buscarNecesidadCultivo(String id){
        for(int i = 0; i < necesidadesCultivos.length();i++){
            Tarea TareaEncontrado = necesidadesCultivos.find(i);
            if(TareaEncontrado.getId().equals(id)){
                return TareaEncontrado;
            }
        }   
        System.out.println("No se encontro el elemento con id " + id);
        return null;
    }
}
