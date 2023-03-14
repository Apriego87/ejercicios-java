package ud3_Practicas.arrays;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float[] notas = new float[10];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Introduce la nota del alumno %d: ", i + 1);
            notas[i] = scan.nextFloat();
        }

        System.out.println("\nCalificaciones:");

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        System.out.printf("\nNota media: %f", media(notas));
        System.out.printf("\nNúmero de aprobados: %d", notas.length - susp(notas));
        System.out.printf("\nNúmero de suspensos: %d", susp(notas));
    }

    public static float media(float[] notas) {
        float suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public static int susp(float[] notas) {
        int cont = 0;
        for (int i = 0; i < notas.length; i++){
            if (notas[i] < 5){
                cont++;
            }
        }
        return cont;
    }
}
