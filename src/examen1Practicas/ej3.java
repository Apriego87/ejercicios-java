package examen1Practicas;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scan.nextLine();

        int numCer = 21, cogCer;
        System.out.printf("Comenzamos. Hay %d cerillas.", numCer);

        do {
            System.out.printf("%n --> %s elige cerillas (1-4): ", nombre);
            cogCer = scan.nextInt();
            while (cogCer < 1 || cogCer > 4){
                System.out.print("El número introducido es incorrecto. Prueba otra vez: ");
                cogCer = scan.nextInt();
            }
            System.out.printf("* Yo, ordenador, tomo %d cerillas. Quedan %d cerillas.", (5-cogCer),(numCer = numCer-5));
        } while (numCer > 1);
        System.out.printf("%n Te toca, y solo queda una cerilla. Has perdido! >:)");
    }
}
