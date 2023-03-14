package ud3_2_Practicas.arraylists;



import java.util.Scanner;

import ud3_2_Practicas.clases.*;

public class ej3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Persona persona = new Persona();
        Lugar lugar = new Lugar();
        Fecha fecha = new Fecha();
        datosPersona(persona, scan, scan2);
        datosLugar(lugar, scan);
        datosFecha(fecha, scan);
        Libro libro = new Libro("Introduction to Java Programming", persona, "0-13-031997-X", 370, 3, "McGraw Hill", lugar, fecha);

        System.out.println();
    }

    public static Persona datosPersona(Persona persona, Scanner scan, Scanner scan2) {
        System.out.println("DATOS DEL AUTOR: ");
        System.out.print("\tIntroduce el nombre: ");
        persona.ponNombre(scan.next());

        System.out.print("\tIntroduce los apellidos: ");
        persona.ponApellidos(scan2.nextLine());
        System.out.println();

        return persona;
    }

    public static Lugar datosLugar (Lugar lugar, Scanner scan){
        System.out.println("DATOS DEL LUGAR: ");
        System.out.print("\tIntroduce la ciudad: ");
        lugar.setCiudad(scan.next());

        System.out.print("\tIntroduce el país: ");
        lugar.setPais(scan.next());
        System.out.println();

        return lugar;
    }

    public static Fecha datosFecha (Fecha fecha, Scanner scan){
        System.out.println("DATOS DE LA FECHA: ");
        System.out.print("\tIntroduce el día: ");
        fecha.dia(scan.nextInt());

        System.out.print("\tIntroduce el mes: ");
        fecha.mes(scan.nextInt());

        System.out.print("\tIntroduce el año: ");
        fecha.anio(scan.nextInt());

        return fecha;
    }
}

/*
 * scan.nextInt(), 20, "Antonio", "Priego"
 * 
 * "Introducción a la programación en Java", persona, "0-13-031997-X", 371, 2,
 * "McGraw Hill", barbastro, fecha1
 */
