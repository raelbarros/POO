package singleton;
public class MessageManeger {
    
    // faz para que nao seja usada instacia da classe
    private MessageManeger(){
    }
    
    // pra ser singleton tem que ter uma atributo static
    public static String name = "nada";
    
    public static void sendOk(){
        System.out.println("Está tudo Ok " + name);
    }
    
    public static void errorOk(int numero){
        System.out.println("Erro " + numero + ": " + name);
    }
    
    public static void warning(int numero){
        System.out.println("Alerta " + numero + ": " +  name);
    }    
    
}
