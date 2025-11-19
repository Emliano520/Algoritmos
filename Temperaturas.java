import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas temperaturas quieres ingresar? ");
        int n = sc.nextInt();

        double[] temps = new double[n];

        System.out.println("Ingresa las " + n + " temperaturas:");
        for (int i = 0; i < n; i++) {
            temps[i] = sc.nextDouble();
        }

        // ----- Guardar copia del arreglo original -----
        double[] original = new double[n];
        for (int i = 0; i < n; i++) {
            original[i] = temps[i];
        }

        // ----- Insertion Sort -----
        for (int i = 1; i < n; i++) {
            double key = temps[i];
            int j = i - 1;

            while (j >= 0 && temps[j] > key) {
                temps[j + 1] = temps[j];
                j--;
            }
            temps[j + 1] = key;
        }

        // ----- Cálculos -----
        double min = temps[0];
        double max = temps[n - 1];
        double rango = max - min;

        // Top 3 bajas
        double[] bajas = new double[3];
        int b = Math.min(3, n);
        for (int i = 0; i < b; i++) {
            bajas[i] = temps[i];
        }

        // Top 3 altas
        double[] altas = new double[3];
        int a = Math.min(3, n);
        int pos = n - a;
        for (int i = 0; i < a; i++) {
            altas[i] = temps[pos + i];
        }

        // ----- Impresiones -----

        System.out.println("\nArreglo original:");
        imprimir(original);

        System.out.println("\nArreglo ordenado:");
        imprimir(temps);

        System.out.println("\nResultados:");
        System.out.println("Temperatura mínima: " + min);
        System.out.println("Temperatura máxima: " + max);
        System.out.println("Rango: " + rango);

        System.out.println("3 temperaturas más bajas:");
        imprimirLimitado(bajas, b);

        System.out.println("3 temperaturas más altas:");
        imprimirLimitado(altas, a);
    }

    // Impresión normal
    public static void imprimir(double[] arr) {
        for (double x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Impresión parcial (cuando el arreglo puede tener menos de 3)
    public static void imprimirLimitado(double[] arr, int limite) {
        for (int i = 0; i < limite; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
