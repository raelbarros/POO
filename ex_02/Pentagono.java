package poligonos;

public class Pentagono extends PoligonosRegulares implements IPoligono {

    private float ladoA;
    private float ladoB;
    private float ladoC;
    private float ladoD;
    private float ladoE;

    public Pentagono(float ladoA, float ladoB, float ladoC, float ladoD, float ladoE) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
        this.ladoE = ladoE;
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

    public float getLadoE() {
        return ladoE;
    }

    public void setLadoE(float ladoE) {
        this.ladoE = ladoE;
    }

    @Override
    public void getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
