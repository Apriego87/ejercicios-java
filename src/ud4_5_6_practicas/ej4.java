package ud4_5_6_practicas;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        String texto = "", buscar, reemplazar;

        Scanner scan = new Scanner(System.in);

        texto = "Escribe un programa que a partir de un String texto, una palabra a buscar y otra a reemplazar, cree y visualice un nuevo texto con la palabra reemplazada. Utiliza el método replaceAll de la clase String (averigua antes su funcionamiento).";
        System.out.println("\nEl texto de ejemplo:\n" + texto);

        System.out.print("\nQué palabra quieres buscar?: ");
        buscar = scan.next();

        System.out.print("\nQué palabra quieres poner en su lugar?: ");
        reemplazar = scan.next();

        System.out.println("\nEl texto final: " + texto.replaceAll(buscar, reemplazar));
    }
}
