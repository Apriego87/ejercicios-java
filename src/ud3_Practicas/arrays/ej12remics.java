package ud3_Practicas.arrays;

import java.util.Scanner;

public class ej12remics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un string: ");
        String texto = scan.nextLine();

        scan.close();

        char[] frec = new char[5];
        char[] letras = new char[] { 'a', 'e', 'i', 'o', 'u' };
        char[][] total = new char[][] { letras, frec };

        calcular(frec, texto);

        for (int i = 0; i < frec.length; i++) {
            System.out.printf("%c: %d\n", total[0][i], (int) total[1][i]);
        }
    }

    public static void calcular(char[] frec, String texto) {
        for (int i = 0; i < texto.length(); i++) {
            char unit = texto.charAt(i);

            switch (unit) {
                case 'a':
                    frec[0]++;
                    break;
                case 'e':
                    frec[1]++;
                    break;
                case 'i':
                    frec[2]++;
                    break;
                case 'o':
                    frec[3]++;
                    break;
                case 'u':
                    frec[4]++;
                    break;
            }
        }
    }
}
