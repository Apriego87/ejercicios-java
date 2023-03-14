package ud3_Practicas.ejemplos;

import java.time.LocalDateTime;

public class funciones3 {

    public static int hora() {
        return LocalDateTime.now().getHour();
        
    }
    public static void main(String[] args) {
        hora();
        System.out.printf("Son las %d horas.\n", hora());
        System.out.println("Fin.");
    }
}
