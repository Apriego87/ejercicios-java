package ud4_5_6_practicas.proyecto2;

public class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    public boolean prestado() {
        return this.prestado;
    }

    public Libro(int codigo, String titulo, int yearPubli) {
        super(codigo, titulo, yearPubli);
        this.prestado = false;
    }

    public int getCodigoLibro() {
        return this.getCodigo();
    }

    public int getYearPubliLibro() {
        return this.getYearPubli();
    }

    @Override
    public String toString() {
        return super.toString() + ", prestado: " + this.prestado + " ]";
    }

}
