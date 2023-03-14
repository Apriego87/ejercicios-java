package ud1_Practicas;

import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce el tiempo en segundos: ");
		int sec = scan.nextInt();
		scan.close();

		int horas = sec / 3600;
		int minutos = sec % 3600 / 60;
		int segundos = sec % 3600 % 60;

		System.out
				.println("El equivalente es: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
	}

}
