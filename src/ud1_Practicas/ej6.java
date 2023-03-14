package ud1_Practicas;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el precio en euros: ");
		double eur = scan.nextDouble();
		scan.close();

		System.out.println("El equivalente en dólares es: " + eur * 0.96);
	}

}
