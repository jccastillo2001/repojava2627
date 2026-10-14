package ut1IntroProg;

import java.util.Scanner;
public class Ejercicio41MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner (System.in);
			int n1,n2,mayor,menor;
			System.out.print("introduce el 1er numero:");
			n1 = sc.nextInt();
			System.out.print("introduce el 2er numero:");
			n2 = sc.nextInt();
			
			//con operador ternario
			 mayor = n1 > n2 ? n1 : n2;
		     menor = n2 > n1 ? n2 : n1;

	}

}
