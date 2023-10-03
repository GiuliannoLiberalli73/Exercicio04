package exercicios04;

public class Pombo extends AnimalVoadorAB {

    public Pombo(double comIn, double camPer, double horSo) {
        super(comIn, camPer, horSo);

    }

    double comeu;
    double mover;
    double dormiu;

    @Override
    public void comer() {

        System.out.println("Ontem " + this.nome + " comeu " + this.comidaIngerida + "kg de graos.");
        this.comidaIngerida = this.comidaIngerida + comeu;
        System.out.println(this.nome + " comeu mais " + comeu + "kg de racao hoje. No total ele comeu "
                + this.comidaIngerida + "kg.\n");

    }

    @Override
    public void moverse() {

        System.out.println(
                "Ontem o pombo voou " + this.caminhoPercorrido + "km com as suas " + this.getQuantAsas()
                        + " asas.");
        this.caminhoPercorrido = this.caminhoPercorrido + mover;
        System.out.println(
                "O pombo voou mais " + mover + "km hoje. No total ele percorreu " + this.caminhoPercorrido
                        + "km.\n");

    }

    @Override
    public void dormir() {

        System.out.println("Ontem o pombo dormiu " + this.horasDeSono + " horas.");
        this.horasDeSono = this.horasDeSono + dormiu;
        System.out.println("O pombo dormiu por " + dormiu
                + " horas essa noite. Ontem e hoje ele dormiu um total de " + this.horasDeSono + " horas.\n");

    }

    public String toString() {

        return this.nome + " e do tipo " + this.tipo + ", possui " + this.getQuantAsas() + " asas com envergadura de " + this.getEnvergAsas() + "m, vive em "
                + this.habitat + ". Mede " + this.altura + "m, pesa " + this.peso + "kg.";

    }

}
