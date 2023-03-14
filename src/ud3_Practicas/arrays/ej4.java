package ud3_Practicas.arrays;

import java.util.Arrays;

public class ej4 {
    public static void main(String[] args) {
        char[] arr = new char[10];
        arr[0] = 'a';
        arr[1] = 'x';
        arr[4] = '@';
        arr[6] = ' ';
        arr[7] = '+';
        arr[8] = 'Q';

        System.out.print(Arrays.toString(arr));

        System.out.println("\nLos elementos no inicializados se muestran como espacios vacíos.");
    }
}
