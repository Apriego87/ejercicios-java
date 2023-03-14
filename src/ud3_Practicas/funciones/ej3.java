package ud3_Practicas.funciones;

import java.util.Scanner;

public class ej3 {
    public static double dolarAeuro(double cantid, double cotiz) {
        return cantid * cotiz;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce una cantidad en dólares y la cotización actual del dólar (separados por espacios): ");
        System.out.println(Math.round((dolarAeuro(scan.nextDouble(), scan.nextDouble()))*100.0)/100.0);
    }
}
