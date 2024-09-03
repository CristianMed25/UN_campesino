/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import Structures.DisjointSet;
import Structures.DisjointSetWithHeuristics;

/**
 *
 * @author CristianM
 */
public class TestDisjointSet {
    public static void main(String[] args) {
        int[] testSizesX = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};  // Tamaños para probar ambas implementaciones
        int[] testSizesY = {100000, 1000000, 10000000, 100000000};  // Tamaños para probar implementacion con heuristica

        for (int size : testSizesX) {
            System.out.println("Pruebas con tamaño: " + size);

            //Test de DisjointSet (Con compresión de ruta y sin heurística)
            DisjointSet disjointSet = new DisjointSet(size);
            System.out.println("DisjointSet (Con compresión de ruta y sin heurística):");
            runTests(disjointSet, size);

            // Test de DisjointSet (Con compresión de ruta y con heurística)
            DisjointSetWithHeuristics disjointSetWithHeuristics = new DisjointSetWithHeuristics(size);
            System.out.println("DisjointSet (Con compresión de ruta y con heurística):");
            runTests(disjointSetWithHeuristics, size);

            System.out.println("=======================================");
        }
        
        for (int size : testSizesY) {
            System.out.println("Pruebas con tamaño: " + size);

            // Test de DisjointSet (Con compresión de ruta y con heurística)
            DisjointSetWithHeuristics disjointSetWithHeuristics = new DisjointSetWithHeuristics(size);
            System.out.println("DisjointSet (Con compresión de ruta y con heurística):");
            runTests(disjointSetWithHeuristics, size);

            System.out.println("=======================================");
        }
    }

    private static void runTests(DisjointSet disjointSet, int size) {
        // Medir tiempo para makeSet
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            disjointSet.makeSet(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Tiempo de makeSet: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // Medir tiempo para union
        startTime = System.nanoTime();
        for (int i = 0; i < size - 1; i++) {
            disjointSet.union(i, i + 1);
        }
        endTime = System.nanoTime();
        System.out.println("Tiempo de union: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // Medir tiempo para find
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            disjointSet.find(i);
        }
        endTime = System.nanoTime();
        System.out.println("Tiempo de find: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }

    private static void runTests(DisjointSetWithHeuristics disjointSet, int size) {
        // Medir tiempo para makeSet
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            disjointSet.makeSet(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Tiempo de makeSet: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // Medir tiempo para union
        startTime = System.nanoTime();
        for (int i = 0; i < size - 1; i++) {
            disjointSet.union(i, i + 1);
        }
        endTime = System.nanoTime();
        System.out.println("Tiempo de union: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // Medir tiempo para find
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            disjointSet.find(i);
        }
        endTime = System.nanoTime();
        System.out.println("Tiempo de find: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}

