import java.util.Scanner;

public class Ejecicio03Mayor {

	
	
		public static void main(String[] args) {
			// cual es mayor
			Scanner sc = new Scanner(System.in);
			
			System.out.print("introdusca el numero");
			int num = sc.nextInt();
			System.out.print("introdusca el siguiente numero");
			int num2 = sc.nextInt();
			
			if (num > num2) {
			    System.out.print("El número " + num + " es mayor que " + num2);
			} else if (num < num2) {
			    System.out.print("El número " + num + " es menor que " + num2);
			} else {
			    System.out.print("Ambos números son iguales (" + num + " y " + num2 + ")");
			}
		

	}

}
