package Structures.Doubly;

import java.io.Serializable;

public class DoublyQueue<T> implements Serializable{
    public DoublyLinkedList<T> listWithTail = new DoublyLinkedList<>();

    public void enqueue(T key){
        listWithTail.pushBack(key);
    }
    public T dequeue(){
        T aux = listWithTail.topFront();
        listWithTail.popFront();
        return aux;
    }
    public Boolean isEmpty(){
        return listWithTail.empty();
    }

    public void print(){
        listWithTail.print();
    }

    public int length(){    
        return listWithTail.length();
    }
    public T top(){
        return listWithTail.topFront();
    }
}