package ud4_5_6_practicas.repaso.proyecto1;

public class Y extends B {
    private String t;

    public Y(String s, String t) {
        super(s);
        this.t = t;
    }


    public String getT() {
        return this.t;
    }

    public void setT(String t) {
        this.t = t;
    }


    @Override
    public String toString() {
        return super.toString() + " t: " + t + " }";
    }

}
