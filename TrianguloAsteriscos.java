import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa la altura del triángulo: ");
        int altura = entrada.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}