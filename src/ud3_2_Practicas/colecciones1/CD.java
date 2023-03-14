package ud3_2_Practicas.colecciones1;

public class CD {
    private final static int MAX = 15;
    private Cancion canciones[];
    private int cont;

    public CD() {
        canciones = new Cancion[MAX];
        cont = 0;
    }

    public int numeroCanciones() {
        return cont;
    }

    public Cancion dameCancion(int valor) {
        if ((valor < 1) || (valor > cont))
            return null;
        else {
            return canciones[valor - 1];
        }
    }

    public boolean grabaCancion(int valor, Cancion cancion) {
        if (cont == MAX) {
            return false;
        } else {
            canciones[valor - 1] = cancion;
            return true;
        }
    }

    public boolean agrega(Cancion cancion) {
        if (cont == MAX)
            return false;
        canciones[cont] = cancion;
        cont++;
        return true;
    }
    
    public boolean elimina(int pos) {
        if(pos > 0 || pos < cont){
            for (int i = pos-1; i < cont; i++){
                canciones[i] = canciones[i+1];
            }
            cont--;
        }
        return true;
    }

    @Override
    public String toString() {
        String cadena = " contenido del CD:\n";
        for (int i = 0; i < cont; i++) {
            cadena += canciones[i].dameTitulo() + " " + canciones[i].dameAutor() + "\n";
        }
        return cadena;
    }

}
