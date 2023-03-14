package ud3_2_Practicas.objetos;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        Zona arrayZona[] = new Zona[3];

        arrayZona[0] = new Zona(1000);
        arrayZona[1] = new Zona(200);
        arrayZona[2] = new Zona(25);

        do {
            System.out.println("\n1. Mostrar número de entradas libres.");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");

            System.out.print("Escribe una de las opciones: ");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("\nquedan %d entradas por vender\n", arrayZona[0].getEntradasPorVender()
                            + arrayZona[1].getEntradasPorVender() + arrayZona[2].getEntradasPorVender());
                    break;
                case 2:
                    System.out.print("para qué zona quieres las entradas?: ");
                    int zona = scan.nextInt() - 1;
                    System.out.print("cuántas entradas quieres?: ");
                    int entradas = scan.nextInt();

                    arrayZona[zona].vender(entradas);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        } while (!salir);

    }
}
