package ud1_Practicas;

import java.util.Scanner;

public class ej15Mal {

	public static void main(String[] args) {
		char[] abcdario = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce una letra: ");
		char letra = scan.next().charAt(0);
		for (int i=0; i<abcdario.length;i++) {
			if (abcdario[i] == letra) {
				System.out.println("Código ASCII de " + letra + " es " + (i+65));
				System.out.print("Los 3 siguientes caracteres son: " + abcdario[i+1] + " - " + abcdario[i+2] + " - " + abcdario[i+3]);
			}
		}
	}

}
