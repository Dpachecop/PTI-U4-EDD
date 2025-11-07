package com.example;


public class Main {

    public static void main(String[] args) {
        
        System.out.println("--- Probando Implementación Manual de ABB ---");
        
        // Usaremos Integer para este ejemplo
        BinarySearchTree<Integer> abb = new BinarySearchTree<>();

        // --- 1. Prueba de insert() ---
        System.out.println("Insertando valores: 50, 30, 70, 20, 40, 60, 80");
        abb.insert(50);
        abb.insert(30);
        abb.insert(70);
        abb.insert(20);
        abb.insert(40);
        abb.insert(60);
        abb.insert(80);
        


        System.out.println("\n--- 2. Prueba de search() ---");
        // Buscar un valor que existe
        System.out.println("¿Se encuentra el 40? " + abb.search(40)); // true
        // Buscar un valor que no existe
        System.out.println("¿Se encuentra el 99? " + abb.search(99)); // false

        System.out.println("\n--- 3. Pruebas de Recorridos ---");
        
        // 1. InOrder (Debe salir ordenado)
        abb.inOrder(); // Esperado: 20 30 40 50 60 70 80 

        // 2. PreOrder (Raíz, Izq, Der)
        abb.preOrder(); // Esperado: 50 30 20 40 70 60 80 

        // 3. PostOrder (Izq, Der, Raíz)
        abb.postOrder(); // Esperado: 20 40 30 60 80 70 50 

        // 4. LevelOrder (Por niveles)
        abb.levelOrder(); // Esperado: 50 30 70 20 40 60 80 
        
        System.out.println("\n--- Fin de la prueba ---");
    }
}