public class MayorMenorArreglo {
    public static void main(String[] args) {
        int[] numeros = {15, 42, 8, 91, 23, 4, 67};
        int mayor = numeros[0];
        int menor = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}