package ud2_Prácticas;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un carácter: ");
        char carac = scan.next().charAt(0);
        int nums = 0, minus = 0, mayus = 0;

        while (carac != '*') {
            if (carac >= '0' && carac <= '9') {
                nums++;
            }
            if (carac >= 'a' && carac <= 'z') {
                minus++;
            }
            if (carac >= 'A' && carac <= 'Z') {
                mayus++;
            }
            System.out.print("Introduce otro carácter: ");
            carac = scan.next().charAt(0);
        }
        System.out.printf("RECUENTO: Números: %d | Minúsculas: %d | Mayúsculas: %d", nums, minus, mayus);
    }
}
