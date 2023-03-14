package _03colecciones2;

import java.util.Comparator;

public class PaginasComparator implements Comparator<Libro> {

    @Override
    public int compare(Libro o1, Libro o2) {
        // TODO Auto-generated method stub
        return o1.getPaginas() - o2.getPaginas();
    }
    
}
