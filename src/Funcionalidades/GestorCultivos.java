2/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;

import Classes.Cultivo.*;
import Classes.Tarea;
import Structures.Doubly.DoublyLinkedList;
import structures.DynamicArrayList;
import Classes.Cultivo.Cereal;
import Classes.Cultivo.Frutal;
import Classes.Cultivo.Hortaliza;
import Classes.Cultivo.Leguminosa;
import Classes.Cultivo.Ornamental;
import Classes.Cultivo.Oleaginosa;
import Classes.Cultivo.Raiz_y_Tuberculo;
 /**
 *
 * @author samue
 */
public class GestorCultivos {
    
    public static final Cereal cereal = new Cereal();
    public static final Frutal frutal = new Frutal();
    public static final Hortaliza hortaliza= new Hortaliza();
    public static final Leguminosa leguminosa = new Leguminosa();
    public static final Oleaginosa oleaginosa= new Oleaginosa();
    public static final Ornamental ornamental= new Ornamental();
    public static final Raiz_y_Tuberculo raiz_y_tuberculo = new Raiz_y_Tuberculo();
//    
//    
    private static DoublyLinkedList<Cereal> listaCereal = cereal.leer();
    private static DoublyLinkedList<Frutal> listaFrutal= frutal.leer();
    private static DoublyLinkedList<Hortaliza> listaHortaliza = hortaliza.leer();
    private static DoublyLinkedList<Leguminosa> listaLeguminosa = leguminosa.leer();
    private static DoublyLinkedList<Oleaginosa> listaOleaginosa = oleaginosa.leer();
    private static DoublyLinkedList<Ornamental> listaOrnamental = ornamental.leer();
    private static DoublyLinkedList<Raiz_y_Tuberculo> listaRaiz_y_Tuberculo = raiz_y_tuberculo.leer();  
      
    //Para creación de archivos
//    private static DoublyLinkedList<Cereal> listaCereal;
//    private static DoublyLinkedList<Frutal> listaFrutal;
//    private static DoublyLinkedList<Hortaliza> listaHortaliza;
//    private static DoublyLinkedList<Leguminosa> listaLeguminosa;
//    private static DoublyLinkedList<Oleaginosa> listaOleaginosa;
//    private static DoublyLinkedList<Ornamental> listaOrnamental;
//    private static DoublyLinkedList<Raiz_y_Tuberculo> listaRaiz_y_Tuberculo;
//
//    public GestorCultivos() {
//        this.listaCereal          = new DoublyLinkedList<>();
//        this.listaFrutal         = new DoublyLinkedList<>();
//        this.listaHortaliza        = new DoublyLinkedList<>();
//        this.listaLeguminosa       = new DoublyLinkedList<>();
//        this.listaOleaginosa       = new DoublyLinkedList<>();
//        this.listaOrnamental      = new DoublyLinkedList<>();
//        this.listaRaiz_y_Tuberculo  = new DoublyLinkedList<>();
//    }
    
    public static void agregarCereal(String id, String nombre, DynamicArrayList<Tarea> necesidades){
         Cereal cereal = new Cereal(id,nombre,necesidades);
         listaCereal.pushBack(cereal);
         
         cereal.escribir(listaCereal);       
     }
    
