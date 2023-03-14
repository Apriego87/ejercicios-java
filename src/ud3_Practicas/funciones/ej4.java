package ud3_Practicas.funciones;

import java.util.Scanner;

public class ej4 {
    public static double areaCirculo(double rad) {
        return Math.PI * Math.pow(rad, 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el radio del círculo: ");
        System.out.printf("El área es: %.2f", Math.round(areaCirculo(scan.nextDouble())*100.0)/100.0);
    }
}
