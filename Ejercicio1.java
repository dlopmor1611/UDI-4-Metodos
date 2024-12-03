import java.util.Scanner;

public class Ejercicio1 {
    static String convierteEnPalotes(int n) {
        String resultado = ""; 
        String sn = String.valueOf(n); 

        for (int i = 0; i < sn.length(); i++) {
            int digito = (int)(sn.charAt(i)-48); 
            for (int j = 0; j < digito; j++) {
                resultado += "|"; 
            }
            
            
            if (i < sn.length()-1 ) {
                resultado += "-";
            }
        }
        return resultado; 
    }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame un numero y te lo convertiré a palotes: ");
        int num = scanner.nextInt();
        System.out.println(convierteEnPalotes(num));
        scanner.close();
    }
}
    