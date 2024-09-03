/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structures;

/**
 *
 * @author 57315
 */
import Classes.Pendientes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 57315
 */

public class BST<T extends Comparable<T>> {
  Node<T> root;
  int _size;

    public BST() {
        this.root = null;
        this._size = 0;
    }
  
  
class Node<T extends Comparable<T>> {
  T element;
  Node<T> left, right, parent;

  Node(T element) {
      this.element = element;
      this.left = this.right = this.parent = null;
  }
}



  int size() {
      return _size;
  }

  boolean empty() {
      return root == null;
  }

  Node<T> insert(Node<T> node, T x) {
      if (root == null) {
          root = new Node<>(x);
          return root;
      }

      if (node == null) {
          return new Node<>(x);
      }

      if (x.compareTo(node.element) > 0) {
          // go right
          node.right = insert(node.right, x);
          node.right.parent = node;
      } else if (x.compareTo(node.element) < 0) {
          // go left
          node.left = insert(node.left, x);
          node.left.parent = node;
      }

      return node;
  }

  void insert(T x) {
      insert(root, x);
      _size++;
  }

  // Returns pointer to Node with the element or null
  Node<T> search(Node<T> node, T x) {
      if (node == null) return null;

      if (x.compareTo(node.element) == 0) {
          return node;
      }
      if (x.compareTo(node.element) > 0) {
          // right
          return search(node.right, x);
      } else {
          // left
          return search(node.left, x);
      }
  }

  Node<T> search(T x) {
      return search(root, x);
  }

  Node<T> remove(Node<T> node, T x) {
      if (root == null) return null;

      if (x.compareTo(node.element) > 0) {
          // right
          node.right = remove(node.right, x);
      } else if (x.compareTo(node.element) < 0) {
          // left
          node.left = remove(node.left, x);
      } else {
          // Node has to be removed
          if (node.left == null) {
              return node.right;
          } else if (node.right == null) {
              return node.left;
          }

          // Left and right not null
          Node<T> parentSucc = node;
          Node<T> succ = node.right;
          while (succ.left != null) {
              parentSucc = succ;
              succ = succ.left;
          }

          if (parentSucc != node) {
              parentSucc.left = succ.right;
          } else {
              parentSucc.right = succ.right;
          }

          node.element = succ.element;
      }
      return node;
  }

  void remove(T x) {
      root = remove(root, x);
  }

  void printInOrder(Node<T> node) {
      if (node != null) {
          printInOrder(node.left);
          System.out.print(node.element + " ");
          printInOrder(node.right);
      }
  }

  void printInOrder() {
      printInOrder(root);
  }
  
//  public List<T> buscarPorPrioridad(int prioridad) {
//        return buscarPorPrioridad(root, prioridad);
//    }
//
//    // Método privado que recorre el árbol a partir de un nodo dado
//    private List<T> buscarPorPrioridad(Node<T> node, int prioridad) {
//        List<T> result = new ArrayList<>();
//        if (node == null) return result;
//
//        // Si la prioridad del nodo es mayor o igual a la buscada, explorar el subárbol izquierdo
//        if (((Pendientes) node.element).getPriority() >= prioridad) {
//            result.addAll(buscarPorPrioridad(node.left, prioridad));
//            result.add(node.element);
//        }
//
//        // Siempre explorar el subárbol derecho
//        result.addAll(buscarPorPrioridad(node.right, prioridad));
//
//        return result;
//    }
  
  public List<T> buscarPorPrioridad(int prioridad) {
        return buscarPorPrioridad(root, prioridad);
    }

    // Método privado que recorre el árbol a partir de un nodo dado
    private List<T> buscarPorPrioridad(Node<T> node, int prioridad) {
        List<T> result = new ArrayList<>();
        if (node == null) return result;

        // Si la prioridad del nodo es mayor o igual a la buscada, explorar el subárbol izquierdo
        if (((Pendientes) node.element).getPriority() >= prioridad) {
            result.addAll(buscarPorPrioridad(node.left, prioridad));
            result.add(node.element);
        }

        // Siempre explorar el subárbol derecho
        result.addAll(buscarPorPrioridad(node.right, prioridad));

        return result;
    }
}