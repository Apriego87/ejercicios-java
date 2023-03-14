package ud3_2_Practicas.colecciones3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.tools.DiagnosticCollector;

public class pruebaHashMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Traductor diccionario = new Traductor();

        diccionario.insertar("hola", "hello");
        diccionario.insertar("coche", "car");
        diccionario.insertar("pájaro", "bird");
        diccionario.insertar("luz", "light");
        diccionario.insertar("ordenador", "computer");
        diccionario.insertar("perro", "dog");
        diccionario.insertar("profesor", "teacher");
        diccionario.insertar("bombilla", "lightbulb");
        diccionario.insertar("cielo", "sky");
        diccionario.insertar("colegio", "school");
        diccionario.insertar("bebida", "drink");
        diccionario.insertar("cama", "bed");
        diccionario.insertar("casa", "house");
        diccionario.insertar("teclado", "keyboard");
        diccionario.insertar("gato", "cat");
        diccionario.insertar("cuadrado", "square");
        diccionario.insertar("reloj", "clock");
        diccionario.insertar("mesa", "table");
        diccionario.insertar("silla", "chair");
        diccionario.insertar("tijeras", "scissors");

        System.out.println(traducir(scan, diccionario));
    }

    public static String traducir (Scanner scan, Traductor diccionario){
        System.out.print("Introduce una palabra en español: ");
        return diccionario.sacar(scan.next());
    }

    public static void inter(Traductor diccionario, Scanner scan){
        for ( String key : diccionario.keySet()){}
    }
}
