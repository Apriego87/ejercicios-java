package ud3_2_Practicas.colecciones2;

public class Producto {
    private int codigo;
    private String nombre;
    private String tipo;
    private double precio;
    private int stock;

    public Producto(){}


    public Producto(int codigo, String nombre, String tipo, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
    }


    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    @Override
    public String toString() {
        return
            "Código: : " + getCodigo() + "\n" +
            "Nombre: " + getNombre() + "\n" +
            "Tipo: " + getTipo() + "\n" +
            "Precio: " + getPrecio() + "\n" +
            "Stock: " + getStock() + "\n";
    }


}
