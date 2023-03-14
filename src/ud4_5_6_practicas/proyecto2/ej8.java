package ud4_5_6_practicas.proyecto2;

public class ej8 {
    public static void main(String[] args) {
        Libro l1 = new Libro(10, "Hábitos Atómicos", 2018);
        Libro l2 = new Libro(20, "El libro de mates", 2014);
        Revista r1 = new Revista(15, "Corazón", 2023, 2);
        Revista r2 = new Revista(25, "Más Que Coches", 2023, 1);

        Publicacion[] array = new Publicacion[] {l1, l2, r1, r2};

        System.out.printf("Hay %d libro(s) prestados.", cuentaPrestados(array));
        System.out.printf("\nHay %d libro(s) publicado(s) antes del año introducido.", publicAntesA(array, 2016));

    }

    public static int cuentaPrestados(Publicacion[] array) {
        int cont = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] instanceof Libro){
                Libro l1 = (Libro) array[i];
                if(l1.prestado() == true){
                    cont++;
                }
            }
        }

        return cont;
    }

    public static int publicAntesA(Publicacion[] array, int year) {
        int cont = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i].getYearPubli() < year){
                cont++;
            }
        }

        return cont;
    }
}
