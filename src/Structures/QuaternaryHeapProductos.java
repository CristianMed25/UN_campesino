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
public class QuaternaryHeapProductos {
    private Producto[] heap;
    private int size;
    private int capacity;

    public QuaternaryHeapProductos(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new Producto[capacity];
    }
    
    public void insert(double precio, String name) {
        if (size == capacity) {
            System.out.println("Heap is full!");
            return;
        }
        Producto producto = new Producto(name, precio);
        heap[size] = producto;
        siftUp(size);
        size++;
    }

    public Producto top() {
        if (size == 0) {
            return null;
        }
        return heap[0];
    }

    public Producto getMin() {
        if (size == 0) {
            return null;
        }
        Producto min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        siftDown(0);
        return min;
    }

    private void siftUp(int idx) {
        int parent = (idx - 1) / 4;
        while (idx > 0 && heap[idx].getPrecio() < heap[parent].getPrecio()) {
            swap(idx, parent);
            idx = parent;
            parent = (idx - 1) / 4;
        }
    }

    private void siftDown(int idx) {
        int smallest = idx;

        for (int i = 1; i <= 4; i++) {
            int child = 4 * idx + i;
            if (child < size && heap[child].getPrecio() < heap[smallest].getPrecio()) {
                smallest = child;
            }
        }

        if (smallest != idx) {
            swap(idx, smallest);
            siftDown(smallest);
        }
    }

    private void swap(int i, int j) {
        Producto temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    
    public int size() {
        return size;
    }

    public Producto[] getarray() {
        return heap;
    }
}
