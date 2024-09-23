package Structures;
/**
 *
 * @author samue
 */ 

import Structures.LinkedList.Node;
import java.util.Random;



public class Hash_Separate_Chaining<K, V> {
    private LinkedList<K, V>[] table;  // Arreglo de listas enlazadas
    private int capacity;
    private int size;
    private float loadFactor;
    private int a, b, p;  // Parámetros para Universal Hashing

    public Hash_Separate_Chaining(int capacity, float loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.table = new LinkedList[capacity];
        this.size = 0;
        this.p = getNextPrime(capacity);  // Elegimos un número primo mayor que capacity
        Random rand = new Random();
        this.a = rand.nextInt(p - 1) + 1; // a entre 1 y p-1
        this.b = rand.nextInt(p);         // b entre 0 y p-1
        initializeBuckets();
    }

    // Inicializar los buckets con listas enlazadas
    private void initializeBuckets() {
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Función hash usando Universal Hashing
    private int hash(K key) {
        int hashCode = key.hashCode();
        return Math.abs(((a * hashCode + b) % p) % capacity);
    }


    // Insertar (put)
    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<K, V> bucket = table[index];
        bucket.add(key, value);
        size++;

        // Rehash si el factor de carga se excede
        if ((float) size / capacity > loadFactor) {
            rehash();
        }
    }

    // Obtener valor (get)
    public V get(K key) {
        int index = hash(key);
        LinkedList<K, V> bucket = table[index];
        return bucket.get(key);  // Retorna el valor si se encuentra
    }

    // Eliminar (remove)
    public void remove(K key) {
        int index = hash(key);
        LinkedList<K, V> bucket = table[index];
        if (bucket.remove(key)) {
            size--;
        }
    }

    // Rehashing cuando el factor de carga se excede
    private void rehash() {
        LinkedList<K, V>[] oldTable = table;
        capacity = capacity * 2;
        table = new LinkedList[capacity];
        initializeBuckets();
        size = 0;

        // Elegir nuevos valores de 'a' y 'b' para Universal Hashing
        Random rand = new Random();
        this.a = rand.nextInt(p - 1) + 1;
        this.b = rand.nextInt(p);

        // Reinsertar todos los elementos en la nueva tabla
        for (LinkedList<K, V> bucket : oldTable) {
            if (bucket != null && !bucket.isEmpty()) {
                Node<K, V> current = bucket.head;
                while (current != null) {
                    put(current.key, current.value);
                    current = current.next;
                }
            }
        }
    }

    // Obtener el siguiente número primo mayor que un número dado
    private int getNextPrime(int num) {
        while (!isPrime(num)) {
            num++;
        }
        return num;
    }

    // Verificar si un número es primo
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Método para verificar si la tabla está vacía
    public boolean isEmpty() {
        return size == 0;
    }

    // Método para verificar si la clave existe en la tabla
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // Obtener el tamaño actual de la tabla hash
    public int size() {
        return size;
    }
}