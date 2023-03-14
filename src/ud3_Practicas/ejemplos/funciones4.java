package ud3_Practicas.ejemplos;

public class funciones4 {

    public static double conversorCelsius(double gradosF) {
        /* double resultado;
        resultado =  */
        return 5.0/9 * (gradosF-32);
    }

    public static void main(String[] args) {
        System.out.printf("Conversión: %f", conversorCelsius(35.7));
    }
}
