package ud1_Practicas;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce la longitud de la habitación: ");
		double longit = scan.nextDouble();

		System.out.print("Introduce el ancho de la habitación: ");
		double ancho = scan.nextDouble();

		scan.close();

		System.out.printf("La superficie de la habitación es de %.4f metros cuadrados.", longit * ancho);
	}

}
