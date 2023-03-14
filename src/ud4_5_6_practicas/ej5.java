package ud4_5_6_practicas;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ej5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase, palabra;
        int cont = 0;

        System.out.print("Introduce la frase: ");
        frase = scan.nextLine();

        System.out.print("Introduce la palabra: ");
        palabra = scan.next();

        StringTokenizer partes = new StringTokenizer(frase, " ");

        String[] x = new String [partes.countTokens()];

        for(int i = 0; i < x.length; i++){
            x[i] = partes.nextToken().toString();
            if (x[i].equals(palabra)){
                cont++;
            }
        }

        System.out.printf("La palabra %s se encontró %d veces.", palabra, cont);
    }
}
