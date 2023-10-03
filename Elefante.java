package exercicios04;

public class Elefante extends AnimalTerrestreAB {

    public Elefante(double comIn, double camPer, double horSo) {
        super(comIn, camPer, horSo);

    }

    double comeu;
    double mover;
    double dormiu;

    @Override
    public void comer() {

        System.out.println("Ontem " + this.nome + " comeu " + this.comidaIngerida + "kg de feno.");
        this.comidaIngerida = this.comidaIngerida + comeu;
        System.out.println("O elefante comeu mais " + comeu + "kg de racao hoje. No total ele comeu "
                + this.comidaIngerida + "kg.\n");
    }

    @Override
    public void moverse() {

        System.out.println("Ontem o elefante andou " + this.caminhoPercorrido + "km com as suas " + this.getQuantPatas()
                + " patas.");
        this.caminhoPercorrido = this.caminhoPercorrido + mover;
        System.out.println(
                "O elefante andou mais " + mover + "km hoje. No total ele percorreu " + this.caminhoPercorrido
                        + "km.\n");
    }

    @Override
    public void dormir() {

        System.out.println("Ontem o elefante dormiu " + this.horasDeSono + " horas.");
        this.horasDeSono = this.horasDeSono + dormiu;
        System.out.println("O elefante dormiu por " + dormiu
                + " horas essa noite. Ontem e hoje ele dormiu um total de " + this.horasDeSono + " horas.\n");

    }

    public String toString() {

        return this.nome + " e do tipo " + this.tipo + ", possui " + this.getQuantPatas() + " patas, vive em "
                + this.habitat + ". Mede " + this.altura + "m, pesa " + this.peso + " toneladas.";

    }

}
