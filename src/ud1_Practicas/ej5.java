package ud1_Practicas;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		final double pi = 3.1416;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el radio del círculo: ");
		double radio = scan.nextDouble();
		scan.close();
		
		System.out.println("El área del círculo es: " + (pi * Math.pow(radio, 2)));
	}

}
