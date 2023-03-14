package _03colecciones2;

import java.util.ArrayList;

public class MainEnvoltorio{
    public static void main(String[] args) {
        // ArrayList<int> coleccion;

        /* Integer i1 = new Integer(33);
        Double d1 = new Double(44.6);
        int i0 = 11;
        int i3 = i0;
        int i23;
        i23 = i1; */

        ArrayList<Integer> coleccion = new ArrayList<Integer>();

        coleccion.add(34);
        coleccion.add(12);
        coleccion.add(68);
        coleccion.add(55);

        System.out.println(coleccion);

        System.out.println(coleccion.contains(64));
        System.out.println(coleccion.indexOf(12));
    }
}