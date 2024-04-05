/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structures;

import java.io.Serializable;

public class Queue<T> extends UnLinkedList<T> implements Serializable{
    
    // Encolar un elemento al final de la cola
    public void enqueue(T item) {
        // Aprovechamos el método pushBack de UnLinkedList para añadir el elemento al final
        super.pushBack(item);
    }
    
    // Desencolar un elemento del frente de la cola
    public T dequeue() {
        // Verificamos primero si la cola está vacía
        if (super.empty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            // Obtenemos el dato del primer nodo para retornarlo
            T item = super.topFront().getData();
            // Eliminamos el primer nodo de la cola
            super.popFront();
            return item;
        }
    }

    // Un método adicional para inspeccionar el elemento en el frente de la cola sin eliminarlo
    public T peek() {
        if (super.empty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            return super.topFront().getData();
        }
    }
}

