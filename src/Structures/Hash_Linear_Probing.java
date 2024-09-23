package Structures;
/**
 *
 * @author samue
 */ 
import java.util.Random;

public class Hash_Linear_Probing<K, V> {

    private K[] keys;  // Array para las claves
    private V[] values;  // Array para los valores
    private int capacity;  // Capacidad de la tabla hash
    private int size;  // Número actual de elementos
    private float loadFactor;  // Factor de carga
    private int a, b, p;  // Parámetros para Universal Hashing

    @SuppressWarnings("unchecked")
    public Hash_Linear_Probing(int capacity, float loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.keys = (K[]) new Object[capacity];  // Array de claves
        this.values = (V[]) new Object[capacity];  // Array de valores
        this.size = 0;
        this.p = getNextPrime(capacity);  // Número primo mayor que capacity
        Random rand = new Random();
        this.a = rand.nextInt(p - 1) + 1;  // a entre 1 y p-1
        this.b = rand.nextInt(p);  // b entre 0 y p-1
    }

    // Función hash usando Universal Hashing
    private int hash(K key) {
        int hashCode = key.hashCode();
        return Math.abs(((a * hashCode + b) % p) % capacity);
    }


    // Insertar (put)
    public void put(K key, V value) {
        int index = hash(key);
        while (keys[index] != null) {
            // Si la clave ya existe, actualizar el valor
            if (keys[index].equals(key)) {
                values[index] = value;
                return;
            }
            // Probar el siguiente índice (linear probing)
            index = (index + 1) % capacity;
        }
        // Insertar nueva clave y valor
        keys[index] = key;
        values[index] = value;
        size++;

        // Si el factor de carga se excede, hacer rehash
        if ((float) size / capacity > loadFactor) {
            rehash();
        }
    }

    // Obtener valor (get)
    public V get(K key) {
        int index = hash(key);
        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                return values[index];  // Retornar el valor si se encuentra la clave
            }
            // Probar el siguiente índice (linear probing)
            index = (index + 1) % capacity;
        }
        return null;  // Retorna null si no se encuentra la clave
    }

    // Eliminar (remove)
    public void remove(K key) {
        int index = hash(key);
        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                keys[index] = null;  // Eliminar clave
                values[index] = null;  // Eliminar valor
                size--;

                // Reordenar los elementos que podrían haber sido afectados
                index = (index + 1) % capacity;
                while (keys[index] != null) {
                    K tempKey = keys[index];
                    V tempValue = values[index];
                    keys[index] = null;
                    values[index] = null;
                    size--;
                    put(tempKey, tempValue);  // Reinsertar el elemento
                    index = (index + 1) % capacity;
                }
                return;
            }
            index = (index + 1) % capacity;
        }
    }

    // Rehashing cuando el factor de carga se excede
    @SuppressWarnings("unchecked")
    private void rehash() {
        K[] oldKeys = keys;
        V[] oldValues = values;
        capacity = capacity * 2;
        keys = (K[]) new Object[capacity];
        values = (V[]) new Object[capacity];
        size = 0;

        // Elegir nuevos valores de 'a' y 'b' para Universal Hashing
        Random rand = new Random();
        this.a = rand.nextInt(p - 1) + 1;
        this.b = rand.nextInt(p);

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
