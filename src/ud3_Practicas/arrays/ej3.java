package ud3_Practicas.arrays;

import java.util.Arrays;

public class ej3 {
    public static void main(String[] args) {
        int[] arr = new int[12];
        arr[0] = 39;
        arr[1] = -2;
        arr[4] = 0;
        arr[6] = 14;
        arr[8] = 5;
        arr[9] = 120;

        System.out.print(Arrays.toString(arr));

        System.out.println("\nLos elementos no inicializados se muestran como un 0.");
    }
}
