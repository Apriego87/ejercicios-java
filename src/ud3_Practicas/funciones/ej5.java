package ud3_Practicas.funciones;

import java.util.Scanner;

public class ej5 {
    public static double potencia(double base, int exp) {
        double result = base;
        for(int i = 1; i < exp; i++){
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce la base y el exponente (separados de espacios): ");
        System.out.printf("El resultado es: %f", potencia(scan.nextDouble(), scan.nextInt()));
    }
}
