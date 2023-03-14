package ud3_2_Practicas.objetos;

public class Pizza {
    private String tamaño;
    private String tipo;
    private boolean estado;
    private static int TotalPedidas = 0;
    private static int TotalServidas = 0;

    public Pizza(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = false;
        TotalPedidas++;
    }

    public void sirve() {
        if (this.estado == false) {
            this.estado = true;
            TotalServidas++;
        } else {
            System.out.println("esa pizza ya se ha servido.");
        }
    }

    public static int getTotalPedidas() {
        return Pizza.TotalPedidas;
    }

    public static int getTotalServidas() {
        return Pizza.TotalServidas;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getTamaño() {
        return this.tamaño;
    }

    public String getEstado() {
        if (this.estado == false){
            return "pedida";
        }
        return "servida";
    }

    @Override
    public String toString() {
        return "pizza " + getTipo() + " " + getTamaño() + ", " + getEstado();
    }

}
