package ut1IntroProg.refuerzo;

import java.util.Scanner;

public class Ejercicio3NumRevesJulio {

    /**
     * Realiza un programa en Java que solicite al usuario un número entero comprendido entre 0 y 99.999.
	A continuación, el programa deberá descomponer el número en sus distintas cifras 
	(unidades, decenas, centenas, unidades de millar y decenas de millar) 
	y mostrarlo escrito al revés, sin utilizar métodos específicos para invertir cadenas.
	Pista: Piensa qué operaciones aritméticas te permiten:
		Obtener la última cifra de un número.
		Eliminar esa última cifra para seguir trabajando con las restantes.
     */
    public static String invertirNumero(int num) {
        String sNumInvertido="";
        
        /*TU CÓDIGO AQUÍ */
    	return sNumInvertido;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entre 0 y 99999: ");
        int num = sc.nextInt();

        System.out.println(invertirNumero(num));

        sc.close();
    }
}










