package _03colecciones2;

import java.util.Comparator;

public class TituloComparator implements Comparator<Libro> {

    @Override
    public int compare(Libro o1, Libro o2) {
        // TODO Auto-generated method stub
        return o1.dameTitulo().compareToIgnoreCase(o2.dameTitulo());
    }
    
}
