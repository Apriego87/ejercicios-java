package ud3_Practicas.repaso;

import java.util.Arrays;

public class ej6 {
    public static void main(String[] args) {
        int[] numeros = new int[20];

        calcular(numeros);
    }

    public static void calcular(int[] numeros) {
        int pos = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < numeros.length; i++) {

            int cont = 0;
            for (int j = 2; j < numeros[i] / 2; j++) {
                if (numeros[i] % j == 0) {
                    cont++;
                }
            }
            if (cont == 0) {
                /* primos[pos] = numeros[i]; */
                pos++;
            }
        }
        hacer(numeros, pos);
    }

    public static void hacer(int[] numeros, int pos) {
        int[] primos = new int[pos];

        int esPrimo = 0;

        for (int i = 0; i < numeros.length; i++) {

            int cont = 0;
            for (int j = 2; j < numeros[i] / 2; j++) {
                if (numeros[i] % j == 0) {
                    cont++;
                }
            }
            if (cont == 0) {
                primos[esPrimo] = numeros[i];
                esPrimo++;
            }
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(primos));
    }

}
