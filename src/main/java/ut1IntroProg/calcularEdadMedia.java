package ut1IntroProg;
import java.util.Scanner;
import java.util.Locale; // Importante si usas Locale

public class calcularEdadMedia {

    public static void main(String[] args) {
        float nota1, nota2, media;
        Scanner sc = new Scanner(System.in);
        
        // Forzamos al Scanner a aceptar el punto (.) como separador decimal
        sc.useLocale(Locale.US);

        System.out.print("escribe la primera nota ");
        nota1 = sc.nextFloat();
        
        System.out.print("escribe la segunda nota ");
        nota2 = sc.nextFloat();
        
        media = (nota1 + nota2) / 2;
        System.out.println("la media es " + media);
        
        sc.close();
    }
}