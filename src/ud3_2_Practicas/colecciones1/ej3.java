package ud3_2_Practicas.colecciones1;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    }

    public static Libro leerLibro(Scanner scan){
        Libro libro = new Libro();
        System.out.println("Introduce el título: ");
        libro.setTitulo(scan.nextLine());

        System.out.println("Nif, edad, nombre, apellidos: ");
        return libro;
    }
}
