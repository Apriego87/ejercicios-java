package ej1pag4;

import java.util.Stack;

public class StackPalabras {
    private Stack<String> pila;

    public StackPalabras(){
        pila = new Stack<String>();
    }

    public boolean vacia(){
        return pila.isEmpty();
    }

    public void apilar(String word){
        pila.push(word);
    }

    public String desapilar(){
        return pila.pop();
    }

    public String lastWord(){
        return pila.peek();
    }

}
