package ud3_Practicas.ejemplos;

import java.time.LocalDateTime;

public class funciones1 {

    public static void hora() {
        System.out.println(LocalDateTime.now().getHour());
    }
    public static void main(String[] args) {
        hora();
    }
}
