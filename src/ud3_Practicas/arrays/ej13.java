package ud3_Practicas.arrays;

import java.io.PrintStream;
import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        double[][] notas = { { 5.6, 9.4, 6.8, 7 },
                { 6.9, 5.2, 5.7, 6.3 },
                { 9.8, 7, 7.6, 8.5 } };

        metA(notas);
        metB(notas);
        metC(notas);
        metD(notas);
    }

    public static void metA(double[][] notas) {
        double media = 0;
        System.out.printf("\nPOR ALUMNO\n");
        for (int i = 0; i < notas.length; i++) {
            double suma = 0, min = notas[i][0], max = notas[i][0];
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];

                if (notas[i][j] > max) {
                    max = notas[i][j];
                }

                if (notas[i][j] < min) {
                    min = notas[i][j];
                }
            }

            media = suma / notas[i].length;

            System.out.printf(" Nota media: %.3f \t Nota máxima: %.3f \t Nota mínima: %.3f \n", media, max, min);
        }
    }

    public static void metB(double[][] notas) {
        double media = 0;
        System.out.print("\nPOR ASIGNATURA\n");
        for (int i = 0; i < notas[0].length; i++) {
            double suma = 0, min = notas[0][i], max = notas[0][i];
            for (int j = 0; j < notas.length; j++) {
                suma += notas[j][i];
                if (notas[j][i] > max) {
                    max = notas[j][i];
                }

                if (notas[j][i] < min) {
                    min = notas[j][i];
                }
            }

            media = suma / notas.length;

            System.out.printf(" Nota media: %.3f \t Nota máxima: %.3f \t Nota mínima: %.3f \n", media, max, min);
        }
    }

    public static void metC(double[][] notas) {
        double suma = 0;
        int cont = 0;
        double max = notas[0][0], min = notas[0][0];
        System.out.printf("\nTOTAL\n");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
                if (notas[i][j] > max) {
                    max = notas[i][j];
                }

                if (notas[i][j] < min) {
                    min = notas[i][j];
                }
                cont++;
            }
        }

        double media = suma / cont;
        System.out.printf(" Nota media: %.3f \t Nota máxima: %.3f \t Nota mínima: %.3f \n", media, max, min);
    }

    public static void metD(double[][] notas) {
        System.out.printf("\nBÚSQUEDA");
        System.out.printf("\nIntroduce una nota: ");
        Scanner scan = new Scanner(System.in);

        double nota = scan.nextDouble();

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] == nota) {
                    System.out.printf(" Alumno: %d \t Materia: %d\n", i + 1, j + 1);
                }
            }
        }
    }

}
