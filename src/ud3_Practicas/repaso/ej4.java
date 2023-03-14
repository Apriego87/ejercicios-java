package ud3_Practicas.repaso;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Cuántas personas sois?: ");

        int personas = scan.nextInt();
        
        while (personas < 0){
            System.out.print("El número introducido debe ser entero y positivo.\nPrueba otra vez: ");
            personas = scan.nextInt();
        }

        float [] alturas = new float[personas];
        
        leer(alturas);

        float[] valores = mediaAlt(alturas);

        System.out.printf(" Altura media: %.2f \n Superiores o iguales a la media: %d \n Inferiores a la media: %d", valores[0], (int)valores[1], (int)valores[2]);
    }

    public static void leer(float[] alturas) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introducción de alturas.");

        for (int i = 0; i < alturas.length; i++){
            System.out.print("Introduce la altura: ");
            alturas[i] = scan.nextFloat();
        }
        scan.close();
    }

    public static float[] mediaAlt(float[] alturas) {
        float suma = 0;
        int supMedia = 0, infMedia = 0;

        for (int i = 0; i < alturas.length; i++){
            suma += alturas[i];
        }

        float media = suma / alturas.length;

        for (int i = 0; i < alturas.length; i++){
            if (alturas[i] >= media){
                supMedia++;
            }
            if (alturas[i] < media){
                infMedia++;
            }
        }
        return new float[]{media, supMedia, infMedia};
    }
}
