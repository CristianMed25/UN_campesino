package Structures;

import java.io.Serializable;

public class UnLinkedList<T> implements Serializable{
    public class Node<T> implements Serializable{
    
    private T data;
    private Node<T> next;

    //CONSTRUCTOR METHODS
    public Node(){
        this(null);
    }
    public Node(T data){
        this.data=data;
        next=null;
    }

    //GETTERS AND SETTERS
    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

    private Node<T> head, tail, ref;
    private int count;
    
    public UnLinkedList(){
        this.head = null;
        this.ref = null;
        this.tail = null;
        this.count=0;
    }

    // PUSH METHODS (add)
    //pushFront method: add to front O(1)
    public void pushFront(T item){
        Node<T> newNode = new Node<>(item);
        ref = newNode;
        ref.setNext(head);
        head = ref;
        ref = null;
        if (tail == null)   tail = head;
        count ++;
    }

    //pushBack method: add to back O(1)
    public void pushBack(T item){
        Node<T> newNode = new Node<>(item);
        ref = newNode;
        if (tail == null) head = tail = ref;
        else {
            tail.setNext(ref);
            tail = ref;
            ref = null;
        }
        count ++;
    }

    // Método para añadir una secuencia de elementos en una posición específica
    public void addAt(int index, T data) {
        Node<T> newNode = new Node<>(data);
        if (index == 0) {
            if (head != null)   newNode.setNext(head);
            else    tail = newNode;
            head = newNode;
        } else if (index >= count) {
            if (tail != null)   tail.setNext(newNode);
            else    head = newNode;
            tail = newNode;
        } else {
            Node<T> current = head;
            for (int i = 1; i < index; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        count++;
    }


    //pushBefore(Node, Data): adds before an item
    public void pushBefore(T listitem, T item) {
        Node<T> newNode = new Node<>(item);
        if (empty() || head.getData() == listitem)    pushFront(item);
        ref = head;
        while (ref != null && ref.getNext().getData() != listitem) {
            ref = ref.getNext();
        }
        if (ref != null) {
            newNode.setNext(ref.getNext());
            ref.setNext(newNode);
        } else  System.err.println("Item not found in the list.");        
        ref = null; // Limpiamos la referencia temporal.
        count ++;
    }


    //pushAfter(Node, Data): adds after an item O(1): we knows the listitem node
    public void pushAfter (Node<T> listitem, T item){
        Node<T> newNode = new Node<>(item);
        ref = newNode;
        ref.setNext(listitem.getNext());
        listitem.setNext(ref);
        if (tail == listitem)   tail = ref;
        ref = null;
        count ++;
    }


    // POP METHODS (remove)
    //popFront method:  remove front item
    public void popFront(){
        if (empty()) System.err.println("List is empty");
        else {
            head = head.getNext();
            if (head == null) tail = null;
            count --;
        }
    }

    //popBack method: remove back item
    public void popBack(){
        if(empty()) System.err.println("List is empty");
        else if(head == tail)    {
            head = tail = null;
            count --;
        }
        else {
            ref = head;
            while (ref.getNext() != tail)  // while (ref.getNext().getNext() != null)
                ref = ref.getNext();
            ref.setNext(null);
            tail = ref;
            ref = null;
            count --;
        }
        
    }

    //pop-erase method: remove a specific item
    public void delete(T item){
        if(empty()) System.err.println("List is empty");
        if(head == tail)    
            if (head.getData() == item)   {
                head = tail = null;
                count --;
            }
            else System.err.println("Item not within the List");
        else {
            ref = head;
            while (ref.getNext().getData() != item && ref.getNext() != null)
               ref = ref.getNext();
            if (ref == tail) System.err.println("Item not with the List");
            else {
                ref.setNext(ref.getNext().getNext());
                if (ref.getNext()==null)    tail = ref.getNext();
                ref = null;    
                count --;
            }
        }
        
    }

    // RETURN METHODS
    //topFront method: return front item
    public Node<T> topFront(){
        return head;
    }

    //topBack method: return back item
    public Node<T> topBack(){
        return tail;
    }

    //top: return a specific item
    public Node<T> top(T item){
        if (find(item))  return ref;
        else return null;        
    }

    // SEARCH METHODS
    //find method: search an item in the list and return a boolean
    public boolean find(T item){
        boolean stop = false, found = false;
        ref = head;
        do{
            if(ref.getData() == item)     stop = found = true;
            else ref=ref.getNext();
        }while(!stop && ref != null);

        return found;
    }

    // GENERAL METHODS
    //empty method: check if list is empty
    public boolean empty(){
        return head==null;
    }

    //output method:
    public void output(){
        output(head);
    }
    public void output(Node<T> ref) {
        if(ref != null) {
            System.out.println(ref.getData());
                output(ref.getNext());
        } 
    } 

    // Método count: devuelve el tamaño de la lista
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.getData());
            current = current.getNext();
        }
        return sb.toString();
    }
}
