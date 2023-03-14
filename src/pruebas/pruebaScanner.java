package pruebas;

import java.util.Scanner;
import java.util.Random;

public class pruebaScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		byte limit = 10;
		byte goal = (byte) rand.nextInt(limit + 1);
		// System.out.println(goal);
		System.out.print("Escribe un número: ");
		
		byte num = scan.nextByte();	
		
		while (num != goal) {
			System.out.print("Incorrecto, introduce otro número: ");
			num = scan.nextByte();
		}
		
		scan.close();
		
		if (num == goal) {
			System.out.print("Correcto! El número aleatorio era " + goal);
		}
	}

}
