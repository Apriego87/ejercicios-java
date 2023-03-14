package ud3_2_Practicas.colecciones3;

import ud3_2_Practicas.arraylists.Lugar;
import ud3_2_Practicas.clases.*;

public class ej1 {
    public static void main(String args[]) {
    Persona p1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
      Fecha f1 = new Fecha(16,11,2001);
      Lugar l1 = new Lugar("Madrid", "España");
      Libro libro = new Libro("Introduction to Java Programming", p1, "0-13-031997-X", 370, 3, "McGraw Hill", l1, f1);

    Libro l4 = new Libro();
}
