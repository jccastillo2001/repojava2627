package ut1IntroProg;
import java.util.Scanner;

public class calcularMedia {

	public static void main(String[] args) {
		double nota1, nota2, media;
		Scanner sc = new Scanner(System.in);
		System.out.print("escribe la primera nota ");
		nota1 = sc.nextDouble();
		System.out.print("escribe la segunda nota ");
		nota2 = sc.nextDouble();
		media = (nota1 + nota2) / 2;
		System.out.println("la media es " + media);
		sc.close();
	}
}