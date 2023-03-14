package ud3_2_Practicas.colecciones1;

public class Lugar {
    private String ciudad;
    private String pais;

    public Lugar(String ciudad, String pais){
        this.ciudad = ciudad;
        this.pais = pais;
    }


    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    @Override
    public String toString() {
        return "{" +
            " ciudad='" + getCiudad() + "'" +
            ", pais='" + getPais() + "'" +
            "}";
    }


}
