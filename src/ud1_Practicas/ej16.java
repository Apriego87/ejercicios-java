package ud1_Practicas;

import java.util.Scanner;

public class ej16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		float num = scan.nextFloat();
		scan.close();
		System.out.println("Billetes de 500€: " + (int) (num / 500));
		System.out.println("Billetes de 200€: " + (int) (num % 500 / 200));
		System.out.println("Billetes de 100€: " + (int) (num % 500 % 200 / 100));
		System.out.println("Billetes de 50€: " + (int) (num % 500 % 200 % 100 / 50));
		System.out.println("Billetes de 20€: " + (int) (num % 500 % 200 % 100 % 50 / 20));
		System.out.println("Billetes de 10€: " + (int) (num % 500 % 200 % 100 % 50 % 20 / 10));
		System.out.println("Billetes de 5€: " + (int) (num % 500 % 200 % 100 % 50 % 20 % 10 / 5));
		System.out.println("Monedas de 1€: " + (int) (num % 500 % 200 % 100 % 50 % 20 % 10 % 5));
	}

}
