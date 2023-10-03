package exercicios04;

public abstract class AnimalAB implements AnimalIF{

    double comidaIngerida;
    double caminhoPercorrido;
    double horasDeSono;
    
    public AnimalAB(double comIn, double camPer, double horSo){

        this.comidaIngerida = comIn;
        this.caminhoPercorrido = camPer;
        this.horasDeSono = horSo;

    }

    
    public void comer(){  }

    public void moverse(){  }

    public void dormir(){   }



}
