package examen1Practicas;

public class ej2 {
    public static void main(String[] args) {

    int num, suma = 0;

    for (num = 1; num < 5000; num++) {
        for (int i = 1; i <= num - 1; i++) {
            if (num % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == num) {
            System.out.println(suma);
        }
        suma = 0;
    }

    }
}
