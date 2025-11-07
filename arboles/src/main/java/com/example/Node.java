package com.example;

/**
 * Representa un nodo individual en el Árbol Binario de Búsqueda.
 * @param <T> El tipo de dato del valor almacenado, debe ser comparable.
 */
public class Node<T extends Comparable<T>> {
    
    T value; // El valor almacenado en el nodo 
    Node<T> left;  // Referencia al hijo izquierdo 
    Node<T> right; // Referencia al hijo derecho 

    /**
     * Constructor para crear un nuevo nodo.
     * @param value El valor que almacenará el nodo.
     */
    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}