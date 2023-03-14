package ud3_2_Practicas.colecciones1;


public class ejs1y2 {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Magic Hoodie", "Jazzinuf");
        Cancion cancion2 = new Cancion("Meow", "Ivusm");
        Cancion cancion3 = new Cancion("Bow Down", "I Prevail");
        Cancion cancion4 = new Cancion("Still Waiting", "Sum 41");
        Cancion cancion5 = new Cancion("Orchids", "Funky Notes");

        /* System.out.println(prueba.dameAutor());
        System.out.println(prueba.dameTitulo());

        prueba.ponTitulo("titulo2");
        prueba.ponAutor("autor2");

        System.out.println(prueba.dameAutor());
        System.out.println(prueba.dameTitulo()); */

        CD cd = new CD();

        System.out.println(cd.agrega(cancion2));
        System.out.println(cd.agrega(cancion1));
        System.out.println(cd.agrega(cancion3));
        System.out.println(cd.agrega(cancion4));
        System.out.println(cd.agrega(cancion5));

        System.out.println(cd.numeroCanciones());

        System.out.println(cd.dameCancion(1));

        System.out.println(cd.grabaCancion(1, new Cancion("MODUS", "Joji")));

        System.out.println(cd.elimina(2));

        System.out.println(cd);
    }
}
