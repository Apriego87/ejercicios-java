package ud3_Practicas.repaso;

import java.util.Arrays;
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = scan.next();

        scan.close();

        comprobar(palabra);
    }

    public static void comprobar(String palabra) {
        char[] izq = new char[palabra.length() / 2];
        char[] der = new char[palabra.length() / 2];
        
        int cont = 0;

        for (int i = 0; i < palabra.length() / 2; i++) {
            izq[i] = palabra.charAt(i);
        }

        if (palabra.length() % 2 == 0) {
            for (int i = palabra.length(); i > palabra.length() / 2; i--) {
                der[cont] = palabra.charAt(i - 1);
                cont++;
            }
        } else {
            for (int i = palabra.length(); i > (palabra.length() / 2) + 1; i--) {
                der[cont] = palabra.charAt(i - 1);
                cont++;
            }
        }

        System.out.println(imprimir(izq, der));
    }

    public static String imprimir(char[] izq, char[] der) {
        if (Arrays.equals(izq, der)) {
            return "Es capicúa.";
        } else {
            return "No es capicúa.";
        }
    }
}
