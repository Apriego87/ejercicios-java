package ud4_5_6_practicas.repaso.proyecto1;

public abstract class B {
    private static int cuenta;
    private String s;
    private final int r = 2;

    public B() {}

    public B(String s) {
        this.s = s;
    }


    public String getS() {
        return this.s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getR() {
        return this.r;
    }

    public final void metodoX() {
        System.out.print("El valor de r es " + r);
    }


    @Override
    public String toString() {
        return "{ " +
            "cuenta: " + cuenta +
            ", s: " + s +
            ", r: " + r;
    }

}
