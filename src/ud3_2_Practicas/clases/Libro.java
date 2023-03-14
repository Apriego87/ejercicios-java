package ud3_2_Practicas.clases;

import java.util.Comparator;

import ud3_2_Practicas.arraylists.Lugar;

public class Libro implements Comparable<Libro> {

    public String titulo;
    public Persona autor;
    public String isbn;
    public int paginas;
    public int edicion;
    public String editorial;
    public Lugar lugar;
    public Fecha fechaEdicion;

    public Libro() {
    }

    public Libro(String titulo, Persona autor, String isbn, int paginas, int edicion, String editorial, Lugar lugar, Fecha fechaEdicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.edicion = edicion;
        this.editorial = editorial;
        this.lugar = lugar;
        this.fechaEdicion = fechaEdicion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return this.autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getEdicion() {
        return this.edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Lugar getLugar() {
        return this.lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Fecha getFechaEdicion() {
        return this.fechaEdicion;
    }

    public void setFechaEdicion(Fecha fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    @Override
    public String toString() {
        return " \n\tTítulo: " + getTitulo() + "\n" +
                " \t" + getEdicion() + "a. edición" + "\n" +
                " \tAutor: " + getAutor().dameApellidos() + ", " + getAutor().dameNombre() + "\n" +
                " \tISBN: " + getIsbn() + "\n" +
                " \t" + getEditorial() + ", " + getLugar().getCiudad() + " (" + getLugar().getPais() + "), " + getFechaEdicion() + "\n" +
                " \t" + getPaginas() + " páginas." + "\n";
    }

    @Override
    public int compareTo(Libro o) {
        return (this.paginas - o.paginas);
    }

}
