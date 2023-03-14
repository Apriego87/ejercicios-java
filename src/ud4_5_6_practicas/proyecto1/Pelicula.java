package ud4_5_6_practicas.proyecto1;

public class Pelicula extends Multimedia {

    private String mainActor;
    private String mainActress;

    public Pelicula(String mainActor, String mainActress, String titulo, String autor, String formato, int duracion) {
        super(titulo, autor, formato, duracion);

        try {
            this.mainActor = mainActor;
            this.mainActress = mainActress;

            if (this.mainActor == null && this.mainActress == null) {
                throw new IllegalArgumentException("ERROR: Debes introducir al menos un actor o actriz");
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("ERROR: Se debe introducir al menos un actor o actriz.");
            System.exit(1);
        }
    }

    public String getMainActor() {
        return this.mainActor;
    }

    public String getMainActress() {
        return this.mainActress;
    }


    @Override
    public String toString() {
        return super.toString() + "\nActor Principal: " + getMainActor() + "\nActriz Principal: " + getMainActress();
    }
}
