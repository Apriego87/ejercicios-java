package ud3_2_Practicas.colecciones3;

import java.util.Comparator;
import ud3_2_Practicas.clases.*;

public class TituloComparator implements Comparator<Libro> {

    @Override
    public int compare(Libro o1, Libro o2) {

        return o1.getTitulo().compareTo(o2.getTitulo());
    }

}
