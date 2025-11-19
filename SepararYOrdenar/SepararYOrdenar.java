import java.util.Scanner;

public class SepararYOrdenar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Leer N números
        System.out.print("¿Cuántos números quieres ingresar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        // Llenar el arreglo original
        System.out.println("Ingresa los " + n + " números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        // Contar pares e impares para crear arreglos del tamaño exacto
        int countPares = 0;
        int countImpares = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }

        // Crear los arreglos de pares e impares
        int[] pares = new int[countPares];
        int[] impares = new int[countImpares];

        // Llenarlos
        int p = 0, q = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                pares[p] = numeros[i];
                p++;
            } else {
                impares[q] = numeros[i];
                q++;
            }
        }

        // Ordenar usando Selection Sort
        selectionSort(pares);
        selectionSort(impares);

        // Imprimir resultados
        System.out.println("\nArreglo original:");
        imprimir(numeros);

        System.out.println("Pares ordenados:");
        imprimir(pares);

        System.out.println("Impares ordenados:");
        imprimir(impares);

        sc.close();
    }

    // Algoritmo Selection Sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            // Buscar el menor
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercambiar
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Función para imprimir un arreglo
    public static void imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
