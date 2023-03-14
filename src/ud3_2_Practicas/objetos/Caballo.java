package ud3_2_Practicas.objetos;

import java.util.Scanner;

public class Caballo {
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private int establo;
    private boolean competidor;
    private int velocidad;

    Scanner scan = new Scanner(System.in);

    /*
     * public Caballo(String nombre, int establo){
     * this.nombre = nombre;
     * this.establo = establo;
     * }
     */

    public Caballo(String nombre, String raza, int edad, double peso, int establo, boolean competidor) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.establo = establo;
        this.competidor = competidor;
        if (competidor == true) {
            System.out.printf("Introduce la velocidad de '%s': ", this.nombre);
            this.velocidad = scan.nextInt();
        }
        if (competidor == false) {
            this.velocidad = 0;
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstablo() {
        return this.establo;
    }

    public void setEstablo(int establo) {
        this.establo = establo;
    }

    public boolean isCompetidor() {
        return this.competidor;
    }

    public boolean getCompetidor() {
        return this.competidor;
    }

    public void come(String comida) {
        if (comida.equals("zanahoria")) {
            System.out.println("Qué rico, gracias!");
        } else {
            System.out.println("Prefiero las zanahorias :(");
        }
    }

    public void compiten(Caballo enemy) {
        if (this.competidor == false) {
            System.out.printf("Lo siento, %s no compite.", this.nombre);
        }
        if (enemy.competidor == false) {
            System.out.printf("Lo siento, %s no compite.", enemy.nombre);
        }
        if (this.competidor == true && enemy.competidor == true) {
            if (this.velocidad > enemy.velocidad) {
                System.out.printf("%s gana!\n", this.nombre);
            }
            if (this.velocidad < enemy.velocidad) {
                System.out.printf("%s gana!\n", enemy.nombre);
            }
            if (this.velocidad == enemy.velocidad) {
                System.out.println("Empate!");
            }
        }
    }

    @Override
    public String toString() {
        return "[" +
                " nombre: " + getNombre() +
                " | raza: " + getRaza() +
                " | edad: " + getEdad() +
                " | peso: " + getPeso() +
                " | establo: " + getEstablo() +
                " ]";
    }

}
