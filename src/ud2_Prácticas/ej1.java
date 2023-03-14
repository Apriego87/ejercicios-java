package ud2_Prácticas;

import java.util.Scanner;

public class ej1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = scan.nextInt();
        scan.close();

        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}
