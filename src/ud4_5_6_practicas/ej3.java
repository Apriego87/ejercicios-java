package ud4_5_6_practicas;

import java.util.StringTokenizer;

public class ej3 {
    public static void main(String[] args) {
        String nombre = "Antonio Priego Díaz";

        // System.out.println("Método 1: " + metodo1(nombre));
        System.out.printf("Método 1:\n Nombre: %s\n Apellido 1: %s\n Apellido 2: %s", metodo2(nombre)[0], metodo2(nombre)[1], metodo2(nombre)[2]);
        System.out.println("\n");
        System.out.printf("Método 2:\n Nombre: %s\n Apellido 1: %s\n Apellido 2: %s", metodo2(nombre)[0], metodo2(nombre)[1], metodo2(nombre)[2]);
    }

    public static String[] metodo1(String nombre){
        StringTokenizer partes = new StringTokenizer(nombre, " ");

        String[] x = new String [partes.countTokens()];

        for(int i = 0; i < partes.countTokens(); i++){
            x[i] = partes.nextToken().toString();
        }

        return x;
    }

    public static String[] metodo2(String nombre){
        String partes[] = nombre.split(" ");

        return partes;
    }
}
