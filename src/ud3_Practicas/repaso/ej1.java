package ud3_Practicas.repaso;

import java.util.Arrays;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        int[] nums = new int[10];

        leer(nums);

        System.out.println(Arrays.toString(nums));

        int[] max = valorMax(nums);
        int[] min = valorMin(nums);

        System.out.printf("El valor máximo es %d, posición %d.\n", max[0], max[1]);
        System.out.printf("El valor mínimo es %d, posición %d.", min[0], min[1]);

        
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

    public static int[] valorMax(int[] nums) {
        int max = nums[0];
        int pos = 0;
        for (int i = 1; i < 10; i++){
            if (nums[i] > max){
                max = nums[i];
                pos = i;
            }
        }
        return new int[]{max,pos};
    }

    public static int[] valorMin(int[] nums) {
        int min = nums[0];
        int pos = 0;
        for (int i = 1; i < 10; i++){
            if (nums[i] < min){
                min = nums[i];
                pos = i;
            }
        }
        return new int[]{min,pos};
    }
}
