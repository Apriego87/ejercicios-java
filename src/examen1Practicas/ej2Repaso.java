package examen1Practicas;

public class ej2Repaso {
    public static void main(String[] args) {
        int suma = 0, num = 1;

        while (num <= 5000) {
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    suma += i;
                }
            }

            if (suma == num) {
                System.out.println(num);
            }

            suma = 0;

            num++;
        }
    }
}
