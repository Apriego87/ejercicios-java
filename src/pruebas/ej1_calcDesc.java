package pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej1_calcDesc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		byte desc = 0;
		float precio = 0;
		
		try {
			System.out.print("Escribe el precio del producto: ");
			precio = scan.nextFloat();

			System.out.print("Escribe el descuento a aplicar: ");
			
			desc = (byte) scan.nextByte();
			scan.close();

			// System.out.print(precio + " " + ((float)desc/100));

			float precioF = precio * (1 - ((float) desc / 100));

			System.out.print("El precio final es de " + ((float) Math.round(precioF * 100) / 100) + "€.");
		} 
		
		catch (InputMismatchException ex) {
			System.out.print("ERROR AL INTRODUCIR EL VALOR. (El precio puede ser un número con decimales, el descuento no.)");
		}
	}

}
