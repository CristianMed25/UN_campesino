/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structures;

import java.io.Serializable;

/**
 *
 * @author CristianM
 */
public class DisjointSetWithHeuristics implements Serializable{
    private static final long serialVersionUID = 4593326322556710783L;
    private int[] parent;
    private int[] rank;

    // Constructor para inicializar n conjuntos disjuntos (de 0 a n-1)
    public DisjointSetWithHeuristics(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;  // Cada elemento es su propio conjunto inicialmente
            rank[i] = 0;    // El rango de cada conjunto es inicialmente 0
        }
    }

    // Crea un nuevo conjunto para el elemento x
    public void makeSet(int x) {
        parent[x] = x;  // Se asegura que x sea su propio padre
        rank[x] = 0;    // Inicializa el rango en 0
    }

    // Encuentra el representante del conjunto de x con compresión de ruta
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);  // Compresión de ruta
        }
        return parent[x];
    }

    // Une los conjuntos de x e y usando unión por rango
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;  // Incrementa el rango si ambos tienen el mismo rango
            }
        }
    }
    
    // Verifica si x e y están en el mismo conjunto
    public boolean isConnected(int x, int y) {
          return find(x) == find(y);
    }
    
    public void printSets() {
        System.out.println("Elemento -> Padre | Rango");
        for (int i = 0; i < parent.length; i++) {
            System.out.println(i + " -> " + parent[i] + " | " + rank[i]);
        }
        System.out.println("\nConjuntos:");
        for (int i = 0; i < parent.length; i++) {
            System.out.println("Elemento " + i + " pertenece al conjunto con representante: " + find(i));
        }
    }
}

