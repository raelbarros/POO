package heranca;

public abstract class Poligono {
    protected int id;

    public Poligono(int id) {
        this.id = id;
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public abstract float getArea();
    public abstract float getPerimetro();    
}
