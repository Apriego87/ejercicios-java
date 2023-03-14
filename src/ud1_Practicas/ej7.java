package ud1_Practicas;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el precio en dólares: ");
		double dol = scan.nextDouble();
		scan.close();

		System.out.println("El equivalente en euros es: " + dol / 0.96);
	}

}
