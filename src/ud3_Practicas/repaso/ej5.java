package ud3_Practicas.repaso;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        String[] nombres = new String[10];
        float[] sueldos = new float[nombres.length];

        leer(nombres, sueldos);

        imprimir(nombres, sueldos);
    }

    public static void leer(String[] nombres, float[] sueldos) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introducción de variables: ");

        for (int i = 0; i < nombres.length; i++){
            System.out.print("Introduce el nombre: ");
            nombres[i] = scan.next();
            System.out.print("Introduce el sueldo: ");
            sueldos[i] = scan.nextFloat();
        }
        scan.close();
    }

    public static void imprimir(String[] nombres, float[] sueldos) {
        float sueldo = sueldos[0];
        for (int i = 1; i < nombres.length; i++){
            if (sueldos[i] > sueldo){
                sueldo = sueldos[i];
            }
        }

        for (int i = 1; i < nombres.length; i++){
            if (sueldos[i] == sueldo){
                System.out.printf("Nombre: %s \t Sueldo: %f\n", nombres[i], sueldo);
            }
        }

        //System.out.printf("Nombre: %s \t Sueldo: %f\n", nombre, sueldo);
    }
}
