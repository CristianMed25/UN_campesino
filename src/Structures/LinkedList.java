package structures;

import java.io.Serializable;

public class LinkedList<T> implements Serializable{
    private Node<T> head, tail;
    private int length;

    private static class Node<T> {
        T key; // Cambiado de 'data' a 'key'
        Node<T> next;

        Node(T key) { // Cambiado de 'data' a 'key'
            this.key = key; // Cambiado de 'data' a 'key'
            this.next = null;
        }
    }

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void pushFront(T key) {
        Node<T> newNode = new Node<>(key);
        if (empty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void pushBack(T key) {
        Node<T> newNode = new Node<>(key);
        if (empty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void popFront() {
        if (!empty()) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            length--;
        } else {
            System.out.println("NOTHING!!");
            System.out.println("Your collection static list is empty.");
        }
    }

    public void popBack() {
        if (!empty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                Node<T> current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
            length--;
        } else {
            System.out.println("NOTHING!!");
            System.out.println("Your collection static list is empty.");
        }
    }

    public T topFront() {
        return !empty() ? head.key : null;
    }

    public T topBack() {
        return !empty() ? tail.key : null;
    }

    public boolean empty() {
        return length == 0;
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.key + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int length() {
        return length;
    }

    public void addBefore(T before, T key) {
        if (empty() || head.key.equals(before)) {
            pushFront(key);
            return;
        }
        Node<T> current = head;
        Node<T> previous = null;
        while (current != null && !current.key.equals(before)) {
            previous = current;
            current = current.next;
        }
        if (current != null) {
            Node<T> newNode = new Node<>(key);
            if (previous != null) {
                previous.next = newNode;
            }
            newNode.next = current;
            length++;
        } else {
            System.out.println("Element not found.");
        }
    }

    public void addAfter(T after, T key) {
        Node<T> current = head;
        while (current != null && !current.key.equals(after)) {
            current = current.next;
        }
        if (current != null) {
            Node<T> newNode = new Node<>(key);
            newNode.next = current.next;
            current.next = newNode;
            if (current == tail) {
                tail = newNode;
            }
            length++;
        } else {
            System.out.println("Element not found.");
        }
    }

    public void delete(T key) {
        if (empty()) {
            System.out.println("NOTHING!!");
            System.out.println("Your collection static list is empty.");
            return;
        }
        if (head.key.equals(key)) {
            popFront();
            return;
        }
        Node<T> current = head;
        Node<T> previous = null;
        while (current != null && !current.key.equals(key)) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Element not found.");
            return;
        }
        if (current == tail) {
            tail = previous;
        }
        if (previous != null) {
            previous.next = current.next;
        }
        length--;
    }
    
    // Añade un elemento en la posición especificada
public void addAt(int position, T key) {
    if (position < 0 || position > length) {
        System.out.println("Index out of bounds.");
        return;
    }
    if (position == 0) {
        pushFront(key);
        return;
    }
    if (position == length) {
        pushBack(key);
        return;
    }
    Node<T> newNode = new Node<>(key);
    Node<T> current = head;
    for (int i = 0; i < position - 1; i++) { // Encuentra el nodo anterior a la posición deseada
        current = current.next;
    }
    // Inserta el nuevo nodo en la posición deseada
    newNode.next = current.next;
    current.next = newNode;
    length++;
}

}
