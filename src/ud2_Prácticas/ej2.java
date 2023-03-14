package ud2_Prácticas;

import java.util.Scanner;

public class ej2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        float num1, num2, num3;
        System.out.println("Introduce 3 números: ");
        num1 = scan.nextFloat();
        num2 = scan.nextFloat();
        num3 = scan.nextFloat();
        scan.close();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es: " + num1);
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es: " + num2);
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println("El mayor es: " + num3);
        }

        // System.out.println("El mayor es: " + Math.max(num1, Math.max(num2, num3)));
    }
}
