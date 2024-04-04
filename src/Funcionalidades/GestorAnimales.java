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
import Classes.Cultivo.Cereal;
import Classes.Cultivo.Frutal;
import Classes.Cultivo.Hortaliza;
import Classes.Cultivo.Leguminosa;
import Classes.Cultivo.Ornamental;
import Classes.Cultivo.Oleaginosa;
import Classes.Cultivo.Raiz_y_Tuberculo;
import Classes.Tarea;
import static Funcionalidades.GestorAnimales.ave;
import static Funcionalidades.GestorAnimales.buscarIdBovino;
import static Funcionalidades.GestorAnimales.position;
import structures.DynamicArrayList;
        



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

public class GestorCultivo {
    //El gestor de cultivos posee una lista de cada clase de cultivo, donde se guerdarán las instancias poseean dichas clases.   
    
    public static final Cereal cereal = new Cereal();
    public static final Frutal frutal = new Frutal();
    public static final Hortaliza hortaliza= new Hortaliza();
    public static final Leguminosa leguminosa = new Leguminosa();
    public static final Oleaginosa oleaginosa= new Oleaginosa();
    public static final Ornamental ornamental= new Ornamental();
    public static final Raiz_y_Tuberculo raiz_y_tuberculo = new Raiz_y_Tuberculo();
    
    
    private static DoublyLinkedList<Cereal> listaCereal = cereal.leer();
    private static DoublyLinkedList<Frutal> listaFrutal= frutal.leer();
    private static DoublyLinkedList<Hortaliza> listaHortaliza = hortaliza.leer();
    private static DoublyLinkedList<Leguminosa> listaLeguminosa = leguminosa.leer();
    private static DoublyLinkedList<Oleaginosa> listaOleaginosa = oleaginosa.leer();
    private static DoublyLinkedList<Ornamental> listaOrnamental = ornamental.leer();
    private static DoublyLinkedList<Raiz_y_Tuberculo> listaRaiz_y_Tuberculo = raiz_y_tuberculo.leer();
    
    public static void agregarCereal(String id, String nombre, DynamicArrayList<Tarea> necesidades){
         Cereal cereal = new Cereal(id,nombre,necesidades);
         listaCereal.pushBack(cereal);
         
         cereal.escribir(listaCereal);       
     }
    
    public static void agregarCereal(Cereal cereal){
         listaCereal.pushBack(Cereal);
         cereal.escribir(listaCereal);
     }
    
    public static void agregarFrutal(String id, String nombre, DynamicArrayList<Tarea> necesidades){
         Frutal frutal = new Frutal(id,nombre,necesidades);
         listaFrutal.pushBack(frutal);
         
         frutal.escribir(listaFrutal);       
     } 
    
    public static void agregarFrutal(Frutal frutal){
        listaFrutal.pushBack(frutal);
        frutal.escribir(listaFrutal);
     }  

    public static void agregarHotaliza ( String id, String nombre, DynamicArrayList<Tarea> necesidades){
        Hortaliza hortaliza = new Hortaliza(id,nombre,necesidades);
        listaHortaliza.pushBack(Hortaliza);
         
        Hortaliza.escribir(listaHortaliza);       
     }
    public static void agregarHortaliza (Hortaliza hortaliza){
        listaHortaliza.pushBack(Hortaliza);
                 
        Hortaliza.escribir (listaHortaliza);
        
    }
    
    public static void agregarLeguminosa(String id, String nombre, DynamicArrayList<Tarea> necesidades){
         Leguminosa leguminosa = new Leguminosa(id,nombre,necesidades);
         listaLeguminosa.pushBack(Leguminosa);
         
         Leguminosa.escribir(listaLeguminosa);       
     }
    public static void agregarLeguminosa(Leguminosa leguminosa){
        listaLeguminosa.pushBack(Leguminosa);
                 
        Leguminosa.escribir (listaLeguminosa);
    }
     public static void Oleaginosa(String id, String nombre, DynamicArrayList<Tarea> necesidades) {
         Oleaginosa oleaginosa=new Oleagiinosa(id, nombre, necesidades)
         listaOleaginosa.pushBack(oleaginosa);
         
         oleaginosa.escribir(listaOleaginosa);       
     }
    
