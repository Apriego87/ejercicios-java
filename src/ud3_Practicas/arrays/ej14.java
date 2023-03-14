package ud3_Practicas.arrays;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        System.out.println(comprobar(crearArray(leer())));
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
            for (int j = 0; j < size[1]; j++) {
                System.out.printf("Introduce el dato %d: ", j + 1);
                nums[i][j] = scan.nextInt();
            }
        }

        scan.close();

        return nums;
    }

    public static boolean comprobar(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] != nums[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
