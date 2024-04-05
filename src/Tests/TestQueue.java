/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;
import  Structures.Queue;

/**
 *
 * @author CristianM
 */
public class TestQueue {
    public static Queue<Test> colaTest = new Queue<>();
    
    public static Test verDato(){
        return colaTest.peek();
    }
    
    public static void encolarDato(Test testQueue){
        colaTest.enqueue(testQueue);
    }
    
    public static Test desencolarDato(){
        return colaTest.dequeue();
    }    
    
//    public static void buscarTarea(String id){
//        Test testQueue = new Test(Integer.parseInt(id), "data");
//        boolean flag = colaTest.find(testQueue);
//        if(flag){
//            System.out.println("La tarea " + testQueue.toString() +"se encuentra en la cola");
//        }else{
//            System.out.println("La tarea no se encuentra en la cola");
//        }
//    } 
//    
//    public static void buscarTarea(Test testQueue){
//        boolean flag = colaTest.find(testQueue);
//        if(flag){
//            System.out.println("La tarea " + testQueue.toString() +"se encuentra en la cola");
//        }else{
//            System.out.println("La tarea no se encuentra en la cola");
//        }
//    } 
    
    public static void editarDato(String data){
        Test datoEditar = verDato();
        datoEditar.setData(data);
        desencolarDato();
        colaTest.pushFront(datoEditar);
    }
    
    public static void testEncolarDatos(int n){
        long startTime = System.currentTimeMillis(); 
        for (int i = 0; i < n; i++) {
            Test dato = new Test(i, "data");
            encolarDato(dato);
        }       
        long endTime = System.currentTimeMillis(); 
        long duration = endTime - startTime;
        System.out.println("La duracion de inserción de datos en Queue fue de: " + duration + "ms");
}

//public static void testBuscarDato(String id){
//        long startTime = System.currentTimeMillis();   
//        buscarTarea(id);      
//        long endTime = System.currentTimeMillis(); 
//        long duration = endTime - startTime;       
//        System.out.println("\nLa duracion de busqueda de dato en DLL fue de: " + duration + "ms");
//}
//
//public static void testBuscarDato(TestQueue testQueue){
//        long startTime = System.currentTimeMillis();   
//        buscarTarea(testQueue);      
//        long endTime = System.currentTimeMillis(); 
//        long duration = endTime - startTime;       
//        System.out.println("\nLa duracion de busqueda de dato en DLL fue de: " + duration + "ms");
//}

public static void testEditarDato(String data){
        long startTime = System.currentTimeMillis();   
        editarDato(data);      
        long endTime = System.currentTimeMillis(); 
        long duration = endTime - startTime;       
        System.out.println("La duracion de edicion de dato en el frente de Queue fue de: " + duration + "ms");
}

public static void testDesencolarDatos(){
        long startTime = System.currentTimeMillis();   
        for(int  i = 0; i < colaTest.getCount(); i++){
            desencolarDato();  
        }          
        long endTime = System.currentTimeMillis(); 
        long duration = endTime - startTime;       
        System.out.println("La duracion de desencolar todos los datos en Queue fue de: " + duration + "ms");
}
    public static void main(String[] args) {
        Test dato = new Test(9999, "data");
        testEncolarDatos(1000000);
//        testBuscarDato("19");
//        testBuscarDato(dato);
        testEditarDato("data edit");
        testDesencolarDatos();      
    }
}
