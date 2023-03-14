package ud3_2_Practicas.colecciones3;

import java.util.TreeSet;

import ud3_2_Practicas.clases.*;

public class TreeSetLibros {
    TreeSet<Libro> lista = new TreeSet<Libro>();

    public int length(){
        return lista.size();
    }

    public void insertar(Libro libro){
        lista.add(libro);
    }

    public void eliminar(Libro libro){
        lista.remove(libro);
    }

    public boolean contiene(Libro libro){
        return lista.contains(libro);
    }

    public void busPorTit(String tit){
        for(Libro l: lista){
            if(l.getTitulo().toLowerCase().contains(tit.toLowerCase())){
                System.out.println(l);
            }
        }
    }

    public String toString(){
        String cadena = lista.size() + " elementos encontrados: \n\n";
        for(Libro l: lista){
            System.out.println(l);
        }
        return cadena;
    }
}
