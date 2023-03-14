package ud4_5_6_practicas;

import java.util.*;
import java.time.*;

public class ej2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce una opción (1-3): ");
        int met = scan.nextInt();

        switch (met) {
            case 1:
                metodo1();
                break;
            case 2:
                metodo2();
                break;

            case 3:
                metodo3();
                break;
        }
    }

    public static void metodo1() {
        @SuppressWarnings("deprecated")
        Date hoy = new Date();
        int year = hoy.getYear() + 1900, mes = hoy.getMonth() + 1, dia = hoy.getDate(), hora = hoy.getHours(),
                mins = hoy.getMinutes(), secs = hoy.getSeconds();

        System.out.printf("Hora: %d | Minutos: %d | Segundos: %d | Día: %d | Mes: %d | Año: %d", hora, mins, secs, dia,
                mes, year);
    }

    public static void metodo2() {
        GregorianCalendar calendario = new GregorianCalendar();
        int year = calendario.get(calendario.YEAR), mes = calendario.get(calendario.MONTH + 1),
                dia = calendario.get(calendario.DAY_OF_MONTH), hora = calendario.get(calendario.HOUR_OF_DAY),
                mins = calendario.get(calendario.MINUTE), secs = calendario.get(calendario.SECOND);

        System.out.printf("Hora: %d | Minutos: %d | Segundos: %d | Día: %d | Mes: %d | Año: %d", hora, mins, secs, dia,
                mes, year);
    }

    public static void metodo3() {
        LocalDateTime hoy = LocalDateTime.now();
        int year = hoy.getYear(), mes = hoy.getMonthValue(), dia = hoy.getDayOfYear(), hora = hoy.getHour(),
                mins = hoy.getMinute(), secs = hoy.getSecond();

        System.out.printf("Hora: %d | Minutos: %d | Segundos: %d | Día: %d | Mes: %d | Año: %d", hora, mins, secs, dia,
                mes, year);
    }
}
