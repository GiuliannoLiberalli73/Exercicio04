package exercicios04;

public abstract class AnimalTerrestreAB extends AnimalAB {

    public AnimalTerrestreAB(double comIn, double camPer, double horSo) {
        super(comIn, camPer, horSo);

    }

    public String nome;
    public String tipo;
    public String habitat;
    public double altura;
    public double peso;
    private int quantPatas;

    /**
     * @return int return the quantPatas
     */
    public int getQuantPatas() {
        return quantPatas;
    }

    /**
     * @param quantPatas the quantPatas to set
     */
    public void setQuantPatas(int quantPatas) {
        this.quantPatas = quantPatas;
    }

}
