import java.util.Scanner;

public class Ejeccio07_salario {

	public static void main(String[] args) {
		/* 
		 * programa que calcula el salario neto mensual de un trabajador
		 en funcion de las horas trabajadas y sus impuestos.
		 -las primeras 35 horas tarifa normal
		 *impuestos:
		 *-los primeros 500 libres de impuestos
		 *-los siguientes 400 25% de impuestos
		 *-lo restante 45% de impuestos
		 *pide por pantalla:
		 *1-horas trabajadas esta semana
		 *2-precio hora trabjada normal
		 *muestra por pantalla :
		 *-salario bruto,impuesto,salario neto:salario-impuestos
		 * 
		 * **/
		
		Scanner sc = new Scanner (System.in);
		int horas_trabajadas,salario_bruto,salario_neto,calcular_salario;
		System.out.print("horas trabajadas esta semana");
		horas_trabajadas = sc.nextInt();
		int salario_base = 10;
		int salario_extra =15;
		int tarifa_normal = horas_trabajadas <= 35 ? salario_base:salario_extra;
		System.out.print("precio hora tarifa normal:"+ tarifa_normal);
		
		System.out.print("tu salario bruto");
		salario_bruto =  sc.nextInt();
		int libre_impuestos = 500;
		
		
		  if (salario_bruto <= libre_impuestos ) {
	            System.out.println("libre de impuestos");
	        } else {
	            System.out.println("El número " +   " no son igualesr");
	        }
		
		
		
		
		
		//con operador ternario
		// mayor = n1 > n2 ? n1 : n2;
	     //menor = n2 > n1 ? n2 : n1;
		

	}

}
