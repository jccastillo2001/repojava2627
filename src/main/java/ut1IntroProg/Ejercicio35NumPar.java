package ut1IntroProg;
import java.util.Scanner;

public class Ejercicio35NumPar {
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos el Scanner para leer lo que escribe el usuario
        Scanner sc = new Scanner(System.in);

        // Pedimos el número
        System.out.print("Escribe un número entero: ");

        // Guardamos el número introducido
        int num = sc.nextInt();

        // % calcula el resto de una división
        // Si el resto al dividir entre 2 es 0, el número es par
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par");
        } else {
            System.out.println("El número " + num + " es impar");
        }

        // Cerramos el Scanner
        sc.close();

	}

}
