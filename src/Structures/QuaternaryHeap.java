/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structures;

/**
 *
 * @author yesid
 */
public class QuaternaryHeap {
        private int[] heap;
    private int size;
    private int capacity;

    public QuaternaryHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    private int parent(int i) {
        return (i - 1) / 4;
    }

    private int child(int i, int k) {
        return 4 * i + k;
    }

    private void heapifyUp(int i) {
        while (i > 0 && heap[parent(i)] > heap[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    private void heapifyDown(int i) {
        int minIndex = i;

        for (int k = 1; k <= 4; k++) {
            int childIndex = child(i, k);
            if (childIndex < size && heap[childIndex] < heap[minIndex]) {
                minIndex = childIndex;
            }
        }

        if (i != minIndex) {
            swap(i, minIndex);
            heapifyDown(minIndex);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void push(int key) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = key;
        size++;
        heapifyUp(size - 1);
    }

    public int extractMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int result = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return result;
    }

    public int getMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
    public void print() {
        System.out.print("Heap: z");
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
    }
        System.out.println();
        
    }
    
}