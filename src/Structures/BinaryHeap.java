/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structures;

/**
 *
 * @author yesid
 */
public class BinaryHeap {
    private static final int N = (int) (2 * 1e5);
    private int[] bin = new int[N];
    private int size = 0;

    private void siftdown(int i) {
        if (2 * i + 1 <= size) {
            if (bin[2 * i] < bin[2 * i + 1]) {
                // Swap with the right child
                if (bin[i] > bin[2 * i + 1]) {
                    swap(i, 2 * i + 1);
                    siftdown(2 * i + 1);
                }
            } else {
                // Swap with the left child
                if (bin[i] > bin[2 * i]) {
                    swap(i, 2 * i);
                    siftdown(2 * i);
                }
            }
        } else if (2 * i <= size) {
            if (bin[i] > bin[2 * i]) {
                swap(i, 2 * i);
                siftdown(2 * i);
            }
        }
    }

    private void siftup(int i) {
        if (i <= 1) return;
        if (bin[i] < bin[i / 2]) {
            swap(i, i / 2);
            siftup(i / 2);
        }
    }

    public void push(int n) {
        // Insert at the last position (leaf)
        bin[++size] = n;
        siftup(size);
    }

    public int top() {
        return bin[1];
    }

    public int pop() {
        int topElement = top();
        // Swap the root with the last element
        swap(1, size--);
        siftdown(1);
        return topElement;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printHeap() {
        System.out.println("HEAP:");
        for (int i = 1; i <= size; i++) {
            System.out.print(bin[i] + " ");
        }
        System.out.println();
    }

    public void heapify(int[] array, int n) {
        size = n;
        // Copy elements from the array to the heap
        System.arraycopy(array, 0, bin, 1, n);
        // Perform heapify operation
        for (int i = size; i >= 1; i--) {
            siftdown(i);
        }
    }

    private void swap(int i, int j) {
        int temp = bin[i];
        bin[i] = bin[j];
        bin[j] = temp;
    }
}
