/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structures;
import Classes.Pendientes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 57315
 * @param <T>
 */
    // Implementation of AVLTree in Java

public class AVL<T extends Comparable<T>> {
    Node<T> root;
    int _size;

    public AVL() {
        this.root = null;
        this._size = 0;
    }

    


public class Node<T extends Comparable<T>> {
    T value;         // Valor del nodo
    int bf;          // Factor de balance (balance factor)
    int height;      // Altura del nodo
    int frequency;   // Frecuencia del valor en el nodo
    Node<T> left;    // Hijo izquierdo
    Node<T> right;   // Hijo derecho

    // Constructor con valor
    Node(T el) {
        left = right = null;
        bf = 0;
        height = 1;
        frequency = 1;
        value = el;
    }
}

    
   

    // Height of rooted tree
    public int height() {
        if (root == null) return 0;
        return root.height;
    }

    public int size() {
        return _size;
    }

    public boolean empty() {
        return size() == 0;
    }

    // Returns node if found
    Node<T> find(Node<T> u, T value) {
        if (u == null) return null;

        // Search in left subtree
        if (u.value.compareTo(value) > 0) {
            return find(u.left, value);
        }

        // Search in right subtree
        if (u.value.compareTo(value) < 0) {
            return find(u.right, value);
        }

        // Found element
        return u;
    }

    public boolean count(T value) {
        Node<T> u = find(root, value);
        if (u == null) return false;
        return u.frequency > 0;
    }

    public boolean contains(T value) {
        return count(value);
    }

    public void update(Node<T> u) {
        int leftNodeHeight = (u.left == null) ? 0 : u.left.height;
        int rightNodeHeight = (u.right == null) ? 0 : u.right.height;

        u.height = 1 + Math.max(leftNodeHeight, rightNodeHeight);
        u.bf = rightNodeHeight - leftNodeHeight;
    }

    Node<T> leftLeftCase(Node<T> u) {
        return rightRotation(u);
    }

    Node<T> leftRightCase(Node<T> u) {
        u.left = leftRotation(u.left);
        return leftLeftCase(u);
    }

    Node<T> rightRightCase(Node<T> u) {
        return leftRotation(u);
    }

    Node<T> rightLeftCase(Node<T> u) {
        u.right = rightRotation(u.right);
        return rightRightCase(u);
    }

    Node<T> leftRotation(Node<T> u) {
        Node<T> newParent = u.right;
        u.right = newParent.left;
        newParent.left = u;

        update(u);
        update(newParent);
        return newParent;
    }

    Node<T> rightRotation(Node<T> u) {
        Node<T> newParent = u.left;
        u.left = newParent.right;
        newParent.right = u;

        update(u);
        update(newParent);

        return newParent;
    }

    Node<T> balance(Node<T> u) {
        if (u.bf == -2) {
            if (u.left.bf <= 0) {
                return leftLeftCase(u);
            } else {
                return leftRightCase(u);
            }
        } else if (u.bf == 2) {
            if (u.right.bf >= 0) {
                return rightRightCase(u);
            } else {
                return rightLeftCase(u);
            }
        }

        // No need to balance
        return u;
    }

    // Returns new node
    Node<T> insert(Node<T> u, T value) {
        if (u == null) return new Node<>(value);

        // Insert in left subtree
        if (u.value.compareTo(value) > 0) {
            u.left = insert(u.left, value);
        } else {
            // Insert in right subtree
            u.right = insert(u.right, value);
        }

        update(u);

        return balance(u);
    }

    // Insert value to the tree
    // Returns true if inserted in new leaf
    public boolean insert(T value) {
        Node<T> u = find(root, value);
        _size++;
        if (u == null) {
            // Perform new insertion in a leaf
            root = insert(root, value);
            return true;
        } else {
            // Found and increment
            u.frequency++;
            return true;
        }
    }

