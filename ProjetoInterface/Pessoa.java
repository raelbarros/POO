package projetointerface;
import projetointerface.ILingua.Genero;

public class Pessoa{

    private String nome;
    private Genero genero;
    private Integer idade;
    private ILingua falador;

    public Pessoa(ILingua falador) {
        this.falador = falador;
    }    

    public Pessoa(String nome, Integer idade, Genero genero, ILingua lingua) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.falador = lingua;
    }
       
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }  

    public ILingua getFalador() {
        return falador;
    }

    public void setFalador(ILingua falador) {
        this.falador = falador;
    }
    
    public String testeTalk(){
        return this.falador.sayHello() + "\n" + this.falador.sayName(nome) + "\n" + this.falador.sayAge(idade.toString()) + "\n" +  this.falador.sayGender(genero);
    }

    public String sayHello() {
        return this.falador.sayHello();
    }

    public String sayName(String name) {
        return this.falador.sayName(this.nome);
    }

    public String age(String age) {
        return this.falador.sayAge(this.idade.toString());
    }

    public String sayGender(Genero gender) {
        return this.falador.sayGender(this.genero);
    }
    
}
