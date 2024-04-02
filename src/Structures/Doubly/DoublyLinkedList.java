package Structures.Doubly;

import java.io.Serializable;

public class DoublyLinkedList<T> implements Serializable {
    public class DoublyNode<T> implements Serializable{
        public T key;
        public DoublyNode<T> next;
        private DoublyNode<T> prev;
        public DoublyNode(){
            this(null);
        }
        public DoublyNode(T key){
            this.key = key;
            this.next = null;
            this.prev = null;
        }
        
        public void setData(T t) {
            this.key = t;
        }
    }
    
    public DoublyNode<T> head;
    private DoublyNode<T> tail;
    private int length;

    public DoublyLinkedList(){
        this.length = 0;
    }

    public void pushFront(T key){
        DoublyNode<T> node = new DoublyNode<>(key);
        if(head == null){
            head=tail= node;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        length++;
    }

    public void pushBack(T key){
        DoublyNode<T> node = new DoublyNode<>(key);
        node.next=null;
        if(tail==null){
            head=tail=node;
            node.prev=null;
        }else{
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
        length++;
    }
    public void popBack(){
        if(head == null){
            System.out.println("NOTING!!");
            System.out.println("Your collection static list is empty.");
        }
        if(head==tail){
            head=tail=null;
        }else{
            tail=tail.prev;
            tail.next= null;
        }
        length--;
    }
    public void popFront(){
        if(head == null){
            System.out.println("NOTING!!");
            System.out.println("Your collection static list is empty.");
        }
        head = head.next;
        if(head == null){
            tail = null;
        }
        length--;

    }
    public T topFront(){
        return head != null ? head.key : null;
    }
    public T topBack(){
        return tail != null ? tail.key : null;
    }

    public int length() {
        return length;
    }

    public Boolean empty(){
        return head == null;
    }

    public void addBefore(int position, T key){
        if(position<0){
            throw new IndexOutOfBoundsException();
        } else if (position==0) {
            pushFront(key);
        }else{
            DoublyNode<T> node = new DoublyNode<>(key);
            DoublyNode<T> aux = head;
            for (int i=0; i<position-1; i++){
                if(aux == null)
                    throw new IndexOutOfBoundsException();
                aux = aux.next;
            }
            if(aux.next == null){
                pushBack(key);
            }else{
                node.next = aux;
                node.prev = aux.prev;
                aux.prev = node;
                if(node.prev != null)
                    node.prev.next=node;
            }
        }
    }
    public void addBefore(DoublyNode<T> node, T key){
        DoublyNode<T> node2 = new DoublyNode<>(key);
        node2.next = node;
        node2.prev = node.prev;
        node.prev = node2;
        if(node2.prev != null){
            node2.prev.next = node2;
        }
        if(head == node){
            head=node2;
        }
    }
    public void addAfter(int position, T key){
        if(position<0){
            throw new IndexOutOfBoundsException();
        } else if (position==0) {
            pushFront(key);
        }else{
            DoublyNode<T> node = new DoublyNode<>(key);
            DoublyNode<T> aux = head;
            for (int i=0; i<position-1; i++){
                if(aux == null)
                    throw new IndexOutOfBoundsException();
                aux = aux.next;
            }
            if(aux.next == null){
                pushBack(key);
            }else{
                node.next = aux.next;
                node.prev = aux;
                aux.next = node;
            }
        }
    }
    public void addAfter(DoublyNode<T> node, T key){
        DoublyNode<T> node2 = new DoublyNode<>(key);
        node2.key = key;
        node2.next = node.next;
        node2.prev = node;
        node.next = node2;
        if(node2.next != null){
            node2.next.prev = node2;
        }
        if(tail == node){
            tail = node2;
        }

    }
    public void erase(int position){
        if(position<0){
            throw new IndexOutOfBoundsException();
        }
        if(position == 0){
            popFront();
        }else{
            DoublyNode<T> aux = head;
            for (int i=0; i<position-1; i++){
                if(aux == null)
                    throw new IndexOutOfBoundsException();
                aux = aux.next;
            }
            if(aux == tail){
                popBack();
            }else{
                aux.next = aux.next.next;
            }
        }
    }
    
    public void delete(T key) {
    DoublyNode<T> nodeToDelete = search(key); // Utiliza el método search para encontrar el nodo

    if (nodeToDelete == null) { // Si el nodo no se encuentra, no hay nada que eliminar
        System.out.println("Element not found.");
        return;
    }

    // Si el nodo a eliminar es el head
    if (nodeToDelete == head) {
        head = nodeToDelete.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null; // Si head ahora es null, entonces la lista está vacía, por lo tanto, tail también debe ser null
        }
    } 
    // Si el nodo a eliminar es el tail y no es el head (esto significa que hay más de un elemento en la lista)
    else if (nodeToDelete == tail) {
        tail = nodeToDelete.prev;
        tail.next = null;
    } 
    // Si el nodo a eliminar está en medio
    else {
        nodeToDelete.prev.next = nodeToDelete.next;
        nodeToDelete.next.prev = nodeToDelete.prev;
    }

    length--; // Decrementa el tamaño de la lista
}

    
    public int getPosition(T key){
        DoublyNode<T> aux = head;
        int pos=0;
        while(aux != null){

                if(aux.key==key){
                    return pos;
                }
                pos+=1;
                aux = aux.next;

        }
        return Integer.MAX_VALUE;
    }
    public T find(int position){
        if(position<0){
            throw new IndexOutOfBoundsException();
        }
        DoublyNode<T> aux= head;
        for(int i=0; i<position-1; i++){
            if(aux == null)
                throw new IndexOutOfBoundsException();
            aux = aux.next;
        }
        return aux.key;
    }
    public void print(){
        DoublyNode<T> aux = head;
        while(aux != null){
            System.out.print(aux.key + " ");
            aux = aux.next;
        }
        System.out.println();
    }
    public int size(){
        int n=0;
        for(
                DoublyNode<T> aux = head;
                aux!=null;
                aux=aux.next
        ){n++;}
        return n;
    }
    
    public DoublyNode<T> search(T key) {
    DoublyNode<T> aux = head;
    while (aux != null) {
        if (aux.key.equals(key)) {
            return aux; // Elemento encontrado
        }
        aux = aux .next;
    }
    return null; // Elemento no encontrado
    }   
}