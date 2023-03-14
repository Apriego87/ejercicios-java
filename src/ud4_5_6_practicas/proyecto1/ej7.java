package ud4_5_6_practicas.proyecto1;

import ud4_5_6_practicas.proyecto3.DiscoPrestable;

public class ej7 {
    public static void main(String[] args) {

        ListaMultimedia lista = new ListaMultimedia();

        Pelicula p1 = new Pelicula("José Mota", null, "Tu Madre 2", "José Mota", ".mp4", 97);

        Pelicula p2 = new Pelicula(null, "Sigourney Weaver", "Alien", "Ridley Scott", ".mp4", 117);

        Pelicula p3 = new Pelicula("Timothée Chalamet", "Rebecca Ferguson", "Dune 2", "Denis Villeneuve", ".mp4", 104);

        // ---------------------------------------------------------------------------- //

        Disco d1 = new Disco("Lo-Fi", "Harbor", "Tomppabeats", "Vinilo", 38);

        Disco d2 = new Disco("Rock", "Drogadicto", "Kagada de Perro", ".mp3", 10);
        
        Disco d3 = new Disco("Lo-Fi", "Smithereens", "Joji", ".wav", 24);

        // ---------------------------------------------------------------------------- //

        DiscoPrestable dp1 = new DiscoPrestable("Pop", "Guerra Fría", "Malú", "CD", 44);

        DiscoPrestable dp2 = new DiscoPrestable("Pop", "Good Girl Gone Bad", "Rihanna", "CD", 46);

        DiscoPrestable dp3 = new DiscoPrestable("Rock", "IV", "Led Zeppelin", "Vinilo", 42);

        // ---------------------------------------------------------------------------- //

        dp1.prestar();
        dp3.prestar();

        DiscoPrestable[] array = new DiscoPrestable[]{dp1, dp2, dp3};

        lista.newItem(d1);
        lista.newItem(d2);
        lista.newItem(d3);

        lista.newItem(p1);
        lista.newItem(p2);
        lista.newItem(p3);

        System.out.println(lista);
        System.out.printf("Duración total de los objetos: %d\n", calcLong(lista));
        System.out.printf("Hay %d disco(s) de rock.\n", discosRock(lista));
        System.out.printf("Hay %d película(s) sin actriz principal.\n", noActress(lista));
        System.out.printf("Hay %d disco(s) prestado(s).", calcPrest(array));
    }

    public static int calcLong(ListaMultimedia lista) {
        int total = 0;
        for (int i = 0; i < lista.length(); i++) {
            total += lista.sacar(i).getDuracion();
        }
        return total;
    }

    public static int discosRock(ListaMultimedia lista){
        int total = 0;
        for(int i = 0; i < lista.length(); i++){
            try {
                Disco disc = (Disco) lista.sacar(i);
                if(disc.getGenero().toLowerCase().equals("Rock".toLowerCase())){
                    total++;
                }
            }
            catch (ClassCastException e) {
                ;
            }
        }
        return total;
    }

    public static int noActress(ListaMultimedia lista){
        int total = 0;
        for(int i = 0; i < lista.length(); i++){
            try {
                Pelicula peli = (Pelicula) lista.sacar(i);
                if(peli.getMainActress() == null){
                    total++;
                }
            }
            catch (ClassCastException e) {
                ;
            }
        }
        return total;
    }

    public static int calcPrest(DiscoPrestable[] array){
        int cont = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i].prestado() == true){
                cont++;
            }
        }

        return cont;
    }
}
