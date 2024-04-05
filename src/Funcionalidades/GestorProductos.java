/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionalidades;
import Classes.Product.Producto;
import Structures.Doubly.DoublyLinkedList;
import Structures.Queue;
/**
 *
 * @author CristianM
 */
public class GestorProductos {
    public static Producto producto = new Producto();
    
    private static DoublyLinkedList<Producto> listaProducto = producto.leer();
    private static Queue<Producto> colaProducto = producto.leerApartado();
    
//Para creación de archivos
//    private static DoublyLinkedList<Producto> listaProducto;
//    private static Queue<Producto> colaProducto;


//    public GestorProductos() {
//        this.listaProducto          = new DoublyLinkedList<>();
//        this.colaProducto          = new Queue<>();       
//    }
    
    public static void agregarProducto(String id, String nombre, double precio, int cantidad){
         Producto Producto = new Producto(id,nombre,precio,cantidad);
         listaProducto.pushBack(Producto);
         
         Producto.escribir(listaProducto);       
     }
    
    public static void agregarProducto(Producto Producto){
         listaProducto.pushBack(Producto);
         Producto.escribir(listaProducto);
     }
    
    public static int position = 0;
    public static Producto buscarIdProducto(String id){
        for(int i=0; i <= listaProducto.length(); i++){
                 Producto objetoEncontrado = listaProducto.find(i);
    	if(objetoEncontrado.getId().equals(id)){
                              position = i;
                              return objetoEncontrado;
                  }   
         }
        System.out.println("No se encontro el elemento con id " + id);
        return null;
    }
        
    public static void actualizarProductoNombre(String id, String nombre){
        Producto Producto = new Producto();       
                 Producto ProductoEncontrado = buscarIdProducto(id);
                 if(ProductoEncontrado != null){                    
                     if(ProductoEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + ProductoEncontrado.getId());
                            Producto = ProductoEncontrado;
                            Producto.setNombre(nombre);                        
                            listaProducto.delete(position);
                            listaProducto.pushBack(Producto);
                            Producto.escribir(listaProducto);                       
                    } 
                 }else{
                     System.out.println("No se realizo actualización.");
                 }  	             
    }
    
    public static void actualizarProductoPrecio(String id, double precio){
        Producto Producto = new Producto();       
                 Producto ProductoEncontrado = buscarIdProducto(id);
                 if(ProductoEncontrado != null){                    
                     if(ProductoEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + ProductoEncontrado.getId());
                            Producto = ProductoEncontrado;
                            Producto.setPrecio(precio);                        
                            listaProducto.delete(position);
                            listaProducto.pushBack(Producto);
                            Producto.escribir(listaProducto);                       
                    } 
                 }else{
                     System.out.println("No se realizo actualización.");
                 }  	             
    }
    
    public static void actualizarProductoCantidad(String id, int cantidad){
        Producto Producto = new Producto();       
                 Producto ProductoEncontrado = buscarIdProducto(id);
                 if(ProductoEncontrado != null){                    
                     if(ProductoEncontrado.getId().equals(id)){
                            System.out.println("Id elemento actualizado " + ProductoEncontrado.getId());
                            Producto = ProductoEncontrado;
                            Producto.setCantidad(cantidad);                        
                            listaProducto.delete(position);
                            listaProducto.pushBack(Producto);
                            Producto.escribir(listaProducto);                       
                    } 
                 }else{
                     System.out.println("No se realizo actualización.");
                 }  	             
    }    
    
    public static void eliminarProducto(String id){
        Producto Producto = new Producto();        
                 Producto ProductoEncontrado = buscarIdProducto(id);
                 if(ProductoEncontrado != null){                    
                     if(ProductoEncontrado.getId().equals(id)){
                            System.out.println("Id del elemento borrado " + ProductoEncontrado.getId());
                            listaProducto.delete(position);
                            Producto.escribir(listaProducto);
                      }                                       
                 }else{
                     System.out.println("No se realizo la eliminación.");
                 }         
    } 
    
    public static Producto verProductoApartado(){
        return colaProducto.peek();
    }
    
    public static void apartarProducto(Producto Producto, int cantidad){
        if(Producto.getCantidad() == 0){
            System.out.println("No hay ninguna unidad de este producto");
        }else if(Producto.getCantidad() < cantidad){
            System.out.println("No hay suficientes unidades disponibles: Cantidad disponible --> " + Producto.getCantidad());
        }else if(cantidad < 0){
            System.out.println("La cantidad ingresada es negativa, no se realizo apartado.");
        }else{
            Producto productoApartado = new Producto(Producto.getIdNum(), Producto.getNombre(), Producto.getPrecio(), cantidad); 
            colaProducto.enqueue(productoApartado);
            producto.escribirApartado(colaProducto);
            actualizarProductoCantidad(Producto.getId(), Producto.getCantidad()-cantidad);
            System.out.println("\nProducto apartado con exito"
                    + "\n  Precio: " + Producto.getPrecio() + "$"
                    + "\n  cantidad: " + cantidad + " unidades"
                    + "\n  Precio total: " + Producto.getPrecio()*cantidad + "$" );
        }     
    }
    
    public static Producto desapartarProducto(){
        Producto productoDesapartado = colaProducto.dequeue();
        producto.escribirApartado(colaProducto);
        Producto producto = buscarIdProducto(productoDesapartado.getId());
        actualizarProductoCantidad(productoDesapartado.getId(), producto.getCantidad()+productoDesapartado.getCantidad());
        System.out.println("Producto desapartado con exito");
        return productoDesapartado;
    }  
    
    public static void editarCantidadUltimoApartado(int cantidad){
        Producto productoEditar = verProductoApartado();
        if(productoEditar.getCantidad() >= cantidad && cantidad >= 0){
            Producto producto = buscarIdProducto(productoEditar.getId());        
            actualizarProductoCantidad(productoEditar.getId(), producto.getCantidad()+(productoEditar.getCantidad()-cantidad));
            productoEditar.setCantidad(cantidad);
            colaProducto.dequeue();
            colaProducto.pushFront(productoEditar);
            producto.escribirApartado(colaProducto);      
            System.out.println("Cantidad producto apartado editada con exito");  
        }else if(cantidad > productoEditar.getCantidad()){
            System.out.println("La cantidad ingresada excede la cantidad del producto apartado, no se realizo edicion.");
        }else if(cantidad < 0){
            System.out.println("La cantidad ingresada es negativa, no se realizo edicion.");
        }             
    }
}
    
