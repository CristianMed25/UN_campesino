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
        System.out.println("\nLa duracion de inserción de datos en Queue fue de: " + duration + "ms");
}

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
        int n = 10000;
        
        System.out.println("\nNumero de datos " + n);
        testEncolarDatos(n);
        testEditarDato("data edit");
        testDesencolarDatos();      
    }
}
