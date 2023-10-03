package exercicios04;

public abstract class AnimalVoadorAB extends AnimalAB {

    public AnimalVoadorAB(double comIn, double camPer, double horSo) {
        super(comIn, camPer, horSo);

    }
    
    public String nome;
    public String tipo;
    public String habitat;
    public double altura;
    public double peso;
    private int quantAsas;
    private double envergAsas;
    

    /**
     * @return int return the quantPatas
     */
    public int getQuantAsas() {
        return quantAsas;
    }

    /**
     * @param quantPatas the quantPatas to set
     */
    public void setQuantAsas(int quantAsas) {
        this.quantAsas = quantAsas;
    }

    /**
     * @return double return the envergAsas
     */
    public double getEnvergAsas() {
        return envergAsas;
    }

    /**
     * @param envergAsas the envergAsas to set
     */
    public void setEnvergAsas(double envergAsas) {
        this.envergAsas = envergAsas;
    }

}
