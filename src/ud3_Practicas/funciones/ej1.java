package ud3_Practicas.funciones;

import java.util.Scanner;

public class ej1 {
    public static Boolean parImpar(int num) {
        Boolean queEs = false;

        if (num % 2 == 0) {
            queEs = true;
        }
        return queEs;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un número: ");

        System.out.println(parImpar(scan.nextInt()));
    }
}
