package repasoEx1Enero.RepasoColeccionesAlumnos.src._04ordenando;

//Diciembre 2019 - Alberto Carrera
//Repaso colecciones vistas hasta ahora

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Banco {
	private ArrayList<Cuenta> listaCuentas;

	public Banco() {
		listaCuentas = new ArrayList<Cuenta>();
	}

	public void annadirCuenta(Cuenta c) {
		listaCuentas.add(c);
	}

	public void mostrarCuentas() {
		for (int i = 0; i < listaCuentas.size(); i++)
			listaCuentas.get(i).imprimeCuenta();
	}// de mostrarCuentas

	public void ordenacionPorNumero() {
		Collections.sort(listaCuentas);
	}

	public void ordenacionPorTitular() {
		// Utilizar m�todo Collections.sort pero como segundo argumento se emplea un
		// objeto de la clase NombreComparator
		Collections.sort(listaCuentas, new NombreComparator());
	}

	public void ordenacionPorSaldo() {
		listaCuentas = listaCuentas.stream().sorted((x, y) -> (int) (x.getSaldo() - y.getSaldo()))
				.collect(Collectors.toCollection(ArrayList::new));

		/*
			Este método ordena una lista de objetos de la clase Cuenta por el saldo de cada uno de ellos. El método realiza los siguientes pasos:

			1. Utiliza el método stream() de la clase ArrayList para crear un flujo de elementos a partir de la lista de cuentas.

			2. Utiliza el método sorted() para ordenar los elementos de la lista según el saldo de cada cuenta. El método sorted() recibe como parámetro una función de comparación (x, y) -> (int) (x.getSaldo() - y.getSaldo()), la cual retorna un entero resultado de restar el saldo de la cuenta x menos el saldo de la cuenta y.

			3. Utiliza el método collect() para recolectar los elementos del flujo ordenados y crear una lista nueva, utilizando la función ArrayList::new
		*/
	}

}// de Banco
