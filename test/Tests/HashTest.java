package Tests;
/**
 *
 * @author samue
 */ 

import Structures.Hash_Separate_Chaining;
import Structures.Hash_Linear_Probing;
import Structures.Hash_Quadratic_Probing;
import Structures.Hash_Double_Hashing;

import java.util.Random;

public class HashTest {

    public static void main(String[] args) {
        // Tamaños de las pruebas
        int[] dataSizes = {1000, 10000, 50000, 100000, 250000, 500000, 750000};
        // Factores de carga a probar
        float[] loadFactors = {0.25f, 0.75f, 0.9f};
        
        // Probar con diferentes tamaños de datos y factores de carga
        for (float loadFactor : loadFactors) {
            System.out.println("=== Pruebas con factor de carga: "+ loadFactor +" ===");
            for (int dataSize : dataSizes) {
                System.out.println("=== Test con " + dataSize + " datos ===");
                testHashImplementations(dataSize, loadFactor);
                System.out.println();
            }
        }
    }

    private static void testHashImplementations(int dataSize, float loadFactor) {
        Random rand = new Random();
        Integer[] keys = new Integer[dataSize];
        Integer[] values = new Integer[dataSize];

        // Generar claves y valores aleatorios
        for (int i = 0; i < dataSize; i++) {
            keys[i] = rand.nextInt();
            values[i] = rand.nextInt();
        }

        // Probar las 4 implementaciones de Hash y medir sus tiempos con el factor de carga
        testSeparateChaining(keys, values, loadFactor);
        testLinearProbing(keys, values, loadFactor);
        testQuadraticProbing(keys, values, loadFactor);
        testDoubleHashing(keys, values, loadFactor);
    }

    // Test para Hash con Separate Chaining
    private static void testSeparateChaining(Integer[] keys, Integer[] values, float loadFactor) {
        System.out.println("-- Separate Chaining --");
        Hash_Separate_Chaining<Integer, Integer> hashTable = new Hash_Separate_Chaining<>(keys.length, loadFactor);

        // Medir inserción
        long startTime = System.nanoTime();
        for (int i = 0; i < keys.length; i++) {
            hashTable.put(keys[i], values[i]);
        }
        long endTime = System.nanoTime();
        System.out.println("Inserción: " + (endTime - startTime) / 1e6 + " ms");

        // Medir búsqueda
        startTime = System.nanoTime();
        for (int key : keys) {
            hashTable.get(key);
        }
        endTime = System.nanoTime();
        System.out.println("Búsqueda: " + (endTime - startTime) / 1e6 + " ms");

        // Medir eliminación
        startTime = System.nanoTime();
        for (int key : keys) {
            hashTable.remove(key);
        }
        endTime = System.nanoTime();
        System.out.println("Eliminación: " + (endTime - startTime) / 1e6 + " ms");
    }

    // Test para Hash con Linear Probing
    private static void testLinearProbing(Integer[] keys, Integer[] values, float loadFactor) {
        System.out.println("-- Linear Probing --");
        Hash_Linear_Probing<Integer, Integer> hashTable = new Hash_Linear_Probing<>(keys.length, loadFactor);

        // Medir inserción
        long startTime = System.nanoTime();
        for (int i = 0; i < keys.length; i++) {
            hashTable.put(keys[i], values[i]);
        }
        long endTime = System.nanoTime();
        System.out.println("Inserción: " + (endTime - startTime) / 1e6 + " ms");

        // Medir búsqueda
        startTime = System.nanoTime();
        for (int key : keys) {
            hashTable.get(key);
        }
        endTime = System.nanoTime();
        System.out.println("Búsqueda: " + (endTime - startTime) / 1e6 + " ms");

        // Medir eliminación
        startTime = System.nanoTime();
        for (int key : keys) {
            hashTable.remove(key);
        }
        endTime = System.nanoTime();
        System.out.println("Eliminación: " + (endTime - startTime) / 1e6 + " ms");
    }

    // Test para Hash con Quadratic Probing
    private static void testQuadraticProbing(Integer[] keys, Integer[] values, float loadFactor) {
        System.out.println("-- Quadratic Probing --");
        Hash_Quadratic_Probing<Integer, Integer> hashTable = new Hash_Quadratic_Probing<>(keys.length, loadFactor);

        // Medir inserción
        long startTime = System.nanoTime();
        for (int i = 0; i < keys.length; i++) {
            hashTable.put(keys[i], values[i]);
        }
        long endTime = System.nanoTime();
        System.out.println("Inserción: " + (endTime - startTime) / 1e6 + " ms");

        // Medir búsqueda
        startTime = System.nanoTime();
        for (int key : keys) {
            hashTable.get(key);
        }
        endTime = System.nanoTime();
        System.out.println("Búsqueda: " + (endTime - startTime) / 1e6 + " ms");

        // Medir eliminación
        startTime = System.nanoTime();
        for (int key : keys) {
            hashTable.remove(key);
        }
        endTime = System.nanoTime();
        System.out.println("Eliminación: " + (endTime - startTime) / 1e6 + " ms");
    }

    // Test para Hash con Double Hashing
    private static void testDoubleHashing(Integer[] keys, Integer[] values, float loadFactor) {
        System.out.println("-- Double Hashing --");
        Hash_Double_Hashing<Integer, Integer> hashTable = new Hash_Double_Hashing<>(keys.length, loadFactor);

        // Medir inserción
        long startTime = System.nanoTime();
        for (int i = 0; i < keys.length; i++) {
            hashTable.put(keys[i], values[i]);
        }
        long endTime = System.nanoTime();
        System.out.println("Inserción: " + (endTime - startTime) / 1e6 + " ms");

        // Medir búsqueda
        startTime = System.nanoTime();
        for (int key : keys) {
            hashTable.get(key);
        }
        endTime = System.nanoTime();
        System.out.println("Búsqueda: " + (endTime - startTime) / 1e6 + " ms");

        // Medir eliminación
        startTime = System.nanoTime();
        for (int key : keys) {
            hashTable.remove(key);
        }
        endTime = System.nanoTime();
        System.out.println("Eliminación: " + (endTime - startTime) / 1e6 + " ms");
    }
}
