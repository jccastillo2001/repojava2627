import java.util.Scanner;

public class Ejecicio04Ordenar {
	public static void main(String[] args) {
		// ordenar
		Scanner sc = new Scanner(System.in);
		
		System.out.print("introdusca el primer numero");
		int num = sc.nextInt();
		System.out.print("introdusca el segundo numero");
		int num2 = sc.nextInt();
		System.out.print("introdusca el tarcero numero");
		int num3 = sc.nextInt();
		
		if (num > num2 && num2 >num3 ) {
		    System.out.print("El número ordenado " + num   + num2 + num3);
		} else if (num < num2 && num2 <num3) {
		    System.out.print("El número ordenado " + num + num2 + num3);
		} else {
		    System.out.print("los numeros son iguales");
		}
	

}
	
}
