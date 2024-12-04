import java.util.Scanner;

public class Ejercicio5 {
    public static int[] concatena(int[] a, int[] b) {
        int[] resultado = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            resultado[a.length + i] = b[i];
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de valores que quieres en el array: ");
        int tamaño = scanner.nextInt();

        int[] a = new int[tamaño];

        System.out.println("Ingresa los elementos del array: ");
        for (int i = 0; i < tamaño; i++) {

            System.out.print("Elemento " + (i + 1) + ": ");
            a[i] =scanner.nextInt();
        }

        System.out.print("Introduce la cantidad de valores que quieres en el array: ");
        int tamaño2 = scanner.nextInt();

        int[] b = new int[tamaño];

        System.out.println("Ingresa los elementos del array: ");
        for (int i = 0; i < tamaño2; i++) {

            System.out.print("Elemento " + (i + 1) + ": ");
            b[i] =scanner.nextInt();
        }

        int [] c = concatena(a, b);
        for (int i = 0; i < (tamaño+tamaño2); i++) {
            System.out.print(c[i]);
            if (i<c.length-1) {
                System.out.print(",");
            } else {
                System.out.println();
            }
        }
    scanner.close();
    }
}