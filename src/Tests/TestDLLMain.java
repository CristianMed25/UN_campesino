package Tests;

import structures.DoublyLinkedList;

public class TestDLLMain{
    
public static DoublyLinkedList<TestDLL> listaTestDLL  = new DoublyLinkedList<>();

public static void agregarTestDLL(int id, int data){
             TestDLL testDLL = new TestDLL(id,data);
             listaTestDLL.pushBack(testDLL);
         }

public static TestDLL buscarIdTestDLL(String id){
    for(int i=0; i <= listaTestDLL.size(); i++){
	if(listaTestDLL.find(i).getId().equals(id)){
                          return listaTestDLL.find(i);
                  }   
         }
    return null;
}

public static void actualizarTestDLLData(String id, int data){
    TestDLL testDLL = new TestDLL(0, 0);
    String idInt = "";
    for(int i = 1; i < id.length(); i++){
        idInt = idInt+id.charAt(i);
    }
    
    for(int i=0; i <= listaTestDLL.size(); i++){
	if(listaTestDLL.find(i).getId().equals(id)){
                        System.out.println("\nElemento actualizado " + listaTestDLL.find(i).getId());
                        testDLL = listaTestDLL.find(i);
                        testDLL.setData(data);                        
                        listaTestDLL.delete(listaTestDLL.find(i));
                        agregarTestDLL(Integer.parseInt(idInt), testDLL.getData());                     
                  }   
         }
}

public static void eliminarTestDLL(String id){
    for(int i=0; i <= listaTestDLL.size(); i++){
	if(listaTestDLL.find(i).getId().equals(id)){
                        System.out.println("\nElemento borrado " + listaTestDLL.find(i).getId());
                        listaTestDLL.delete(listaTestDLL.find(i));                    
                  }   
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
        testInsercionDatos(10000);
        testBusquedaDatos("9999");
        testActualizacionDatos("9999", 500);
        testBorrarDatos("9999");
    }
}
