package ud3_Practicas.arrays;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        leer(nums);
        print(nums);
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

    public static int min(int[] nums) {
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                min = nums[i];
            } else {
                if (nums[i] < min) {
                    min = nums[i];
                }
            }
        }
        return min;
    }

    public static int max(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0) {
                max = nums[i];
            } else {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
        }
        return max;
    }

    public static void print(int[] nums) {
        System.out.println("\nRESULTADO:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);

            if (nums[i] == min(nums)) {
                System.out.print("\tmínimo");
            }

            if (nums[i] == max(nums)) {
                System.out.print("\tmáximo");
            }

            System.out.println("");
        }
    }
}