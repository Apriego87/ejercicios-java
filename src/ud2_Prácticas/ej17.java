package ud2_Prácticas;

import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, numAnt, cont = 0;
        boolean crec = true;

        System.out.print("Introduce un número: ");
        num = scan.nextInt();

        while (num != 0) {
            numAnt = num;
            System.out.print("Introduce otro número: ");
            num = scan.nextInt();
            cont++;
            if (num == 0) {
                break;
            }
            if (num < numAnt) {
                crec = false;
            }
        }

        if (cont < 2) {
            System.out.println("Faltan números.");
            System.exit(1);
        }

        scan.close();

        if (crec) {
            System.out.println("Secuencia creciente.");
        } else {
            System.out.println("No es creciente.");
        }
    }
}
