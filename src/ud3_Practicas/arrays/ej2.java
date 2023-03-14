package ud3_Practicas.arrays;

import java.util.Arrays;

public class ej2 {
    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));
    }
}
