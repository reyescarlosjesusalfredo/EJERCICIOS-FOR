import java.util.Scanner;

public class SerieExponencial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el valor de x: ");
        int x = entrada.nextInt();
        System.out.print("Ingresa el valor de n (potencia máxima): ");
        int n = entrada.nextInt();
        double suma = 1.0;
        
        for (int i = 1; i <= n; i++) {
            suma += Math.pow(x, i);
        }
        System.out.println("El resultado de la serie exponencial es: " + suma);
    }
}