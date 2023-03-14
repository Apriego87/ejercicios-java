package ud3_2_Practicas.colecciones2;

import java.util.Scanner;

import ud3_2_Practicas.clases.*;

public class ej4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Producto p1 = new Producto(12, "Garbanzos", "Conserva", 1.99, 10);
        Producto p2 = new Producto(34, "Sandía", "Fruta", 0.59, 5);

        LinkedProducto l1 = new LinkedProducto();

        l1.agregar(p1);
        l1.agregar(p2);

        // System.out.println(l1);

        int cont = 1;

        while (true) {
            if (cont == 0){
                System.exit(1);
            }

            System.out.println("---------------------------------\nOpciones:");
            System.out.println("\t1. Buscar producto por posición");
            System.out.println("\t2. Buscar producto por código");
            System.out.println("\t3. borrar producto por código");
            System.out.println("\t4. Cambiar precio del producto por código");
            System.out.println("\t5. Agregar producto");
            System.out.println("\t6. Listar todos los productos");

            System.out.printf("¿Qué quieres hacer? (si quieres salir, pulsa 0): ");

            cont = scan.nextInt();

            switch (cont) {
                case 1:
                    System.out.println(l1.busPorPos(busPorPos(scan)));
                    break;
                case 2:
                    System.out.println(l1.busPorCod(busPorCod(scan)));
                    break;
                case 3:
                    System.out.println(l1.borrPorCod(borrPorCod(scan)));
                    break;
                case 4:
                    System.out.println(l1.cambiarPrecio(busPorCod(scan), cambiarPrecio(scan)));
                    break;
                case 5:
                    System.out.println(l1.agregar(agregar(scan)));
                case 6:
                    System.out.println(l1);
            }
        }

        // System.out.println(l1.busPorPos(busPorPos(scan)));
        // System.out.println(l1.busPorCod(busPorCod(scan)));
        // System.out.println(l1.borrPorCod(borrPorCod(scan)));
        // System.out.println(l1);
        // System.out.println(l1.cambiarPrecio(busPorCod(scan), cambiarPrecio(scan)));
    }

    public static int busPorPos(Scanner scan) {
        System.out.print("Introduce la posición del producto: ");
        return scan.nextInt();
    }

    public static int busPorCod(Scanner scan) {
        System.out.print("Introduce el código del producto: ");
        return scan.nextInt();
    }

    public static int borrPorCod(Scanner scan) {
        System.out.print("Introduce el código del producto a borrar: ");
        return scan.nextInt();
    }

    public static double cambiarPrecio(Scanner scan) {
        System.out.print("Introduce el nuevo precio: ");
        return scan.nextDouble();
    }

    public static Producto agregar(Scanner scan) {
        Producto prod = new Producto();
        System.out.print("Introduce el código: ");
        prod.setCodigo(scan.nextInt());

        System.out.println("Introduce el nombre del producto: ");
        prod.setNombre(MyInput.readString());

        System.out.println("Introduce el tipo de producto: ");
        prod.setTipo(MyInput.readString());

        System.out.print("Introduce el precio: ");
        prod.setPrecio(scan.nextDouble());

        System.out.print("Introduce el stock: ");
        prod.setStock(scan.nextInt());

        return prod;
    }
}
