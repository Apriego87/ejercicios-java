package ud2_Prácticas;

import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = scan.nextInt();
        scan.close();

        int suma = 0, cifra;

        while (num != 0) {
            cifra = num % 10;
            num /= 10;
            suma += cifra;
        }

        System.out.println(suma);
    }
}
