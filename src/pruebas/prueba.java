package pruebas;

import java.util.Scanner;
import java.util.Random;

public class prueba {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random num = new Random();
		byte limit = 10;
		System.out.print("Introduce un número: ");
		byte busc = s.nextByte();
		byte randomN = (byte) num.nextInt(limit);
		
		
		if (randomN == busc) {
			System.out.print(randomN + " A la primera!");
		}
		// System.out.print("Escribe tu nombre: ");
		// String nombre = s.nextLine();
		
		/* for (byte i = 0; i < 5; i++) {
			System.out.println("Tu nombre es "+ nombre);
		} */
		
		
		while (randomN != busc) {
			randomN = (byte) num.nextInt(limit);
			if (randomN == busc) {
				System.out.print(randomN + "  Este sí.");
			}
			else {
				System.out.println(randomN + " " + " No es este.");
			}
		}
		s.close();
	}

}
