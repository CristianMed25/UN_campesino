/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;
import structures.DynamicArrayList;
/**
 *
 * @author CristianM
 */
public class TestDynamicArrayList {
    public static DynamicArrayList<Test> testList = new DynamicArrayList<>();
    
    public static void agregarDato(int id, String data){
        Test testDAL = new Test(id, data);
        testList.pushFront(testDAL);
    }
    
    public static void agregarDato(Test testDAL){
        testList.pushFront(testDAL);
    }
    
    public static void eliminarDatoReciente(){
        testList.popFront();
    }
    
    public static void buscarDatoId(String id){
        for(int i = 0; i < testList.length();i++){
            Test objetoEncontrado = testList.find(i);
            if(objetoEncontrado.getId().equals(id)){
                break;
            }
        }       
    }
    
    public static void testInsercionDatos(int n){
        Test testDAL = new Test(0, "data");           
        
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {       
            agregarDato(testDAL);     
        }    
        long endTime = System.currentTimeMillis();
        
        long duration = endTime - startTime;
        System.out.println("\nLa duracion de inserción de datos en DAL fue de: " + duration + "ms");
}

public static void testBusquedaDatos(String n){
        long startTime = System.currentTimeMillis();   
        buscarDatoId("T" + n);      
        long endTime = System.currentTimeMillis(); 
        long duration = endTime - startTime;       
        System.out.println("La duracion de busqueda de datos en DAL fue de: " + duration + "ms");
}

public static void testBorrarDatos(){
        long startTime = System.currentTimeMillis();   
        for(int  i = 0; i < testList.length(); i++){
            eliminarDatoReciente();  
        }     
        long endTime = System.currentTimeMillis(); 
        long duration = endTime - startTime;       
        System.out.println("La duracion de eliminacion de todos los datos en DAL fue de: " + duration + "ms");
}
    public static void main(String[] args) {
        int n = 10000;
        String dato = "9999";
        
        System.out.println("\nNumero de datos " + n);
        testInsercionDatos(n);
        testBusquedaDatos(dato);
        testBorrarDatos();
    } 
}
