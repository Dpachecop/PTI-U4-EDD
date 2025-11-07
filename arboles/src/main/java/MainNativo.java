
import java.util.TreeSet;

public class MainNativo {

    public static void main(String[] args) {
        
        System.out.println("--- Probando Librería Nativa: TreeSet ---");

      
        TreeSet<Integer> arbolNativo = new TreeSet<>();

        // --- 1. Prueba de inserción (.add()) ---
        System.out.println("Insertando valores: 50, 30, 70, 20, 40, 60, 80");
        arbolNativo.add(50);
        arbolNativo.add(30);
        arbolNativo.add(70);
        arbolNativo.add(20);
        arbolNativo.add(40);
        arbolNativo.add(60);
        arbolNativo.add(80);

        // --- Prueba de duplicados ---
        System.out.println("Intentando insertar 40 (duplicado)...");
        boolean resultado = arbolNativo.add(40); // Esto devolverá 'false'
        System.out.println("¿Se insertó el duplicado? " + resultado); // false

        // --- 2. Prueba de búsqueda (.contains()) ---
        System.out.println("\n--- Prueba de búsqueda ---");
        // Buscar un valor que existe
        System.out.println("¿Contiene el 40? " + arbolNativo.contains(40)); // true
        // Buscar un valor que no existe
        System.out.println("¿Contiene el 99? " + arbolNativo.contains(99)); // false

        // --- 3. Prueba de Recorrido (InOrder por defecto) ---
        System.out.println("\n--- Recorrido (InOrder por defecto) ---");
        // ¡Solo se necesita un bucle 'for-each'!
        // Los elementos saldrán ordenados automáticamente.
        for (Integer valor : arbolNativo) {
            System.out.print(valor + " ");
        }
   
        System.out.println();

        System.out.println("\n--- Fin de la prueba nativa ---");
    }
}