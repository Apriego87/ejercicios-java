package ud3_2_Practicas.colecciones3;

import ud3_2_Practicas.clases.*;

import java.util.Scanner;

import ud3_2_Practicas.arraylists.Lugar;

public class pruebaHashLibros {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                Persona p1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
                Fecha f1 = new Fecha(16, 11, 2001);
                Lugar l1 = new Lugar("Madrid", "España");

                Libro libro1 = new Libro("Introduction to Java Programming", p1, "0-13-031997-X", 370, 3, "McGraw Hill",
                                l1,
                                f1);

                Libro libro2 = new Libro("Beginning Java", p1,
                                "0-13-031997-X", 516, 3, "insertarison", l1, f1);
                Libro libro3 = new Libro("Avanzado Java", p1,
                                "0-13-031997-X", 546, 3, "McGraw-Hill", l1, f1);

                HashSetLibros a = new HashSetLibros();

                System.out.println(a.length());

                a.insertar(libro1);
                a.insertar(libro2);
                a.insertar(libro3);

                System.out.println(a.length());

                a.eliminar(libro1);

                // System.out.println(a);

                a.busPorTit(elTitulo(scan));

        }

        public static String elTitulo(Scanner scan) {
                System.out.print("Introduce el título: ");
                return scan.next();
        }
}
