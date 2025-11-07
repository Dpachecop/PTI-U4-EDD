package com.example;
import java.util.Queue; // 
import java.util.LinkedList;

/**
 * Implementación de un Árbol Binario de Búsqueda (ABB) manual.
 * @param <T> El tipo de dato, debe ser comparable.
 */
public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> root;

    public BinarySearchTree() {
        this.root = null;
    }


    
    public void insert(T value) {
        root = insertRecursive(root, value);
    }

    private Node<T> insertRecursive(Node<T> current, T value) {
        if (current == null) {
            return new Node<>(value);
        }
        if (value.compareTo(current.value) < 0) {
            current.left = insertRecursive(current.left, value);
        } else if (value.compareTo(current.value) > 0) {
            current.right = insertRecursive(current.right, value);
        }
        return current;
    }

    public boolean search(T value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(Node<T> current, T value) {
        if (current == null) {
            return false;
        }
        if (value.equals(current.value)) {
            return true;
        }
        return value.compareTo(current.value) < 0
            ? searchRecursive(current.left, value)
            : searchRecursive(current.right, value);
    }

   

    /**
     * 1. Recorrido InOrder (En Orden: Izquierda, Raíz, Derecha)
     * Visita el subárbol izquierdo, luego el nodo actual (raíz), y 
     * finalmente el subárbol derecho.
     * Resultado: Imprime los nodos en orden ascendente.
     */
    public void inOrder() {
        System.out.println("Recorrido InOrder (Ascendente):");
        inOrderRecursive(root);
        System.out.println(); // Salto de línea al final
    }

    private void inOrderRecursive(Node<T> node) {
        if (node != null) {
            inOrderRecursive(node.left);
            System.out.print(node.value + " ");
            inOrderRecursive(node.right);
        }
    }

    /**
     * 2. Recorrido PreOrder (Preorden: Raíz, Izquierda, Derecha)
     * Visita el nodo actual (raíz), luego el subárbol izquierdo,
     * y finalmente el subárbol derecho.
     * Resultado: Útil para copiar el árbol.
     */
    public void preOrder() {
        System.out.println("Recorrido PreOrder (Raíz primero):");
        preOrderRecursive(root);
        System.out.println(); // Salto de línea al final
    }

    private void preOrderRecursive(Node<T> node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrderRecursive(node.left);
            preOrderRecursive(node.right);
        }
    }

    /**
     * 3. Recorrido PostOrder (Postorden: Izquierda, Derecha, Raíz)
     * Visita el subárbol izquierdo, luego el subárbol derecho,
     * y finalmente el nodo actual (raíz).
     * Resultado: Útil para eliminar nodos del árbol.
     */
    public void postOrder() {
        System.out.println("Recorrido PostOrder (Raíz al final):");
        postOrderRecursive(root);
        System.out.println(); // Salto de línea al final
    }

    private void postOrderRecursive(Node<T> node) {
        if (node != null) {
            postOrderRecursive(node.left);
            postOrderRecursive(node.right);
            System.out.print(node.value + " ");
        }
    }

    /**
     * 4. Recorrido LevelOrder (Por Niveles o BFS)
     * Visita los nodos nivel por nivel, de arriba hacia abajo
     * y de izquierda a derecha.
     * Resultado: Muestra el árbol en su "amplitud".
     */
    public void levelOrder() {
        System.out.println("Recorrido LevelOrder (Por niveles):");
        if (root == null) {
            return;
        }

        // Usamos una Cola (Queue) para llevar el orden de visita
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root); // Empezamos por la raíz

        while (!queue.isEmpty()) {
            
            // 1. Sacamos un nodo de la cola
            Node<T> currentNode = queue.poll();

            // 2. Imprimimos su valor
            System.out.print(currentNode.value + " ");

            // 3. Añadimos sus hijos (si existen) a la cola
            // Se añade primero el izquierdo para que se procese primero
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            // Se añade el derecho después
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        System.out.println(); // Salto de línea al final
    }


}