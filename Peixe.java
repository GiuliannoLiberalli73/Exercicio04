package exercicios04;

public class Peixe extends AnimalMarinhoAB {

    public Peixe(double comIn, double camPer, double horSo) {
        super(comIn, camPer, horSo);

    }
    
    double comeu;
    double mover;
    double dormiu;

    @Override
    public void comer() {

        System.out.println("Ontem " + this.nome + " comeu " + this.comidaIngerida + "kg.");
        this.comidaIngerida = this.comidaIngerida + comeu;
        System.out.println(this.nome + " comeu mais " + comeu + "kg hoje. No total ele comeu "
                + this.comidaIngerida + "kg.\n");

    }

    @Override
    public void moverse() {

        System.out.println(
                "Ontem o peixe nadou " + this.caminhoPercorrido + "km com as suas " + this.getQuantNadadeiras()
                        + " nadadeiras.");
        this.caminhoPercorrido = this.caminhoPercorrido + mover;
        System.out.println(
                "O peixe nadou mais " + mover + "km hoje. No total ele percorreu " + this.caminhoPercorrido
                        + "km.\n");

    }

    @Override
    public void dormir() {

        System.out.println("Ontem o peixe dormiu " + this.horasDeSono + " horas.");
        this.horasDeSono = this.horasDeSono + dormiu;
        System.out.println("O peixe dormiu por " + dormiu
                + " horas essa noite. Ontem e hoje ele dormiu um total de " + this.horasDeSono + " horas.\n");

    }

    public String toString() {

        return this.nome + " e do tipo " + this.tipo + ", possui " + this.getQuantNadadeiras() + " nadadeiras, vive em "
                + this.habitat + ". Mede " + this.altura + "m, pesa " + this.peso + "kg.";

    }
    


}