    public static void agregaOleaginosa(Oleaginosa oleaginosa){
         listaOleaginosa.pushBack(Oleaginosa);
         oleaginosa.escribir(listaOleaginosa);
     }
        
    public static void agregarOrnamental(String id, int edad, String salud, double peso){
         Ornamental ornamental = new Ornamental(id,edad,salud,peso);
         listaOrnamental.pushBack(ornamental);
         
         ornamental.escribir(listaOrnamental);       
     } 
    
    public static void agregarOrnamental(Ornamental ornamental){
         listaOrnamental.pushBack(ornamental);
         ornamental.escribir(listaOrnamental);
     }  
    
    public static void agregarRaiz_y_Tuberculo(String id, String nombre, DynamicArrayList<Tarea> necesidades){
        Raiz_y_Tuberculo raiz_y_tuberculo = new Raiz_y_Tuberculo(id,edad,salud,peso);
        listaRaiz_y_Tuberculo.pushBack(raiz_y_tuberculo);
         
        raiz_y_tuberculo.escribir(listaRaiz_y_Tuberculo);       
     } 
    
    public static int position = 0;
    public static Cereal buscarIdCereal(String id){
        for(int i=0; i <= listaCereal.length(); i++){
                 Cereal objetoEncontrado = listaCereal.find(i);
    	if(objetoEncontrado.getId().equals(id)){
                              position = i;
                              return objetoEncontrado;
                  }   
             }
        System.out.println("No se encontro el elemento con id " + id);
        return null;
    }
    
    public static Frutal buscarIdFrutal(String id){
        for(int i=0; i <= listaFrutal.length(); i++){
                Frutal objetoEncontrado = listaFrutal.find(i);
    	if(objetoEncontrado.getId().equals(id)){
                              position = i;
                              return objetoEncontrado;
                  }   
             }
        System.out.println("No se encontro el elemento con id " + id);
        return null;
    }
    
    public static Hortaliza buscarIdHortaliza(String id){
        for(int i=0; i <= listaHortaliza.length(); i++){
                Hortaliza objetoEncontrado = listaHortaliza.find(i);
    	if(objetoEncontrado.getId().equals(id)){
                              position = i;
                              return objetoEncontrado;
                  }   
             }
        System.out.println("No se encontro el elemento con id " + id);
        return null;
    }
        
    public static Leguminosa buscarIdLeguminosa(String id){
        for(int i=0; i <= listaLeguminosa.length(); i++){
                Leguminosa objetoEncontrado = listaLeguminosa.find(i);
    	if(objetoEncontrado.getId().equals(id)){
                              position = i;
                              return objetoEncontrado;
                  }   
             }
        System.out.println("No se encontro el elemento con id " + id);
        return null;
    }
    
    public static Oleaginosa buscarIdOleaginosa(String id){
        for(int i=0; i <= listaLeguminosa.length(); i++){
                Oleaginosa objetoEncontrado = listaOleaginosa.find(i);
    	if(objetoEncontrado.getId().equals(id)){
                              position = i;
                              return objetoEncontrado;
                  }   
             }
        System.out.println("No se encontro el elemento con id " + id);
        return null;
    }
    public static Ornamental buscarIdOrnamental(String id){
        for(int i=0; i <= listaOrnamental.length(); i++){
                Ornamental objetoEncontrado = listaOrnamental.find(i);
    	if(objetoEncontrado.getId().equals(id)){
                              position = i;
                              return objetoEncontrado;
                  }   
             }
        System.out.println("No se encontro el elemento con id " + id);
        return null;
    }
    public static Raiz_y_Tuberculo buscarIdRaiz_y_Tuberculo(String id){
        for(int i=0; i <= listaRaiz_y_Tuberculo.length(); i++){
                Raiz_y_Tuberculo objetoEncontrado = listaRaiz_y_Tuberculo.find(i);
    	if(objetoEncontrado.getId().equals(id)){
                              position = i;
                              return objetoEncontrado;
                  }   
             }
        System.out.println("No se encontro el elemento con id " + id);
        return null;
    }
    
