package ut1IntroProg;

import java.util.Scanner;

public class calcularEdadActual {

	public static void main(String[] args) {
		int anoActual, anoNacimiento, anos;
		Scanner sc = new Scanner(System.in);
		System.out.print("escribe el ano actual ");
		anoActual = sc.nextInt();
		System.out.print("escribe el ano en que naciste ");
		anoNacimiento = sc.nextInt();
		anos = anoActual - anoNacimiento;
		System.out.println("tienes " + anos + " anos");
		sc.close();
	}
}