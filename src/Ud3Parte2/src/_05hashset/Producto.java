package _05hashset;

import java.util.Objects;

public class Producto {

    private String nombre;
    private int cantidad;

    public Producto(String s, int i) {
        nombre = s;
        cantidad = i;
    }

    public String toString() {
        return ("Nombre: " + nombre + " Cantidad: " + cantidad);
    }

    public String getNombre() {
        return this.nombre;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Producto)) {
            return false;
        }
        Producto producto = (Producto) o;
        return Objects.equals(nombre, producto.nombre) || cantidad == producto.cantidad;
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
    

}