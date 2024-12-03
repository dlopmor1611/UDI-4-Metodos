import java.util.Scanner;

public class ejercicio4 {
    public static String convierteArrayEnString(int[] a) {
        String resultado = "";
        for (int numero : a) {
            resultado += numero;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la cantidad de valores que quieres en el array: ");
        int tamaño = entrada.nextInt();

        int[] a = new int[tamaño];

        System.out.println("Ingresa los elementos del array: ");
        for (int i = 0; i < tamaño; i++) {

            System.out.print("Elemento " + (i + 1) + ": ");
            a[i] =entrada.nextInt();
        }
        String resultado = convierteArrayEnString(a);
        System.out.println("El array convertido en cadena de caracteres es: " + resultado);
        entrada.close();
    }
}