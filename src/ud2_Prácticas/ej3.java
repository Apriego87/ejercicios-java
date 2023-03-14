package ud2_Prácticas;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce 2 números: ");
        float num1 = scan.nextFloat();
        float num2 = scan.nextFloat();
        scan.close();

        if (num1 % num2 == 0) {
            System.out.printf("%.2f es múltiplo de %.2f", num1, num2);
            System.exit(1);
        }
        if (num2 % num1 == 0) {
            System.out.printf("%.2f es múltiplo de %.2f", num2, num1);
            System.exit(1);
        }

        else {
            System.out.println("No son múltiplos.");
        }
    }
}
