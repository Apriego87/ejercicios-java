package ud3_Practicas.repaso;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        int[] nums = new int[10];

        leer(nums);

        float valores[] = medias(nums);

        System.out.printf(" Media de los positivos: %f \n Media de los negativos: %f", valores[0], valores[1]);
    }

    public static void leer(int[] nums) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introducción de variables: ");

        for (int i = 0; i < nums.length; i++){
            System.out.print("Introduce un entero: ");
            nums[i] = scan.nextInt();
        }
        scan.close();
    }

    public static float[] medias(int[] nums) {
        float medPos = 0, medNeg = 0;
        int contPos = 0, contNeg = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                medPos += nums[i];
                contPos++;
            }
            if (nums[i] < 0){
                medNeg += nums[i];
                contNeg++;
            }
        }
        return new float[]{(medPos / contPos), (medNeg / contNeg)};
    }
}
