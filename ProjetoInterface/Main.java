package projetointerface;
import projetointerface.ILingua.Genero;
public class Main {
    public static void main(String[] args){
        Portugues pt = new Portugues();
        Ingles en = new Ingles();
        
        Pessoa p = new Pessoa("Joao", 2, Genero.TRAVESTI, en);
                      
        System.out.println(p.testeTalk());
        
        System.out.println(" ");
        p.setFalador(pt);
        System.out.println(p.testeTalk());
    }
}
