package ud1_Practicas;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		float num1 = scan.nextFloat();
		System.out.print("Introduce otro número: ");
		float num2 = scan.nextFloat();
		scan.close();
		
		System.out.println("La suma de ambos: " + (num1 + num2));
		System.out.println("La resta de ambos: " + (num1 - num2));
		System.out.println("La multiplicación de ambos: " + (num1 * num2));
		System.out.println("La división de ambos: " + (num1 / num2));
		System.out.println("El módulo de ambos: " + (num1 % num2));
		System.out.println("El postincremento del primero: " + num1++);
		System.out.println("El preincremento del primero: " + ++num1);
		System.out.println("El postincremento del segundo: " + num2++);
		System.out.println("El preincremento del segundo: " + ++num2);
	}

}
