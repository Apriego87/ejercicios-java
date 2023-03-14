package ud4_5_6_practicas.repaso.proyecto1;

public final class Z extends B implements Comparable {
    private int i;

    public Z(String s, int i) {
        super(s);
        this.i = i;
    }

    public int getI() {
        return this.i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return super.toString() + " i: " + i + " }";
    }

    public int compareTo(Z o) {
        return this.i - o.getI();
    }
}
