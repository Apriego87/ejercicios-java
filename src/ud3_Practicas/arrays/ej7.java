package ud3_Practicas.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        int[] nums = new int[15];
        leer(nums);
        print(nums,nums.length);
    }

    public static void leer(int[] nums) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introducción de elementos en el array.\n");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Introduce un número: ");
            nums[i] = scan.nextInt();
        }
        scan.close();
    }

    public static void print(int[] nums, int n) {
        int i, j;
        for (i = 0; i < n / 2; i++) {
            j = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = j;
        }
  
        System.out.println("Array invertido: \n" + Arrays.toString(nums));
    }
}
