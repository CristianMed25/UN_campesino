/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structures;
import Classes.Product.Producto;
/**
 *
 * @author yesid
 */
public class BinPriorityQueueProductos {
    private BinaryHeapProductos heap;

    public BinPriorityQueueProductos(int capacity) {
        heap = new BinaryHeapProductos(capacity);
    }

    // Inserta un elemento en la cola de prioridad
    public void Insert(double key, String id) {
        heap.insert(key, id);
    }

    // Obtiene y elimina el elemento con mayor prioridad (el menor)
    public Producto getMin() {
        return heap.getMin();
    }

    // Obtiene el elemento con mayor prioridad sin eliminarlo
    public Producto peek() {
        return heap.top();
    }

    // Verifica si la cola de prioridad está vacía
    public boolean isEmpty() {
        return heap.top() == null;
    }

    // Obtiene el tamaño de la cola de prioridad
    public int size() {
        return heap.size();
    }
    public Producto[] getArray(){
        return heap.getarray();
    }
    
}
