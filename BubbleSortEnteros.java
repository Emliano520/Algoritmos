import java.util.Scanner;

public class BubbleSortEnteros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres ingresar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        System.out.println("Ingresa los " + n + " números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        // Guardar copia del arreglo original
        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = numeros[i];
        }

        // Bubble Sort (orden ascendente)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        // Resultados
        int minimo = numeros[0];
        int maximo = numeros[n - 1];
        int diferencia = maximo - minimo;

        // Impresiones finales
        System.out.println("\nArreglo original:");
        imprimir(original);

        System.out.println("\nArreglo ordenado:");
        imprimir(numeros);

        System.out.println("\nValor mínimo: " + minimo);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Diferencia (máximo - mínimo): " + diferencia);

        sc.close();
    }

    public static void imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : " "));
        }
        System.out.println();
    }
}
