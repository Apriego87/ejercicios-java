package ud4_5_6_practicas.proyecto1;

public class Disco extends Multimedia {
    private String genero;


    public Disco(String genero, String titulo, String autor, String formato, int duracion) {
        super(titulo, autor, formato, duracion);

        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGénero: " + getGenero();
    }

}
