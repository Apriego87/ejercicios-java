package ej1pag4;

import java.util.LinkedList;

public class PilaPalabras {
    private LinkedList<String> pila;

    public PilaPalabras() {
        pila = new LinkedList<>();
    }

    public class pruebaPila {
        PilaPalabras pila = new PilaPalabras();
    }
    
    public void apilar(String word){
        pila.add(word);
    }

    public boolean vacia(){
        return pila.isEmpty();
    }

    public String desapilar(){
        return "terminar";
    }

    public String lastWord(){
        return "sacar palabra sin borrar";
    }

}
