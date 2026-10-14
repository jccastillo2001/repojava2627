import java.util.Scanner;

public class Ejercicio05Notas {

	
		public static void main(String[] args) {
			// pide  un numro
			//valida entre 0 y 10
			// de 0 a 3 muy deficiente, de 3 a 5 insuficiente, 5 a 6 bien ,6 a 9 notable y 9 a 10 sobresaliente
			Scanner sc = new Scanner(System.in);
			
			System.out.print("introdusca el primer numero");
			int num = sc.nextInt();
		
			
			if (num ) {
				
			    System.out.print("muy deficiente " );
			} else if (num == 3 || num == 5) {
			    System.out.print("insuficiente ");
			} else {
			    System.out.print("sobresaliente");
			}
		

	

	}

}


