package ud1_Practicas;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		int num1 = scan.nextInt();

		System.out.print("Introduce otro número entero: ");
		int num2 = scan.nextInt();

		scan.close();

		System.out.print(num1 < num2);
	}

}
