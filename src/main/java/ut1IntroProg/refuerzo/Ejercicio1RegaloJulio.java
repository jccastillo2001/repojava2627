package ut1IntroProg.refuerzo;

import java.util.Scanner;
/*
 * Un grupo de amigos quiere comprar un regalo de cumpleaños y repartir su coste entre todos los participantes.

Escribe un programa en Java que solicite al usuario:
	El precio total del regalo (en euros).
	El número de amigos que van a contribuir a la compra.
	Cada amigo deberá aportar una cantidad exacta de euros 
	El programa deberá mostrar:
	Cuántos euros debe pagar cada amigo.
	//hola julio 3
 * */

public class Ejercicio1RegaloJulio {
	/**
	 * 
	 * @param precioRegalo
	 * @param numAmigos
	 * @return String
	 */
	public static double calcularReparto(double precioRegalo, int numAmigos) {
		double dPagaCadaUno=0;
		//Tu código aquí.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("escribe el precio del resgalo");
		precioRegalo = sc.nextDouble();
		
		System.out.print("escribe el precio del resgalo");
		 numAmigos = sc.nextInt();
		 
		 dPagaCadaUno = precioRegalo / numAmigos;
		 
		 
		 		
		return dPagaCadaUno;
		
	}

	public static void main(String[] args) {

		//Tu código aquí.

		
	}
}
