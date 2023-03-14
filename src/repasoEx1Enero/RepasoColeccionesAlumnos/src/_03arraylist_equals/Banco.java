package repasoEx1Enero.RepasoColeccionesAlumnos.src._03arraylist_equals;

//Diciembre 2019 - Alberto Carrera
//Repaso colecciones vistas hasta ahora

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cuenta> listaCuentas;

	public Banco() {
		listaCuentas = new ArrayList<Cuenta>();
	}

	public int tamanyo() {
		return listaCuentas.size();
	}

	public void annadirCuenta(Cuenta c) {
		listaCuentas.add(c);
	}

	public boolean borrarCuenta(Cuenta c) {
		return listaCuentas.remove(c);

	} // de borrarCuenta

	public boolean borrarCuentaPorNumero(long c) { // Borrar cuenta por n�mero
		for (int i = 0; i < listaCuentas.size() - 1; i++) {
			if (listaCuentas.get(i).getNumero() == c) {
				listaCuentas.remove(listaCuentas.get(i));
				return true;
			}
		}

		return false;

	}
	// de borrarCuentaPorNumero

	public boolean contieneCuenta(Cuenta c) {
		return listaCuentas.contains(c);
	}// de contieneCuenta

	public boolean contieneCuentaMejorado(Cuenta c) {
		for (int i = 0; i < listaCuentas.size(); i++) {
			if (listaCuentas.get(i).equals(c)) {
				return true;
			}
		}
		return false;
	}
	//

	public String buscarPorNombre(String n) {
		String cuentas = "Lista de cuentas:\n";
		for (Cuenta c : listaCuentas) {
			if (c.getNombre().toLowerCase().contains(n.toLowerCase())) {
				cuentas += c + "\n";
			}
		}
		return cuentas;

	}// de buscarPorNombre

	public void mostrarCuentas() {
		for (Cuenta c : listaCuentas) {
			System.out.println(c);
		}
	}// de mostrarCuentas

}// de Banco
