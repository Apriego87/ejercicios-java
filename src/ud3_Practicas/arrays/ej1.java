package ud3_Practicas.arrays;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            arr[i] = scan.nextInt();
        }

        scan.close();

        for (int j = 9; j >= 0; j--) {
            System.out.print(arr[j] + "\t");
        }
    }
}
