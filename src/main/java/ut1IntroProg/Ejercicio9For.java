package ut1IntroProg;

public class Ejercicio9For {

    public static void main(String[] args) {
        // Bucle sencillo del 1 al 10 
        System.out.println("Cuenta ascendente:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Alumno número " + i);
        }
          
        System.out.println("\nCuenta descendente:");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Alumno número " + i);
        }
        
        System.out.println("\nNúmeros impares:");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Número impar: " + i);
        }
        
        System.out.println("\nSuma de los dos primeros números:");
        int suma = 0; 
        for (int i = 1; i <= 2; i++) {
            suma += i; 
        }
        System.out.println("El resultado de la suma es: " + suma);
        
        System.out.println("\nSuma de los 100 primeros números:");
        int suma2 = 0; 
        for (int i = 1; i <= 100; i++) {
            suma2 += i; 
        }
        System.out.println("El resultado de la suma es: " + suma2);
        
        System.out.println("\nMatriz 3x3:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) { 
                System.out.print("(" + i + "," + j + ") "); 
            }
            System.out.println();
        }
        
        // Llamadas a los métodos de figuras y bucles while
        pintarTriangulo();
        pintarPiramideInvertida();
        pintarRectangulo();
        ejemplosConWhile();
    }
    
    // 1. Triángulo
    public static void pintarTriangulo() {
        System.out.println("\nTriángulo:");
        int altura = 4;
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    // 2. Pirámide invertida
    public static void pintarPiramideInvertida() {
        System.out.println("\nPirámide invertida:");
        int altura = 4;
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    // 3. Cuadrado / Rectángulo
    public static void pintarRectangulo() {
        System.out.println("\nCuadrado / Rectángulo (4x5):");
        int filas = 4;
        int columnas = 5;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    // 4. Ejemplo utilizando bucles WHILE
    public static void ejemplosConWhile() {
        System.out.println("\n--- Ejemplos usando WHILE ---");
        
        // Cuenta ascendente con while
        System.out.println("Cuenta ascendente (1 al 5):");
        int i = 1;
        while (i <= 5) {
            System.out.println("Número: " + i);
            i++;
        }
        
        // Triángulo hecho con while
        //tarea dos y cuando el bucle es infinito
        System.out.println("\nTriángulo con while:");
        int fila = 1;
        while (fila <= 3) {
            int col = 1;
            while (col <= fila) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            fila++;
        }
    }
}