package ud1_Practicas;

import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int num = scan.nextInt();
		scan.close();

		System.out.print(num % 2 == 0);
	}

}
