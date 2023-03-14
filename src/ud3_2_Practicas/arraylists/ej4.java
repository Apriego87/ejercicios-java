package ud3_2_Practicas.arraylists;
import ud3_2_Practicas.clases.*;


public class ej4 {
    public static void main(String[] args) {
        Persona p1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
        Fecha f1 = new Fecha(16, 11, 2001);
        Lugar    lugar1 = new Lugar("Madrid", "España");
        Libro libro1 = new Libro("Introducción a Java", p1,
                "0-13-031997-X", 546, 3, "Prentice-Hall", lugar1, f1);

        Libro libro2 = new Libro("Beginning Java", p1,
                "0-13-031997-Y", 546, 3, "Addison", lugar1, f1);
        Libro libro3 = new Libro("Avanzado Java", p1,
                "0-13-031997-Z", 546, 3, "McGraw-Hill", lugar1, f1);

        Lista lista = new Lista();

        lista.insertar(libro1);
        lista.insertar(libro2);
        lista.insertar(libro3);

        System.out.println(lista);
        /* System.out.println(lista.getPorTit("Java"));
        System.out.println(lista.borrarPorPos(1)); */
    }
}
