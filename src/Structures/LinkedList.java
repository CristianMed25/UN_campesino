package Structures;

/**
 *
 * @author samue
 */
public class LinkedList<K, V> {
    // Clase Nodo para representar cada nodo en la lista enlazada
    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;  // Referencia al siguiente nodo

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    Node<K, V> head;

    public LinkedList() {
        this.head = null;
    }

    // Método para insertar un nuevo nodo
    public void add(K key, V value) {
        // Si la clave ya existe, actualizar el valor
        Node<K, V> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;  // Actualizar el valor si la clave ya existe
                return;
            }
            current = current.next;
        }
        // Si la clave no existe, insertar un nuevo nodo al inicio
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = head;
        head = newNode;
    }

    // Método para obtener un valor dado una clave
    public V get(K key) {
        Node<K, V> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;  // Devolver el valor si se encuentra la clave
            }
            current = current.next;
        }
        return null;  // Retorna null si no se encuentra la clave
    }

    // Método para eliminar un nodo dado su clave
    public boolean remove(K key) {
        Node<K, V> current = head;
        Node<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    // Eliminar el primer nodo (cabeza)
                    head = current.next;
                } else {
                    // Eliminar un nodo intermedio o al final
                    prev.next = current.next;
                }
                return true;  // Retorna true si la eliminación es exitosa
            }
            prev = current;
            current = current.next;
        }
        return false;  // Retorna false si la clave no fue encontrada
    }

    // Método para verificar si la lista está vacía
    public boolean isEmpty() {
        return head == null;
    }
}
