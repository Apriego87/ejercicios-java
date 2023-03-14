package ud3_Practicas.arrays;

public class ej5 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println("Número\t\tCuadrado\tCubo");
        for (int i = 0; i < 20; i++) {
            cuadrado[i] = arr[i] * arr[i];
            cubo[i] = arr[i] * arr[i] * arr[i];
            System.out.println(arr[i] + "\t\t" + cuadrado[i] + "\t\t" + cubo[i]);
        }
    }
}
