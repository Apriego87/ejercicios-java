package ud3_2_Practicas.colecciones1;

public class Cancion {
    private String titulo;
    private String autor;

    Cancion(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    Cancion(){
        titulo = "";
        autor = "";
    }

    public String dameTitulo(){
        return this.titulo;
    }

    public String dameAutor(){
        return this.autor;
    }

    public void ponTitulo(String titulo){
        this.titulo = titulo;
    }

    public void ponAutor(String autor){
        this.autor = autor;
    }


    @Override
    public String toString() {
        return "{" +
            " titulo='" + dameTitulo() + "'" +
            ", autor='" + dameAutor() + "'" +
            "}";
    }


}
