package repasoEx1Enero.RepasoColeccionesAlumnos.src._01arraylist;

//Diciembre 2019 - Alberto Carrera
//Repaso colecciones vistas hasta ahora

import java.util.ArrayList;
import java.util.Iterator;

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

	public boolean borrarCuentaPorNumero(long c) { // Borrar cuenta por n�mero de cuenta
		// NO HAY PROBLEMA EN NO USAR ITERATOR a la hora de recorrer listaCuentas,
		// PUES EN EL MOMENTO EN QUE LA ENCUENTRO PARO y DEVUELVO TRUE
		// La instrucci�n siguiente al bucle anterior se ejecutar� si no ha encontrado
		// la cuenta. Poner all� return false
		for(Cuenta ac : listaCuentas){
			if(ac.getNumero() == c){
				listaCuentas.remove(ac);
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
		// Muy parecido al del paquete __00arrays
		String cuentas = "Cuentas encontradas:\n";
		for(Cuenta ac : listaCuentas){
			if(ac.getNombre().equalsIgnoreCase(n)){
				cuentas += ac + "\n";
			}
		}
		return cuentas;
	}// de buscarPorNombre

	public void mostrarCuentas() {
		// Id�ntico al del paquete __00arrays
		for(Cuenta ac : listaCuentas){
			System.out.println(ac);
		}
	}// de mostrarCuentas

}// de Banco
