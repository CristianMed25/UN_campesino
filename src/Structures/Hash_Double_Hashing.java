package Structures;
/**
 *
 * @author samue
 */ 

import java.util.Random;

public class Hash_Double_Hashing<K, V> {

    private K[] keys;  // Array para las claves
    private V[] values;  // Array para los valores
    private int capacity;  // Capacidad de la tabla hash
    private int size;  // Número actual de elementos
    private float loadFactor;  // Factor de carga
    private int a, b, p;  // Parámetros para la primera función de hash
    private int prime;  // Número primo para la segunda función de hash

    @SuppressWarnings("unchecked")
    public Hash_Double_Hashing(int capacity, float loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.keys = (K[]) new Object[capacity];  // Array de claves
        this.values = (V[]) new Object[capacity];  // Array de valores
        this.size = 0;
        this.p = getNextPrime(capacity);  // Número primo mayor que capacity
        this.prime = getPreviousPrime(capacity);  // Número primo menor que capacity para hash2
        Random rand = new Random();
        this.a = rand.nextInt(p - 1) + 1;  // a entre 1 y p-1
        this.b = rand.nextInt(p);  // b entre 0 y p-1
    }

    // Primera función hash usando Universal Hashing
    private int hash(K key) {
        int hashCode = key.hashCode();
        return Math.abs(((a * hashCode + b) % p) % capacity);  // Siempre positivo
    }

    // Segunda función hash para double hashing
    private int hash2(K key) {
        int hashCode = key.hashCode();
        // Calcular hash2 asegurándose de que sea positivo y diferente de 0
        int hash2Value = prime - (hashCode % prime);
        return (hash2Value > 0) ? hash2Value : 1;  // Evitar que hash2Value sea 0 o negativo
    }

    // Insertar (put)
    public void put(K key, V value) {
        int index = hash(key);
        int hash2Value = hash2(key);
        int i = 0;  // Contador de intentos de colisión

        // Probar usando double hashing para encontrar un espacio vacío
        while (keys[Math.abs((index + i * hash2Value) % capacity)] != null) {
            // Si la clave ya existe, actualizar el valor
            if (keys[Math.abs((index + i * hash2Value) % capacity)].equals(key)) {
                values[Math.abs((index + i * hash2Value) % capacity)] = value;
                return;
            }
            i++;
        }
        // Insertar nueva clave y valor en el índice encontrado
        int newIndex = Math.abs((index + i * hash2Value) % capacity);
        keys[newIndex] = key;
        values[newIndex] = value;
        size++;

        // Si el factor de carga se excede, hacer rehash
        if ((float) size / capacity > loadFactor) {
            rehash();
        }
    }

    // Obtener valor (get)
    public V get(K key) {
        int index = hash(key);
        int hash2Value = hash2(key);
        int i = 0;

        // Probar usando double hashing para encontrar la clave
        while (keys[Math.abs((index + i * hash2Value) % capacity)] != null) {
            if (keys[Math.abs((index + i * hash2Value) % capacity)].equals(key)) {
                return values[Math.abs((index + i * hash2Value) % capacity)];  // Retornar el valor si se encuentra la clave
            }
            i++;
        }
        return null;  // Retorna null si no se encuentra la clave
    }

    // Eliminar (remove)
    public void remove(K key) {
        int index = hash(key);
        int hash2Value = hash2(key);
        int i = 0;

        // Probar usando double hashing para encontrar la clave
        while (keys[Math.abs((index + i * hash2Value) % capacity)] != null) {
            if (keys[Math.abs((index + i * hash2Value) % capacity)].equals(key)) {
                int removeIndex = Math.abs((index + i * hash2Value) % capacity);
                keys[removeIndex] = null;  // Eliminar clave
                values[removeIndex] = null;  // Eliminar valor
                size--;

                // Reordenar los elementos que podrían haber sido afectados
                i++;
                while (keys[Math.abs((index + i * hash2Value) % capacity)] != null) {
                    K tempKey = keys[Math.abs((index + i * hash2Value) % capacity)];
                    V tempValue = values[Math.abs((index + i * hash2Value) % capacity)];
                    keys[Math.abs((index + i * hash2Value) % capacity)] = null;
                    values[Math.abs((index + i * hash2Value) % capacity)] = null;
                    size--;
                    put(tempKey, tempValue);  // Reinsertar el elemento
                    i++;
                }
                return;
            }
            i++;
        }
    }

    // Rehashing cuando el factor de carga se excede
    @SuppressWarnings("unchecked")
    private void rehash() {
        K[] oldKeys = keys;
        V[] oldValues = values;
        capacity = capacity * 2;  // Duplicar la capacidad
        keys = (K[]) new Object[capacity];
        values = (V[]) new Object[capacity];
        size = 0;

        // Elegir nuevos valores de 'a' y 'b' para Universal Hashing
        Random rand = new Random();
        this.a = rand.nextInt(p - 1) + 1;
        this.b = rand.nextInt(p);
        this.prime = getPreviousPrime(capacity);  // Nuevo número primo para hash2

        // Reinsertar todos los elementos en la nueva tabla
        for (int i = 0; i < oldKeys.length; i++) {
            if (oldKeys[i] != null) {
                put(oldKeys[i], oldValues[i]);
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

    // Obtener el número primo anterior al número dado
    private int getPreviousPrime(int num) {
        num--;
        while (!isPrime(num)) {
            num--;
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
