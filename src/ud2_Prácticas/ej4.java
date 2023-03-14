package ud2_Prácticas;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        double num = scan.nextInt();
        scan.close();
        double raiz = Math.sqrt(num);
        if ((int) raiz * (int) raiz == num) {
            System.out.printf("%.2f se puede expresar como el cuadrado de %.2f", num, Math.sqrt(num));
        } else {
            System.out.printf("%f no se puede expresar como el cuadrado de nada.", num);
        }
    }
}
