package projetointerface;
public interface ILingua {
      
    enum Genero{
        MASC,
        FEM,
        GAY,
        TRAVESTI,
    }
        
    public String sayHello();
    public String sayName(String name);
    public String sayAge(String age);
    public String sayGender(Genero gender);
}
