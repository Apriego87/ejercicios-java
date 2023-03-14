package ud4_5_6_practicas.proyecto3;

import ud4_5_6_practicas.proyecto1.Disco;
import ud4_5_6_practicas.proyecto2.Prestable;

public class DiscoPrestable extends Disco implements Prestable {
    public DiscoPrestable(String genero, String titulo, String autor, String formato, int duracion) {
        super(genero, titulo, autor, formato, duracion);
        this.prestado = false;
    }

    private boolean prestado;

    @Override
    public void prestar() {
        this.prestado = true;
        
    }

    @Override
    public void devolver() {
        this.prestado = false;
        
    }

    @Override
    public boolean prestado() {
        return this.prestado;
    }
}