       //ACTUALIZAR CADA ATRIBUTO Cultivos
    //cereal
    public static void actualizarCerealNombre(String id, String nombre){
        Cereal cereal = new Cereal();       
                 Cereal cerealEncontrado = buscarIdCereal(id);
                 if(cerealEncontrado != null){                    
                     if(cerealEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + cerealEncontrado.getId());
                            cereal = cerealEncontrado;
                            cereal.setNombre(nombre);                        
                            listaCereal.delete(position);
                            listaCereal.pushBack(cereal);
                            cereal.escribir(listaCereal);                       
                    } 
                 }else{
                     System.out.println("No se realizo actualización.");
                 }  	  
           
    }
    
    public static void actualizarCerealNecesidades(String id, DynamicArrayList<Tarea> necesidades){
        Cereal cereal = new Cereal();       
                Cereal cerealEncontrado = buscarIdCereal(id);
                 if(cerealEncontrado != null){                    
                     if(cerealEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + cerealEncontrado.getId());
                            cereal = cerealEncontrado;
                            cereal.setNecesidades(necesidades);                        
                            listaCereal.delete(position);
                            listaCereal.pushBack(cereal);
                            cereal.escribir(listaCereal);                       
                    }  
                 }else{
                     System.out.println("No se realizo actualización.");
                 }            
    }
    public static void actualizarFrutalNombre(String id, String nombre){
        Frutal frutal = new Frutal();       
                Frutal frutalEncontrado = buscarIdFrutal(id);
                 if(frutalEncontrado != null){                    
                     if(frutalEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + frutalEncontrado.getId());
                            frutal = frutalEncontrado;
                            frutal.setNombre(nombre);                        
                            listaFrutal.delete(position);
                            listaFrutal.pushBack(frutal);
                            frutal.escribir(listaFrutal);                       
                    } 
                 }else{
                     System.out.println("No se realizo actualización.");
                 }  	  
           
    }
    
    public static void actualizarFrutalNecesidades(String id, DynamicArrayList<Tarea> necesidades){
        Frutal frutal = new Frutal();       
                Frutal cerealEncontrado = buscarIdFrutal(id);
                 if(frutalEncontrado != null){                    
                     if(frutalEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + frutalEncontrado.getId());
                            cereal = cerealEncontrado;
                            cereal.setNecesidades(necesidades);                        
                            listaFrutal.delete(position);
                            listaFrutal.pushBack(frutal);
                            frutal.escribir(listaFrutal);                       
                    }  
                 }else{
                     System.out.println("No se realizo actualización.");
                 }            
    }
    
    public static void actualizarHortalizaNombre(String id, String nombre){
        Hortaliza hortaliza = new Hortaliza();       
                Hortaliza hortalizaEncontrado = buscarIdHortaliza(id);
                 if(hortalizaEncontrado != null){                    
                     if(hortalizaEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + hortalizaEncontrado.getId());
                            hortaliza = hortalizaEncontrado;
                            hortaliza.setNombre(nombre);                        
                            listaHortaliza.delete(position);
                            listaHortaliza.pushBack(hortaliza);
                            hortaliza.escribir(listaHortaliza);                       
                    } 
                 }else{
                     System.out.println("No se realizo actualización.");
                 }  	  
           
    }
    
    public static void actualizarHortalizaNecesidades(String id, DynamicArrayList<Tarea> necesidades){
        Hortaliza hortaliza = new Hortaliza();       
                Hortaliza hortalizaEncontrado = buscarIdHortaliza(id);
                 if(hortalizaEncontrado != null){                    
                     if(hortalizaEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + hortalizaEncontrado.getId());
                            hortaliza = hortalizaEncontrado;
                            hortaliza.setNecesidades(necesidades);                        
                            listaHortaliza.delete(position);
                            listaHortaliza.pushBack(hortaliza);
                            hortaliza.escribir(listaHortaliza);                       
                    }  
                 }else{
                     System.out.println("No se realizo actualización.");
                 }            
    }
    
    
}
