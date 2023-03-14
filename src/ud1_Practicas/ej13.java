package ud1_Practicas;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce 3 números enteros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		scan.close();

		System.out.print((num1 < num2) && (num2 < num3));

	}

}