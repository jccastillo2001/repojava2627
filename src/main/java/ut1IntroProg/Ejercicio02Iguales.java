package ut1IntroProg;

import java.util.Scanner;

public class Ejercicio02Iguales {
	public static void main(String[] args) {
		// uso de iguales
		Scanner sc = new Scanner(System.in);
		
		System.out.print("introdusca el numero");
		int num = sc.nextInt();
		System.out.print("introdusca el siguiente numero");
		int num2 = sc.nextInt();
		
		  if (num == num2) {
	            System.out.println("El número " + num + " son iguales");
	        } else {
	            System.out.println("El número " + num + " no son igualesr");
	        }
		

	}

}