    // Removes a value from the AVL tree
    public Node<T> remove(Node<T> node, T elem) {
        // Explore left
        if (node.value.compareTo(elem) > 0) {
            node.left = remove(node.left, elem);
        }
        // Explore right
        else if (node.value.compareTo(elem) < 0) {
            node.right = remove(node.right, elem);
        } else {
            if (node.left == null) {
                return node.right;

            } else if (node.right == null) {
                return node.left;
            } else {

                // Choose to remove from left subtree
                if (node.left.height > node.right.height) {

                    // Swap the value of the successor into the node
                    T successorValue = getMax(node.left);
                    node.value = successorValue;

                    // Find the largest node in the left subtree
                    node.left = remove(node.left, successorValue);

                } else {

                    T successorValue = getMin(node.right);
                    node.value = successorValue;
                    node.right = remove(node.right, successorValue);
                }
            }
        }

        // Update balance factor and height values
        update(node);

        return balance(node);
    }

    public boolean remove(T value) {
        Node<T> u = find(root, value);

        if (u != null) {
            _size--;
            if (u.frequency > 1) {
                u.frequency--;
                return true;
            }
            root = remove(root, value);
            return true;
        }
        return false;
    }

    T getMin(Node<T> u) {
        while (u.left != null) u = u.left;
        return u.value;
    }

    T getMax(Node<T> u) {
        while (u.right != null) u = u.right;
        return u.value;
    }

    T getMin() {
        return getMin(root);
    }

    T getMax() {
        return getMax(root);
    }

    public void preOrder(Node<T> u) {
        if (u == null) return;
        System.out.print(u.value + " ");
        preOrder(u.left);
        preOrder(u.right);
    }

    public void inOrder(Node<T> u) {
        if (u == null) return;
        inOrder(u.left);
        System.out.print(u.value + " ");
        inOrder(u.right);
    }

    public void postOrder(Node<T> u) {
        if (u == null) return;
        postOrder(u.left);
        postOrder(u.right);
        System.out.print(u.value + " ");
    }

    public void printSorted() {
        inOrder(root);
        System.out.println();
    }

    public void printOrders() {
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    }
    
    
    
//    public List<T> buscarPorPrioridad(Node<T> node, int prioridad) {
//        List<T> result = new ArrayList<>();
//        if (node == null) return result;
//
//        // Si la prioridad del nodo es mayor o igual a la buscada, explorar el subárbol izquierdo
//        if (((Pendientes) node.value).getPriority() >= prioridad) {
//            result.addAll(buscarPorPrioridad(node.left, prioridad));
//            result.add(node.value);
//        }
//
//        // Siempre explorar el subárbol derecho
//        result.addAll(buscarPorPrioridad(node.right, prioridad));
//
//        return result;
//    }
//
//    public List<T> buscarPorPrioridad(int prioridad) {
//        return buscarPorPrioridad(root, prioridad);
//    }
    
    
    public List<T> buscarPorPrioridad(int prioridad) {
        return buscarPorPrioridad(root, prioridad);
    }

    // Método privado que recorre el árbol a partir de un nodo dado
    private List<T> buscarPorPrioridad(Node<T> node, int prioridad) {
        List<T> result = new ArrayList<>();
        if (node == null) return result;

        // Si la prioridad del nodo es mayor o igual a la buscada, explorar el subárbol izquierdo
        if (((Pendientes) node.value).getPriority() >= prioridad) {
            result.addAll(buscarPorPrioridad(node.left, prioridad));
            result.add(node.value);
        }

        // Siempre explorar el subárbol derecho
        result.addAll(buscarPorPrioridad(node.right, prioridad));

        return result;
    }
    public List<T> buscarPorPrioridadExacta(int prioridad) {
        List<T> resultado = new ArrayList<>();
        buscarPorPrioridadExacta(root, prioridad, resultado);
        return resultado;
    }

    private void buscarPorPrioridadExacta(Node<T> nodo, int prioridad, List<T> resultado) {
        if (nodo == null) {
            return;
        }

        // Suponiendo que T es Pendientes o tiene un método getPriority
        Pendientes tarea = (Pendientes) nodo.value;
        if (tarea.getPriority() == prioridad) {
            resultado.add(nodo.value);
        }

        buscarPorPrioridadExacta(nodo.left, prioridad, resultado);
        buscarPorPrioridadExacta(nodo.right, prioridad, resultado);
    }
}
