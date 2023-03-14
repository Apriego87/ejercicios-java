package ud1_Practicas;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce la Tª en Fahrenheit: ");
		float fahr = scan.nextFloat();
		scan.close();

		System.out.printf("La Tª en Celsius es: %.1f ºC.", ((float) 5 / 9 * (fahr - 32)));
	}

}
