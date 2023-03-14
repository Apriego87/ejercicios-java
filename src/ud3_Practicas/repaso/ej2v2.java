package ud3_Practicas.repaso;

import java.util.Scanner;

public class ej2v2 {
    public static void main(String[] args) {
        int[] nums = new int[10];

        leer(nums);

        int[] valores = valores(nums);

        System.out.printf("\n Positivos: %d \n Negativos: %d \n Ceros: %d", valores[0], valores[1], valores[2]);
    }

    public static void leer(int[] nums) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introducción de variables: ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Introduce un entero: ");
            nums[i] = scan.nextInt();
        }
        scan.close();
    }

    public static int[] valores(int[] nums) {
        int pos = 0, neg = 0, zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos++;
            }
            if (nums[i] < 0) {
                neg++;
            }
            if (nums[i] == 0) {
                zero++;
            }
        }
        return new int[] { pos, neg, zero };
    }
}
