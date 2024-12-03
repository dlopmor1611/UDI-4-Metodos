import java.util.Scanner;

public class Ejercicio3 {
    static void linea(char caracter, int repeticiones) {
        int resto=repeticiones; 
        for (int i = 0; i < repeticiones; i++) {
            for (int j = resto; j >0; j--) {
                System.out.print(caracter);
            }
        resto-=1;
        System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame un numero y te hare un triagulo de esa altura: ");
        int num = scanner.nextInt();
        System.out.print("Dame un caracter para hacerte ese triangulo: ");
        char character = scanner.next().charAt(0);
        linea(character, num);
        scanner.close();
    }
}