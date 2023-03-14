package ud3_2_Practicas.colecciones3;

import java.util.Comparator;

import ud3_2_Practicas.clases.*;

class PaginasComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Libro l1 = (Libro) o1;
        Libro l2 = (Libro) o2;
        return l1.getPaginas() - l2.getPaginas();
    }

    public boolean equals(Object o) {
        return this == o;
    }
}
