import java.util.Scanner;

public class Ejercicio2 {
    static String convierteEnPalabras(int n) {
        String resultado = ""; 
        String sn = String.valueOf(n); 
        String[] palabras = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};

        for (int i = 0; i < sn.length(); i++) {
            int digito = (int)(sn.charAt(i)-48);    
            resultado +=palabras[digito] ;    
            if (i < sn.length()-1 ) {
                resultado += ",";
            }
        }
        return resultado; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame un numero y te lo convertiré a palabras: ");
        int num = scanner.nextInt();
        System.out.println(convierteEnPalabras(num));
        scanner.close();
    }
}