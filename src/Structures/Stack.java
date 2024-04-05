package Structures;

public class Stack<T> extends UnLinkedList<T>{
    
    // Añadir un elemento al tope de la pila
    public void push(T item) {
        // Utiliza pushFront de UnLinkedList para añadir el elemento al inicio, actuando como el tope de la pila
        super.pushFront(item);
    }
    
    // Remover el elemento en el tope de la pila
    public T pop() {
        // Verifica primero si la pila está vacía
        if (super.empty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            // Obtiene el dato del primer nodo para retornarlo
            T item = super.topFront().getData();
            // Elimina el primer nodo de la pila
            super.popFront();
            return item;
        }
    }
    
    // Inspeccionar el elemento en el tope de la pila sin eliminarlo
    public T peek() {
        if (super.empty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return super.topFront().getData();
        }
    }
}
