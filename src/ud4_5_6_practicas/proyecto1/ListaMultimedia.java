package ud4_5_6_practicas.proyecto1;

import java.util.ArrayList;

public class ListaMultimedia {
    private ArrayList<Multimedia> lista;

    public ListaMultimedia(){
        lista = new ArrayList<Multimedia>();
    }

    public void newItem(Multimedia item){
        lista.add(item);
    }

    public int length(){
        return lista.size();
    }

    public Multimedia sacar(int item){
        return lista.get(item);
    }

    public String toString(){
        String cadena = lista.size() + " elementos encontrados: \n";
        for(Multimedia l: lista){
            cadena += "\n" + (l) + "\n";
        }
        return cadena;
    }

}
