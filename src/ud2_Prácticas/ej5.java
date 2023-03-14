package ud2_Prácticas;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un carácter alfanumérico: ");

        char carac = scan.next().charAt(0);
        scan.close();

        if (carac >= '0' && carac <= '9') {
            System.out.println("Es un número.");
            System.exit(1);
        }
        if (carac >= 'a' && carac <= 'z') {
            System.out.println("Es una letra minúscula.");
            System.exit(1);
        }
        if (carac >= 'A' && carac <= 'Z') {
            System.out.println("Es una letra mayúscula.");
            System.exit(1);
        } else {
            System.out.println("El carácter introducido no es alfanumérico.");
        }
    }
}
