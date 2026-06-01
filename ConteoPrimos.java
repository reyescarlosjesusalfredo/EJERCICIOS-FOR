import java.util.Scanner;

public class ConteoPrimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Rango inicial: ");
        int inicio = entrada.nextInt();
        System.out.print("Rango final: ");
        int fin = entrada.nextInt();
        int contadorPrimos = 0;
        
        for (int i = inicio; i <= fin; i++) {
            if (i < 2) continue;
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                contadorPrimos++;
            }
        }
        System.out.println("Hay " + contadorPrimos + " números primos en el rango.");
    }
}