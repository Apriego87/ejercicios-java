package ud3_2_Practicas.arraylists;

import java.util.ArrayList;
import java.util.Iterator;

public class Lista {
    private ArrayList<Libro> lista;

    public Lista() {
        lista = new ArrayList<Libro>();
    }

    public boolean vacia() {
        return lista.isEmpty();
    }

    public int size() {
        return lista.size();
    }

    public void insertar(Libro libro) {
        lista.add(libro);
    }

    public Libro borrarPorPos(int pos) {
        if (pos < 0 || pos > lista.size()) {
            return null;
        } else {
            return lista.remove(pos - 1);
        }
    }

    public Libro getPorPos(int pos){
        if (pos < 0 || pos > lista.size()){
            return null;
        }
        else {
            return lista.get(pos - 1);
        }
    }

    public ArrayList<Integer> getPorTit(String tit){
        ArrayList<Integer> posiciones = new ArrayList<Integer>();
        int cont = 0;
        for (int i = 0; i < lista.size(); i++){
            if(lista.get(i).getTitulo().toLowerCase().contains(tit.toLowerCase())){
                posiciones.add(i+1);
                cont++;
            }
        }
        if (cont == 0){
            posiciones.add(-1);
        }
        return posiciones;
    }

    @Override
    public String toString() {
        /*
        String mensaje;
        if (vacia()){
            return "La lista de libros está vacía.";
        }

        mensaje = size() + " libro(s) en la lista: \n";

        for (int i = 0; i < size(); i++){
            mensaje += lista.get(i) + "\n--------------------\n";
        }

        return mensaje; */

        String cad = lista.size() + " elementos en la lista: \n";

        Iterator it = lista.iterator();

        while (it.hasNext()){
            cad += it.next() + "-----------------------------------";
        }
        return cad;
    }
}
