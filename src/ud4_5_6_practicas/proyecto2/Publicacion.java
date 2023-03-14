package ud4_5_6_practicas.proyecto2;

public class Publicacion {
    private int codigo;
    private String titulo;
    private int yearPubli;

    public Publicacion(int codigo, String titulo, int yearPubli) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.yearPubli = yearPubli;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public int getYearPubli() {
        return this.yearPubli;
    }

    @Override
    public String toString() {
        return "[" +
                " codigo: " + getCodigo() +
                ", titulo: " + this.titulo +
                ", yearPubli: " + getYearPubli();
    }

}
