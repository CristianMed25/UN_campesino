/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;
import Structures.QuaPriorityQueueProductos;
import Classes.Product.Producto;
/**
 *
 * @author yesid
 */
public class GestorComprasQuaHeap {
    private QuaPriorityQueueProductos Queue;
    public GestorComprasQuaHeap(){
        this(25);
    } 
    public GestorComprasQuaHeap(int Tamaño){
        this.Queue= new QuaPriorityQueueProductos(Tamaño);
    }
    
    public void Insertar(double Precio, String Nombre){
        Queue.Insert(Precio, Nombre);
    }
    public Producto ExtraerDato(){
        return Queue.getMin();
    }
    public Producto[] ExtraerDatos(){
        Producto[] a= new Producto[Queue.getSize()];
        for(int i=0;i<Queue.getSize();i++){
            a[i]=Queue.getMin();
            
        }
        
        return a;
    }
}
