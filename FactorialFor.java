import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int n = entrada.nextInt();
        long factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + n + " calculado con FOR es: " + factorial);
    }
}