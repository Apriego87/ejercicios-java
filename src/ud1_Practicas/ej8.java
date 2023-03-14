package ud1_Practicas;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un valor: ");
		String val1 = scan.next();

		System.out.print("Introduce otro valor: ");
		String val2 = scan.next();
		scan.close();

		System.out.println("Valor 1: '" + val1 + "', Valor 2: '" + val2 + "'.");

		String valRes = val1;
		val1 = val2;
		val2 = valRes;

		System.out.println("Valor 1: '" + val1 + "', Valor 2: '" + val2 + "'.");
	}

}
