package ut1IntroProg;

import java.util.Scanner;

public class Ejercicio2Entrada {

	public static void main(String[] args) {
		// vamos a hacer un prog que pida un numero por pantalla y lo muestre
		int num;
		System.out.println("escribe un numero de 1 al 10");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.print("el numero leido es :"+num);
		sc.close();

	}

}
