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
    public static void agregarCaballo(Caballo caballo){
        listaCaballo.pushBack(caballo);
        caballo.escribir(listaCaballo);
    }    
    public static void agregarOvino(String id, int edad, String salud, double peso){
         Ovino Ovino = new Ovino(id,edad,salud,peso);
         listaOvino.pushBack(Ovino);
      
         Ovino.escribir(listaOvino);       
     }
    public static void agregarOvino(Ovino ovino){
        listaOvino.pushBack(ovino);
        ovino.escribir(listaOvino);
    }

    public static void agregarPez(String id, int edad, String salud, double peso){
         Pez Pez = new Pez(id,edad,salud,peso);
         listaPez.pushBack(Pez);
         
         Pez.escribir(listaPez);       
     }
    public static void agregarPez(Pez pez){
        listaPez.pushBack(pez);
        pez.escribir(listaPez);
    }
    
    public static void agregarPorcino(String id, int edad, String salud, double peso){
         Porcino Porcino = new Porcino(id,edad,salud,peso);
         listaPorcino.pushBack(Porcino);
         
         Porcino.escribir(listaPorcino);      
    }
    public static void agregarPorcino(Porcino porcino){
        listaPorcino.pushBack(porcino);
        porcino.escribir(listaPorcino);
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
    
    public static Caballo buscarIdCaballo(String id){
        for(int i=0; i <= listaCaballo.length(); i++){
                 Caballo objetoEncontrado = listaCaballo.find(i);
    	if(objetoEncontrado.getId().equals(id)){
                              position = i;
                              return objetoEncontrado;
                  }   
             }
        System.out.println("No se encontro el elemento con id " + id);
        return null;
    }
    
    public static Ovino buscarIdOvino(String id){
        for(int i=0; i <= listaOvino.length(); i++){
                 Ovino objetoEncontrado = listaOvino.find(i);
    	if(objetoEncontrado.getId().equals(id)){
                              position = i;
                              return objetoEncontrado;
                  }   
             }
        System.out.println("No se encontro el elemento con id " + id);
        return null;
    }
    
    public static Pez buscarIdPez(String id){
        for(int i=0; i <= listaPez.length(); i++){
                 Pez objetoEncontrado = listaPez.find(i);
    	if(objetoEncontrado.getId().equals(id)){
                              position = i;
                              return objetoEncontrado;
                  }   
             }
        System.out.println("No se encontro el elemento con id " + id);
        return null;
    }
    
    public static Porcino buscarIdPorcino(String id){
        for(int i=0; i <= listaPorcino.length(); i++){
                 Porcino objetoEncontrado = listaPorcino.find(i);
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
    
    public static void actualizarBovinoPeso(String id, double peso){
        Bovino bovino = new Bovino();
        Bovino bovinoEncontrado = buscarIdBovino(id);
        if (bovinoEncontrado!=null){
            if(bovinoEncontrado.getId().equals(id)){
                System.out.println("Id elemento actualizado" + bovinoEncontrado.getId());
                bovino=bovinoEncontrado;
                bovino.setPeso(peso);
                listaBovino.delete(position);
                listaBovino.pushBack(bovino);
                bovino.escribir(listaBovino);
                
            }
        }
    }
    
    public static void actualizarAveEdad(String id, int edad){
        Ave ave=new Ave();
        Ave aveEncontrada = buscarIdAve(id);
        if (aveEncontrada!=null){
            if(aveEncontrada.getId().equals(id)){
                System.out.println("Id elemento actualizado" + aveEncontrada.getId());
                ave = aveEncontrada;
                ave.setEdad(edad);
                listaAve.delete(position);
                listaAve.pushBack(ave);
                ave.escribir(listaAve);
            }
        }
    }
    
    public static void actualizarAveSalud(String id, String salud){
        Ave ave=new Ave();
        Ave aveEncontrada = buscarIdAve(id);
        if (aveEncontrada!=null){
            if(aveEncontrada.getId().equals(id)){
                System.out.println("Id elemento actualizado" + aveEncontrada.getId());
                ave = aveEncontrada;
                ave.setSalud(salud);
                listaAve.delete(position);
                listaAve.pushBack(ave);
                ave.escribir(listaAve);
            }
        }
    }
    
    public static void actualizarAvePeso(String id, double peso){
        Ave ave=new Ave();
        Ave aveEncontrada = buscarIdAve(id);
        if (aveEncontrada!=null){
            if(aveEncontrada.getId().equals(id)){
                System.out.println("Id elemento actualizado" + aveEncontrada.getId());
                ave = aveEncontrada;
                ave.setPeso(peso);
                listaAve.delete(position);
                listaAve.pushBack(ave);
                ave.escribir(listaAve);
            }
        }
    }
    
    
    public static void actualizarCaballoEdad(String id, int edad){
        Caballo caballo= new Caballo();
        Caballo caballoEncontrado=buscarIdCaballo(id);
        if (caballoEncontrado!=null){
            if(caballoEncontrado.getId().equals(id)){
                System.out.println("Id elemento actualizado" + caballoEncontrado.getId());
                caballo=caballoEncontrado;
                caballo.setEdad(edad);
                listaCaballo.delete(position);
                listaCaballo.pushBack(caballo);
                caballo.escribir(listaCaballo);
            }
        }
    }
    
    public static void actualizarCaballoSalud(String id, String salud){
        Caballo caballo= new Caballo();
        Caballo caballoEncontrado=buscarIdCaballo(id);
        if (caballoEncontrado!=null){
            if(caballoEncontrado.getId().equals(id)){
                System.out.println("Id elemento actualizado" + caballoEncontrado.getId());
                caballo=caballoEncontrado;
                caballo.setSalud(salud);
                listaCaballo.delete(position);
                listaCaballo.pushBack(caballo);
                caballo.escribir(listaCaballo);
            }
        }
    }
    
    public static void actualizarCaballoPeso(String id, double peso){
        Caballo caballo= new Caballo();
        Caballo caballoEncontrado=buscarIdCaballo(id);
        if (caballoEncontrado!=null){
            if(caballoEncontrado.getId().equals(id)){
                System.out.println("Id elemento actualizado" + caballoEncontrado.getId());
                caballo=caballoEncontrado;
                caballo.setPeso(peso);
                listaCaballo.delete(position);
                listaCaballo.pushBack(caballo);
                caballo.escribir(listaCaballo);
            }
        }
    }
    
    
    public static void actualizarOvinoEdad(String id, int edad){
        Ovino ovino=new Ovino();
        Ovino ovinoEncontrado=buscarIdOvino(id);
        if (ovinoEncontrado!=null){
            if (ovinoEncontrado.getId().equals(id)){
                System.out.println("Id elemento actualizado" + ovinoEncontrado.getId());
                ovino=ovinoEncontrado;
                ovino.setEdad(edad);
                listaOvino.delete(position);
                listaOvino.pushBack(ovino);
                ovino.escribir(listaOvino);
            }
        }
    }
    
    public static void actualizarOvinoSalud(String id, String salud){
        Ovino ovino=new Ovino();
        Ovino ovinoEncontrado=buscarIdOvino(id);
        if (ovinoEncontrado!=null){
            if (ovinoEncontrado.getId().equals(id)){
                System.out.println("Id elemento actualizado" + ovinoEncontrado.getId());
                ovino=ovinoEncontrado;
                ovino.setSalud(salud);
                listaOvino.delete(position);
                listaOvino.pushBack(ovino);
                ovino.escribir(listaOvino);
            }
        }
    }
    
    public static void actualizarOvinoPeso(String id, double peso){
        Ovino ovino=new Ovino();
        Ovino ovinoEncontrado=buscarIdOvino(id);
        if (ovinoEncontrado!=null){
            if (ovinoEncontrado.getId().equals(id)){
                System.out.println("Id elemento actualizado" + ovinoEncontrado.getId());
                ovino=ovinoEncontrado;
                ovino.setPeso(peso);
                listaOvino.delete(position);
                listaOvino.pushBack(ovino);
                ovino.escribir(listaOvino);
            }
        }
    }
    
    
    public static void actualizarPezEdad(String id, int edad){
        Pez pez=new Pez();
        Pez pezEncontrado=buscarIdPez(id);
        if (pezEncontrado!=null){
            if (pezEncontrado.getId().equals(id)){
                System.out.println("Id elemento actualizado" + pezEncontrado.getId());
                pez=pezEncontrado;
                pez.setEdad(edad);
                listaPez.delete(position);
                listaPez.pushBack(pez);
                pez.escribir(listaPez);
            }
        }
    }
    
    public static void actualizarPezSalud(String id, String salud){
        Pez pez=new Pez();
        Pez pezEncontrado=buscarIdPez(id);
        if (pezEncontrado!=null){
            if (pezEncontrado.getId().equals(id)){
                System.out.println("Id elemento actualizado" + pezEncontrado.getId());
                pez=pezEncontrado;
                pez.setSalud(salud);
                listaPez.delete(position);
                listaPez.pushBack(pez);
                pez.escribir(listaPez);
            }
        }
    }
    
    public static void actualizarPezPeso(String id, double peso){
        Pez pez=new Pez();
        Pez pezEncontrado=buscarIdPez(id);
        if (pezEncontrado!=null){
            if (pezEncontrado.getId().equals(id)){
                System.out.println("Id elemento actualizado" + pezEncontrado.getId());
                pez=pezEncontrado;
                pez.setPeso(peso);
                listaPez.delete(position);
                listaPez.pushBack(pez);
                pez.escribir(listaPez);
            }
        }
    }
    
    
    public static void actualizarPorcinoEdad(String id, int edad){
        Porcino porcino=new Porcino();
        Porcino porcinoEncontrado=buscarIdPorcino(id);
        if (porcinoEncontrado!=null){
            if (porcinoEncontrado.getId().equals(id)){
                System.out.println("Id elemento actualizado" + porcinoEncontrado.getId());
                porcino=porcinoEncontrado;
                porcino.setEdad(edad);
                listaPorcino.delete(position);
                listaPorcino.pushBack(porcino);
                porcino.escribir(listaPorcino);
            }
        }
    }
    
    public static void actualizarPorcinoSalud(String id, String salud){
        Porcino porcino=new Porcino();
        Porcino porcinoEncontrado=buscarIdPorcino(id);
        if (porcinoEncontrado!=null){
            if (porcinoEncontrado.getId().equals(id)){
                System.out.println("Id elemento actualizado" + porcinoEncontrado.getId());
                porcino=porcinoEncontrado;
                porcino.setSalud(salud);
                listaPorcino.delete(position);
                listaPorcino.pushBack(porcino);
                porcino.escribir(listaPorcino);
            }
        }
    }
    
    public static void actualizarPorcinoPeso(String id, double peso){
        Porcino porcino=new Porcino();
        Porcino porcinoEncontrado=buscarIdPorcino(id);
        if (porcinoEncontrado!=null){
            if (porcinoEncontrado.getId().equals(id)){
                System.out.println("Id elemento actualizado" + porcinoEncontrado.getId());
                porcino=porcinoEncontrado;
                porcino.setPeso(peso);
                listaPorcino.delete(position);
                listaPorcino.pushBack(porcino);
                porcino.escribir(listaPorcino);
            }
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
    
    public static void eliminarCaballo(String id){
        Caballo caballo = new Caballo();        
                 Caballo caballoEncontrado = buscarIdCaballo(id);
                 if(caballoEncontrado != null){                    
                     if(caballoEncontrado.getId().equals(id)){
                            System.out.println("Id del elemento borrado " + caballoEncontrado.getId());
                            listaCaballo.delete(position);
                            caballo.escribir(listaCaballo);
                      }                                       
                 }else{
                     System.out.println("No se realizo la eliminación.");
                 }         
    }
    
    public static void eliminarOvino(String id){
        Ovino ovino = new Ovino();        
                 Ovino ovinoEncontrado = buscarIdOvino(id);
                 if(ovinoEncontrado != null){                    
                     if(ovinoEncontrado.getId().equals(id)){
                            System.out.println("Id del elemento borrado " + ovinoEncontrado.getId());
                            listaOvino.delete(position);
                            ovino.escribir(listaOvino);
                      }                                       
                 }else{
                     System.out.println("No se realizo la eliminación.");
                 }         
    }
    
    public static void eliminarPez(String id){
        Pez pez = new Pez();        
                 Pez pezEncontrado = buscarIdPez(id);
                 if(pezEncontrado != null){                    
                     if(pezEncontrado.getId().equals(id)){
                            System.out.println("Id del elemento borrado " + pezEncontrado.getId());
                            listaPez.delete(position);
                            pez.escribir(listaPez);
                      }                                       
                 }else{
                     System.out.println("No se realizo la eliminación.");
                 }         
    }
    
    public static void eliminarPorcino(String id){
        Porcino porcino = new Porcino();        
                 Porcino porcinoEncontrado = buscarIdPorcino(id);
                 if(porcinoEncontrado != null){                    
                     if(porcinoEncontrado.getId().equals(id)){
                            System.out.println("Id del elemento borrado " + porcinoEncontrado.getId());
                            listaPorcino.delete(position);
                            porcino.escribir(listaPorcino);
                      }                                       
                 }else{
                     System.out.println("No se realizo la eliminación.");
                 }         
    }
}

