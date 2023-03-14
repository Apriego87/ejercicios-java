package ud2_Prácticas;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el consumo de agua: ");
        float consum = scan.nextFloat();
        scan.close();

        if (consum < 100) {
            System.out.printf("Deberás pagar: %.2f euros.", consum * 0.15);
        }
        if (consum >= 100 && consum < 500) {
            System.out.printf("Deberás pagar: %.2f euros.", ((100 * 0.15) + ((consum - 100) * 0.20)));
        }
        if (consum >= 500 && consum < 1000) {
            System.out.printf("Deberás pagar: %.2f euros.", ((100 * 0.15) + (400 * 0.20) + ((consum - 500) * 0.35)));
        }
        if (consum >= 1000) {
            System.out.printf("Deberás pagar: %.2f euros.",
                    ((100 * 0.15) + (400 * 0.20) + (500 * 0.35) + ((consum - 1000) * 0.8)));
        }
    }
}
