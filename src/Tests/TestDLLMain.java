package Tests;

import Structures.Doubly.DoublyLinkedList;

public class TestDLLMain{
    
public static DoublyLinkedList<TestDLL> listaTestDLL  = new DoublyLinkedList<>();

public static void agregarTestDLL(int id, int data){
             TestDLL testDLL = new TestDLL(id,data);
             listaTestDLL.pushBack(testDLL);
         }

public static void agregarTestDLL(TestDLL testDLL){
             listaTestDLL.pushBack(testDLL);
         }

public static int position = 0;
public static TestDLL buscarIdTestDLL(String id){ 
    for(int i=0; i <= listaTestDLL.length(); i++){
                 TestDLL objetoEncontrado = listaTestDLL.find(i);
	if(objetoEncontrado.getId().equals(id)){
                          position = i;
                          return objetoEncontrado;
                  }   
         }
    return null;
}

public static void actualizarTestDLLData(String id, int data){
    TestDLL testDLL = new TestDLL();
                  TestDLL objetoEncontrado = buscarIdTestDLL(id);
	if(objetoEncontrado.getId().equals(id)){
                        System.out.println("\nElemento actualizado " + objetoEncontrado.getId());
                        testDLL = objetoEncontrado;
                        testDLL.setData(data);                          
                        listaTestDLL.delete(position);
                        listaTestDLL.addAfter(position-1, testDLL);
                  }   
}

public static void eliminarTestDLL(String id){
                  TestDLL objetoEncontrado = buscarIdTestDLL(id);
	if(objetoEncontrado.getId().equals(id)){
                        System.out.println("\nElemento borrado " + objetoEncontrado.getId());
                        listaTestDLL.delete(position); 
                  }   
}

public static void testInsercionDatos(int n){
        long startTime = System.currentTimeMillis(); 
        for (int i = 0; i < n; i++) {
            agregarTestDLL(i, 0);
        }       
        long endTime = System.currentTimeMillis(); 
        long duration = endTime - startTime;
        System.out.println("La duracion de inserción de datos en DLL fue de: " + duration + "ms");
}

public static void testBusquedaDatos(String n){
        long startTime = System.currentTimeMillis();   
        buscarIdTestDLL("X" + n);      
        long endTime = System.currentTimeMillis(); 
        long duration = endTime - startTime;       
        System.out.println("\nLa duracion de busqueda de datos en DLL fue de: " + duration + "ms");
}

public static void testActualizacionDatos(String n, int data){
        long startTime = System.currentTimeMillis();   
        actualizarTestDLLData("X" + n, data);      
        long endTime = System.currentTimeMillis(); 
        long duration = endTime - startTime;       
        System.out.println("La duracion de actualizacion de dato en DLL fue de: " + duration + "ms");
}

public static void testBorrarDatos(String n){
        long startTime = System.currentTimeMillis();   
        eliminarTestDLL("X" + n);      
        long endTime = System.currentTimeMillis(); 
        long duration = endTime - startTime;       
        System.out.println("La duracion de eliminacion de dato en DLL fue de: " + duration + "ms");
}


    public static void main(String[] args) {
        testInsercionDatos(50000);
//        listaTestDLL.print();
        testBusquedaDatos("9999");
//        System.out.println(listaTestDLL.find(9999));
        testActualizacionDatos("9999", 500);
//        System.out.println(listaTestDLL.find(2));
//        listaTestDLL.print();
//        listaTestDLL.print();
        testBorrarDatos("9999");    
//        listaTestDLL.print();
//        System.out.println(listaTestDLL.find(9998));
//        testBusquedaDatos("50000");

//        listaTestDLL.find(9999);
//        long startTime = System.currentTimeMillis();   

//        long endTime = System.currentTimeMillis(); 
//        long duration = endTime - startTime;       
//        System.out.println("La duracion de busqueda pos de dato en DLL fue de: " + duration + "ms");
//        System.out.println(listaTestDLL.find(500000));
//        System.out.println(listaTestDLL.getPosition(listaTestDLL.find(500000)));
    }
}
