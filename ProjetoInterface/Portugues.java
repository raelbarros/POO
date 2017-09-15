package projetointerface;
public class Portugues implements ILingua{

    @Override
    public String sayHello() {
        return "Ola";
    }

    @Override
    public String sayName(String name) {
        return "Meu nome é " + name;
    }

    @Override
    public String sayAge(String age) {
        return "Minha idade é " + age; 
    }
    
    @Override
    public String sayGender(Genero gender) {
        switch(gender){
            case MASC:
                return "Sexo masculino";
            case FEM:
                return "Sexo feminino";
            case GAY:
                return "Queima rosca";
            case TRAVESTI:
                return "Eu sou Pablo Vittar";
        }
        return "";
    }
    
    
}
