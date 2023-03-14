package ud4_5_6_practicas;

import java.util.Arrays;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String w1, w2;

        System.out.print("Introduce la primera palabra: ");
        w1 = scan.next();

        System.out.print("Introduce la segunda palabra: ");
        w2 = scan.next();

        if (w1.length() != w2.length()) {
            System.out.printf("%s y %s no son anagramas.", w1, w2);
            System.exit(0);
        }

        char w1p[] = new char[w1.length()];
        char w2p[] = new char[w2.length()];

        for (int i = 0; i < w1.length(); i++) {
            w1p[i] = w1.toLowerCase().charAt(i);
            w2p[i] = w2.toLowerCase().charAt(i);
        }

        Arrays.sort(w1p);
        Arrays.sort(w2p);

        if (Arrays.equals(w1p, w2p)) {
            System.out.printf("%s y %s son anagramas.", w1, w2);
        } else {
            System.out.printf("%s y %s NO son anagramas.", w1, w2);
        }

    }
}
