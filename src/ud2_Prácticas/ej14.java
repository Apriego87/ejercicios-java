package ud2_Prácticas;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = scan.nextInt();

        scan.close();

        boolean noEsPrimo = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                noEsPrimo = true;
                break;
            }
        }

        if (!noEsPrimo) {
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " no es primo.");
        }
    }
}
