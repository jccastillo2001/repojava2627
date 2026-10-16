import java.util.Scanner;

public class Ejecicio8_granja {

	public static void main(String[] args) {
		/* cuantos kilos de comida
		 * cuantos animales 
		 * kilos/animal **/
         Scanner sc = new Scanner(System.in);
		
		System.out.print("kilos de comida");
		int cantidad_comida = sc.nextInt();
		System.out.print("numeros de animales");
		int numeros_animales = sc.nextInt();
		System.out.print("kilos por animal");
		int kilos_animales = sc.nextInt();
		
		int total_comida = numeros_animales * kilos_animales;
		
		  if (total_comida < cantidad_comida) {
	            System.out.println("hay suficiente comida por que hay" + cantidad_comida + "y necesitamos "+ total_comida);
	        } else {
	            System.out.println("no hay suficiente comida por que necesitamos" + cantidad_comida );
	        }
		
		

	}

}
