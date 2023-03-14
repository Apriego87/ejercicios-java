package ud3_2_Practicas.objetos;


public class ej1 {
    public static void main(String[] args) {
        /* Caballo caballo1 = new Caballo("nombre1", 3); */
        Caballo perdigon = new Caballo("Perdigón", "Pinto", 7, 420.0, 3, false);
        Caballo que = new Caballo("que", "raza", 3, 400, 1, true);
        Caballo nose = new Caballo("nose", "raza", 4, 430, 2, true);

        System.out.println(perdigon);
        perdigon.come("zanahoria");
        perdigon.come("pienso");

        que.compiten(nose);
        que.compiten(perdigon);
    }
}
