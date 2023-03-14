package ud3_2_Practicas.colecciones3;
// PruebaListaLibros.java: prueba de la clase ArrayListLibros

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ud3_2_Practicas.arraylists.Lugar;
import ud3_2_Practicas.clases.*;

public class PruebaArrayListLibros {
  public static void main(String args[]) {
    Persona p1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
    Fecha f1 = new Fecha(16, 11, 2001);
    Lugar l1 = new Lugar("Madrid", "España");

    Libro libro1 = new Libro("Introduction to Java Programming", p1, "0-13-031997-X", 370, 3, "McGraw Hill", l1, f1);

    Libro libro2 = new Libro("Beginning Java", p1,
        "0-13-031997-X", 516, 3, "insertarison", l1, f1);
    Libro libro3 = new Libro("Avanzado Java", p1,
        "0-13-031997-X", 546, 3, "McGraw-Hill", l1, f1);

    // ArrayListLibros a = new ArrayListLibros();
    ArrayList<Libro> a = new ArrayList<Libro>();
    a.add(libro1);
    a.add(libro2);
    a.add(libro3);

    /* Collections.sort(a, new PaginasComparator()); */

    Collections.sort(a, new PaginasComparator());
    //

    System.out.printf("Ordenadas por Nº de páginas:\n" + a + "\n\n");

    Collections.sort(a, new TituloComparator());
    System.out.printf("Ordenadas por título (alfabético):\n" + a);

    /*
     * int indice=a.buscar("AVANZADO");
     * System.out.println(indice+1);
     * if (indice != -1) {
     * l3 = a.recuperar(indice+1);
     * System.out.println(l3);
     * }
     * else
     * System.out.println("No encontrado");
     * 
     * /* a.eliminar(2);
     * System.out.println("Tras eliminar el 2 \n");
     * System.out.println(a);
     */
  }
}