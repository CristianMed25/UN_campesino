/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;
import Structures.Stack;
/**
 *
 * @author CristianM
 */
public class TestStack {
    public static Stack<Test> pilaTest = new Stack<>();
    
    public static Test verDato(){
        return pilaTest.peek();
    }
    
    public static void apilarDato(Test testQueue){
        pilaTest.push(testQueue);
    }
    
    public static Test desapilarDatos(){
        return pilaTest.pop();
    }      
    
    public static void editarDato(String data){
        Test datoEditar = verDato();
        datoEditar.setData(data);
        desapilarDatos();
        pilaTest.pushBack(datoEditar);
    }
    
    public static void testApilarDatos(int n){
        long startTime = System.currentTimeMillis(); 
        for (int i = 0; i < n; i++) {
            Test dato = new Test(i, "data");
            apilarDato(dato);
        }       
        long endTime = System.currentTimeMillis(); 
        long duration = endTime - startTime;
        System.out.println("La duracion de inserción de datos en Stack fue de: " + duration + "ms");
}

public static void testEditarDato(String data){
        long startTime = System.currentTimeMillis();   
        editarDato(data);      
        long endTime = System.currentTimeMillis(); 
        long duration = endTime - startTime;       
        System.out.println("La duracion de edicion de dato en la cima de Stack fue de: " + duration + "ms");
}

public static void testDesapilarDatos(){
        long startTime = System.currentTimeMillis();   
        for(int  i = 0; i < pilaTest.getCount(); i++){
            desapilarDatos();  
        }          
        long endTime = System.currentTimeMillis(); 
        long duration = endTime - startTime;       
        System.out.println("La duracion de desapilar todos los datos en Stack fue de: " + duration + "ms");
}
    public static void main(String[] args) {
        testApilarDatos(1000000);
        testEditarDato("data edit");
        testDesapilarDatos();      
    }
}
