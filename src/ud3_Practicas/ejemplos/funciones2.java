package ud3_Practicas.ejemplos;

import java.time.LocalDateTime;

public class funciones2 {

    public static void hora(String nombre, String apellidos) {
        System.out.printf("Hola, %s %s, son las: ", nombre, apellidos);
        System.out.println(LocalDateTime.now().getHour());
    }
    public static void main(String[] args) {
        hora("Antonio", "Priego Díaz");
        System.out.println("Fin.");
    }
}
