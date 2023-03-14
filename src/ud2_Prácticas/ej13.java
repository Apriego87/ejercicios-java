package ud2_Prácticas;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = scan.nextInt();

        scan.close();

        int fact = num;

        for (int i = --num; i > 0; i--) {
            fact *= i;
            if (num == 0) {
                fact = 1;
            }
        }

        System.out.println(fact);
    }
}
