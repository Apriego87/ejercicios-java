package _04ordenando_colecciones;
import java.util.ArrayList;
import java.util.Collections;
public class PruebaPerson {
    public static void main(String arg[]) {

        Person p1 = new Person(1,"Maria",185);
        Person p2 = new Person(2,"Carla",190);
        Person p3 = new Person(3,"Yovana",170);

        System.out.println(p1.compareTo(p2));

        /* ArrayList<Person> listaPersonas = new ArrayList<Person>();
        listaPersonas.add(new Person(1,"Maria",185));
        listaPersonas.add(new Person(2,"Carla",190));
        listaPersonas.add(new Person(3,"Yovana",170));
        Collections.sort(listaPersonas);  // Ejemplo uso ordenaci�n natural
        System.out.println("Personas Ordenadas por orden natural: "+listaPersonas); */
      } 
}