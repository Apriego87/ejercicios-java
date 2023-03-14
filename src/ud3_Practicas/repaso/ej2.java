package ud3_Practicas.repaso;

import java.util.Arrays;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        int[] nums = new int[10];

        leer(nums);

        System.out.printf("\n Positivos: %d \n Negativos: %d \n Ceros: %d.", pos(nums), neg(nums), zero(nums));
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

    public static int pos(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                pos++;
            }
        }

        return pos;
    }

    public static int neg(int[] nums) {
        int neg = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0){
                neg++;
            }
        }

        return neg;
    }

    public static int zero(int[] nums) {
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                zero++;
            }
        }

        return zero;
    }
}
