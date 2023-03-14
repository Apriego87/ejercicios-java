package ud1_Practicas;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		final byte year = 12;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un mes (en número): ");
		byte mes = scan.nextByte();
		scan.close();
		
		System.out.println("Mes " + mes + " de " + year + ".");
		
		System.out.println("Porcentaje transcurrido: " + ((float)(mes * 100))/year);
	}

}
