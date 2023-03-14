package ud2_Prácticas;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = scan.nextInt();
        scan.close();

        for (int i = 1; i <= num; ++i) {

            for (int j = 1; j <= i; ++j) {
                System.out.print(j + "\t");
            }

            System.out.println("");
        }

        for (int i = num; i >= 1; i--) {

            for (int j = 1; j < i; j++) {
                System.out.print(j + "\t");
            }

            System.out.println("");
        }
    }
}