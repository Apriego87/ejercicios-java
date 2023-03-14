package ud3_Practicas.funciones;

import java.util.Scanner;

public class ej2 {
    public static Boolean esMultiplo(int num1, int num2) {
        // Boolean queEs = false;
        if (num1 % num2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce 2 números (separados por espacios): ");
        System.out.println(esMultiplo(scan.nextInt(), scan.nextInt()));
    }
}
