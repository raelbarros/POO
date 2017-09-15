package projetointerface;
public class Ingles implements ILingua{

   @Override
    public String sayHello() {
        return "Hello";
    }

    @Override
    public String sayName(String name) {
        return "My name is " + name;
    }

    @Override
    public String sayAge(String age) {
        return "My age is " + age; 
    }
    
    @Override
    public String sayGender(Genero gender) {
        switch(gender){
            case MASC:
                return "Sex male";
            case FEM:
                return "Sexo female";
            case GAY:
                return "Thread Burning";
            case TRAVESTI:
                return "I'm Shemale";
        }
        return "";
    }
    
}
