package ud3_2_Practicas.colecciones3;

import java.util.HashSet;

import ud3_2_Practicas.clases.*;

// Repaso ArrayList

public class HashSetLibros {
  // private final static int MAX = 100; no tiene sentido....
  private HashSet<Libro> lista = new HashSet<Libro>();

  public boolean vacia() {
    return lista.isEmpty();
  }

  public int length() {
    return lista.size();
  }

  public void insertar(Libro libro) {
    lista.add(libro);
  }

  public void eliminar(Libro libro) {
    lista.remove(libro);
  }

  public boolean buscar(Libro libro) {
    return lista.contains(libro);
  }

  public void busPorTit(String tit) {
      for (Libro l: lista){
        if(l.getTitulo().toLowerCase().contains(tit.toLowerCase())){
          System.out.println(l);
          
        }
      }
  }

  public String toString() {
    // Iterator value = lista.iterator();
    String cad = lista.size() + " Elementos de la lista:\n\n";
    for (Libro l: lista){
      cad += l;
    }
    return cad;
  }

}