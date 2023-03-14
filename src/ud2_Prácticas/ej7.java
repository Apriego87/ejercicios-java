package ud2_Prácticas;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = scan.nextInt();
        scan.close();

        int suma = 0;

        for (int i = 1; i <= num; i++) {
            suma += i;
        }
        System.out.println("La suma total es: " + suma);
    }
}
