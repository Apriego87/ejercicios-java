package ud3_2_Practicas.colecciones3;

import java.util.HashMap;

public class Traductor {
    HashMap<String, String> diccionario = new HashMap<String, String>();

    public void insertar(String k, String o) {
        diccionario.put(k, o);
    }

    public String sacar(String k) {
        return diccionario.get(k);
    }

    public void prueba(String k) {
        for (String key : diccionario.keySet()) {
            
        }
    }
}
