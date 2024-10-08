/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;
import Structures.BinPriorityQueueProductos;
/**
 *
 * @author yesid
 */
public class GestorComprasBinaryHeap {
    private BinPriorityQueueProductos Queue;
    public GestorComprasBinaryHeap(int Tamaño){
        this.Queue= new BinPriorityQueueProductos(Tamaño);
    }
    
    public void Insertar(double Precio, String Nombre){
        Queue.Insert(Precio, Nombre);
    }
    
    public String ExtraerDato(){
        return Queue.getMin().getNombre();
    }
    public String ExtraerDatos(){
        String a="";
        int tamaño=Queue.size();
        for(int i=0;i<tamaño;i++){
            a=a+" " + Queue.getMin().getNombre();
            
        }
        
        return a;
    }
}
