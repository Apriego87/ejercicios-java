package ud3_Practicas.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        int[] leer = leer();
        System.out.println(Arrays.deepToString(comprobar(crearArray(leer), leer)).replace("],", "],\n"));
    }

    public static int[] leer() {
        Scanner scan = new Scanner(System.in);

        int[] size = new int[2];

        System.out.print("Cuántas filas?: ");
        size[0] = scan.nextInt();

        System.out.print("Cuántas columnas: ");
        size[1] = scan.nextInt();

        return size;
    }

    public static int[][] crearArray(int[] size) {
        Scanner scan = new Scanner(System.in);
        int[][] nums = new int[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            System.out.printf("Fila %d\n", i + 1);
            for (int j = 0; j < size[1]; j++) {
                System.out.printf(" Introduce el dato %d: ", j + 1);
                nums[i][j] = scan.nextInt();
            }
        }

        scan.close();        

        return nums;
    }

    public static int[][] comprobar(int[][] nums, int[] size) {
        int[][] trasp = new int[size[0]][size[1]];

        for(int i = 0; i < trasp.length; i++){
            for (int j = 0; j < trasp[i].length; j++){
                trasp[i][j] = nums[j][i];
            }
        }

        return trasp;
    }
}
