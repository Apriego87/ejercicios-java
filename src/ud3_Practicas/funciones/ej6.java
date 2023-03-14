package ud3_Practicas.funciones;

import java.util.Scanner;

public class ej6 {
    public static double radicando(int raiz) {
        double root = Math.sqrt(raiz);
        if((int)root * (int)root == raiz){
            return root;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = scan.nextInt();
        System.out.print((int)radicando(num));
    }
}
