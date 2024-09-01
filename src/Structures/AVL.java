/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structures;

/**
 *
 * @author Valentina
 */
    // Implementation of AVLTree in Java

// T needs to have > and < comparator operations
class Node<T extends Comparable<T>> {
    T value;

    // Balance factor
    int bf;

    // Height of the node, if leaf 1
    int height;

    // Frequency of the value
    int frequency;

    Node<T> left;
    Node<T> right;

    // Initially a leaf
    Node() {
        left = right = null;
        bf = 0;
        height = 1;
        frequency = 1;
    }

    Node(T el) {
        left = right = null;
        bf = 0;
        height = 1;
        frequency = 1;
        value = el;
    }
}

public class AVL<T extends Comparable<T>> {
    Node<T> root;
    int _size;

    AVL() {
        _size = 0;
        root = null;
    }

    // Height of rooted tree
    int height() {
        if (root == null) return 0;
        return root.height;
    }

    int size() {
        return _size;
    }

    boolean empty() {
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

    boolean count(T value) {
        Node<T> u = find(root, value);
        if (u == null) return false;
        return u.frequency > 0;
    }

    boolean contains(T value) {
        return count(value);
    }

    void update(Node<T> u) {
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
    boolean insert(T value) {
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
    Node<T> remove(Node<T> node, T elem) {
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

    boolean remove(T value) {
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

    void preOrder(Node<T> u) {
        if (u == null) return;
        System.out.print(u.value + " ");
        preOrder(u.left);
        preOrder(u.right);
    }

    void inOrder(Node<T> u) {
        if (u == null) return;
        inOrder(u.left);
        System.out.print(u.value + " ");
        inOrder(u.right);
    }

    void postOrder(Node<T> u) {
        if (u == null) return;
        postOrder(u.left);
        postOrder(u.right);
        System.out.print(u.value + " ");
    }

    void printSorted() {
        inOrder(root);
        System.out.println();
    }

    void printOrders() {
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    }
}

