package heranca;
public class Retangulo extends Poligono{
    private float ladoA, ladoB;

    public Retangulo(float ladoA, float ladoB, int id) {
        super(id);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
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

    @Override
    public float getArea() {
        return this.ladoA * this.ladoB;
    }

    @Override
    public float getPerimetro() {
        return 2*(this.ladoA + this.ladoB);
    }
    
    public boolean isQuadrado(){
        return this.ladoA == this.ladoB;
        
    } 

}
