package exercicios04;

public abstract class AnimalMarinhoAB extends AnimalAB {

    public AnimalMarinhoAB(double comIn, double camPer, double horSo) {
        super(comIn, camPer, horSo);

    }

    public String nome;
    public String tipo;
    public String habitat;
    public double altura;
    public double peso;
    private int quantNadadeiras;

    /**
     * @return int return the quantNadadeiras
     */
    public int getQuantNadadeiras() {
        return quantNadadeiras;
    }

    /**
     * @param quantNadadeiras the quantNadadeiras to set
     */
    public void setQuantNadadeiras(int quantNadadeiras) {
        this.quantNadadeiras = quantNadadeiras;
    }

}
