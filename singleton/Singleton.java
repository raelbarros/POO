package singleton;
public class Singleton {
    public static void main(String[] args) {
        Teste t = new Teste();
        
        t.imprimeNome();
        
        // nao pode inicialicar o metodo por causa do private na classe
        // MessageManeger m2 = new MessageManeger();
        
        MessageManeger.name = "Israel Lindo";
        
        MessageManeger.warning(564);
        MessageManeger.errorOk(123456);
        MessageManeger.sendOk();
        
        t.imprimeNome();
        
    }
}
