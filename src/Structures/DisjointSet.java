/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structures;

/**
 *
 * @author CristianM
 */
public class DisjointSet {
    private int[] parent;

    // Constructor para inicializar n conjuntos disjuntos (de 0 a n-1)
    public DisjointSet(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;  // Cada elemento es su propio conjunto inicialmente
        }
    }

    // Crea un nuevo conjunto para el elemento x
    public void makeSet(int x) {
        parent[x] = x;  // Se asegura que x sea su propio padre
    }

    // Encuentra el representante del conjunto de x con compresión de ruta
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);  // Compresión de ruta
        }
        return parent[x];
    }

    // Une los conjuntos de x e y sin unión por heurística
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            parent[rootX] = rootY;  // Unión simple: se hace rootX hijo de rootY
        }
    }
    
    // Verifica si x e y están en el mismo conjunto
    public boolean isConnected(int x, int y) {
          return find(x) == find(y);
    }
}

