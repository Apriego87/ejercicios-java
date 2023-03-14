package ud3_Practicas.arrays;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float[] notas = new float[30];
        int contador = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Introduce la nota del alumno %d: ", i + 1);
            float sig = scan.nextFloat();
            if (sig < 0) {
                break;
            }
            notas[i] = sig;
            contador++;
        }

        System.out.println("\nCalificaciones:");

        for (int i = 0; i < contador; i++) {
            System.out.println(notas[i]);
        }

        System.out.printf("\nNota media: %f", media(notas, contador));
        System.out.printf("\nNúmero de aprobados: %d", contador - susp(notas, contador));
        System.out.printf("\nNúmero de suspensos: %d", susp(notas, contador));
        System.out.printf("\nNota máxima: %f", max(notas, contador));
    }

    public static float media(float[] notas, int contador) {
        float suma = 0;
        for (int i = 0; i < contador; i++) {
            suma += notas[i];
        }
        return suma / contador;
    }

    public static int susp(float[] notas, int contador) {
        int cont = 0;
        for (int i = 0; i < contador; i++) {
            if (notas[i] < 5) {
                cont++;
            }
        }
        return cont;
    }

    public static float max(float[] notas, int contador) {
        float max = 0;
        for (int i = 0; i < contador; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }
        return max;
    }
}
