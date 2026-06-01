import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String texto = entrada.nextLine().toLowerCase();
        int contador = 0;
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("El número total de vocales es: " + contador);
    }
}