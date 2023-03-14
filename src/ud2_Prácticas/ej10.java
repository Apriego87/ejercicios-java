package ud2_Prácticas;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, suma = 0, cont = 0;

        /*
         * for(int i=1;i<=3;i++){
         * System.out.print("Introduce un número entero: ");
         * num = scan.nextInt();
         * suma += num;
         * }
         */

        System.out.print("Introduce un número entero: ");
        num = scan.nextInt();

        int min = num, max = num;

        while (num > 0) {
            suma += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            System.out.print("Introduce otro número entero: ");
            num = scan.nextInt();

            cont++;
        }

        scan.close();

        float media = (float) suma / cont;

        System.out.printf("Suma total: %d, mínimo: %d, máximo: %d, media: %.3f", suma, min, max, media);
    }
}
