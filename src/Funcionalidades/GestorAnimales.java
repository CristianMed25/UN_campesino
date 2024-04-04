/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionalidades;

import Classes.Animal.Ave;
import Classes.Animal.Bovino;
import Classes.Animal.Caballo;
import Classes.Animal.Ganado;
import Classes.Animal.Ovino;
import Classes.Animal.Pez;
import Classes.Animal.Porcino;
import Structures.Doubly.DoublyLinkedList;

/**
 *
 * @author CristianM
 */
       
public class GestorAnimales {
    //El gestor de cultivos posee una lista de cada clase de cultivo, donde se guerdarán las instancias poseean dichas clases.   
    
    public static final Ave ave = new Ave();
    public static final Bovino bovino = new Bovino();
    public static final Caballo caballo= new Caballo();
    public static final Ganado ganado = new Ganado();
    public static final Ovino ovino = new Ovino();
    public static final Pez pez = new Pez();
    public static final Porcino porcino = new Porcino();
    
    
    private static DoublyLinkedList<Ave> listaAve = ave.leer();
    private static DoublyLinkedList<Bovino> listaBovino = bovino.leer();
    private static DoublyLinkedList<Caballo> listaCaballo = caballo.leer();
    private static DoublyLinkedList<Ganado> listaGanado;
    private static DoublyLinkedList<Ovino> listaOvino = ovino.leer();
    private static DoublyLinkedList<Pez> listaPez = pez.leer();
    private static DoublyLinkedList<Porcino> listaPorcino = porcino.leer();

//    public GestorAnimales() {
//        this.listaAve          = new DoublyLinkedList<>();
//        this.listaBovino = new DoublyLinkedList<>();
//        this.listaCaballo      = new DoublyLinkedList<>();
//        this.listaGanado       = new DoublyLinkedList<>();
//        this.listaOvino       = new DoublyLinkedList<>();
//        this.listaPez      = new DoublyLinkedList<>();
//        this.listaPorcino  = new DoublyLinkedList<>();
//    }
    
    //AGREGAR ANIMALES
    
    public static void agregarAve(String id, int edad, String salud, double peso){
         Ave ave = new Ave(id,edad,salud,peso);
         listaAve.pushBack(ave);
         
         ave.escribir(listaAve);       
     }
    
    public static void agregarAve(Ave Ave){
         listaAve.pushBack(Ave);
         ave.escribir(listaAve);
     }
    
    public static void agregarBovino(String id, int edad, String salud, double peso){
         Bovino bovino = new Bovino(id,edad,salud,peso);
         listaBovino.pushBack(bovino);
         
         bovino.escribir(listaBovino);       
     } 
    
    public static void agregarBovino(Bovino bovino){
         listaBovino.pushBack(bovino);
         bovino.escribir(listaBovino);
     }  

    public static void agregarCaballo(String id, int edad, String salud, double peso){
         Caballo Caballo = new Caballo(id,edad,salud,peso);
         listaCaballo.pushBack(Caballo);
         
         Caballo.escribir(listaCaballo);       
     }
    
    public static void agregarOvino(String id, int edad, String salud, double peso){
         Ovino Ovino = new Ovino(id,edad,salud,peso);
         listaOvino.pushBack(Ovino);
         
         Ovino.escribir(listaOvino);       
     }
    
    public static void agregarPez(String id, int edad, String salud, double peso){
         Pez Pez = new Pez(id,edad,salud,peso);
         listaPez.pushBack(Pez);
         
         Pez.escribir(listaPez);       
     }
    
    public static void agregarPorcino(String id, int edad, String salud, double peso){
         Porcino Porcino = new Porcino(id,edad,salud,peso);
         listaPorcino.pushBack(Porcino);
         
         Porcino.escribir(listaPorcino);       
     }
    
    
    
    
    // Hazlo para los demas cultivos...
    
    //BUSCAR ANIMALES POR ID
    public static int position = 0;
    public static Bovino buscarIdBovino(String id){
        for(int i=0; i <= listaBovino.length(); i++){
                 Bovino objetoEncontrado = listaBovino.find(i);
    	if(objetoEncontrado.getId().equals(id)){
                              position = i;
                              return objetoEncontrado;
                  }   
             }
        System.out.println("No se encontro el elemento con id " + id);
        return null;
    }
    
    public static Ave buscarIdAve(String id){
        for(int i=0; i <= listaAve.length(); i++){
                 Ave objetoEncontrado = listaAve.find(i);
    	if(objetoEncontrado.getId().equals(id)){
                              position = i;
                              return objetoEncontrado;
                  }   
             }
        System.out.println("No se encontro el elemento con id " + id);
        return null;
    }
    
    //ACTUALIZAR CADA ATRIBUTO ANIMALES
    public static void actualizarBovinoEdad(String id, int edad){
        Bovino bovino = new Bovino();       
                 Bovino bovinoEncontrado = buscarIdBovino(id);
                 if(bovinoEncontrado != null){                    
                     if(bovinoEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + bovinoEncontrado.getId());
                            bovino = bovinoEncontrado;
                            bovino.setEdad(edad);                        
                            listaBovino.delete(position);
                            listaBovino.pushBack(bovino);
                            bovino.escribir(listaBovino);                       
                    } 
                 }else{
                     System.out.println("No se realizo actualización.");
                 }  	  
           
    }
    
    public static void actualizarBovinoSalud(String id, String salud){
        Bovino bovino = new Bovino();       
                 Bovino bovinoEncontrado = buscarIdBovino(id);
                 if(bovinoEncontrado != null){                    
                     if(bovinoEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + bovinoEncontrado.getId());
                            bovino = bovinoEncontrado;
                            bovino.setSalud(salud);                        
                            listaBovino.delete(position);
                            listaBovino.pushBack(bovino);
                            bovino.escribir(listaBovino);                       
                    }  
                 }else{
                     System.out.println("No se realizo actualización.");
                 }            
    }
    //ELIMINAR ANIMALES:
    public static void eliminarBovino(String id){
        Bovino bovino = new Bovino();        
                 Bovino bovinoEncontrado = buscarIdBovino(id);                
                 if(bovinoEncontrado != null){                    
                     if(bovinoEncontrado.getId().equals(id)){
                            System.out.println("Id del elemento borrado " + bovinoEncontrado.getId());
                            listaBovino.delete(position);
                            bovino.escribir(listaBovino);
                      }                                       
                 }else{
                     System.out.println("No se realizo la eliminación.");
                 }    
    }
    
    public static void eliminarAve(String id){
        Ave Ave = new Ave();        
                 Ave AveEncontrado = buscarIdAve(id);
                 if(AveEncontrado != null){                    
                     if(AveEncontrado.getId().equals(id)){
                            System.out.println("Id del elemento borrado " + AveEncontrado.getId());
                            listaAve.delete(position);
                            Ave.escribir(listaAve);
                      }                                       
                 }else{
                     System.out.println("No se realizo la eliminación.");
                 }         
    }
}