    public static void agregarCereal(Cereal cereal){
         listaCereal.pushBack(cereal);
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

    public static void agregarHortaliza ( String id, String nombre, DynamicArrayList<Tarea> necesidades){
        Hortaliza hortaliza = new Hortaliza(id,nombre,necesidades);
        listaHortaliza.pushBack(hortaliza);
         
        hortaliza.escribir(listaHortaliza);       
     }
    public static void agregarHortaliza (Hortaliza hortaliza){
        listaHortaliza.pushBack(hortaliza);
                 
        hortaliza.escribir (listaHortaliza);     
    }
    
    public static void agregarLeguminosa(String id, String nombre, DynamicArrayList<Tarea> necesidades){
         Leguminosa leguminosa = new Leguminosa(id,nombre,necesidades);
         listaLeguminosa.pushBack(leguminosa);
         
         leguminosa.escribir(listaLeguminosa);       
     }
    public static void agregarLeguminosa(Leguminosa leguminosa){
        listaLeguminosa.pushBack(leguminosa);
                 
        leguminosa.escribir(listaLeguminosa);
    }
    
     public static void agregarOleaginosa(String id, String nombre, DynamicArrayList<Tarea> necesidades) {
         Oleaginosa oleaginosa=new Oleaginosa(id, nombre, necesidades);
         listaOleaginosa.pushBack(oleaginosa);
         
         oleaginosa.escribir(listaOleaginosa);       
     }
    
    public static void agregarOleaginosa(Oleaginosa oleaginosa){
         listaOleaginosa.pushBack(oleaginosa);
         oleaginosa.escribir(listaOleaginosa);
     }
        
    public static void agregarOrnamental(String id, String nombre, DynamicArrayList<Tarea> necesidades){
         Ornamental ornamental = new Ornamental(id, nombre, necesidades);
         listaOrnamental.pushBack(ornamental);
         
         ornamental.escribir(listaOrnamental);       
     } 
    
    public static void agregarOrnamental(Ornamental ornamental){
         listaOrnamental.pushBack(ornamental);
         ornamental.escribir(listaOrnamental);
     }  
    
    public static void agregarRaiz_y_Tuberculo(String id, String nombre, DynamicArrayList<Tarea> necesidades){
        Raiz_y_Tuberculo raiz_y_tuberculo = new Raiz_y_Tuberculo(id, nombre, necesidades);
        listaRaiz_y_Tuberculo.pushBack(raiz_y_tuberculo);
         
        raiz_y_tuberculo.escribir(listaRaiz_y_Tuberculo);       
     } 
    
    public static void agregarRaiz_y_Tuberculo(Raiz_y_Tuberculo raiz_y_tuberculo){
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
                Frutal frutalEncontrado = buscarIdFrutal(id);
                 if(frutalEncontrado != null){                    
                     if(frutalEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + frutalEncontrado.getId());
                            frutal = frutalEncontrado;
                            frutal.setNecesidades(necesidades);                        
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
    public static void actualizarLeguminosaNombre(String id, String nombre){
        Leguminosa leguminosa = new Leguminosa();       
                Leguminosa leguminosaEncontrado = buscarIdLeguminosa(id);
                 if(leguminosaEncontrado != null){                    
                     if(leguminosaEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + leguminosaEncontrado.getId());
                            leguminosa = leguminosaEncontrado;
                            leguminosa.setNombre(nombre);                        
                            listaLeguminosa.delete(position);
                            listaLeguminosa.pushBack(leguminosa);
                            leguminosa.escribir(listaLeguminosa);                       
                    } 
                 }else{
                     System.out.println("No se realizó actualización.");
                 }  	  
           
    }
    
    public static void actualizarLeguminosaNecesidades(String id, DynamicArrayList<Tarea> necesidades){
        Leguminosa leguminosa = new Leguminosa();       
                Leguminosa leguminosaEncontrado = buscarIdLeguminosa(id);
                 if(leguminosaEncontrado != null){                    
                     if(leguminosaEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + leguminosaEncontrado.getId());
                            leguminosa = leguminosaEncontrado;
                            leguminosa.setNecesidades(necesidades);                        
                            listaLeguminosa.delete(position);
                            listaLeguminosa.pushBack(leguminosa);
                            leguminosa.escribir(listaLeguminosa);                       
                    }  
                 }else{
                     System.out.println("No se realizo actualización.");
                 }            
    }  
    public static void actualizarOleaginosaNombre(String id, String nombre){
        Oleaginosa oleaginosa = new Oleaginosa();       
                Oleaginosa oleaginosaEncontrado = buscarIdOleaginosa(id);
                 if(oleaginosaEncontrado != null){                    
                     if(oleaginosaEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + oleaginosaEncontrado.getId());
                            oleaginosa = oleaginosaEncontrado;
                            oleaginosa.setNombre(nombre);                        
                            listaOleaginosa.delete(position);
                            listaOleaginosa.pushBack(oleaginosa);
                            oleaginosa.escribir(listaOleaginosa);                       
                    } 
                 }else{
                     System.out.println("No se realizo actualización.");
                 }  	  
           
    }
    
    public static void actualizarOleaginosaNecesidades(String id, DynamicArrayList<Tarea> necesidades){
        Oleaginosa oleaginosa = new Oleaginosa();       
                Oleaginosa oleaginosaEncontrado = buscarIdOleaginosa(id);
                 if(oleaginosaEncontrado != null){                    
                     if(oleaginosaEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + oleaginosaEncontrado.getId());
                            oleaginosa = hortalizaEncontrado;
                            oleaginosa.setNecesidades(necesidades);                        
                            listaOleaginosa.delete(position);
                            listaOleaginosa.pushBack(oleaginosa);
                            oleaginosa.escribir(listaOleaginosa);                       
                    }  
                 }else{
                     System.out.println("No se realizo actualización.");
                 }            
    }   
}