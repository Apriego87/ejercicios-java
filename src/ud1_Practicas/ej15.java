package ud1_Practicas;

import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce una letra: ");
		char letra = (char) scan.nextLine().charAt(0);
		scan.close();
		System.out.println("El código ASCII de " + letra + " es " + (int) letra);
		System.out.println("Los 3 siguientes caracteres son: " + (char) (letra + 1) + " - " + (char) (letra + 2) + " - "
				+ (char) (letra + 3));
	}

}
