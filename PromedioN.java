import java.util.Scanner;

public class PromedioN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas promediar?: ");
        int n = entrada.nextInt();
        double suma = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingresa el valor " + i + ": ");
            suma += entrada.nextDouble();
        }
        System.out.println("El promedio total es: " + (suma / n));
    }
}