package Structures.Doubly;

import java.io.Serializable;

public class DoublyStack<T> implements Serializable {
    public DoublyLinkedList<T> listWithTail = new DoublyLinkedList<>();

    public void push(T key){
        listWithTail.pushBack(key);
    }
    public T top(){
        return listWithTail.topBack();
    }
    public T pop(){
        T aux = listWithTail.topBack();
        listWithTail.popBack();
        return aux;
    }
    public Boolean empty(){
        return listWithTail.empty();
    }
    public void print(){
        listWithTail.print();
    }
    public int length(){
        return listWithTail.length();
    }
}