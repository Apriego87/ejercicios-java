package examen1Practicas;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scan.nextInt();
        scan.close();
        
        int suma = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }

        if (suma == num) {
            System.out.printf("El número %d SÍ es perfecto.", num);
        } else {
            System.out.printf("El número %d NO es perfecto.", num);
        }
    }
}
