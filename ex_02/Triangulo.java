package poligonos;

public class Triangulo extends PoligonosRegulares {

    private float ladoA;
    private float ladoB;
    private float ladoC;

    public Triangulo(float ladoA, float ladoB, float ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public float getLadoA() {
        return ladoA;
    }

    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }

    public float getLadoC() {
        return ladoC;
    }

    public void setLadoC(float ladoC) {
        this.ladoC = ladoC;
    }
    
    
}
