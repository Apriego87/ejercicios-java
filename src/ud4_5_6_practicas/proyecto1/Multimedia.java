package ud4_5_6_practicas.proyecto1;

import java.util.Objects;

public class Multimedia{
    private String titulo;
    private String autor;
    private String formato;
    private int duracion;

    public Multimedia(String titulo, String autor, String formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getFormato() {
        return this.formato;
    }

    public int getDuracion() {
        return this.duracion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Multimedia)) {
            return false;
        }
        Multimedia multimedia = (Multimedia) o;
        return Objects.equals(titulo, multimedia.titulo) && Objects.equals(autor, multimedia.autor);
    }

    @Override
    public String toString() {
        return "Título: " + getTitulo() +
                "\nAutor: " + getAutor() +
                "\nFormato: " + getFormato() +
                "\nDuracion: " + getDuracion();
    }

}
