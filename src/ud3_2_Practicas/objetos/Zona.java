package ud3_2_Practicas.objetos;

public class Zona {
    private int entradasPorVender;

    public Zona(int n) {
        entradasPorVender = n;
    }

    public int getEntradasPorVender() {
        return this.entradasPorVender;
    }

    public void vender(int n) {
        if (this.entradasPorVender == 0) {
            System.out.println("lo siento, las entradas para esta zona están agotadas.");
        } else if (this.entradasPorVender < n) {
            System.out.printf("sólo quedan %d entradas para esa zona.", this.entradasPorVender);
        }

        if (this.entradasPorVender >= n) {
            entradasPorVender -= n;
            System.out.printf("aquí tiene sus %d entradas, gracias.", n);
        }
    }

}
