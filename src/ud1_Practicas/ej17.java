package ud1_Practicas;

import java.util.Scanner;

public class ej17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double cantidPrest, intAnual, intMensual, pagoMensual;
		int anyos, numPagos;

		System.out.print("Introduzca la cantidad prestada: ");
		cantidPrest = scan.nextDouble();

		System.out.print("Introduzca el interés anual en %: ");
		intAnual = scan.nextDouble();

		System.out.print("Introduzca el nº de años: ");
		anyos = scan.nextInt();

		scan.close();

		intMensual = intAnual / 100 / 12;
		numPagos = anyos * 12;

		pagoMensual = (cantidPrest * intMensual) / (1 - (1 / (Math.pow(1 + intMensual, numPagos))));

		System.out.println("------------------------------------------");
		System.out.println("Resultado de la operación: ");
		System.out.println("Cantidad prestada: " + cantidPrest + " euros.");
		System.out.println("Interés anual: " + intAnual + "%");
		System.out.println("Duración en años del préstamo: " + anyos);
		System.out.println("Número de pagos: " + numPagos);
		System.out.format("Pago mensual: %.2f euros. \r\n" , pagoMensual);
		System.out.println("Cantidad total a pagar: " + Math.round(pagoMensual * numPagos) + " euros.");
	}

}
