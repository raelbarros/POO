package heranca;
public class Heranca {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(30, 30, 1);
        Circuferencia c = new Circuferencia(3, 1);
        Quadrado q = new Quadrado(20, 20, 1);
        
        System.out.println(" --RETANGULO -- ");
        System.out.println("Area retangulo: " + r.getArea());
        System.out.println("Perimetro do retangulo: " + r.getPerimetro());
        System.out.println("É quadrado: " + r.isQuadrado());
        
        System.out.println(" ");
        
        System.out.println(" -- CIRCUFERENCIA -- ");
        System.out.println("Area circuferencia: " + c.getArea());
        System.out.println("Perimetro da circuferencia: " + c.getPerimetro());
        
        System.out.println(" ");
        
        System.out.println(" -- QUADRADO -- ");
        System.out.println("Area circuferencia: " + q.getArea());
        System.out.println("Perimetro do quadrado: " + q.getPerimetro());
        System.out.println("É quadrado: " + q.isQuadrado());      
    }
    
}
