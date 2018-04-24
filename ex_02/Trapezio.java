package poligonos;

public class Trapezio extends PoligonosRegulares {

    private float ladoA;
    private float ladoB;
    private float ladoC;
    private float ladoD;

    public Trapezio(float ladoA, float ladoB, float ladoC, float ladoD) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
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

    public float getLadoD() {
        return ladoD;
    }

    public void setLadoD(float ladoD) {
        this.ladoD = ladoD;
    }

}
