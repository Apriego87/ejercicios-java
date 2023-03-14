package ud4_5_6_practicas.proyecto2;

public class Revista extends Publicacion {
    private int numero;

    public Revista(int codigo, String titulo, int yearPubli, int numero){
        super(codigo, titulo, yearPubli);
        this.numero = numero;
    }

    public int getCodigoRevista() {
        return this.getCodigo();
    }

    public int getYearPubliRevista() {
        return this.getYearPubli();
    }

    @Override
    public String toString() {
        return super.toString() + ", prestado: " + this.numero + " ]";
    }
}
