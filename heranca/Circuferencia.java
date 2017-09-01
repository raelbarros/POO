package heranca;
public class Circuferencia extends Poligono{
    private float raio;

    public Circuferencia(float raio, int id) {
        super(id);
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public float getArea() {
        return 3.14f * (this.raio * this.raio);
    }

    @Override
    public float getPerimetro() {
        return 2f *(3.14f * this.raio);
    }

    
    
}
